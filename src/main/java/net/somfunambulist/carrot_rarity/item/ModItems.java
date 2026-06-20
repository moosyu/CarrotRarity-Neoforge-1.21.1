package net.somfunambulist.carrot_rarity.item;

import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.somfunambulist.carrot_rarity.item.custom.HolographicItem;

import java.util.function.Supplier;

import static net.somfunambulist.carrot_rarity.CarrotRarityMod.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final Supplier<Item> TWISTY_CARROT = ITEMS.register("twisty_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.TWISTY_CARROT)));
    public static final Supplier<Item> LEGGY_CARROT = ITEMS.register("leggy_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.TWISTY_CARROT).rarity(Rarity.UNCOMMON)));
    public static final Supplier<Item> CARROT_BABY = ITEMS.register("carrot_baby",
            () -> new Item(new Item.Properties().food(ModFoods.TWISTY_CARROT).rarity(Rarity.RARE)));
    public static final Supplier<Item> HOLOGRAPHIC_CARROT_BABY = ITEMS.register("holographic_carrot_baby",
            () -> new HolographicItem(new Item.Properties().food(ModFoods.TWISTY_CARROT).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}