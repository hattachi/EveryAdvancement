package flag.me.hattachi;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Hattachi extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        // SPEED 효과
        PotionEffectType speedEffectType = PotionEffectType.SPEED;
        PotionEffect speedEffect = new PotionEffect(speedEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(speedEffect);

        // ABSORPTION 효과
        PotionEffectType absorptionEffectType = PotionEffectType.ABSORPTION;
        PotionEffect absorptionEffect = new PotionEffect(absorptionEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(absorptionEffect);

        // BLINDNESS 효과
        PotionEffectType blindnessEffectType = PotionEffectType.BLINDNESS;
        PotionEffect blindnessEffect = new PotionEffect(blindnessEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(blindnessEffect);

        // CONDUIT_POWER 효과
        PotionEffectType conduitPowerEffectType = PotionEffectType.CONDUIT_POWER;
        PotionEffect conduitPowerEffect = new PotionEffect(conduitPowerEffectType, Integer.MAX_VALUE, 0,false);
        player.addPotionEffect(conduitPowerEffect);

        // CONFUSION 효과
        PotionEffectType confusionEffectType = PotionEffectType.CONFUSION;
        PotionEffect confusionEffect = new PotionEffect(confusionEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(confusionEffect);

        // DAMAGE_RESISTANCE 효과
        PotionEffectType damageResistanceEffectType = PotionEffectType.DAMAGE_RESISTANCE;
        PotionEffect damageResistanceEffect = new PotionEffect(damageResistanceEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(damageResistanceEffect);

        // DARKNESS 효과
        PotionEffectType darknessEffectType = PotionEffectType.DARKNESS;
        PotionEffect darknessEffect = new PotionEffect(darknessEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(darknessEffect);

        // DOLPHINS_GRACE 효과
        PotionEffectType dolphinsGraceEffectType = PotionEffectType.DOLPHINS_GRACE;
        PotionEffect dolphinsGraceEffect = new PotionEffect(dolphinsGraceEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(dolphinsGraceEffect);

        // FAST_DIGGING 효과
        PotionEffectType fastDiggingEffectType = PotionEffectType.FAST_DIGGING;
        PotionEffect fastDiggingEffect = new PotionEffect(fastDiggingEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(fastDiggingEffect);

        // FIRE_RESISTANCE 효과
        PotionEffectType fireResistanceEffectType = PotionEffectType.FIRE_RESISTANCE;
        PotionEffect fireResistanceEffect = new PotionEffect(fireResistanceEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(fireResistanceEffect);

        // GLOWING 효과
        PotionEffectType glowingEffectType = PotionEffectType.GLOWING;
        PotionEffect glowingEffect = new PotionEffect(glowingEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(glowingEffect);

        // HARM 효과
        PotionEffectType harmEffectType = PotionEffectType.HARM;
        PotionEffect harmEffect = new PotionEffect(harmEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(harmEffect);

        // HEAL 효과
        PotionEffectType healEffectType = PotionEffectType.HEAL;
        PotionEffect healEffect = new PotionEffect(healEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(healEffect);

        // HEALTH_BOOST 효과
        PotionEffectType healthBoostEffectType = PotionEffectType.HEALTH_BOOST;
        PotionEffect healthBoostEffect = new PotionEffect(healthBoostEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(healthBoostEffect);

        // HERO_OF_THE_VILLAGE 효과
        PotionEffectType heroOfTheVillageEffectType = PotionEffectType.HERO_OF_THE_VILLAGE;
        PotionEffect heroOfTheVillageEffect = new PotionEffect(heroOfTheVillageEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(heroOfTheVillageEffect);

        // HUNGER 효과
        PotionEffectType hungerEffectType = PotionEffectType.HUNGER;
        PotionEffect hungerEffect = new PotionEffect(hungerEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(hungerEffect);

        // INCREASE_DAMAGE 효과
        PotionEffectType increaseDamageEffectType = PotionEffectType.INCREASE_DAMAGE;
        PotionEffect increaseDamageEffect = new PotionEffect(increaseDamageEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(increaseDamageEffect);

        // INVISIBILITY 효과
        PotionEffectType invisibilityEffectType = PotionEffectType.INVISIBILITY;
        PotionEffect invisibilityEffect = new PotionEffect(invisibilityEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(invisibilityEffect);

        // JUMP 효과
        PotionEffectType jumpEffectType = PotionEffectType.JUMP;
        PotionEffect jumpEffect = new PotionEffect(jumpEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(jumpEffect);

        // LEVITATION 효과
        PotionEffectType levitationEffectType = PotionEffectType.LEVITATION;
        PotionEffect levitationEffect = new PotionEffect(levitationEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(levitationEffect);

        // LUCK 효과
        PotionEffectType luckEffectType = PotionEffectType.LUCK;
        PotionEffect luckEffect = new PotionEffect(luckEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(luckEffect);

        // NIGHT_VISION 효과
        PotionEffectType nightVisionEffectType = PotionEffectType.NIGHT_VISION;
        PotionEffect nightVisionEffect = new PotionEffect(nightVisionEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(nightVisionEffect);

        // POISON 효과
        PotionEffectType poisonEffectType = PotionEffectType.POISON;
        PotionEffect poisonEffect = new PotionEffect(poisonEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(poisonEffect);

        // REGENERATION 효과
        PotionEffectType regenerationEffectType = PotionEffectType.REGENERATION;
        PotionEffect regenerationEffect = new PotionEffect(regenerationEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(regenerationEffect);

        // SATURATION 효과
        PotionEffectType saturationEffectType = PotionEffectType.SATURATION;
        PotionEffect saturationEffect = new PotionEffect(saturationEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(saturationEffect);

        // SLOW 효과
        PotionEffectType slowEffectType = PotionEffectType.SLOW;
        PotionEffect slowEffect = new PotionEffect(slowEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(slowEffect);

        // SLOW_DIGGING 효과
        PotionEffectType slowDiggingEffectType = PotionEffectType.SLOW_DIGGING;
        PotionEffect slowDiggingEffect = new PotionEffect(slowDiggingEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(slowDiggingEffect);

        // SLOW_FALLING 효과
        PotionEffectType slowFallingEffectType = PotionEffectType.SLOW_FALLING;
        PotionEffect slowFallingEffect = new PotionEffect(slowFallingEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(slowFallingEffect);

        // UNLUCK 효과
        PotionEffectType unluckEffectType = PotionEffectType.UNLUCK;
        PotionEffect unluckEffect = new PotionEffect(unluckEffectType, Integer.MAX_VALUE, 0,  false);
        player.addPotionEffect(unluckEffect);

        // WATER_BREATHING 효과
        PotionEffectType waterBreathingEffectType = PotionEffectType.WATER_BREATHING;
        PotionEffect waterBreathingEffect = new PotionEffect(waterBreathingEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(waterBreathingEffect);

        // WEAKNESS 효과
        PotionEffectType weaknessEffectType = PotionEffectType.WEAKNESS;
        PotionEffect weaknessEffect = new PotionEffect(weaknessEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(weaknessEffect);

        // WITHER 효과
        PotionEffectType witherEffectType = PotionEffectType.WITHER;
        PotionEffect witherEffect = new PotionEffect(witherEffectType, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(witherEffect);

        // 우민 효과
        PotionEffectType badwoomin = PotionEffectType.BAD_OMEN;
        PotionEffect BAD_OMEN = new PotionEffect(badwoomin, Integer.MAX_VALUE, 0, false);
        player.addPotionEffect(BAD_OMEN);

    }

}
