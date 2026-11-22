package com.nightwatcher;

import com.nightwatcher.item.ItemWatcherEgg;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = NightWatcher.MODID)
public class ModItems {
	public static final Item WATCHER_EGG = new ItemWatcherEgg();

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(WATCHER_EGG);
	}
}
