import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new TpBowEvent(),this);
        getCommand("tpbow").setExecutor(new TpBow());

    }



    @Override
    public void onDisable() {

    }

}
