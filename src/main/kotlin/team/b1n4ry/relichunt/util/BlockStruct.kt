package team.b1n4ry.relichunt.util

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.data.BlockData

class BlockStruct(material: Material, blockData: BlockData, location: Location) {
    var material = material
    var blockData = blockData
    var location = location
}