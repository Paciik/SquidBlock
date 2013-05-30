package eu.paciik.squidblockmod;

import recipes.ModCrafting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import eu.paciik.squidblockmod.lib.Reference;
import eu.paciik.squidblockmod.block.BlockSquid;
import eu.paciik.squidblockmod.item.ItemSquidWrath;
import net.minecraftforge.common.EnumHelper;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SquidBlock {
	
	public static final String modid = "SquidBlock";
	public static Block BlockSquid;
	public static Item squidWrath;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Init
	public void init(FMLInitializationEvent event){
		
		//Materials
		EnumToolMaterial squid = EnumHelper.addToolMaterial("SQUID", 2, 20, 8.0F, 20, 12);
		
		//Block
		BlockSquid = new BlockSquid(500, Material.rock).setUnlocalizedName("squid");
		GameRegistry.registerBlock(BlockSquid, modid + BlockSquid.getUnlocalizedName());
		LanguageRegistry.addName(BlockSquid, "Squid Block");
		
		//Items
		squidWrath = new ItemSquidWrath(5001, squid).setUnlocalizedName("SquidWrath");
		LanguageRegistry.addName(squidWrath, "Squid Wrath");
		
		//Recipes
		ModCrafting.init();
	}
	
	@PostInit
	public void init(FMLPostInitializationEvent event){
		
	}
	
	
}
