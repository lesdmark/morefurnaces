package cubex2.mods.morefurnaces.tileentity;

import cubex2.mods.morefurnaces.FurnaceType;
import cubex2.mods.morefurnaces.MoreFurnaces;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class TileEntityNetherrackFurnace extends TileEntityIronFurnace
{

    public TileEntityNetherrackFurnace()
    {
        super(FurnaceType.NETHERRACK);
    }

    @Override
    public int getSpeed()
    {
        return MoreFurnaces.netherrackSpeed;
    }

    @Override
    public float getConsumptionRate()
    {
        return MoreFurnaces.netherrackConsumptionRate;
    }

    @Override
    public boolean isBurning()
    {
        return world != null && world.getBlockState(pos.up()).getBlock() == Blocks.FIRE;
    }

    @Override
    public float getBurnTimeRemaining()
    {
        return isBurning() ? 0.99f : 0f;
    }
}
