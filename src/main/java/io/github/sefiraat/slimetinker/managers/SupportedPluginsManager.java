package io.github.sefiraat.slimetinker.managers;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

@SuppressWarnings("SpellCheckingInspection")
public final class SupportedPluginsManager {

    private SupportedPluginsManager() {
        throw new IllegalStateException("Utility class");
    }

    public static final boolean INFINITY_EXPANSION;
    public static final boolean SLIMEFUN_WARFARE;
    public static final boolean DYNATECH;
    public static final boolean LITEXPANSION;
    public static final boolean TRANSCENDENCE;
    public static final boolean NETWORKS;

    public static Plugin TRANSCENDENCE_PLUGIN;

    public static final String CORE_NOTE = ThemeUtils.MAIN + "黏液匠魂(SlimeTinker)";
    public static final String INFINITY_EXPANSION_NOTE = ThemeUtils.ADD_INFINITY + "無限科技(InfinityExpansion)";
    public static final String SLIMEFUN_WARFARE_NOTE = ThemeUtils.ADD_SLIMEFUN_WARFARE + "戰爭工藝(SlimefunWarfare)";
    public static final String DYNATECH_NOTE = ThemeUtils.ADD_DYNATECH + "動力科技(DynaTech)";
    public static final String LITEXPANSION_NOTE = ThemeUtils.ADD_LITEXPANSION + "工業(LiteXpansion)";
    public static final String TRANSCENDENCE_NOTE = ThemeUtils.ADD_TRANSCENDENCE + "終界科技(TranscEndence)";
    public static final String NETWORKS_NOTE = ThemeUtils.ADD_NETWORKS + "網路(Networks)";

    static {
        PluginManager pluginManager = SlimeTinker.getInstance().getServer().getPluginManager();
        INFINITY_EXPANSION = pluginManager.isPluginEnabled("InfinityExpansion");
        SLIMEFUN_WARFARE = pluginManager.isPluginEnabled("SlimefunWarfare");
        DYNATECH = pluginManager.isPluginEnabled("DynaTech");
        LITEXPANSION = pluginManager.isPluginEnabled("LiteXpansion");
        TRANSCENDENCE = pluginManager.isPluginEnabled("TranscEndence");
        NETWORKS = pluginManager.isPluginEnabled("Networks");

        if (TRANSCENDENCE) {
            TRANSCENDENCE_PLUGIN = pluginManager.getPlugin("TranscEndence");
        }
    }

    public static boolean isInfinityExpansion() {
        return INFINITY_EXPANSION;
    }

    public static boolean isSlimefunWarfare() {
        return SLIMEFUN_WARFARE;
    }

    public static boolean isDynatech() {
        return DYNATECH;
    }

    public static boolean isLitexpansion() {
        return LITEXPANSION;
    }

    public static boolean isTranscendence() {
        return TRANSCENDENCE;
    }

    public static boolean isNetworks() {
        return NETWORKS;
    }
}
