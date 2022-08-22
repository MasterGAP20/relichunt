package team.b1n4ry.relichunt

import org.bukkit.plugin.java.JavaPlugin
import team.b1n4ry.relichunt.util.StructureScanner

class Relichunt : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(StructureScanner, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}