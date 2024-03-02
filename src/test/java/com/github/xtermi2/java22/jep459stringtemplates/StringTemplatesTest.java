package com.github.xtermi2.java22.jep459stringtemplates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringTemplatesTest {

    @Test
    void toJson() {
        final StringTemplates java = new StringTemplates("Java", 22);

        assertThat(java.toJson())
                .isEqualTo("""
                        {
                            "name": "Java",
                            "age": 22
                        }
                        """);
    }
}