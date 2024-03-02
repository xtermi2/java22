package com.github.xtermi2.java22.jep447statementsbeforesuper;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

class StatementsBeforeSuperTest {

    @Test
    void create_collection_of_10_elements_is_OK() {
        assertThat(new StatementsBeforeSuper.CollectionOfTen<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
                .hasSize(10);
    }

    @Test
    void create_collection_of_not_10_elements_fails() {
        final List<Integer> init = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertThatCode(() -> new StatementsBeforeSuper.CollectionOfTen<>(init))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Collection must have 10 elements");
    }
}