package com.github.xtermi2.java22.jep456unnamedvariablespatterns;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UnnamedVariablesAndPatterns {

    public void doIt(String[] args) {
        int count = 0;
        // unnamed variable in for loop
        for (String _ : args) {
            count++;
        }

        // unnamed variable in lambda
        Arrays.stream(args)
                .collect(Collectors.toMap(String::toUpperCase,
                        _ -> "NODATA"));

        ObjectMapper customized = customizer().apply(new ObjectMapper());

        Color color = new Red();

        // unnamed pattern in switch
        switch (color) {
            case Red _ -> System.out.println("red");
            case Green _ -> System.out.println("green");
            case Blue _ -> System.out.println("blue");
        }
    }

    private Function<ObjectMapper, ObjectMapper> customizer() {
        // unnamed variable in lambda
        return _ -> {
            final ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.RegisterModule("foo-module");
            return objectMapper;
        };
    }

    private static class ObjectMapper {
        public void RegisterModule(Object module) {
            System.out.println(STR."Registering module: \{module}");
        }
    }

    private sealed interface Color permits Red, Green, Blue {
    }

    private static final class Red implements Color {
    }

    private static final class Green implements Color {
    }

    private static final class Blue implements Color {
    }
}
