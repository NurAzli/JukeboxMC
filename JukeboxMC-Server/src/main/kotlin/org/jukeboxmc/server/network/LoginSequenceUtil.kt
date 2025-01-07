package org.jukeboxmc.server.network

import org.cloudburstmc.protocol.bedrock.packet.PlayStatusPacket
import org.cloudburstmc.protocol.bedrock.packet.ResourcePacksInfoPacket
import org.jukeboxmc.server.JukeboxServer
import org.jukeboxmc.server.player.JukeboxPlayer
import java.util.UUID

/**
 * @author Kaooot
 * @version 1.0
 */
class LoginSequenceUtil {

    companion object {
        fun processLoginSequence(server: JukeboxServer, player: JukeboxPlayer) {
            val playStatusPacket = PlayStatusPacket()
            playStatusPacket.status = PlayStatusPacket.Status.LOGIN_SUCCESS
            player.sendPacketImmediately(playStatusPacket)

            val resourcePacksInfoPacket = ResourcePacksInfoPacket()
            server.getResourcePackManager().getResourcePacks().forEach {
                resourcePacksInfoPacket.resourcePackInfos.add(
                    ResourcePacksInfoPacket.Entry(
                        UUID.fromString(it.getUuid()),
                        it.getVersion(),
                        it.getSize(),
                        "",
                        "",
                        it.getUuid(),
                        false,
                        false,
                        false
                    ))
            }
            resourcePacksInfoPacket.isForcedToAccept = server.isForceResourcePacks()
            resourcePacksInfoPacket.isForcingServerPacksEnabled = false
            resourcePacksInfoPacket.isScriptingEnabled = false
            player.sendPacket(resourcePacksInfoPacket)
        }
    }
}
