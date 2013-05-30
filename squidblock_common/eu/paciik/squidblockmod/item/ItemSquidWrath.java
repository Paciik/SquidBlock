package eu.paciik.squidblockmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eu.paciik.squidblockmod.SquidBlock;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSquidWrath extends Item{
	
	public ItemSquidWrath(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister)
	{
		this.itemIcon = IconRegister.registerIcon(SquidBlock.modid + ":" + this.getUnlocalizedName());
	}
}
