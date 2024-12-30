package aesansmod.mod.item;

import aesansmod.mod.Aesanmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SIGMA_MONKEY = registerItem("sigma_monkey", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Aesanmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aesanmod.LOGGER.info("Registering Mod Items for " + Aesanmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SIGMA_MONKEY);
        });
    }
}
