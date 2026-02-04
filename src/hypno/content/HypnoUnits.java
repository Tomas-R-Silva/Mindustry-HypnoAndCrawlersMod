package hypno.content;

import mindustry.type.*;
import mindustry.content.*;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import static hypno.content.HypnoBullets.*;
import static hypno.content.HypnoStatus.emp;
import static hypno.content.HypnoStatus.nuclear;

public class HypnoUnits {

    public void load(){
        UnitType alpha = UnitTypes.alpha;

        alpha.weapons.clear();

        alpha.weapons.add(new Weapon("hypno-gun"){{
            reload = 10f;
            x = 2.75f;
            y = 1f;

            bullet = hypnoBullet;
        }});

        new NewCrawler().load();
        
    }
}