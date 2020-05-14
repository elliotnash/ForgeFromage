package forge.fromage.objects.items;

import forge.fromage.Fromage;
import net.minecraft.item.Item;

public class cheese_cloth extends Item {
    public cheese_cloth() {
        super(new Properties()
                .group(Fromage.FromageItemGroup.instance)
                .maxDamage(5)
        );
    }
}
