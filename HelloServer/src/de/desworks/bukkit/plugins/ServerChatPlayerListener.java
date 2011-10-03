package de.desworks.bukkit.plugins;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class ServerChatPlayerListener extends PlayerListener {
		public static HelloServer plugin;
		
		public ServerChatPlayerListener(HelloServer instance) {
			plugin = instance;
		}
		
		public void onPlayerChat(PlayerChatEvent chat) {
			Player p = chat.getPlayer();
			String message = chat.getMessage();
			String message_lower = message.toLowerCase();
			ChatColor RED = ChatColor.RED;
			ChatColor WHITE = ChatColor.WHITE;
			
			if(message_lower.contains("hi") && message_lower.contains("server")) {
				p.sendMessage(RED + "[SERVER]" + WHITE + "Hello " + p.getName());
				chat.setCancelled(true);
			}
		}
		
		public void onPlayerConnect(PlayerJoinEvent join) {
			
			Player p = join.getPlayer();
			//String message = join.getJoinMessage();
			
			ChatColor GREEN = ChatColor.GREEN;
			ChatColor WHITE = ChatColor.WHITE;
			
			p.sendMessage(GREEN + "Hallo " + WHITE + p.getName());			
			
		}
}
