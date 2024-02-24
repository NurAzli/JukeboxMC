package org.jukeboxmc.api.block

import org.jukeboxmc.api.block.data.Axis

interface VerdantFroglight : Block {

   fun getPillarAxis(): Axis

   fun setPillarAxis(value: Axis): VerdantFroglight

}