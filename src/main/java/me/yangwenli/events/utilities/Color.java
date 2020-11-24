package me.yangwenli.events.utilities;

import org.bukkit.ChatColor;

public final class Color {
    public static String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}

