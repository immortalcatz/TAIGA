package com.sosnitzka.ztic_addon;

import com.google.common.base.Joiner;
import com.sosnitzka.ztic_addon.blocks.BlockLignite;
import com.sosnitzka.ztic_addon.blocks.BlockTiberium;
import com.sosnitzka.ztic_addon.generic.BasicBlock;
import com.sosnitzka.ztic_addon.generic.BasicBlockGround;
import com.sosnitzka.ztic_addon.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Arrays;

import static com.sosnitzka.ztic_addon.util.Utils.PREFIX_BLOCK;
import static com.sosnitzka.ztic_addon.util.Utils.PREFIX_ORE;

public class Blocks {
    public static Block basalt = new BasicBlock("basalt", Material.ROCK, 45.0f, 35.0f, 3);
    public static Block rottenGround = new BasicBlockGround("rotten_ground", Material.GROUND, 2.0f, 2.0f, 0);
    public static Block ligniteOre = new BlockLignite();

    public static Block aardiumOre = new BasicBlock("aardium_ore", Material.ROCK, 55.0f, 400.0f, 3, PREFIX_ORE);
    public static Block adamantiteOre = new BasicBlock("adamantite_ore", Material.ROCK, 80.0f, 1000.0f, 4, PREFIX_ORE);
    public static Block arcaniteOre = new BasicBlock("arcanite_ore", Material.ROCK, 23.0f, 25.0f, 2, PREFIX_ORE);
    public static Block axiidianOre = new BasicBlock("axiidian_ore", Material.ROCK, 13.0f, 13.0f, 3, PREFIX_ORE);
    public static Block bismuthOre = new BasicBlock("bismuth_ore", Material.ROCK, 8.0f, 8.0f, 1, PREFIX_ORE);
    public static Block eterniteOre = new BasicBlock("eternite_ore", Material.ROCK, 24.0f, 25.0f, 3, PREFIX_ORE);
    public static Block ignititeOre = new BasicBlock("ignitite_ore", Material.ROCK, 23.0f, 25.0f, 3, PREFIX_ORE);
    public static Block karmesineOre = new BasicBlock("karmesine_ore", Material.ROCK, 13.0f, 15.0f, 1, PREFIX_ORE);
    public static Block meteoriteOre = new BasicBlock("meteorite_ore", Material.ROCK, 60.0f, 500.0f, 4, PREFIX_ORE);
    public static Block mindoriteOre = new BasicBlock("mindorite_ore", Material.ROCK, 12.0f, 12.0f, 2, PREFIX_ORE);
    public static Block mythrilOre = new BasicBlock("mythril_ore", Material.ROCK, 25.0f, 25.0f, 4, PREFIX_ORE);
    public static Block palladiumOre = new BasicBlock("palladium_ore", Material.ROCK, 25.0f, 25.0f, 3, PREFIX_ORE);
    public static Block prometheumOre = new BasicBlock("prometheum_ore", Material.ROCK, 35.0f, 35.0f, 4, 0.25f, PREFIX_ORE);
    public static Block slagironOre = new BasicBlock("slagiron_ore", Material.ROCK, 3.0f, 5.0f, 1);
    public static Block slaggoldOre = new BasicBlock("slaggold_ore", Material.ROCK, 3.0f, 5.0f, 1);
    public static Block tiberiumOre = new BlockTiberium();
    public static Block vibraniumOre = new BasicBlock("vibranium_ore", Material.ROCK, 70.0f, 800.0f, 4, PREFIX_ORE);
    public static Block yrdeanOre = new BasicBlock("yrdean_ore", Material.ROCK, 13.0f, 15.0f, 3, PREFIX_ORE);

    public static Block aardiumBlock = new BasicBlock("aardium_block", Material.ROCK, 55.0f, 400.0f, 3, PREFIX_BLOCK);
    public static Block adamantiteBlock = new BasicBlock("adamantite_block", Material.ROCK, 80.0f, 1000.0f, 4, PREFIX_BLOCK);
    public static Block arcaniteBlock = new BasicBlock("arcanite_block", Material.ROCK, 23.0f, 25.0f, 2, PREFIX_BLOCK);
    public static Block axiidianBlock = new BasicBlock("axiidian_block", Material.ROCK, 13.0f, 13.0f, 3, PREFIX_BLOCK);
    public static Block bismuthBlock = new BasicBlock("bismuth_block", Material.ROCK, 8.0f, 8.0f, 1, PREFIX_BLOCK);
    public static Block eterniteBlock = new BasicBlock("eternite_block", Material.ROCK, 24.0f, 25.0f, 3, PREFIX_BLOCK);
    public static Block ignititeBlock = new BasicBlock("ignitite_block", Material.ROCK, 23.0f, 25.0f, 3, PREFIX_BLOCK);
    public static Block karmesineBlock = new BasicBlock("karmesine_block", Material.ROCK, 13.0f, 15.0f, 1, PREFIX_BLOCK);
    public static Block meteoriteBlock = new BasicBlock("meteorite_block", Material.ROCK, 60.0f, 500.0f, 4, PREFIX_BLOCK);
    public static Block mindoriteBlock = new BasicBlock("mindorite_block", Material.ROCK, 12.0f, 12.0f, 2, PREFIX_BLOCK);
    public static Block mythrilBlock = new BasicBlock("mythril_block", Material.ROCK, 25.0f, 25.0f, 4, PREFIX_BLOCK);
    public static Block palladiumBlock = new BasicBlock("palladium_block", Material.ROCK, 25.0f, 25.0f, 3, PREFIX_BLOCK);
    public static Block prometheumBlock = new BasicBlock("prometheum_block", Material.ROCK, 35.0f, 35.0f, 4, 0.25f, PREFIX_BLOCK);
    public static Block tiberiumBlock = new BasicBlock("tiberium_block", Material.ROCK, 30.0f, 30.0f, 3, 1f, PREFIX_BLOCK);
    public static Block vibraniumBlock = new BasicBlock("vibranium_block", Material.ROCK, 70.0f, 800.0f, 4, PREFIX_BLOCK);
    public static Block yrdeanBlock = new BasicBlock("yrdean_block", Material.ROCK, 13.0f, 15.0f, 3, PREFIX_BLOCK);

    public static Block astriumBlock = new BasicBlock("astrium_block", Material.ROCK, 55.0f, 400.0f, 3, PREFIX_BLOCK);
    public static Block blazingXylititeBlock = new BasicBlock("blazing_xylitite_block", Material.ROCK, 80.0f, 1000.0f, 4, PREFIX_BLOCK);
    public static Block cryptogenBlock = new BasicBlock("cryptogen_block", Material.ROCK, 23.0f, 25.0f, 2, PREFIX_BLOCK);
    public static Block dysprosaniumBlock = new BasicBlock("dysprosanium_block", Material.ROCK, 13.0f, 13.0f, 3, PREFIX_BLOCK);
    public static Block fractoryteBlock = new BasicBlock("fractoryte_block", Material.ROCK, 8.0f, 8.0f, 1, PREFIX_BLOCK);
    public static Block imperomiteBlock = new BasicBlock("imperomite_block", Material.ROCK, 24.0f, 25.0f, 3, PREFIX_BLOCK);
    public static Block instableDyoniteBlock = new BasicBlock("instable_dyonite_block", Material.ROCK, 23.0f, 25.0f, 3, PREFIX_BLOCK);
    public static Block instableNitroniteBlock = new BasicBlock("instable_nitronite_block", Material.ROCK, 13.0f, 15.0f, 1, PREFIX_BLOCK);
    public static Block instablePolyniumBlock = new BasicBlock("instablePolynium_block", Material.ROCK, 60.0f, 500.0f, 4, PREFIX_BLOCK);
    public static Block instablePrysociteBlock = new BasicBlock("instable_prysocite_block", Material.ROCK, 12.0f, 12.0f, 2, PREFIX_BLOCK);
    public static Block proxideumBlock = new BasicBlock("proxideum_block", Material.ROCK, 25.0f, 25.0f, 4, PREFIX_BLOCK);
    public static Block radiantPliniumBlock = new BasicBlock("radiant_plinium_block", Material.ROCK, 25.0f, 25.0f, 3, PREFIX_BLOCK);
    public static Block refractiveBysmuidBlock = new BasicBlock("refractive_bysmuid_block", Material.ROCK, 35.0f, 35.0f, 4, 0.25f, PREFIX_BLOCK);
    public static Block seismodiumBlock = new BasicBlock("seismodium_block", Material.ROCK, 30.0f, 30.0f, 3, 1f, PREFIX_BLOCK);
    public static Block terramiteBlock = new BasicBlock("terramite_block", Material.ROCK, 70.0f, 800.0f, 4, PREFIX_BLOCK);
    public static Block ultraniteBlock = new BasicBlock("ultranite_block", Material.ROCK, 13.0f, 15.0f, 3, PREFIX_BLOCK);


    public static void register() {
        Field[] declaredFields = Blocks.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                Class<?> targetType = field.getType();
                try {
                    Block block = (Block) field.get(targetType);
                    Utils.registerBlockWithItem(block);

                    if (block instanceof BasicBlock) {
                        if (((BasicBlock) block).isOreDict()) {
                            String oreDictName;
                            String[] nameParts = block.getUnlocalizedName().replace("tile.", "").split("_");

                            if (nameParts.length > 2) {
                                oreDictName = Joiner.on("_").join(Arrays.copyOfRange(nameParts, 0, nameParts.length - 1));
                            } else {
                                oreDictName = nameParts[0];
                            }

                            OreDictionary.registerOre(((BasicBlock) block).getOreDictPrefix() + StringUtils.capitalize(oreDictName), block);
                            System.out.println(String.format("Registered OreDict: %s", ((BasicBlock) block).getOreDictPrefix() + StringUtils.capitalize(oreDictName)));
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
