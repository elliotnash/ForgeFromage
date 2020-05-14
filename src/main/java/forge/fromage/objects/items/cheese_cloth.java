package forge.fromage.objects.items;

import forge.fromage.Fromage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class cheese_cloth extends Item {
    public cheese_cloth() {
        super(new Properties()
                .group(Fromage.FromageItemGroup.instance)
                .maxDamage(5)
        );
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack item = playerIn.getHeldItem(handIn);

        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
    }
}
