package eu.paciik.squidblockmod.item;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eu.paciik.squidblockmod.SquidBlock;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MathHelper;

public class ItemSquidWrath extends ItemSword{
	
	private int damage = 4;

	public ItemSquidWrath(int id, EnumToolMaterial material){
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IconRegister)
	{
		this.itemIcon = IconRegister.registerIcon(SquidBlock.modid + ":" + "SquidWrath");
	}
	
	@Override
    public int getDamageVsEntity(Entity entity) {
        if (entity instanceof EntitySquid) {
            Random random = new Random();
            damage = random.nextInt(3) + 24;
        }
        return damage;
    }
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving){
		
		Random random = new Random();
		int drop = MathHelper.getRandomIntegerInRange(random, 5, 12);
		
        if(par2EntityLiving instanceof EntitySquid){
        	 EntityItem entityitem = new EntityItem(par2EntityLiving.worldObj, par2EntityLiving.posX, par2EntityLiving.posY, par2EntityLiving.posZ, new ItemStack(Item.dyePowder, drop, 0));
        	 par3EntityLiving.worldObj.spawnEntityInWorld(entityitem);
        }
		par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
}
