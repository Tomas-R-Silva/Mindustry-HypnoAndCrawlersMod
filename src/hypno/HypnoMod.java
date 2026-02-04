package hypno;

import mindustry.mod.*;
import hypno.content.*;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class HypnoMod extends Mod {

    public HypnoMod(){
        System.out.println("HypnoMod carregado!");
    }

    @Override
    public void loadContent(){
        new HypnoStatus().load();
        new HypnoBullets().load();
        new HypnoUnits().load();
        new HypnoBlocks().load();
        NewBlocks.load();
    }
}