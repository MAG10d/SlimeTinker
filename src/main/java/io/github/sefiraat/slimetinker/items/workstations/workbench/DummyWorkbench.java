package io.github.sefiraat.slimetinker.items.workstations.workbench;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummyWorkbench {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY",
        Material.FLETCHING_TABLE,
        ThemeItemType.MACHINE,
        "匠魂合成站",
        "該物品在匠魂合成站中製作"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_WORKBENCH, STACK);

    private DummyWorkbench() {
        throw new IllegalStateException("Utility class");
    }
}
