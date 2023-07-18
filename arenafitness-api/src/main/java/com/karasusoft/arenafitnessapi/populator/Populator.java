package com.karasusoft.arenafitnessapi.populator;

public interface Populator <SOURCE, TARGET> {

    void populate(SOURCE source, TARGET target);
}
