import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TpBowEvent implements Listener {

    @EventHandler
    public void onEvent(ProjectileHitEvent e) {
        if(e.getEntity() instanceof Arrow ) {
            Player player = (Player) e.getEntity().getShooter();

            Location location = e.getEntity().getLocation();
            player.teleport(location);

        }

    }

}
