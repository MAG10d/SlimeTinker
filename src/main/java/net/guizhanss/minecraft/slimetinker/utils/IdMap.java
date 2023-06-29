package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;

import java.util.HashMap;
import java.util.Map;

/**
 * 包含大部分 {@link Ids} 對應的中文
 */
public class IdMap {

    private IdMap() {
        throw new IllegalStateException("Utility class");
    }

    private static final Map<String, String> idMap = new HashMap<>();

    static {
        // Vanilla + Core Sf
        idMap.put(Ids.IRON, "鐵");
        idMap.put(Ids.GOLD, "金");
        idMap.put(Ids.COPPER, "銅");
        idMap.put(Ids.SILVER, "銀");
        idMap.put(Ids.TIN, "錫");
        idMap.put(Ids.MAGNESIUM, "鎂");
        idMap.put(Ids.ALUMINUM, "鋁");
        idMap.put(Ids.LEAD, "鉛");
        idMap.put(Ids.ZINC, "鋅");
        idMap.put(Ids.COAL, "煤");
        idMap.put(Ids.STEEL, "鋼");
        idMap.put(Ids.DAMASCUS_STEEL, "大馬士革鋼");
        idMap.put(Ids.DURALUMIN, "硬鋁");
        idMap.put(Ids.BRONZE, "青銅");
        idMap.put(Ids.ALUMINUM_BRONZE, "鋁青銅");
        idMap.put(Ids.HARDENED_METAL, "硬化金屬");
        idMap.put(Ids.CORINTHIAN_BRONZE, "科林斯青銅");
        idMap.put(Ids.SOLDER, "焊錫");
        idMap.put(Ids.BILLON, "銀銅合金");
        idMap.put(Ids.BRASS, "黃銅");
        idMap.put(Ids.ALUMINUM_BRASS, "鋁黃銅");
        idMap.put(Ids.NICKEL, "鎳");
        idMap.put(Ids.COBALT, "鈷");
        idMap.put(Ids.REINFORCED_ALLOY, "強化合金");
        idMap.put(Ids.STRING, "線");
        idMap.put(Ids.VINE, "藤蔓");
        idMap.put(Ids.CRIMSON_ROOTS, "緋紅菌索");
        idMap.put(Ids.WARPED_ROOTS, "詭異菌索");
        idMap.put(Ids.WEEPING_VINES, "垂淚藤");
        idMap.put(Ids.TWISTING_VINES, "纏怨藤");
        idMap.put(Ids.SLIME, "黏液");
        idMap.put(Ids.LEATHER, "皮革");
        idMap.put(Ids.DIAMOND, "鑽石");
        idMap.put(Ids.REDSTONE, "紅石");
        idMap.put(Ids.REDSTONE_ALLOY, "紅石合金");
        idMap.put(Ids.SILICON, "矽");
        idMap.put(Ids.FERROSILICON, "矽鐵");
        idMap.put(Ids.BOOMERITE, "Boomer合金");
        idMap.put(Ids.SEFIRITE, "Sefi合金");
        idMap.put(Ids.LIQUID_CHRISTMAS, "聖誕禮物");
        idMap.put(Ids.CRINGLEIUM, "聖誕合金");
        idMap.put(Ids.FLOWING_FONDNESS, "喜愛");
        idMap.put(Ids.DETAILED_DEVOTION, "深愛");
        idMap.put(Ids.PURIFIED_PASSION, "熱情");
        idMap.put(Ids.LIQUID_LOVE, "愛");
        idMap.put(Ids.NICEINIUM, "Nice");
        idMap.put(Ids.DRACONIC, "龍息");
        idMap.put(Ids.REINFORCED_DRACONIUM, "強化龍");

        // Mods
        idMap.put("QUARTZ", "石英");
        idMap.put("LAPIS_LAZULI", "青金石");
        idMap.put("MOD_PLATE", "強化合金板");
        idMap.put("EMERALD", "綠寶石");

        // Infinity Expansion (SlimefunGuguProject)
        idMap.put(Ids.VOID, "虛空");
        idMap.put(Ids.INFINITY, "無盡");
        idMap.put(Ids.FORTUNE_SINGULARITY, "時運奇點");
        idMap.put(Ids.MAGIC_SINGULARITY, "魔法奇點");
        idMap.put(Ids.EARTH_SINGULARITY, "地球奇點");
        idMap.put(Ids.METAL_SINGULARITY, "金屬奇點");
        idMap.put(Ids.MAGSTEEL, "磁鋼");
        idMap.put(Ids.TITANIUM, "鈦");
        idMap.put(Ids.MYTHRIL, "秘銀");
        idMap.put(Ids.ADAMANTITE, "精金");
        idMap.put(Ids.MAGNONIUM, "磁金");
        idMap.put(Ids.COPPER_SINGULARITY, "銅奇點");
        idMap.put(Ids.ZINC_SINGULARITY, "鋅奇點");
        idMap.put(Ids.TIN_SINGULARITY, "錫奇點");
        idMap.put(Ids.ALUMINUM_SINGULARITY, "鋁奇點");
        idMap.put(Ids.SILVER_SINGULARITY, "銀奇點");
        idMap.put(Ids.MAGNESIUM_SINGULARITY, "鎂奇點");
        idMap.put(Ids.LEAD_SINGULARITY, "鉛奇點");
        idMap.put(Ids.GOLD_SINGULARITY, "金奇點");
        idMap.put(Ids.IRON_SINGULARITY, "鐵奇點");
        idMap.put(Ids.DIAMOND_SINGULARITY, "鑽石奇點");
        idMap.put(Ids.INFINITY_SINGULARITY, "無盡奇點");

        // Slimefun Warfare
        idMap.put(Ids.SLIMESTEEL, "軟鋼");
        idMap.put(Ids.REINFORCED_SLIMESTEEL, "強化軟鋼");
        idMap.put(Ids.OSMIUM_SUPERALLOY, "鋨高溫合金");
        idMap.put(Ids.OSMIUM, "鋨");
        idMap.put(Ids.SEGGANESSON, "塞格尼森");
        idMap.put(Ids.UNPATENTABLIUM, "非專利品");

        // DynaTech
        idMap.put(Ids.STAINLESS_STEEL, "不鏽鋼");
        idMap.put(Ids.VEX_GEM, "惱鬼寶石");
        idMap.put(Ids.STARDUST, "星塵");
        idMap.put(Ids.GHOSTLY_ESSENCE, "幽靈精華");
        idMap.put(Ids.TESSERACT, "光學材料");

        // LiteXpansion
        idMap.put(Ids.RUBBER, "橡膠");
        idMap.put(Ids.REFINED_IRON, "精煉鐵");
        idMap.put(Ids.MIXED_METAL, "合金");
        idMap.put(Ids.ADVANCED_ALLOY, "高級合金");
        idMap.put(Ids.THORIUM, "釷");
        idMap.put(Ids.MAG_THOR, "鎂釷合金");
        idMap.put(Ids.CARBON_MESH, "粗製碳板");
        idMap.put(Ids.SCRAP, "廢料");
        idMap.put(Ids.IRIDIUM, "銥");

        // TranscEndence
        idMap.put(Ids.DAXI_STRENGTH, "超能力核心(S)");
        idMap.put(Ids.DAXI_ABSORPTION, "超能力核心(A)");
        idMap.put(Ids.DAXI_FORTITUDE, "超能力核心(F)");
        idMap.put(Ids.DAXI_SATURATION, "超能力核心(H)");
        idMap.put(Ids.DAXI_REGENERATION, "超能力核心(R)");

        // Networks
        idMap.put(Ids.MOLTEN_PRESENCE, "跨越維度的存在");
        idMap.put(Ids.REMOTININIUM, "古代遠端存取");
        idMap.put(Ids.ULTIMANINIUM, "終極遠端存取");
    }

    public static Map<String, String> getMap() {
        return idMap;
    }
}
