package com.qzp.java.jvm.gc;

/**
 * VM Args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * 新生代 Minor GC
 */
public class Allocation {

    private static final int _1MB = 1024 * 1024;

    private static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB]; // 出现一次 Minor GC
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
