package forge.fromage.init;

import forge.fromage.Fromage;
import forge.fromage.objects.blocks.cheese_table;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Fromage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Fromage.MOD_ID)
public class BlockInit
{
    //Init block variables here
    public static final Block cheese_table_acacia = null;
    public static final Block cheese_table_birch = null;
    public static final Block cheese_table_dark_oak = null;
    public static final Block cheese_table_jungle = null;
    public static final Block cheese_table_oak = null;
    public static final Block cheese_table_spruce = null;

    //Inits vars for properties
    public static Block.Properties CheeseTableSettings = Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).hardnessAndResistance(2.5f, 2.5f);
    public static Item.Properties CheeseTableItemSettings = new Item.Properties().group(Fromage.FromageItemGroup.instance);

    //Register blocks and block settings here
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new cheese_table(CheeseTableSettings).setRegistryName("cheese_table_acacia"));
        event.getRegistry().register(new cheese_table(CheeseTableSettings).setRegistryName("cheese_table_birch"));
        event.getRegistry().register(new cheese_table(CheeseTableSettings).setRegistryName("cheese_table_dark_oak"));
        event.getRegistry().register(new cheese_table(CheeseTableSettings).setRegistryName("cheese_table_jungle"));
        event.getRegistry().register(new cheese_table(CheeseTableSettings).setRegistryName("cheese_table_oak"));
        event.getRegistry().register(new cheese_table(CheeseTableSettings).setRegistryName("cheese_table_spruce"));
    }
    //Register BlockItems here
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(cheese_table_acacia, CheeseTableItemSettings).setRegistryName("cheese_table_acacia"));
        event.getRegistry().register(new BlockItem(cheese_table_birch, CheeseTableItemSettings).setRegistryName("cheese_table_birch"));
        event.getRegistry().register(new BlockItem(cheese_table_dark_oak, CheeseTableItemSettings).setRegistryName("cheese_table_dark_oak"));
        event.getRegistry().register(new BlockItem(cheese_table_jungle, CheeseTableItemSettings).setRegistryName("cheese_table_jungle"));
        event.getRegistry().register(new BlockItem(cheese_table_oak, CheeseTableItemSettings).setRegistryName("cheese_table_oak"));
        event.getRegistry().register(new BlockItem(cheese_table_spruce, CheeseTableItemSettings).setRegistryName("cheese_table_spruce"));
    }
}
