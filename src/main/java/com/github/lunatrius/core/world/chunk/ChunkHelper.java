package com.github.lunatrius.core.world.chunk;

import java.util.Random;

public class ChunkHelper {

    private static final Random RANDOM = new Random();

    public static boolean isSlimeChunk(long seed, int x, int z) {
        RANDOM.setSeed(
            seed + (int) (x * x * 0x4c1906) + (int) (x * 0x5ac0db) + (int) (z * z) * 0x4307a7L + (int) (z * 0x5f24f)
                ^ 0x3ad8025fL);
        return RANDOM.nextInt(10) == 0;
    }
}
