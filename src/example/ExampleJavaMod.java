package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.game.Saves;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.mod.Mod;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");
        Events.on(WorldLoadEvent.class, event -> {
            var save = new Saves();
            Log.info(save);
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
