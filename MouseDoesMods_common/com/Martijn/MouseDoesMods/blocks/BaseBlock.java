package com.Martijn.MouseDoesMods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Mouse Does Mods
 * 
 * BaseBlock
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class BaseBlock extends Block {

	public BaseBlock(int id){
		
		super(id, Material.rock);
		this.setHardness(25F);
		this.setResistance(25F);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}