package com.tenko;

import org.bukkit.plugin.java.JavaPlugin;

import com.tenko.cmdexe.CommanderCirno;

public class FakeLog extends JavaPlugin {
	
	private static FakeLog plugin;
	private final CommanderCirno cc = new CommanderCirno();
	
	@Override
	public void onEnable(){
		plugin = this;
		
		getCommand("flogin").setExecutor(this.cc);
		getCommand("flogout").setExecutor(this.cc);
		
		getCommand("flogin").setPermission(getConfig().getString("FLoginPermission"));
		getCommand("flogout").setPermission(getConfig().getString("FLogoutPermission"));
		
		getCommand("flogin").setPermissionMessage("Unknown command. Type \"help\" for help.");
		getCommand("flogout").setPermissionMessage("Unknown command. Type \"help\" for help.");
	}

	public static FakeLog getPlugin(){
		return plugin;
	}
}
