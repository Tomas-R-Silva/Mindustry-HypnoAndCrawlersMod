package hypno.content;

import mindustry.type.*;
import arc.graphics.*;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.graphics.Pal;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.type.*;

public class HypnoStatus {

    public static StatusEffect hypnoVisual, hypnoEnemies ,emp, nuclear;

    public void load(){
        hypnoVisual = new StatusEffect("hypnoVisual"){{
            speedMultiplier = 0.7f;
            damageMultiplier = 0.8f;
            reloadMultiplier = 1f;
            healthMultiplier = 1f;
            effect = NewEffects.hypnoEffect;
            effectChance = 0.15f;
            //lifetime = 360f; 
        }}; // já nem estou a usar isto utilizo logo o efeito no hipnobullet
        hypnoEnemies = new StatusEffect("hypnoEnemies"){{  // ver umefeito bom ao FX
            speedMultiplier = 0.7f;
            damageMultiplier = 0.8f;
            reloadMultiplier = 1f;
            healthMultiplier = 1f;
            color = new Color(0.6f, 0.3f, 1f, 0.4f);
            effect = NewEffects.hypnoOnHit;
            effectChance = 1f;

        }};
        emp = new StatusEffect("emp"){{
            color = Color.gold;
            damage = 0.4f;
            speedMultiplier =0f;
            healthMultiplier = 0.8f;
            disarm = true;
            effect = Fx.electrified;
        }};

        nuclear = new StatusEffect("nuclear"){{
            color = Pal.heal;
            healthMultiplier = 0.8f;
            damage = 0.4f;
            effect = Fx.greenBomb;
    

        }};
    }
}