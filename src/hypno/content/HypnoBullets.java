package hypno.content;

import mindustry.entities.bullet.*;
import arc.graphics.*;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import static hypno.content.HypnoStatus.*;
import static mindustry.content.StatusEffects.freezing;

public class HypnoBullets {

    public static BasicBulletType hypnoBullet, empBullet, nuclearBullet, freezingBullet;
    public static ExplosionBulletType hypnoExplosiveBullet, empExplosiveBullet, nuclearExplosiveBullet,freezingExplosiveBullet;

    public void load(){
       hypnoBullet = new HypnoBasicBulletType(8f, 0f){{
            width = 8f;
            height = 10f;
            lifetime = 60f;
            damage = 0f;
            range = 90f;
            shootEffect = Fx.none;
            hitSound = Sounds.none;
            despawnSound = Sounds.none;
            hitColor = Color.purple;
            trailColor = new Color(75f/255f, 0f/255f, 130f/255f, 1f);
            trailEffect = Fx.missileTrail;

            homingPower = 0.02f;
            homingRange = 100f;

            hitEffect = NewEffects.hypnoEffect;
            status = hypnoEnemies;   // status que muda a cor das units , colocar umas partículas roxas tipo bolhas 
            statusDuration = 360f; 
        }};

        empBullet = new BasicBulletType(3f,1){{
            width = 8f;
            height = 10f;
            lifetime = 60f;
            hitEffect = Fx.hitLancer;
            hitColor = Color.gold;

            homingPower = 0.02f;
            homingRange = 80f;

            status = emp;
            statusDuration = 60f * 5;
        }};

        empExplosiveBullet = new ExplosionBulletType(){{
            collidesTiles = false;
            collides = false;
            hitSound = Sounds.explosion;

            rangeOverride = 25f;
            hitEffect = Fx.hitEmpSpark;
            speed = 0f;
            splashDamageRadius = 44f;
            instantDisappear = true;
            splashDamage = 10f;
            killShooter = true;
            hittable = false;
            collidesAir = true;
            status=emp;
        }};

        nuclearBullet = new BasicBulletType(3f,1){{
            width = 8f;
            height = 10f;
            lifetime = 60f;

            homingPower = 0.02f;
            homingRange = 80f;

            status = nuclear;
            statusDuration = 60f * 5;
        }};

        nuclearExplosiveBullet = new ExplosionBulletType(){{
            collidesTiles = false;
            collides = false;
            hitSound = Sounds.explosion;

            rangeOverride = 25f;
            hitEffect = Fx.greenCloud;
            speed = 0f;
            splashDamageRadius = 44f;
            instantDisappear = true;
            splashDamage = 160f;
            killShooter = true;
            hittable = false;
            collidesAir = true;
            status=nuclear;
        }};

        freezingBullet = new BasicBulletType(3f,1){{
            width = 8f;
            height = 10f;
            lifetime = 60f;

            homingPower = 0.02f;
            homingRange = 80f;

            status = freezing;
            statusDuration = 60f * 5;
        }};

        freezingExplosiveBullet = new ExplosionBulletType(){{
            collidesTiles = false;
            collides = false;
            hitSound = Sounds.explosion;

            rangeOverride = 25f;
            hitEffect = Fx.freezing;
            speed = 0f;
            splashDamageRadius = 44f;
            instantDisappear = true;
            splashDamage = 10f;
            killShooter = true;
            hittable = false;
            collidesAir = true;
            status=freezing;
        }};
    }
}