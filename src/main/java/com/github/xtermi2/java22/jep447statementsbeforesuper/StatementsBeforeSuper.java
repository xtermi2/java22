package com.github.xtermi2.java22.jep447statementsbeforesuper;

import java.util.ArrayList;
import java.util.Collection;

public class StatementsBeforeSuper {

    public static class CollectionOfTen<T> extends ArrayList<T> {

        public CollectionOfTen(Collection<T> init) {
            // now we can execute statements before the super constructor call
            if (null == init || init.size() != 10) {
                throw new IllegalArgumentException("Collection must have 10 elements");
            }
            super(init);
        }
    }
}
