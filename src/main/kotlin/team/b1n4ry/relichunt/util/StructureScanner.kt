package team.b1n4ry.relichunt.util

import org.bukkit.Location
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractAtEntityEvent
import java.io.File

object StructureScanner : Listener{
    fun getBlocksInBox(loc1 : Location, loc2 : Location) : List<BlockStruct> {
        val blocks : MutableList<BlockStruct> = mutableListOf()
        for(y in loc1.blockY..loc2.blockY) {
            for(x in loc1.blockX..loc2.blockX) {
                for(z in loc1.blockZ..loc2.blockZ) {
                    val block = loc1.world.getBlockAt(x,y,z)
                    val blockStruct = BlockStruct(block.type, block.blockData, block.location.subtract(loc1))
                    blocks += blockStruct
                }
            }
        }
        return blocks
    }

    @EventHandler
    fun scan(e : PlayerInteractAtEntityEvent) {
        println("-------------------------------------------")
        val blocks = getBlocksInBox(Location(e.player.world,-41.0,68.0,23.0),Location(e.player.world,-38.0,69.0,26.0))
        File("structure.struct").writeText(blocks.toString())
    }
}