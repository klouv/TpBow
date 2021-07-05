import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class TpBow implements CommandExecutor {

    ItemStack bow = new ItemStack(Material.BOW);

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage("you are not a player. you don't do this");
            return true;
        }
        Player player = (Player) sender;
        ItemMeta meta = bow.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Teleport Bow");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("this bow...");
        meta.setLore(lore);
        bow.setItemMeta(meta);

        player.getInventory().addItem(bow);

        return true;
    }
}
