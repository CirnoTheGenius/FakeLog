package com.tenko.cmdexe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class FLogoutCommand extends CommandExe {
	
	public FLogoutCommand(CommandSender cs, String[] args){
		Execute(cs, args);
	}
	
	@Override
	public void Execute(CommandSender cs, String[] args) {
		try {
			if(!super.validateInput(args)){
				cs.sendMessage(ChatColor.RED + "[FakeLog] You are not allowed to fake " + args[0] + "!");
				return;
			}
			cs.sendMessage(ChatColor.DARK_GREEN + "[FakeLog] Faked the logout of " + args[0] + ".");
			Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " has left the game!");
		} catch (ArrayIndexOutOfBoundsException e){
			cs.sendMessage(ChatColor.RED + "[FakeLog] You must specify a player username!");
		}
	}
}
