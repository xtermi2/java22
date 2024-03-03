package com.github.xtermi2.java22.jep456unnamedvariablespatterns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class UnnamedVariablesAndPatternsTest {
    @Test
    void unnamed_vars_and_patterns() {
        assertThatCode(() -> new UnnamedVariablesAndPatterns().doIt(new String[]{"1", "2"}))
                .doesNotThrowAnyException();
    }
}