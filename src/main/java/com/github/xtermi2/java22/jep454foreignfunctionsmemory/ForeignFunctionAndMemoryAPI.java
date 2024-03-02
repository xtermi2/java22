package com.github.xtermi2.java22.jep454foreignfunctionsmemory;


import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;


public class ForeignFunctionAndMemoryAPI {

    public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE.withByteAlignment(64/8);
    public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT.withByteAlignment(32/8);

    public MemorySegment allocateArrayOffHeap(Arena arena) {
        System.out.println("An array of data");
        MemorySegment cDoubleArray = arena.allocateFrom(C_DOUBLE, 1.0, 2.0, 3.0, 4.0,
                1.0, 1.0, 1.0, 1.0,
                3.0, 4.0, 5.0, 6.0,
                5.0, 6.0, 7.0, 8.0);

        for (long i = 0; i < (4 * 4); i++) {
            if (i > 0 && i % 4 == 0) {
                System.out.println();
            }
            final double v = cDoubleArray.get(C_DOUBLE, i * 8);
            System.out.printf(" %f ", v);
        }
        return cDoubleArray;
    }

    public int getPid() throws Throwable {
        var linker = Linker.nativeLinker();
        SymbolLookup stdlib = linker.defaultLookup();
        // Using a MethodHandle
        MethodHandle getpidMH = linker.downcallHandle(stdlib.find("getpid").orElseThrow(), FunctionDescriptor.of(C_INT));
        int pid = (int) getpidMH.invokeExact();
        System.out.printf("MethodHandle calling getpid() (%d)%n", pid);
        return pid;
    }
}
