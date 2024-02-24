package org.jukeboxmc.server.item.behavior

import org.jukeboxmc.api.item.ItemType

class ItemCookedCod(itemType: ItemType, countNetworkId: Boolean) : JukeboxItemFood(itemType, countNetworkId) {

    override fun getSaturation(): Float {
        return 6F
    }

    override fun getHunger(): Int {
        return 5
    }
}