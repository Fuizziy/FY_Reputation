package fr.fuizziy.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.fuizziy.reputation.Reputation;

public class MainCommand implements CommandExecutor {

	private final Reputation plugin;
	
	public MainCommand(Reputation plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
