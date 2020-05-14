package forge.fromage.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;

public class cheese_table extends Block {

    //Creates bool property full
    public static final BooleanProperty FULL = BooleanProperty.create("full");
    //adds blockstate to minecraft
    @Override
    protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(FULL);
    }


    public cheese_table(Properties properties) {
        super(properties);
        //sets default blockstate
        this.setDefaultState(this.getDefaultState().with(FULL, false));
    }
}
