package forge.fromage.objects.items;

import forge.fromage.Fromage;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class fromage extends Item {

    public fromage() {
        super(new Item.Properties()
                .group(Fromage.FromageItemGroup.instance)
                .food(new Food.Builder().hunger(4).saturation(10).build())
        );
    }
}
