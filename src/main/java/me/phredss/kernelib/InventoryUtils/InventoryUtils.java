package me.phredss.kernelib.InventoryUtils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import static me.phredss.kernelib.GeneralUtils.*;

public class InventoryUtils {

    public static Inventory createGui (String guiName, int slot){
        int slots = slot / 9;
        if (isDouble(slots)) {
            return null;
        }
        Inventory gui = Bukkit.createInventory(null, slot, guiName);
        return gui;
    }


}
