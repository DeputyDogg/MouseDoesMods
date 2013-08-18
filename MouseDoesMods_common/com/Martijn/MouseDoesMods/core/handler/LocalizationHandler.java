package com.Martijn.MouseDoesMods.core.handler;

import com.Martijn.MouseDoesMods.core.helper.LocalizationHelper;
import com.Martijn.MouseDoesMods.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	
	public static void init(){
	
		/* For every file in Localizations.java, do*/
		for(String LocalizationFile : Localizations.localeFiles){
			
			LanguageRegistry.instance().loadLocalization(LocalizationFile, LocalizationHelper.getLocaleFromFileName(LocalizationFile), LocalizationHelper.isXMLFile(LocalizationFile));
		}
	}
}