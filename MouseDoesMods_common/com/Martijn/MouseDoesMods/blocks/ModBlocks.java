package com.Martijn.MouseDoesMods.blocks;

import com.Martijn.MouseDoesMods.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Mouse Does Mods
 * 
 * ModBlocks
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class ModBlocks {
	
	/* Initializing all the blocks*/
	public static Block BaseBlock;
	
	public static void init(){
		
		/*Spreading all blocks to different classes. They carry the blockID*/
		BaseBlock = new BaseBlock(3000);
		
		/*Registering all the blocks. Args: block, name*/
		GameRegistry.registerBlock(BaseBlock, Strings.BASEBLOCK_NAME);
	}
}