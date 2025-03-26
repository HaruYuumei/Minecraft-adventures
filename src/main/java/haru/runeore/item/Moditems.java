package haru.runeore.item;


import haru.runeore.RuneOreCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Moditems {

    public static final Item SHARD = registerItem("shard",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(RuneOreCraft.MOD_ID,"shard")))));

    private static void addItemsToIngredientTabGroup(FabricItemGroupEntries entries){
        //entries.add(SHARD);
        entries.add(SHARD);
    }




    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(RuneOreCraft.MOD_ID,name),item);
    }

    public static void registerModItems(){
        RuneOreCraft.LOGGER.info("Registering mod items for " + RuneOreCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SHARD);
        });
    }


}
