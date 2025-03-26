package haru.runeore;

import haru.runeore.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuneOreCraft implements ModInitializer {
	public static final String MOD_ID = "runeorecraft";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Moditems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}