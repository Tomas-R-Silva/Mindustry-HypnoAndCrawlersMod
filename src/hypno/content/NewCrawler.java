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
import mindustry.ai.types.*;
import mindustry.type.ammo.*;

import static hypno.content.HypnoBullets.*;
import static hypno.content.HypnoStatus.emp;
import static hypno.content.HypnoStatus.nuclear;

public class NewCrawler{

    public static UnitType empCrawler,nuclearCrawler,hypnoCrawler,freezeCrawler;

    public void load(){

        empCrawler = new UnitType("emp-crawler"){{
            constructor = MechUnit::create;
            researchCostMultiplier = 0.5f;
            aiController = SuicideAI::new;

            speed = 1f;
            hitSize = 8f;
            health = 250;
            mechSideSway = 0.25f;
            range = 40f;
            ammoType = new ItemAmmoType(Items.coal);

            weapons.add(new Weapon(){{
                shootOnDeath = true;
                targetUnderBlocks = false;
                reload = 24f;
                shootCone = 180f;
                ejectEffect = Fx.none;
                shootSound = Sounds.explosion;
                x = shootY = 0f;
                mirror = false;
                bullet = empExplosiveBullet;
                useAmmo = false;
                shootStatus = emp;
            }});
        }};

        nuclearCrawler = new UnitType("nuclear-crawler"){{
            constructor = MechUnit::create;
            researchCostMultiplier = 0.5f;
            aiController = SuicideAI::new;

            speed = 1f;
            hitSize = 8f;
            health = 300;
            mechSideSway = 0.25f;
            range = 40f;
            ammoType = new ItemAmmoType(Items.coal);

            weapons.add(new Weapon(){{
                shootOnDeath = true;
                targetUnderBlocks = false;
                reload = 24f;
                shootCone = 180f;
                ejectEffect = Fx.none;
                shootSound = Sounds.explosion;
                x = shootY = 0f;
                mirror = false;
                bullet = nuclearExplosiveBullet;
            }});
        }};

        freezeCrawler = new UnitType("freeze-crawler"){{
            constructor = MechUnit::create;
            researchCostMultiplier = 0.5f;
            aiController = SuicideAI::new;

            speed = 1f;
            hitSize = 8f;
            health = 200;
            mechSideSway = 0.25f;
            range = 40f;
            ammoType = new ItemAmmoType(Items.coal);

            weapons.add(new Weapon(){{
                shootOnDeath = true;
                targetUnderBlocks = false;
                reload = 24f;
                shootCone = 180f;
                ejectEffect = Fx.none;
                shootSound = Sounds.explosion;
                x = shootY = 0f;
                mirror = false;
                bullet = freezingExplosiveBullet;
            }});
        }};

    }
}