package org.jukeboxmc.api.block

import org.jukeboxmc.api.block.data.CoralColor
import org.jukeboxmc.api.block.data.CoralFanDirection

interface CoralFan : Block {

   fun getCoralColor(): CoralColor

   fun setCoralColor(value: CoralColor): CoralFan

   fun getCoralFanDirection(): CoralFanDirection

   fun setCoralFanDirection(value: CoralFanDirection): CoralFan

}