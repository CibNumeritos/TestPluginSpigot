package me.cibnumeritos.example;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        getServer().getPluginManager().registerEvents(new EntityDamage(), this);
    }
}