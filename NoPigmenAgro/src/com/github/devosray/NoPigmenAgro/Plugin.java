
package com.github.devosray.NoPigmenAgro;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Raymond
 */
public class Plugin extends JavaPlugin{
    
    TargetListener targetl = new TargetListener(this);
    
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(targetl, this);
    }

    @Override
    public void onDisable() {
        
    }
    
    
    
}
