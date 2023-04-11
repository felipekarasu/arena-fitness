package com.karasusoft.arenafitnessapi.populator;

public interface Populator <SOURCE, TARGET> {

    void populate(SOURCE source, TARGET target);

    void reversePopulate(TARGET target, SOURCE source);
}
