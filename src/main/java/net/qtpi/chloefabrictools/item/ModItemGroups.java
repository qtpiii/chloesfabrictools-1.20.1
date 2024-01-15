package net.qtpi.chloefabrictools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.qtpi.chloefabrictools.ChloeFabricTools;

public class ModItemGroups {

    public static final ItemGroup CHLOEFABRICTOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChloeFabricTools.MOD_ID, "chloefabrictools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chloefabrictools"))
                    .icon(() -> new ItemStack(ModItems.TESTITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TESTITEM);
                    }).build());

    public static void registerItemGroups() {
        ChloeFabricTools.LOGGER.info("Registering Item Groups for " + ChloeFabricTools.MOD_ID);
    }
}
