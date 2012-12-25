/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 23 Dec 2012
package vazkii.tinkerer.reference;

/**
 * ResourcesReference
 *
 * Reference for Resource constants.
 * 
 * @author Vazkii
 */
public final class ResourcesReference {

	/** The Spritesheet containing the in-world block textures **/
	public static final String BLOCKS_SPRITESHEET = "/vazkii/tinkerer/res/blocks.png";
	
	/** The Spritesheet containing the item sprites **/
	public static final String ITEMS_SPRITESHEET = "/vazkii/tinkerer/res/items32.png";
	
	/** The Spritesheet containing the item sprites in 32x32 resolution **/
	public static final String ITEMS_32_SPRITESHEET = "/vazkii/tinkerer/res/items32.png";
	
	/** Integers for the Blocks Spritesheet indexes **/
	public static final int BLOCK_INDEX_ELEMENTIUM_ORE_NON_AIMATED = 5;
	
	/** Integers for the Blocks Spritesheet Animations **/
	public static final int BLOCK_ANIM_ELEMENTIUM_ORE_START = 0,
							BLOCK_ANIM_ELEMENTIUM_ORE_END = 15;
	
	/** Integers for the Item Spritesheet (32x) Animations **/
	public static final int ITEM_32_ANIM_ELEMENTIUM_GEM_START = 0,
							ITEM_32_ANIM_ELEMENTIUM_GEM_END = 7;
 							
	/** Integers for Animation tick speeds **/
	public static final int ANIM_SPEED_ELEMENTIUM_ORE = 3,
							ANIM_SPEED_ELEMENTIUM_GEM = 2;
	
	/** The Elementium Gem is colored trough the spectrum, this integer is
	 ** the divisor for the cosine function's speed that defines the color. **/
	public static final int SPECTRUM_DIVISOR_ELEMENTIUM_GEM = 60;
	
	/** The file that contains the Elementium Guardian Mob Texture **/
	public static final String MOB_ELEMENTAL_GUARDIAN_TEXTURE = "/vazkii/tinkerer/res/mob/oreGuardian.png";

	/** The Elementium Guardian mob is colored trough the spectrum, this integer is
	 ** the divisor for the cosine function's speed that defines the color. **/
	public static final int SPECTRUM_DIVISOR_ELEMENTIUM_GUARDIAN = 20;
}