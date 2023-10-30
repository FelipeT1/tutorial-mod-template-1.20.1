package br.com.felipeteixeira.tutorialmod;

import br.com.felipeteixeira.tutorialmod.block.ModBlocks;
import br.com.felipeteixeira.tutorialmod.item.ModItemGroups;
import br.com.felipeteixeira.tutorialmod.item.ModItems;
import br.com.felipeteixeira.tutorialmod.item.custom.MetalDetectorItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// o id do mod será referenciado muitas vezes, por isso criar uma variável e chamar ela
	// é mais inteligente que ficar escrevendo o ID toda hora.
	// o mod ID é único para seu mod, então deve ser feito de forma única
	// Deve ser todo minúsculo e sem espaço
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		//LOGGER.info("Hello Fabric world!");
	}
}