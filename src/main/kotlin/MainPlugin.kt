import arc.*
import arc.util.*
import mindustry.*
import mindustry.content.*
import mindustry.game.EventType.*
import mindustry.gen.*
import mindustry.mod.*

class MainPlugin() : Plugin() {
    init {
        Log.info("hello world!")
    }

    override fun registerClientCommands(handler: CommandHandler) {
        handler.register(
            "dm", "<player> <text...>", "DM another player"
        ) { args: Array<String>, player: Player ->
            val other = Groups.player.find {
                it.name.equals(args[0], true)
            }
            other?.sendMessage("[lightgray]<" + player.name.toString() + ">:[] " + args[1])
                ?: player.sendMessage("[red]Player '" + args[0] + "' does not exist")
        }
    }

    override fun registerServerCommands(handler: CommandHandler) {
        // stuff
    }
}

