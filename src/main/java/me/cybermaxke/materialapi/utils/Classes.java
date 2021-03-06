/**
 * 
 * This software is part of the MaterialAPI
 * 
 * This api allows plugin developers to create on a easy way custom
 * items with a custom id and recipes depending on them.
 * 
 * MaterialAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or 
 * any later version.
 *  
 * MaterialAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MaterialAPI. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package me.cybermaxke.materialapi.utils;

import me.cybermaxke.materialapi.MaterialAPI;

public class Classes {
	public static Class<?> CB_CRAFT_ITEMSTACK;
	public static Class<?> CB_CRAFT_INVENTORY;
	public static Class<?> CB_CRAFT_METAITEM;

	public static Class<?> NMS_INVENTORY_CRAFTING;
	public static Class<?> NMS_CRAFTING_MANAGER;
	public static Class<?> NMS_IRECIPE;
	public static Class<?> NMS_WORLD;
	public static Class<?> NMS_SHAPED_RECIPES;
	public static Class<?> NMS_SHAPELESS_RECIPES;
	public static Class<?> NMS_FURNACE_RECIPES;
	public static Class<?> NMS_ITEMSTACK;
	public static Class<?> NMS_ITEM_ARMOR;

	public Classes(MaterialAPI plugin) {
		try {
			CB_CRAFT_ITEMSTACK = Class.forName(plugin.getCraftbukkitPackage() + ".inventory.CraftItemStack");
			CB_CRAFT_INVENTORY = Class.forName(plugin.getCraftbukkitPackage() + ".inventory.CraftInventory");
			CB_CRAFT_METAITEM = Class.forName(plugin.getCraftbukkitPackage() + ".inventory.CraftMetaItem");
			NMS_INVENTORY_CRAFTING = Class.forName(plugin.getNMSPackage() + ".InventoryCrafting");
			NMS_CRAFTING_MANAGER = Class.forName(plugin.getNMSPackage() + ".CraftingManager");
			NMS_IRECIPE = Class.forName(plugin.getNMSPackage() + ".IRecipe");
			NMS_WORLD = Class.forName(plugin.getNMSPackage() + ".World");
			NMS_SHAPED_RECIPES = Class.forName(plugin.getNMSPackage() + ".ShapedRecipes");
			NMS_SHAPELESS_RECIPES = Class.forName(plugin.getNMSPackage() + ".ShapelessRecipes");
			NMS_FURNACE_RECIPES = Class.forName(plugin.getNMSPackage() + ".RecipesFurnace");
			NMS_ITEMSTACK = Class.forName(plugin.getNMSPackage() + ".ItemStack");
			NMS_ITEM_ARMOR = Class.forName(plugin.getNMSPackage() + ".ItemArmor");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}