
package com.github.devosray.NoPigmenAgro;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
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
           
           PigZombie pigz = (PigZombie) evt.getEntity();
           pigz.setAngry(false);
           
           pigz.setTarget(null);
           
           evt.setCancelled(true);
           
       }
   }
   
   @EventHandler(priority = EventPriority.HIGHEST)
   public void EntityDamageByEntityEvent(EntityDamageByEntityEvent evt){
       if (evt.getDamager().getType() == EntityType.PIG_ZOMBIE && evt.getEntityType() == EntityType.PLAYER){
           evt.setCancelled(true);
       }
   }
   
   
    
}
