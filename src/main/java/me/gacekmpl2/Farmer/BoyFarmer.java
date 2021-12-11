package me.gacekmpl2.Farmer;

import me.gacekmpl2.Listener.AbstractRecipe;
import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.main;
import org.bukkit.Material;

public class BoyFarmer extends AbstractRecipe {
    public BoyFarmer(main m) {
        super(m);
    }

    public String getName() {
        return ChatUtils.color("&aBoyFarmer");
    }

    public String getDescription() {
        return ChatUtils.color("&7Postaw, aby stworzyc obsydian do samego dolu");
    }

    public Material getMaterial() {
        return Material.OBSIDIAN;
    }
}
