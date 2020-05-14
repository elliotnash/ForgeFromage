package forge.fromage.objects.items;

import forge.fromage.Fromage;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class daddy_cheese extends Item {
    public daddy_cheese() {
        super(new Properties()
                .group(Fromage.FromageItemGroup.instance)
                .food(new Food.Builder().hunger(4).saturation(10)
                        .effect(new EffectInstance(Effects.POISON, 20*20, 255), 100)
                        .effect(new EffectInstance(Effects.NAUSEA, 20*20, 255), 100)
                        .build())
        );
    }
}
