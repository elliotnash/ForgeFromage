package forge.fromage.objects.items;

import forge.fromage.Fromage;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class cheese_bread extends Item {
    public cheese_bread() {
        super(new Properties()
                .group(Fromage.FromageItemGroup.instance)
                .food(new Food.Builder().hunger(8).saturation(14).build())
        );
    }
}
