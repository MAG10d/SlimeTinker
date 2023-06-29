package io.github.sefiraat.slimetinker;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.Casts;
import io.github.sefiraat.slimetinker.items.Dies;
import io.github.sefiraat.slimetinker.items.Guide;
import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.Mods;
import io.github.sefiraat.slimetinker.items.Parts;
import io.github.sefiraat.slimetinker.items.Workstations;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterialManager;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.listeners.ListenerManager;
import io.github.sefiraat.slimetinker.managers.DispatchManager;
import io.github.sefiraat.slimetinker.managers.MemoryManager;
import io.github.sefiraat.slimetinker.managers.TraitManager;
import io.github.sefiraat.slimetinker.runnables.RunnableManager;
import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;
import org.bstats.bukkit.Metrics;

import java.util.logging.Level;

public class SlimeTinker extends AbstractAddon {

    public static final int RUNNABLE_TICK_RATE = 40;

    private static SlimeTinker instance;

    private RunnableManager runnableManager;
    private ListenerManager listenerManager;
    private TinkerMaterialManager tinkerMaterialManager;
    private DispatchManager dispatchManager;
    private Workbench workbench;
    private TraitManager traitManager;
    private MemoryManager memoryManager;

    public SlimeTinker() {
        super("SlimefunGuguProject", "SlimeTinker", "master", "auto-update");
    }

    @Override
    public void enable() {

        if (!getServer().getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
            getLogger().log(Level.SEVERE, "本插件需要 鬼斬前置庫插件(GuizhanLibPlugin) 才能運行!");
            getLogger().log(Level.SEVERE, "從此處下載: https://50l.cc/gzlib");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        new Metrics(this, 11748);

        instance = this;

        getLogger().info("########################################");
        getLogger().info("         Slime Tinker  黏液匠魂          ");
        getLogger().info("       作者: Sefiraat 漢化: ybw0014      ");
        getLogger().info("########################################");

        ItemGroups.set(this);
        Materials.set(this);
        Dies.set(this);
        Casts.set(this);
        Parts.set(this);
        Guide.set(this);
        Mods.set(this);
        Workstations.set(this);

        traitManager = new TraitManager();
        tinkerMaterialManager = new TinkerMaterialManager();
        runnableManager = new RunnableManager();
        dispatchManager = new DispatchManager();
        memoryManager = new MemoryManager();

        this.listenerManager = new ListenerManager(this, this.getServer().getPluginManager());

        if (getConfig().getBoolean("auto-update") && getDescription().getVersion().startsWith("Build")) {
            GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "SlimeTinker", "master");
        }
    }

    @Override
    protected void disable() {
        saveConfig();
        instance = null;
    }

    public RunnableManager getRunnableManager() {
        return runnableManager;
    }

    public ListenerManager getListenerManager() {
        return listenerManager;
    }

    public TinkerMaterialManager getCmManager() {
        return tinkerMaterialManager;
    }

    public DispatchManager getDispatchManager() {
        return dispatchManager;
    }

    public Workbench getWorkbench() {
        return workbench;
    }

    public void setWorkbench(Workbench workbench) {
        this.workbench = workbench;
    }

    public TraitManager getTraitManager() {
        return traitManager;
    }

    public static SlimeTinker getInstance() {
        return instance;
    }
}
