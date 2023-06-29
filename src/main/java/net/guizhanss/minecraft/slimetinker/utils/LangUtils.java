package net.guizhanss.minecraft.slimetinker.utils;

import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;

public final class LangUtils {

    private LangUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getMaterialName(String type) {
        String result = IdMap.getMap().get(type.toUpperCase());
        return result != null ? result : ThemeUtils.toTitleCase(type);
    }

    public static String getToolName(String type){
        switch(type.toUpperCase()){
            case Ids.PICKAXE:
                return "鎬";
            case Ids.SHOVEL:
                return "鏟";
            case Ids.AXE:
                return "斧";
            case Ids.SWORD:
                return "劍";
            case Ids.HOE:
                return "鋤";
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getToolHead(String type){
        switch(type.toUpperCase()){
            case Ids.PICKAXE:
                return "鎬頭";
            case Ids.SHOVEL:
                return "鏟頭";
            case Ids.AXE:
                return "斧刃";
            case Ids.SWORD:
                return "劍刃";
            case Ids.HOE:
                return "鋤頭";
            default:
                return ThemeUtils.toTitleCase(type);
        }
    }

    public static String getArmorPart(String part) {
        switch(part.toUpperCase()){
            case Ids.HELMET:
                return "頭盔";
            case Ids.CHESTPLATE:
                return "胸甲";
            case Ids.LEGGINGS:
                return "護腿";
            case Ids.BOOTS:
                return "靴子";
            default:
                return ThemeUtils.toTitleCase(part);
        }
    }

    public static String getToolOrArmorName(String type){
        String toolName = getToolName(type);
        return toolName.equals(ThemeUtils.toTitleCase(type)) ? getArmorPart(type) : toolName;
    }
}
