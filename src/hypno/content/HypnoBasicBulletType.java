package hypno.content;

import mindustry.entities.Units;
import mindustry.entities.bullet.*;
import arc.*;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.math.Mathf;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.game.Team;
import mindustry.gen.*;
import mindustry.graphics.Drawf;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import static hypno.content.HypnoStatus.*;

public class HypnoBasicBulletType extends BasicBulletType { // mudar para HypnoBulletType

    public float radius = 50f;

     public HypnoBasicBulletType(float speed, float damage){
        super(speed, damage);
    }

    @Override
    public void hit(Bullet b, float x, float y){
    super.hit(b, x, y);

    Units.nearbyEnemies(b.team, x, y, radius, other -> {
        Team originalTeam = other.team(); // salva a equipe original
        other.team(b.team); // hipnotiza
        other.apply(hypnoEnemies, 360f);

        // agenda para voltar à equipe original após 6 segundos
        Timer.schedule(() -> {
            if(!other.dead){
                other.team(originalTeam);
            }
        }, 6f);
    });
    }


    @Override 
    public void draw(Bullet b){
        drawParts(b);
        float shrink = shrinkInterp.apply(b.fout());
        float height = this.height * ((1f - shrinkY) + shrinkY * shrink);
        float width = this.width * ((1f - shrinkX) + shrinkX * shrink);
        float offset = -90 + (spin != 0 ? Mathf.randomSeed(b.id, 360f) + b.time * spin : 0f) + rotationOffset;

        Color mix = Tmp.c1.set(mixColorFrom).lerp(mixColorTo, b.fin());

        Draw.mixcol(mix, mix.a);

        if(backRegion.found()){
            Draw.color(Color.purple);
            Draw.rect(backRegion, b.x, b.y, width, height, b.rotation() + offset);
        }

        Draw.color(new Color(75f/255f, 0f/255f, 130f/255f, 1f)); // criar as pall colors
        Draw.rect(frontRegion, b.x, b.y, width, height, b.rotation() + offset);

        Draw.reset();
    }

     @Override
    public void drawParts(Bullet b){
        
        Draw.color(Color.purple);

        // a bala fica com a ponta em triângulo
        float sizeX = width * (0.8f ); 
        float sizeY = height * (0.8f + Mathf.range(0.2f));
        Drawf.tri(
            b.x, b.y,          // posição
            sizeX, sizeY,       // tamanho
            b.rotation() + Mathf.range(30f)  //efeito
        );

        Draw.reset();
    }
}
