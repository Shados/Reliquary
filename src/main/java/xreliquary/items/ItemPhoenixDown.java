package xreliquary.items;

import xreliquary.Reliquary;
import xreliquary.reference.Names;

public class ItemPhoenixDown extends ItemAngelicFeather {

	public ItemPhoenixDown() {
		super(Names.phoenix_down);
		this.setCreativeTab(Reliquary.CREATIVE_TAB);
		this.setMaxStackSize(1);
		canRepair = false;
	}
}
