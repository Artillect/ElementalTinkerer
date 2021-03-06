/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 24 Jan 2013
package vazkii.tinkerer.magic;


/**
 * PassiveSpell
 *
 * Abstract class for the Passive Spells. This has various methods to help with
 * passing in data.
 *
 * @author Vazkii
 */
public abstract class PassiveSpell extends Spell {

	public PassiveSpell(short index, String label, String displayName, int element) {
		super(index, label, displayName, element);
	}

	@Override
	public boolean isPassive() {
		return true;
	}

}
