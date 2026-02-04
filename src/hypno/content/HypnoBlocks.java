package hypno.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.content.UnitTypes;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.units.UnitFactory.UnitPlan;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import hypno.content.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class HypnoBlocks {
    public void load(){

        UnitFactory groundFactory = (UnitFactory) Blocks.groundFactory;
    
        groundFactory.plans = Seq.with(
                new UnitPlan(UnitTypes.dagger, 60f * 15, with(Items.silicon, 10, Items.lead, 10)),
                new UnitPlan(UnitTypes.crawler, 60f * 10, with(Items.silicon, 8, Items.coal, 10)),
                new UnitPlan((UnitType)NewCrawler.empCrawler, 60f * 30, with(Items.blastCompound, 10, Items.copper, 20, Items.lead, 20)),
                new UnitPlan((UnitType)NewCrawler.nuclearCrawler, 60f * 60, with(Items.blastCompound, 20, Items.titanium, 50, Items.thorium, 50)),
                new UnitPlan((UnitType)NewCrawler.freezeCrawler, 60f * 25, with(Items.blastCompound, 10, Items.silicon, 20, Items.lead, 20)),
                new UnitPlan(UnitTypes.nova, 60f * 40, with(Items.silicon, 30, Items.lead, 20, Items.titanium, 20))
        );
    }
}
