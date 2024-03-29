package net.qtpi.chloefabrictools;

import net.fabricmc.api.ModInitializer;

import net.qtpi.chloefabrictools.block.ModBlocks;
import net.qtpi.chloefabrictools.item.ModItemGroups;
import net.qtpi.chloefabrictools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChloeFabricTools implements ModInitializer {
	public static final String MOD_ID = "chloefabrictools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}