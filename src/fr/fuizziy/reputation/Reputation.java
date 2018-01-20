package fr.fuizziy.reputation;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Reputation extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage(String.format(ChatColor.GREEN + "[FY] [%s v.%s] " + 
	ChatColor.BLUE + " activé", getDescription().getName(), getDescription().getVersion()));
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(String.format(ChatColor.GREEN + "[FY] [%s v.%s] " + 
	ChatColor.RED + " désactivé", getDescription().getName(), getDescription().getVersion()));
	}
	
}
