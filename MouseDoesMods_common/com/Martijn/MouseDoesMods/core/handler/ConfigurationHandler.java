package com.Martijn.MouseDoesMods.core.handler;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Martijn.MouseDoesMods.lib.BlockIds;
import com.Martijn.MouseDoesMods.lib.ItemIds;
import com.Martijn.MouseDoesMods.lib.References;
import com.Martijn.MouseDoesMods.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	static Configuration config = new Configuration();
	
	public static void init(File file){
	
		config = new Configuration(file);
		
		try{
			
			config.load();
			
			BlockIds.BASEBLOCK_ID = config.get(config.CATEGORY_BLOCK, Strings.BASEBLOCK_NAME, BlockIds.BASEBLOCK_ID_DEFAULT).getInt(BlockIds.BASEBLOCK_ID_DEFAULT);
			ItemIds.ITEM_ID = config.get(config.CATEGORY_ITEM, Strings.ITEMNAME, ItemIds.ITEM_ID_DEFAULT).getInt(ItemIds.ITEM_ID_DEFAULT);
		}
		
		catch(Exception e){
			
			FMLLog.log(Level.SEVERE, e, References.MODID + " has trouble loading the config");
		}
		
		finally{
			
			config.save();
		}
	}
}