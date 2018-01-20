package fr.fuizziy.reputation;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.fuizziy.commands.MainCommand;
import fr.fuizziy.listeners.Listeners;
import net.md_5.bungee.api.ChatColor;

public class Reputation extends JavaPlugin {

	public static Plugin instance;
	 
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(String.format(ChatColor.GREEN + "[FY] [%s v.%s] " + 
	ChatColor.BLUE + " activé", getDescription().getName(), getDescription().getVersion()));
		instance = this; 
		this.getCommand("reputation").setExecutor(new MainCommand(this));
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	} 
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(String.format(ChatColor.GREEN + "[FY] [%s v.%s] " + 
	ChatColor.RED + " désactivé", getDescription().getName(), getDescription().getVersion()));
	}
	 
	
}
