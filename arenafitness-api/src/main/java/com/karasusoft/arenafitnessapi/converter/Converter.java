package com.karasusoft.arenafitnessapi.converter;

import com.karasusoft.arenafitnessapi.populator.Populator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TODO create a converter interface
public class Converter <SOURCE, TARGET>{

    private Class<TARGET> targetClass;

    private List<Populator> populators = new ArrayList<>();

    public Converter(Class<TARGET> targetClass) {
        this.targetClass = targetClass;
    }
    public static <SOURCE, TARGET> Converter<SOURCE, TARGET> of(Class<TARGET> targetClass) {
        return new Converter<>(targetClass);
    }

    public TARGET convert(SOURCE source) {
        TARGET target = createFromClass();
        for (Populator populator : populators) {
            populator.populate(source, target);
        }

        return target;
    }

    public List<TARGET> convertAll(List<SOURCE> objectsToConvert) {
        List<TARGET> convertedList = new ArrayList<>();
        for (SOURCE objectToConvert : objectsToConvert) {
            convertedList.add(convert(objectToConvert));
        }
        return convertedList;
    }

    private TARGET createFromClass() {
        try {
            return targetClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void addPopulator(Populator<SOURCE, TARGET> populator) {
        if (Objects.nonNull(populator)) {
            populators.add(populator);
        }
    }
    public <SOURCE, TARGET> Converter<SOURCE, TARGET> withPopulator(Populator<SOURCE, TARGET> populator) {
        if (Objects.nonNull(populator)) {
            populators.add(populator);
        }
        return (Converter<SOURCE, TARGET>) this;
    }
}
