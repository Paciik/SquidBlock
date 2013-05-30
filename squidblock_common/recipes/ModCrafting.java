package recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import eu.paciik.squidblockmod.SquidBlock;

public class ModCrafting {
	
	public static void init(){
		
		//Items
		GameRegistry.addRecipe(new ItemStack(SquidBlock.squidWrath), new Object[] { "###", "#I#", "###",
            Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 0), Character.valueOf('I'),
            Item.ingotGold });
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(SquidBlock.BlockSquid), new Object[] { "###", "###", "###",
            Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 0)});
	}
}
