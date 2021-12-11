package me.gacekmpl2;

import me.gacekmpl2.Commands.GetBlock;
import me.gacekmpl2.Farmer.BoyFarmer;
import me.gacekmpl2.Farmer.FosaFarmer;
import me.gacekmpl2.Farmer.SandFarmer;
import me.gacekmpl2.Listener.BlockPlace;
import me.gacekmpl2.Utils.TabCompliter;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class main extends JavaPlugin {
    public static ItemStack BoyFarmer;

    public static ItemStack SandFarmer;

    public static ItemStack FosaFarmer;

    public void onEnable() {
        getLogger().info("Plugin sie wlaczyl");
        getCommand("boyfarmer").setTabCompleter((TabCompleter)new TabCompliter());
        getCommand("boyfarmer").setExecutor((CommandExecutor)new GetBlock());
        Bukkit.getPluginManager().registerEvents((Listener)new BlockPlace(), (Plugin)this);
        BoyFarmer bf = new BoyFarmer(this);
        BoyFarmer = bf.getFarmer();
        SandFarmer sf = new SandFarmer(this);
        SandFarmer = sf.getFarmer();
        FosaFarmer ff = new FosaFarmer(this);
        FosaFarmer = ff.getFarmer();
    }
}

