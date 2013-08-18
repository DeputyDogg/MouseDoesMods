package com.Martijn.MouseDoesMods;

import com.Martijn.MouseDoesMods.blocks.ModBlocks;
import com.Martijn.MouseDoesMods.core.handler.LocalizationHandler;
import com.Martijn.MouseDoesMods.core.proxy.CommonProxy;
import com.Martijn.MouseDoesMods.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * Mouse Does Mods
 * 
 * MouseDoesMods
 * 
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * @author Martijn
 */

@Mod( 	
		/* @Mod is used to inform forge about the mod's properties. Properties needed are: name, modid and version. Modid needs to be identical*/
		name 				= References.MODNAME,
		modid 				= References.MODID,
		version 			= References.VERSION
		)

@NetworkMod(
		/* Declaring whether a server, client or both is needed for the mod. */
		clientSideRequired 	= true, 
		serverSideRequired 	= false
		)

public class MouseDoesMods {
	
	@SidedProxy(
			/* @SidedProxy is used to tell forge where the proxy's can be found. Exact location can be found in References.java */
			clientSide 		= References.CLIENT_PROXY_LOCATION,
			serverSide 		= References.COMMON_PROXY_LOCATION
			)
	public static CommonProxy proxy;
	
	/**
	 * preInit loads all blocks, items, configurations and more
	 * 
	 * @param event Minecraft Forge Event
	 */
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		/* Adds the localizations*/
		LocalizationHandler.init();
		
		/* This is the method which loads all the blocks*/
		ModBlocks.init();
	}
	
	/**
	 * init loads all gui's, listeners and more
	 * 
	 * @param event Minecraft Forge Event
	 */ 
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	/**
	 * postInit loads everything what needs the mod to be loaded. EG. add-ons, modules etc.
	 * 
	 * @param event Minecraft Forge Event
	 */
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}