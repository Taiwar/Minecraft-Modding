package de.muellersites.theoryofeverything.block;

import de.muellersites.theoryofeverything.TheoryOfEverything;
import de.muellersites.theoryofeverything.reference.GUIs;
import de.muellersites.theoryofeverything.tileentity.TileEntityCoffeeMachine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;


public class BlockCoffeeMachine extends BlockTileEntityTTOE
{
    public BlockCoffeeMachine()
    {
        super(Material.anvil);
        this.setBlockName("coffeemachine");
        this.setHardness(2.5F);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1f, 1f, 1f);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metaData)
    {
        if (metaData == 0)
        {
            return new TileEntityCoffeeMachine(0);
        }

        return null;
    }
    @Override
    public int damageDropped(int metaData)
    {
        return metaData;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return true;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return true;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if ((player.isSneaking() && player.getCurrentEquippedItem() != null) || world.isSideSolid(x, y + 1, z, ForgeDirection.DOWN))
        {
            return true;
        }
        else
        {
            if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityCoffeeMachine)
            {
                player.openGui(TheoryOfEverything.instance, GUIs.COFFEE_MACHINE.ordinal(), world, x, y, z);
            }

            return true;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
    {
        for (int meta = 0; meta < 3; meta++)
        {
            list.add(new ItemStack(item, 1, meta));
        }
    }

}
