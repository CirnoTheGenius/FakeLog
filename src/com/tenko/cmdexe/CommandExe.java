package com.tenko.cmdexe;

import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import com.tenko.FakeLog;

public class CommandExe {
	
	/**
	 * Execute the command.
	 * @param args - The arguments. 
	 * @param cs - The CommandSender.
	 */
	public void Execute(CommandSender cs, String[] args){/*Do nothing*/}
	
	protected final boolean validateInput(String[] args){
		FileConfiguration config = FakeLog.getPlugin().getConfig();
		
		if(config.getStringList("NoFake").contains(args[0])){
			return false;
		}
		
		return true;
	}
	
}
