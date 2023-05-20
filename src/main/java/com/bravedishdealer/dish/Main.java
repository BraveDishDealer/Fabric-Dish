package com.bravedishdealer.dish;


import com.bravedishdealer.dish.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    public static final String MOD_ID = "dish";
    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
    }
}
