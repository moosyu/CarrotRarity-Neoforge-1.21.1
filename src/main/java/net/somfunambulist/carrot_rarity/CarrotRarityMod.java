package net.somfunambulist.carrot_rarity;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.somfunambulist.carrot_rarity.item.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static net.somfunambulist.carrot_rarity.CarrotRarityMod.MOD_ID;
import static net.somfunambulist.carrot_rarity.item.ModItems.ITEMS;


@Mod(MOD_ID)
public class CarrotRarityMod {
    public static final String MOD_ID = "carrot_rarity";

    public CarrotRarityMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::addCreative);
        ITEMS.register(modEventBus);
    }

    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.TWISTY_CARROT.get());
            event.accept(ModItems.LEGGY_CARROT.get());
            event.accept(ModItems.CARROT_BABY.get());
        }
    }
}