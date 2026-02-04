package hypno.content;

import arc.struct.ObjectMap;
import mindustry.content.*;
import mindustry.entities.UnitSorts;
import mindustry.gen.Sounds;
import mindustry.world.blocks.defense.turrets.ItemTurret;

import mindustry.type.Category;
import static mindustry.type.ItemStack.with;

public class NewBlocks {

    public static ItemTurret foreshadowHypno;

    public static void load() {
        
       foreshadowHypno = new ItemTurret("foreshadowHypno"){{
            requirements(Category.turret, with(
            Items.copper, 1000,
            Items.metaglass, 600,
            Items.surgeAlloy, 300,
            Items.plastanium, 200,
            Items.silicon, 600
        ));

        ammo(
            Items.surgeAlloy, HypnoBullets.hypnoBullet 
        );
        range = 500f;
        maxAmmo = 40;
        ammoPerShot = 5;
        rotateSpeed = 2f;
        reload = 200f;
        ammoUseEffect = Fx.casing3Double;
        recoil = 5f;
        cooldownTime = reload;
        shake = 4f;
        size = 4;
        shootCone = 2f;
        shootSound = Sounds.none;
        unitSort = UnitSorts.strongest;

        coolantMultiplier = 0.4f;
        scaledHealth = 150;

        coolant = consumeCoolant(1f);
        consumePower(10f);
    }};
    }
}