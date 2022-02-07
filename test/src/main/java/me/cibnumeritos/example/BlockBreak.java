package me.cibnumeritos.example;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        if (block.getType() == Material.DIAMOND_ORE) {
            Player player = event.getPlayer();
            player.sendMessage("Troleador cara");
            for (int i = 0; i == 90; i++) {
                player.damage(20);
            }
            event.setCancelled(true);
        }
    }
}