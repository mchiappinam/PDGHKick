package me.mchiappinam.pdghkick;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {
	
	//private Main plugin;
	public Listeners(Main main) {
		//plugin=main;
	}
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onJoin(final PlayerJoinEvent e) {
		e.getPlayer().kickPlayer("§3§lNovo IP: lobby.pdgh.com.br");
		
	}
}