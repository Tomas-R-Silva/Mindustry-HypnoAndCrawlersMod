package hypno.content;

import mindustry.type.*;
import arc.graphics.*;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.math.Mathf;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.Effect;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.type.StatusEffect;
import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class NewEffects {

    public static final Effect 

    hypnoEffect = new Effect(45f, 100f, e ->{
        Color indigo = new Color(75f/255f, 0f/255f, 130f/255f, 1f);
        Color mediumPurple = new Color(147f/255f, 112f/255f, 219f/255f, 1f);
        color(indigo, mediumPurple, e.fin());

        float radius = 90f ; 
        Lines.circle(e.x, e.y, radius);
        stroke(e.fout() * 2f);
        float circleRad = 4f + e.finpow() * 65f;
        Lines.circle(e.x, e.y, circleRad);

        color(mediumPurple);
        for(int i = 0; i < 4; i++){
            Drawf.tri(e.x, e.y, 6f, 100f * e.fout(), i*90);
        }

        color(mediumPurple);
        for(int i = 0; i < 4; i++){
            Drawf.tri(e.x, e.y, 3f, 35f * e.fout(), i*90);
        }
        
    }),

      hypnoOnHit = new Effect(35f, e ->{
        Color indigo = new Color(75f/255f, 0f/255f, 130f/255f, 1f);
        Color mediumPurple = new Color(147f/255f, 112f/255f, 219f/255f, 1f);
        color(indigo, mediumPurple, e.fin());
        randLenVectors(e.id, 3, 2f + e.fin() * 7f, (x, y) -> {
            Fill.circle(e.x + x, e.y + y, 0.1f + e.fout() * 1.4f);
        });
    }),

    greenBomb = new Effect(40f, 100f, e -> {
        color(Pal.heal);
        stroke(e.fout() * 2f);
        float circleRad = 4f + e.finpow() * 65f;
        Lines.circle(e.x, e.y, circleRad);

        color(Pal.heal);
        for(int i = 0; i < 4; i++){
            Drawf.tri(e.x, e.y, 6f, 100f * e.fout(), i*90);
        }

        color();
        for(int i = 0; i < 4; i++){
            Drawf.tri(e.x, e.y, 3f, 35f * e.fout(), i*90);
        }

        Drawf.light(e.x, e.y, circleRad * 1.6f, Pal.heal, e.fout());
    });


    

}
