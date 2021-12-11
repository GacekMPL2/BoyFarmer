package me.gacekmpl2.Utils;

import org.bukkit.entity.Player;


public class ChatUtils {
    public static String color(String toColor) {
        return toColor.replaceAll("&", String.valueOf('§'));
    }

    public static void sendMessage(Player player, String message) {
        player.sendMessage(color(message));
    }
}