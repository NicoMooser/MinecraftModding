package com.YOURPACKAGENAME.modid.init;   //Replace YOURPACKAGENAME
import com.YOURPACKAGENAME.MODNAME;       //Replace YOURPACKAGENAME and MODNAME (MODNAME is "modname".java)
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid=MinecraftModV0.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PROJECTNAME.MOD_ID)
public class ItemInit{
	public static final Item example_item = null;		//Replace example_item with itemName
	
	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));	//Replace "example_item" with "itemName"
	}
}
