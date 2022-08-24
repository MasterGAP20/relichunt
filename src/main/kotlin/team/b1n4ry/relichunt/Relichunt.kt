package team.b1n4ry.relichunt

import org.bukkit.plugin.java.JavaPlugin
import team.b1n4ry.relichunt.util.StructureScanner

class Relicshunter : JavaPlugin() {

    override fun onEnable() {
        logger.info("Plugin Activated :)")
        CreateData(this).createFolder()
        getCommand("structurescan")?.setExecutor(StructureScanner(this))
        getCommand("structurescan")?.tabCompleter = CommandsTab(this)
        getCommand("structureload")?.setExecutor(StructureLoader(this))
        getCommand("structureload")?.tabCompleter = CommandsTab(this)
    }

    override fun onDisable() {
        logger.info("Plugin Deactivated :(")
    }

}