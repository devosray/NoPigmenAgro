
package com.github.devosray.NoPigmenAgro;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

/**
 *
 * @author Raymond
 */
public class TargetListener implements Listener{
    
    Plugin plugin;

    public TargetListener(Plugin plugin) {
        this.plugin = plugin;
    }   

   @EventHandler(priority = EventPriority.HIGHEST)
   public void onEntityTargetEvent(EntityTargetEvent evt){
       
       if (evt.getEntity().getType() == EntityType.PIG_ZOMBIE 
               && evt.getTarget().getType() == EntityType.PLAYER){
           
           evt.setCancelled(true);
           
       }
   }
    
}
