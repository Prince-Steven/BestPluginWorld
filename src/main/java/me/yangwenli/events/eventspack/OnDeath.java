package me.yangwenli.events.eventspack;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath {

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        event.getEntity().sendMessage(ChatColor.RED + "POIOS MALFITE 15 LEVEL!! RIOOOOT!!!");
    }
}
