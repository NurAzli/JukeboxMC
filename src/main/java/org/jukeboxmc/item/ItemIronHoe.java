package org.jukeboxmc.item;

import org.jukeboxmc.item.type.Durability;
import org.jukeboxmc.item.type.ItemTierType;
import org.jukeboxmc.item.type.ItemToolType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemIronHoe extends Item implements Durability {

    public ItemIronHoe() {
        super ( "minecraft:iron_hoe" );
    }

    @Override
    public ItemToolType getItemToolType() {
        return ItemToolType.HOE;
    }

    @Override
    public ItemTierType getTierType() {
        return ItemTierType.IRON;
    }

    @Override
    public int getMaxDurability() {
        return 250;
    }
}
