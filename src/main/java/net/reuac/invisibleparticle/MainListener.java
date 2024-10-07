package net.reuac.invisibleparticle;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class MainListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("invisibleparticle.bypass")){return;}
        if (player.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
            Location loc = player.getLocation();
            loc.setY(loc.getY() + 2);
            player.getWorld().spigot().playEffect(loc, Effect.COLOURED_DUST, 0, 1, (float) 255/255, (float) 0 /255, (float) 0 /255, 1, 0, 100);
        }
    }
}
