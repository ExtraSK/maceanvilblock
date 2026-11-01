package com.extrask.maceanvil;

import org.bukkit.plugin.java.JavaPlugin;

public final class MaceAnvilBlockerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MaceAnvilBlocker(), this);
    }
}