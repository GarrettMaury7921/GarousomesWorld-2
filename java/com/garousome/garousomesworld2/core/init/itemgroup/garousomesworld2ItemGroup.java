package com.garousome.garousomesworld2.core.init.itemgroup;

import com.garousome.garousomesworld2.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class garousomesworld2ItemGroup extends ItemGroup {
	
	public static final garousomesworld2ItemGroup GarousomesWorld2 = new garousomesworld2ItemGroup(ItemGroup.TABS.length, "garousomesworld2");
	
	public garousomesworld2ItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.garrett_block.get());
	}

}
