package zmaster587.advancedRocketry.Inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import zmaster587.libVulpes.api.IUniversalEnergy;

public class ContainerPowerStorageBox extends ContainerPowered {

	public ContainerPowerStorageBox(InventoryPlayer playerInv,
			IUniversalEnergy tile2) {
		super(playerInv, tile2);
		
		// Player inventory
		for (int i1 = 0; i1 < 3; i1++) {
			for (int l1 = 0; l1 < 9; l1++) {
				addSlotToContainer(new Slot(playerInv, l1 + i1 * 9 + 9, 8 + l1 * 18, 89 + i1 * 18));
			}
		}

		// Player hotbar
		for (int j1 = 0; j1 < 9; j1++) {
			addSlotToContainer(new Slot(playerInv, j1, 8 + j1 * 18, 147));
		}
	}

}
