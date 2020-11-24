package me.yangwenli.events;

import me.yangwenli.events.utilities.Color;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Events extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Start!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        // Here is the code that will be run once the event is triggered.
        Player player = event.getPlayer();
        player.sendMessage("O Roussos einai gay!!");
    }

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event){
        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.BLUE + "Ths Manas sou to mpriki!!");
    }

    @EventHandler
    public void onDeath2(PlayerDeathEvent event){
        event.setDeathMessage(Color.format("Psofaa poutsooopaido!!&4&l&kiiiiiiii"));
    }
}