package me.mchiappinam.pdghkick;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
	    getServer().getPluginManager().registerEvents(new Listeners(this), this);
	    getServer().getConsoleSender().sendMessage("§3[PDGHSTAFF] §2ativado - Plugin by: mchiappinam");
	    getServer().getConsoleSender().sendMessage("§3[PDGHSTAFF] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
	    getServer().getConsoleSender().sendMessage("§3[PDGHSTAFF] §2desativado - Plugin by: mchiappinam");
	    getServer().getConsoleSender().sendMessage("§3[PDGHSTAFF] §2Acesse: http://pdgh.com.br/");
	}
}