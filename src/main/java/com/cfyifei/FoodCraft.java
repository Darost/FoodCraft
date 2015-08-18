package com.cfyifei;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.cfyifei.config.NERConfigHandler;
import com.cfyifei.config.NERLogManager;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.proxy.CommonProxy;
import com.cfyifei.util.FoodcraftSubscribeEvent;

@Mod(modid="FoodCraft", name="FoodCraft", version="1.2.0")

public class FoodCraft {
	public static boolean NEIIsLoad = false;
	public static final CreativeTabs FcTabJiqi = new CreativeTabs("Jiqi") {//����&����
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModGui.Nmj);
		}
	};
	public static final CreativeTabs FcTabZhiwu = new CreativeTabs("Zhiwu") {//ֲ��
		public Item getTabIconItem() {
			return FoodcraftItems.ItemLajiao;
		}
	};
	public static final CreativeTabs FcTabYingliao = new CreativeTabs("Yingliao") {//����
		public Item getTabIconItem() {
			return FoodcraftItems.ItemPutaozhi;
		}
	};
	public static final CreativeTabs FcTabZhushi = new CreativeTabs("Zhushi") {//��ʳ
		public Item getTabIconItem() {
			return FoodcraftItems.ItemChaotudousifan;
		}
	};
	public static final CreativeTabs FcTabShicai = new CreativeTabs("Shicai") {//ʳ��
		public Item getTabIconItem() {
			return FoodcraftItems.ItemMianfen;
		}
	};
	public static final CreativeTabs FcTabXiaodian = new CreativeTabs("Xiaodian") {//��ʳ
		public Item getTabIconItem() {
			return FoodcraftItems.ItemJianjiao;
		}
	};
	
	@SidedProxy(clientSide = "com.cfyifei.proxy.ClientProxy", serverSide = "com.cfyifei.proxy.CommonProxy")
		public static CommonProxy proxy;
		
		@Instance("FoodCraft")
	    public static FoodCraft instance;

		@EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			NERLogManager.log("Loading foodcraft, Version: 1.2.0");
			NEIIsLoad = Loader.isModLoaded("NotEnoughItems");
        NERConfigHandler.initConfig(event);
        NERConfigHandler.getConfig();
		proxy.preInit(event);
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event) {
			proxy.init(event);
			MinecraftForge.EVENT_BUS.register(new FoodcraftSubscribeEvent());
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event) {
			proxy.postInit(event);
		}

}