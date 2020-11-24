package me.yangwenli.events.eventspack;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.DARK_BLUE + player.getDisplayName()  + ChatColor.WHITE + "POU PAS GAMW TH MANA SOU!!");
    }
}
