package aesansmod.mod;

import aesansmod.mod.block.ModBlocks;
import aesansmod.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aesanmod implements ModInitializer {
	public static final String MOD_ID = "aesanmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}