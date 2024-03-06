package me.phredss.kernelib.PlayerUtils;

import org.bukkit.entity.Player;

import java.util.UUID;

public class Players {

    public static String playerName(Player player) {
        return player.getName();
    }

    public static UUID playerId(Player player) {
        return player.getUniqueId();
    }

    public static boolean permission(Player player, String permission) {
        return player.hasPermission(permission);
    }

    public void message(Player player, String message){
        player.sendMessage(message);
    }


}
