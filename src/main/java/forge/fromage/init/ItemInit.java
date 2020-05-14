package forge.fromage.init;

import forge.fromage.Fromage;
import forge.fromage.objects.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Fromage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Fromage.MOD_ID)
public class ItemInit {
    //init item variables here
    public static final Item fromage = null;
    public static final Item daddy_cheese = null;
    public static final Item cheese_bread = null;
    public static final Item cheese_cloth = null;
    public static final Item dirty_cheese_cloth = null;

    //Register items and settings here
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new fromage().setRegistryName("fromage"));
        event.getRegistry().register(new daddy_cheese().setRegistryName("daddy_cheese"));
        event.getRegistry().register(new cheese_bread().setRegistryName("cheese_bread"));
        event.getRegistry().register(new cheese_cloth().setRegistryName("cheese_cloth"));
        event.getRegistry().register(new dirty_cheese_cloth().setRegistryName("dirty_cheese_cloth"));
    }
}
