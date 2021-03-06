/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 24 Dec 2012
package vazkii.tinkerer.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import vazkii.tinkerer.ElementalTinkerer;
import vazkii.tinkerer.magic.IWand;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * MiscHelper
 *
 * Helper for Misc. Features
 *
 * @author Vazkii
 */
public final class MiscHelper {

	@SideOnly(Side.CLIENT)
	public static Minecraft getMc() {
		return Minecraft.getMinecraft();
	}

	@SideOnly(Side.CLIENT)
	public static EntityClientPlayerMP getClientPlayer() {
		return getMc().thePlayer;
	}

	@SideOnly(Side.CLIENT)
	public static WorldClient getClientWorld() {
		return getMc().theWorld;
	}

	public static MinecraftServer getServer() {
		return MinecraftServer.getServer();
	}

	public static boolean isServerPVP() {
		return ElementalTinkerer.proxy.isServerPVP();
	}

	/** Compares two item stacks and checks if their ID,
	 * Metadata and Tag Compound (if exists) are equal. **/
	public static boolean areStacksEqualIgnoreSize(ItemStack stack1, ItemStack stack2) {
		return stack1 != null
				&& stack2 != null
				&& stack1.itemID == stack2.itemID
				&& (stack1.getItemDamage() == stack2.getItemDamage()
				|| stack1.getItemDamage() == -1
				|| stack2.getItemDamage() == -1)
				&& (stack1.stackTagCompound == null
				&& stack2.stackTagCompound == null
				|| (stack1.stackTagCompound == null
				? stack2.stackTagCompound.equals(stack1.stackTagCompound)
				: stack1.stackTagCompound.equals(stack2.stackTagCompound)));
	}

	@SideOnly(Side.CLIENT)
	public static boolean doesClientPlayerHaveWand() {
		Minecraft mc = getMc();
		EntityPlayer clientPlayer = getClientPlayer();
		return !(!doesPlayerHaveWand(clientPlayer) ||
				mc.currentScreen != null ||
				SpellHelper.clientSpells == null);
	}

	public static boolean doesPlayerHaveWand(EntityPlayer player) {
		return !(player == null ||
				player.inventory.getCurrentItem() == null ||
				player.inventory.getCurrentItem().getItem() == null ||
				!(player.inventory.getCurrentItem().getItem() instanceof IWand));
	}
}
