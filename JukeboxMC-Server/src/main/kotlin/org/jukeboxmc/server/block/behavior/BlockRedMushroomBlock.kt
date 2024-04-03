package org.jukeboxmc.server.block.behavior

import org.cloudburstmc.nbt.NbtMap
import org.jukeboxmc.api.Identifier
import org.jukeboxmc.api.block.RedMushroomBlock
import org.jukeboxmc.api.item.Item
import org.jukeboxmc.api.item.ItemType
import org.jukeboxmc.server.block.JukeboxBlock
import kotlin.random.Random

class BlockRedMushroomBlock(identifier: Identifier, blockStates: NbtMap?) : JukeboxBlock(identifier, blockStates), RedMushroomBlock {

   override fun getHugeMushrooms(): Int {
       return this.getIntState("huge_mushroom_bits")
   }

   override fun setHugeMushrooms(value: Int): RedMushroomBlock {
       return this.setState("huge_mushroom_bits", value)
   }

    override fun getDrops(item: Item): MutableList<Item> {
        return mutableListOf(Item.create(ItemType.valueOf(this.getType().name.replace("_BLOCK", "")), Random.nextInt(2) + 1))
    }
}