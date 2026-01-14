package com.raid.addon;

import com.raid.addon.commands.CommandExample;
import com.raid.addon.hud.HudExample;
import com.raid.addon.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class init extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        Modules.get().add(new AutoRaid());


    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }



    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("bitsixfour", "raidfarmaddon");
    }
}
