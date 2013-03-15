/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 9 Mar 2013
package vazkii.tinkerer.item;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import vazkii.tinkerer.gui.CreativeTabET;
import vazkii.tinkerer.reference.MiscReference;
import vazkii.tinkerer.reference.ResourcesReference;

/**
 * ItemOrichalcumArmor
 *
 * The Item for the Orichalcum Armor. It implements IArmorTextureProvider,
 * so it can have a custom texture.
 *
 * @author Vazkii
 */
public class ItemOrichalcumArmor extends ItemArmor implements IArmorTextureProvider {

	public ItemOrichalcumArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1 - MiscReference.ITEM_INDEX_SHIFT, par2EnumArmorMaterial, 0, par4);
		// Pass in accurate IDs, negating the index shift
		setCreativeTab(CreativeTabET.INSTANCE);
		iconIndex = par3;
	}

	@Override
	public String getTextureFile() {
		return ResourcesReference.ITEMS_SPRITESHEET;
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		return armorType == 2 ? ResourcesReference.ARMOR_ORICHALCUM_LEGS_TEXTURE : ResourcesReference.ARMOR_ORICHALCUM_TEXTURE;
	}
}
