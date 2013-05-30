package eu.paciik.squidblockmod.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class ItemSquidBlock extends ItemBlock{
	public ItemSquidBlock(int par1) {
        super(par1);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(CreativeTabs.tabDecorations);
    }
}
