package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.TinkersSmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Materials {

    private Materials() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Vanilla + Core SF

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_COPPER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COPPER",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "銅粒",
        "由熔融銅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_TIN = ThemeUtils.themedItemStack(
        "NUGGET_CAST_TIN",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "錫粒",
        "由熔融錫製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ZINC = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ZINC",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鋅粒",
        "由熔融鋅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALUMINUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALUMINUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鋁粒",
        "由熔融鋁製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGNESIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGNESIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鎂粒",
        "由熔融鎂製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_LEAD = ThemeUtils.themedItemStack(
        "NUGGET_CAST_LEAD",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鉛粒",
        "由熔融鉛製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SILVER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SILVER",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "銀粒",
        "由熔融銀製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_COAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COAL",
        Material.POLISHED_BLACKSTONE_BUTTON,
        ThemeItemType.CRAFTING,
        "煤粒",
        "由熔融煤製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_STEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_STEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鋼粒",
        "由熔融鋼製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAMASCUS_STEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAMASCUS_STEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "大馬士革鋼粒",
        "由熔融大馬士革鋼製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DURALIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DURALIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "硬鋁粒",
        "由熔融硬鋁製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BRONZE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "青銅粒",
        "由熔融青銅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALU_BRONZE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "鋁青銅粒",
        "由熔融鋁青銅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_HARD_METAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_HARD_METAL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "硬化金屬粒",
        "由熔融硬化金屬製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_COR_BRONZE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COR_BRONZE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "科林斯青銅粒",
        "由熔融科林斯青銅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SOLDER = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SOLDER",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "焊錫粒",
        "由熔融焊錫製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BILLON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BILLON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "銀銅合金粒",
        "由熔融銀銅合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BRASS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BRASS",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "黃銅粒",
        "由熔融黃銅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRASS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ALU_BRASS",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "鋁黃銅粒",
        "由熔融鋁黃銅製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_NICKEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_NICKEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鎳粒",
        "由熔融鎳製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_COBALT = ThemeUtils.themedItemStack(
        "NUGGET_CAST_COBALT",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鈷粒",
        "由熔融鈷製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "強化合金粒",
        "由熔融強化合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_FERROSILICON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_FERROSILICON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "矽鐵粒",
        "由熔融矽鐵製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_REDSTONE_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REDSTONE_ALLOY",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "紅石合金粒",
        "由熔融紅石合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_BOOMERITE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "Boomer合金粒",
        "由熔融Boomer合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SEFIRITE",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "Sefi合金粒",
        "由熔融Sefi合金製成的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_CRINGLEIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "聖誕合金粒",
        "由熔融聖誕合金製成的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_FONDNESS = ThemeUtils.themedItemStack(
        "NUGGET_CAST_FONDNESS",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "喜愛粒",
        "帶有喜愛意義的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_DEVOTION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DEVOTION",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "深愛粒",
        "帶有深愛意義的梨"
    );
    public static final SlimefunItemStack NUGGET_CAST_PASSION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_PASSION",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "熱情粒",
        "帶有熱情意義的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_LOVE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_LOVE",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "愛之粒",
        "由純真的愛鑄造而成的粒"
    );
    public static final SlimefunItemStack NUGGET_CAST_NICE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_NICE",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "Nice粒",
        "Nice~"
    );
    public static final SlimefunItemStack NUGGET_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SMITHIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "史密斯粒",
        "一種直接的金屬，有多種工業用途。"
    );
    public static final SlimefunItemStack NUGGET_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ANNIVERSARIUM",
        Material.GOLD_NUGGET,
        ThemeItemType.CRAFTING,
        "周年慶粒",
        "慶祝黏液科技10周年!"
    );
    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED_DRACONIUM",
        Material.CRIMSON_BUTTON,
        ThemeItemType.CRAFTING,
        "強化龍粒",
        "由無盡的憤怒鑄造而成的粒"
    );
    // endregion

    // region Ingots
    public static final SlimefunItemStack INGOT_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "INGOT_CAST_BOOMERITE",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "Boomer合金錠",
        "由熔融Boomer合金製成的錠"
    );
    public static final SlimefunItemStack INGOT_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "INGOT_CAST_SEFIRITE",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "Sefi合金錠",
        "由熔融Sefi合金製成的錠",
        "不穩定,只能存在一小段時間"
    );
    public static final SlimefunItemStack INGOT_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_CRINGLEIUM",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "聖誕合金錠",
        "由熔融聖誕合金製成的錠",
        "不穩定,只能存在一小段時間"
    );
    public static final SlimefunItemStack INGOT_CAST_FONDNESS = ThemeUtils.themedItemStack(
        "INGOT_CAST_FONDNESS",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "喜愛錠",
        "帶有喜愛意義的錠"
    );
    public static final SlimefunItemStack INGOT_CAST_DEVOTION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DEVOTION",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "深愛錠",
        "帶有深愛意義的錠"
    );
    public static final SlimefunItemStack INGOT_CAST_PASSION = ThemeUtils.themedItemStack(
        "INGOT_CAST_PASSION",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "熱情錠",
        "帶有熱情意義的錠"
    );
    public static final SlimefunItemStack INGOT_CAST_LOVE = ThemeUtils.themedItemStack(
        "INGOT_CAST_LOVE",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "愛之錠",
        "由純真的愛製成的錠"
    );
    public static final SlimefunItemStack INGOT_CAST_NICE = ThemeUtils.themedItemStack(
        "INGOT_CAST_NICE",
        Material.GOLD_INGOT,
        ThemeItemType.CRAFTING,
        "Nice錠",
        "Nice~"
    );
    public static final SlimefunItemStack INGOT_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_SMITHIUM",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "史密斯錠",
        "一種直接的金屬，有多種工業用途。"
    );
    public static final SlimefunItemStack INGOT_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_ANNIVERSARIUM",
        Material.GOLD_INGOT,
        ThemeItemType.CRAFTING,
        "周年慶錠",
        "慶祝黏液科技10周年!"
    );
    public static final SlimefunItemStack INGOT_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "INGOT_CAST_REINFORCED_DRACONIUM",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "強化龍錠",
        "由無盡的憤怒鑄造而成的錠"
    );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_COPPER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COPPER",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "銅塊",
        "由熔融銅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_TIN = ThemeUtils.themedItemStack(
        "BLOCK_CAST_TIN",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "錫塊",
        "由熔融錫製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_ZINC = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ZINC",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鋅塊",
        "由熔融鋅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALUMINUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALUMINUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鋁塊",
        "由熔融鋁製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGNESIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGNESIUM",
        Material.PINK_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "鎂塊",
        "由熔融鎂製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_LEAD = ThemeUtils.themedItemStack(
        "BLOCK_CAST_LEAD",
        Material.PURPLE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "鉛塊",
        "由熔融鉛製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_SILVER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SILVER",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "銀塊",
        "由熔融銀製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_STEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_STEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鋼塊",
        "由熔融鋼製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_DAMASCUS_STEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_DAMASCUS_STEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "大馬士革鋼塊",
        "由熔融大馬士革鋼製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_DURALIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_DURALIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "硬鋁塊",
        "由熔融硬鋁製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "青銅塊",
        "由熔融青銅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALU_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "鋁青銅塊",
        "由熔融鋁青銅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_HARD_METAL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_HARD_METAL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "硬化金屬塊",
        "由熔融硬化金屬製成的塊"
    );
    public static final SlimefunItemStack BLOCK_CAST_COR_BRONZE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COR_BRONZE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "科林斯青銅塊",
        "由熔融科林斯青銅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_SOLDER = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SOLDER",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "焊錫塊",
        "由熔融焊錫製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_BILLON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BILLON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "銀銅合金塊",
        "由熔融銀銅合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_BRASS = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BRASS",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "黃銅塊",
        "由熔融黃銅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRASS = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ALU_BRASS",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鋁黃銅塊",
        "由熔融鋁黃銅製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_NICKEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_NICKEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鎳塊",
        "由熔融鎳製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_COBALT = ThemeUtils.themedItemStack(
        "BLOCK_CAST_COBALT",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鈷塊",
        "由熔融鈷製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "強化合金塊",
        "由熔融強化合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_FERROSILICON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_FERROSILICON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "矽鐵塊",
        "由熔融矽鐵製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_REDSTONE_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REDSTONE_ALLOY",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "紅石合金塊",
        "由熔融紅石合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_BOOMERITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_BOOMERITE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "Boomer合金塊",
        "由熔融Boomer合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_SEFIRITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SEFIRITE",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "Sefi合金塊",
        "由熔融Sefi合金製成的塊"
    );
    public static final SlimefunItemStack BLOCK_CAST_CRINGLEIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_CRINGLEIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "聖誕合金塊",
        "由熔融聖誕合金製成的塊"
    );
    public static final SlimefunItemStack BLOCK_CAST_LOVE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_LOVE",
        Material.PINK_DYE,
        ThemeItemType.CRAFTING,
        "愛之塊",
        "由純愛製成的塊"
    );
    public static final SlimefunItemStack BLOCK_CAST_NICE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_NICE",
        Material.GOLD_BLOCK,
        ThemeItemType.CRAFTING,
        "Nice塊",
        "Nice~"
    );

    public static final SlimefunItemStack BLOCK_CAST_SMITHIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SMITHIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "史密斯塊",
        "一種直接的金屬，有多種工業用途。"
    );
    public static final SlimefunItemStack BLOCK_CAST_ANNIVERSARIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ANNIVERSARIUM",
        Material.GOLD_BLOCK,
        ThemeItemType.CRAFTING,
        "周年慶塊",
        "慶祝黏液科技10周年!"
    );
    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_DRACONIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED_DRACONIUM",
        Material.RED_CONCRETE,
        ThemeItemType.CRAFTING,
        "強化龍塊",
        "由無盡的憤怒鑄造而成的塊"
    );
    // endregion

    // region Crafts
    public static final SlimefunItemStack MOD_PLATE = ThemeUtils.themedItemStack(
        "MOD_PLATE",
        Material.OBSIDIAN,
        ThemeItemType.MOD,
        "強化合金板",
        ThemeUtils.PASSIVE + "一個模組,可以讓工具",
        ThemeUtils.PASSIVE + "有機率不消耗耐久"
    );

    public static final SlimefunItemStack GROUT = ThemeUtils.themedItemStack(
        "GROUT",
        Material.GRAVEL,
        ThemeItemType.CRAFTING,
        "水泥",
        ThemeUtils.PASSIVE + "可用來燒製成焦黑磚"
    );


    public static final SlimefunItemStack SEARED_BRICK = ThemeUtils.themedItemStack(
        "SEARED_BRICK",
        Material.BRICK,
        ThemeItemType.CRAFTING,
        "焦黑磚",
        ThemeUtils.PASSIVE + "用於合成匠魂冶煉爐方塊"
    );

    public static final SlimefunItemStack SMELTERY_CONTROLLER = ThemeUtils.themedItemStack(
        "SMELTERY_CONTROLLER",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "冶煉爐控制器",
        ThemeUtils.PASSIVE + "用於建造匠魂冶煉爐"
    );

    public static final SlimefunItemStack SEARED_TANK = ThemeUtils.themedItemStack(
        "SEARED_TANK",
        Material.RED_NETHER_BRICK_WALL,
        ThemeItemType.CRAFTING,
        "焦黑液罐",
        ThemeUtils.PASSIVE + "用於建造匠魂冶煉爐"
    );

    public static final SlimefunItemStack SPOUT = ThemeUtils.themedItemStack(
        "SPOUT",
        Material.POLISHED_BLACKSTONE_BRICK_WALL,
        ThemeItemType.CRAFTING,
        "焦黑澆鑄口",
        ThemeUtils.PASSIVE + "用於建造匠魂冶煉爐"
    );

    public static final SlimefunItemStack SEARED_BRICK_BLOCK = ThemeUtils.themedItemStack(
        "SEARED_BRICK_BLOCK",
        Material.POLISHED_BLACKSTONE_BRICKS,
        ThemeItemType.CRAFTING,
        "焦黑石磚",
        ThemeUtils.PASSIVE + "用於建造匠魂冶煉爐"
    );
    // endregion

    // endregion

    // region Infinity Expansion

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_INFINITY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_INFINITY",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "無盡粒",
        "由熔融無盡製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGSTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGSTEEL",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "磁鋼粒",
        "由熔融磁鋼製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_TITANIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_TITANIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鈦粒",
        "由熔融鈦製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MYTHRIL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MYTHRIL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "秘銀粒",
        "由熔融秘銀製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ADAMANTITE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ADAMANTITE",
        Material.ACACIA_BUTTON,
        ThemeItemType.CRAFTING,
        "精金粒",
        "由熔融精金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAGNONIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAGNONIUM",
        Material.CRIMSON_BUTTON,
        ThemeItemType.CRAFTING,
        "鎂合金粒",
        "由熔融鎂合金製成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_VOID = ThemeUtils.themedItemStack(
        "BLOCK_CAST_VOID",
        Material.NETHERITE_BLOCK,
        ThemeItemType.CRAFTING,
        "虛空塊",
        "由熔融虛空(?)製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_INFINITY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_INFINITY",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "無盡塊",
        "由熔融無盡製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGSTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGSTEEL",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "磁鋼塊",
        "由熔融磁鋼製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_TITANIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_TITANIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鈦塊",
        "由熔融鈦製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_MYTHRIL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MYTHRIL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "秘銀塊",
        "由熔融製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_ADAMANTITE = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ADAMANTITE",
        Material.TERRACOTTA,
        ThemeItemType.CRAFTING,
        "精金塊",
        "由熔融精金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAGNONIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAGNONIUM",
        Material.PURPLE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "鎂合金塊",
        "由熔融鎂合金製成的塊"
    );

    // endregion

    // endregion

    // region SFWarfare

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_SLIMESTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SLIMESTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "軟鋼粒",
        "由熔融軟鋼製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_SLIMESTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REINFORCED_SLIMESTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "強化軟鋼粒",
        "由熔融強化軟鋼製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_OSMIUM",
        Material.WARPED_BUTTON,
        ThemeItemType.CRAFTING,
        "鋨粒",
        "由熔融鋨製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM_SUPER_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_OSMIUM_SUPER_ALLOY",
        Material.WARPED_BUTTON,
        ThemeItemType.CRAFTING,
        "鋨高溫合金粒",
        "由熔融鋨高溫合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_UNPATENTABILUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_UNPATENTABILUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "非專利品粒",
        "由熔融非專利品製成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_SLIMESTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SLIMESTEEL",
        Material.SLIME_BLOCK,
        ThemeItemType.CRAFTING,
        "軟鋼塊",
        "由熔融軟鋼製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_SLIMESTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REINFORCED_SLIMESTEEL",
        Material.SLIME_BLOCK,
        ThemeItemType.CRAFTING,
        "強化軟鋼塊",
        "由熔融強化軟鋼製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_OSMIUM",
        Material.LIGHT_BLUE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "鋨塊",
        "由熔融鋨製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM_SUPER_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_OSMIUM_SUPER_ALLOY",
        Material.BLUE_TERRACOTTA,
        ThemeItemType.CRAFTING,
        "鋨高溫合金塊",
        "由熔融鋨高溫合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_UNPATENTABILUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_UNPATENTABILUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "非專利品塊",
        "由熔融非專利品製成的塊"
    );

    // endregion

    // endregion

    // region DynaTech

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_STAINLESSSTEEL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_STAINLESSSTEEL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "不鏽鋼粒",
        "由熔融不鏽鋼製成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_STAINLESSSTEEL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_STAINLESSSTEEL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "不鏽鋼塊",
        "由熔融不鏽鋼製成的塊"
    );

    // endregion

    // endregion

    // region LiteXpansion
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_REFINED_IRON = ThemeUtils.themedItemStack(
        "NUGGET_CAST_REFINED_IRON",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "精煉鐵粒",
        "由熔融精煉鐵製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MIXED_METAL = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MIXED_METAL",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "合金粒",
        "由熔融合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_ADVANCED_ALLOY = ThemeUtils.themedItemStack(
        "NUGGET_CAST_ADVANCED_ALLOY",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "高級合金粒",
        "由熔融高級合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_MAG_THOR = ThemeUtils.themedItemStack(
        "NUGGET_CAST_MAG_THOR",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "鎂釷合金粒",
        "由熔融鎂釷合金製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_SCRAP = ThemeUtils.themedItemStack(
        "NUGGET_CAST_SCRAP",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "廢料粒",
        "由熔融廢料製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_IRIDIUM = ThemeUtils.themedItemStack(
        "NUGGET_CAST_IRIDIUM",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "銥粒",
        "由熔融銥製成的粒"
    );

    // endregion

    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_REFINED_IRON = ThemeUtils.themedItemStack(
        "BLOCK_CAST_REFINED_IRON",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "精煉鐵塊",
        "由熔融精煉鐵製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_MIXED_METAL = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MIXED_METAL",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "合金塊",
        "由熔融合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_ADVANCED_ALLOY = ThemeUtils.themedItemStack(
        "BLOCK_CAST_ADVANCED_ALLOY",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "高級合金塊",
        "由熔融高級合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_MAG_THOR = ThemeUtils.themedItemStack(
        "BLOCK_CAST_MAG_THOR",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "鎂釷合金塊",
        "由熔融鎂釷合金製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_SCRAP = ThemeUtils.themedItemStack(
        "BLOCK_CAST_SCRAP",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "廢料塊",
        "由熔融廢料製成的塊"
    );

    public static final SlimefunItemStack BLOCK_CAST_IRIDIUM = ThemeUtils.themedItemStack(
        "BLOCK_CAST_IRIDIUM",
        Material.IRON_BLOCK,
        ThemeItemType.CRAFTING,
        "銥塊",
        "由熔融銥製成的塊"
    );

    // endregion

    // endregion

    // region TranscEndance

    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_DAXI_STRENGTH = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_STRENGTH",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(S)粒",
        "由熔融超能力核心(S)製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_ABSORPTION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_ABSORPTION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(A)粒",
        "由熔融超能力核心(A)製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_FORTITUDE = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_FORTITUDE",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(F)粒",
        "由熔融超能力核心(F)製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_SATURATION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_SATURATION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(H)粒",
        "由熔融超能力核心(H)製成的粒"
    );

    public static final SlimefunItemStack NUGGET_CAST_DAXI_REGENERATION = ThemeUtils.themedItemStack(
        "NUGGET_CAST_DAXI_REGENERATION",
        Material.IRON_NUGGET,
        ThemeItemType.CRAFTING,
        "超能力核心(R)粒",
        "由熔融超能力核心(R)製成的粒"
    );

    // endregion

    // region Ingots

    public static final SlimefunItemStack INGOT_CAST_DAXI_STRENGTH = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_STRENGTH",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(S)錠",
        "由熔融超能力核心(S)製成的錠"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_ABSORPTION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_ABSORPTION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(A)錠",
        "由熔融超能力核心(A)製成的錠"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_FORTITUDE = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_FORTITUDE",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(F)錠",
        "由熔融超能力核心(F)製成的錠"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_SATURATION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_SATURATION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(H)錠",
        "由熔融超能力核心(H)製成的錠"
    );

    public static final SlimefunItemStack INGOT_CAST_DAXI_REGENERATION = ThemeUtils.themedItemStack(
        "INGOT_CAST_DAXI_REGENERATION",
        Material.IRON_INGOT,
        ThemeItemType.CRAFTING,
        "超能力核心(R)錠",
        "由熔融超能力核心(R)製成的錠"
    );

    // endregion

    // endregion

    private static final ItemStack[] RECIPE_GROUT = new ItemStack[]{
        new ItemStack(Material.CLAY), new ItemStack(Material.SAND), new ItemStack(Material.SAND),
        new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.GRAVEL),
        new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL)
    };

    private static final ItemStack[] RECIPE_SEARED_BRICK = new ItemStack[]{
        Materials.GROUT, null, null,
        null, null, null,
        null, null, null
    };

    private static final ItemStack[] RECIPE_SEARED_BRICK_BLOCK = new ItemStack[]{
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
        null, null, null
    };

    private static final ItemStack[] RECIPE_SMELTERY_CONTROLLER = new ItemStack[]{
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, Materials.SEARED_BRICK, Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_SMELTERY_SPOUT = new ItemStack[]{
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, null, Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_SMELTERY_TANK = new ItemStack[]{
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK,
        Materials.SEARED_BRICK, new ItemStack(Material.GLASS), Materials.SEARED_BRICK
    };

    private static final ItemStack[] RECIPE_REINFORCED_PLATE = new ItemStack[]{
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,
        Materials.BLOCK_CAST_REINFORCED, new ItemStack(Material.OBSIDIAN), Materials.BLOCK_CAST_REINFORCED,
        Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED
    };

    public static void set(SlimeTinker p) {

        // Vanilla + Core SF + Tinker's General
        new UnplaceableBlock(ItemGroups.MATERIALS, GROUT, Workbench.TYPE, RECIPE_GROUT).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, SEARED_BRICK, RecipeType.SMELTERY, RECIPE_SEARED_BRICK).register(p);
        new TinkersSmeltery(ItemGroups.MATERIALS, SMELTERY_CONTROLLER, Workbench.TYPE, RECIPE_SMELTERY_CONTROLLER).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SEARED_TANK, Workbench.TYPE, RECIPE_SMELTERY_TANK).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SPOUT, Workbench.TYPE, RECIPE_SMELTERY_SPOUT).register(p);
        new SlimefunItem(ItemGroups.MATERIALS, SEARED_BRICK_BLOCK, Workbench.TYPE, RECIPE_SEARED_BRICK_BLOCK).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, MOD_PLATE, Workbench.TYPE, RECIPE_REINFORCED_PLATE).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COPPER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COPPER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_LEAD, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_LEAD, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SILVER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SILVER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALUMINUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALUMINUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGNESIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGNESIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ZINC, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ZINC, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_TIN, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_TIN, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DURALIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_DURALIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALU_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALU_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_HARD_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_HARD_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COR_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COR_BRONZE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SOLDER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SOLDER, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BILLON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BILLON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ALU_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ALU_BRASS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_NICKEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_NICKEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COBALT, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_COBALT, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_FERROSILICON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_FERROSILICON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_BOOMERITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SEFIRITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_CRINGLEIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_FONDNESS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_FONDNESS, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DEVOTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DEVOTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_PASSION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_PASSION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_LOVE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_NICE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SMITHIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ANNIVERSARIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED_DRACONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_COAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);

        // Infinity Expansion
        if (SupportedPluginsManager.INFINITY_EXPANSION) {
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_VOID, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_INFINITY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_INFINITY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_TITANIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_TITANIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MYTHRIL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MYTHRIL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ADAMANTITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ADAMANTITE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAGNONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAGNONIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // SFWarfare
        if (SupportedPluginsManager.SLIMEFUN_WARFARE) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_OSMIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_OSMIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_UNPATENTABILUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_UNPATENTABILUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // DynaTech
        if (SupportedPluginsManager.DYNATECH) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // LiteXpansion
        if (SupportedPluginsManager.LITEXPANSION) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_REFINED_IRON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_REFINED_IRON, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MIXED_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MIXED_METAL, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_MAG_THOR, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_MAG_THOR, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_SCRAP, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_SCRAP, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_IRIDIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, BLOCK_CAST_IRIDIUM, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // TranscEndence
        if (SupportedPluginsManager.TRANSCENDENCE) {
            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_STRENGTH, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_STRENGTH, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_ABSORPTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_ABSORPTION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_FORTITUDE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_FORTITUDE, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_SATURATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_SATURATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);

            new UnplaceableBlock(ItemGroups.MATERIALS, NUGGET_CAST_DAXI_REGENERATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(ItemGroups.MATERIALS, INGOT_CAST_DAXI_REGENERATION, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_INGOT)).register(p);
        }
    }
}
