package com.tenko.cmdexe;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommanderCirno implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender cs, Command c, String l, String[] args) {
		if(c.getName().equalsIgnoreCase("flogin")){
			new FLoginCommand(cs, args);
			return true;
		}
		
		if(c.getName().equalsIgnoreCase("flogout")){
			new FLogoutCommand(cs, args);
			return true;
		}
		
		return false;
	}
}
