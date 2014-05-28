package com.makzk.cb.scs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

class ChatStyler implements Listener {
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		
	}
}

public class SimpleChatStyle extends JavaPlugin {
	@Override
	public void onEnable() {
		saveDefaultConfig();
		if(getConfig() == null) {
			getLogger().severe("Configuration not loaded, cannot load plugin!");
			getServer().getPluginManager().disablePlugin(this);
		} else {
			getServer().getPluginManager().registerEvents(new ChatStyler(), this);
			getLogger().info("Plugin loaded!");
		}
	}
	
}
