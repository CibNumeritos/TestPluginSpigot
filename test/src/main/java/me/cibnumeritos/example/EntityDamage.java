package me.cibnumeritos.example;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

public class EntityDamage implements Listener {
    @EventHandler
    public void projectileHit(ProjectileHitEvent event) {
        ProjectileSource shooter = event.getEntity().getShooter();
        if (event.getEntity() instanceof Creeper && shooter instanceof Player) {
            Player momos = (Player) shooter;
            System.out.println("Hola, "+momos.getName());
            momos.sendMessage("message :V");
        }
    }
    @EventHandler
    public void projecileShoot(ProjectileLaunchEvent event){
        if (event.getEntity().getShooter() instanceof Skeleton) {
            long number = Math.round(Math.random());
            
        }
    }
}