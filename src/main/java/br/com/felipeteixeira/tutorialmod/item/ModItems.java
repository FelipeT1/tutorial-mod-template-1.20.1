package br.com.felipeteixeira.tutorialmod.item;

import br.com.felipeteixeira.tutorialmod.TutorialMod;
import br.com.felipeteixeira.tutorialmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static br.com.felipeteixeira.tutorialmod.block.ModBlocks.*;

// Uma helper class que registrará todos os itens
public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));


    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(DEEP_RUBY_ORE);
        entries.add(END_RUBY_ORE);
        entries.add(NETHER_RUBY_ORE);
        entries.add(RUBY_ORE);
        entries.add(METAL_DETECTOR);
        entries.add(SOUND_BLOCK);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,
                new Identifier(TutorialMod.MOD_ID, name),
                item);
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
