package com.cfyifei.item;




import com.cfyifei.FoodCraft;
import com.cfyifei.plant.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import com.cfyifei.block.ModBlocks;


public class ModItem{

	static public Item ItemCong,ItemZongye,ItemXifan,ItemDangeng,ItemTiepian,ItemCaidao,ItemDami,Itemfan,ItemMianfen,ItemHuashen,
	ItemDouzi,ItemHuashenyou,ItemDoujiang,ItemDianluban,ItemJianjidan,ItemLaobing,ItemMianpi,ItemJiaozixian,ItemJiaozi,ItemJianjiao,
	ItemQiaokeli,ItemQiaokelifen,ItemShucai,ItemFanqie,ItemLajiao,ItemMianfensi,ItemQiezi,ItemPutao,ItemYan,Itemwater,ItemDoufu,
	ItemJiangyou,ItemNuomi, ItemDoufugan,ItemBaifan,ItemFanqiechaojidanfan,ItemDisanxian,ItemCu,ItemYuxiangrousi,ItemGongbaojiding,
    ItemJitui,ItemTudoupian,ItemTudousi,ItemChaotudousifan,ItemChaotudoupian,ItemDuojiaoyutou,ItemDouban,ItemMapodoufufan,
	ItemDianfen,ItemHongshaoroufan,ItemHuiguoroufan,ItemMogudunjitang,ItemZongzi,ItemNuomifen,ItemTangyuan,
	ItemHuashentangyuanxian,ItemNuomituan,ItemMahua,ItemNiangao,ItemChunjuan,ItemJikuai,ItemShutiao,ItemAeljichi,ItemJimihua,
	ItemAeljichifan,ItemYuanweijikuai,ItemZhadoufu,ItemZhaniangao,ItemShupian,ItemZhamianbao,ItemZhachunjuan,ItemZhamahua,
	ItemZhajitui,ItemDajirou,ItemZhongjirou,ItemXiaojirou,ItemJichi,ItemDoufusi,ItemLuobosi,ItemHongjiu,ItemBaijiu,ItemPingguojiu,
	ItemPutaojiu,ItemJinputaojiu, ItemJinpingguojiu,ItemJinputao,ItemQiaokelishui,ItemQiaokelinai,ItemHuluobozhi,ItemPutaozhi,
	ItemPingguozhi,ItemShucaizhi,ItemJinputaozhi,ItemJinpingguozhi,ItemDounai,ItemKele,ItemXuebi,ItemXiguazhi,ItemQiaokelinaiice,
	ItemPutaozhiice,ItemPingguozhiice,ItemJinputaozhiice,ItemJinpingguozhiice,ItemXiguazhiice,ItemCha,ItemNaicha,ItemKafei,
	ItemBaiqiuji,ItemCongyouji,ItemKoushuiji,ItemLaziji,ItemQingzhenyu,ItemMalayu,ItemSuancaiyu,ItemKelejichifan,ItemGalikuai,
	ItemGalijiroufan,ItemShuizhuniurou,ItemMian,ItemGuoqiaomixian,ItemYifen,ItemYifenpork,ItemYifenbeef,ItemYifenchicken,
	ItemPidanshourouzhou,ItemYuebing,ItemMantou,ItemSuancaibing,ItemYoutiao,ItemLatiao,ItemHetaosu,ItemAici,ItemCiba,ItemChangfen,
	ItemXiangchang,ItemRegou,ItemLachang,ItemLarou,ItemZhaxiangchang,ItemRibendoufu,ItemLabazhou,ItemLaweixunliao,ItemNainao,
	ItemPisa,ItemHanbaobao,ItemJinghuashuitong,ItemSCBlock,ItemSCPlant,ItemSCMW1,ItemSCMW2,ItemSCKFC,ItemSCCn,ItemSCYz,
	ItemSCJ,ItemSCShui1,ItemSCShui2,ItemSCFan1,ItemSCFan2,ItemSCFan3,ItemSCTh,ItemAnbizhishi,ItemAnlanzhishi,ItemZongjiqianguzhishi,
ItemAnlanTools,ItemAnbiTools,ItemZongjiTools,ItemZongjiTools2,ItemZongjiTools3,ItemZongjiTools4,ItemNull,ItemYangrou,ItemShuyangrou,
ItemYouyurou,ItemShuyouyurou,ItemYouyusi;
	public static void init() {
		//���˹���	
		ItemTiepian = new ItemKb();
		ItemTiepian.setUnlocalizedName("ItemTiepian");
		ItemTiepian.setTextureName("FoodCraft:ItemTiepian");
		ItemTiepian.setCreativeTab(FoodCraft.FcTab);
		

		Itemwater = new ItemKb();
		Itemwater.setUnlocalizedName("Itemwater");
		Itemwater.setTextureName("FoodCraft:Itemwater");
		Itemwater.setCreativeTab(FoodCraft.FcTab);
		
		ItemCaidao = new ItemSpade(Item.ToolMaterial.WOOD);
		ItemCaidao.setUnlocalizedName("ItemCaidao");
		ItemCaidao.setTextureName("FoodCraft:ItemCaidao");
		ItemCaidao.setCreativeTab(FoodCraft.FcTab);
		
		ItemJinghuashuitong = new ItemJinghuashuitong(EnumHelper.addToolMaterial("JHST", 0, 16, 2.0F, 0.0F, 15));
		ItemJinghuashuitong.setMaxStackSize(1);
		ItemJinghuashuitong.setUnlocalizedName("ItemJinghuashuitong");
		ItemJinghuashuitong.setTextureName("FoodCraft:ItemJinghuashuitong");
		ItemJinghuashuitong.setCreativeTab(FoodCraft.FcTab);
	//��	
		ItemDami = new ItemShuidao(ModBlocks.BlockShuidao);
		MinecraftForge.addGrassSeed(new ItemStack(ItemDami), 2);
		ItemDami.setUnlocalizedName("ItemDami");
		ItemDami.setTextureName("FoodCraft:ItemDami");
		ItemDami.setCreativeTab(FoodCraft.FcTab);
		
		ItemHuashen = new ItemHuashen(ModBlocks.BlockHuashen);
		ItemHuashen.setUnlocalizedName("ItemHuashen");
		MinecraftForge.addGrassSeed(new ItemStack(ItemHuashen), 2);
		ItemHuashen.setTextureName("FoodCraft:ItemHuashen");
		ItemHuashen.setCreativeTab(FoodCraft.FcTab);
		
		ItemShucai = new ItemShucai(ModBlocks.BlockShucai);
		ItemShucai.setUnlocalizedName("ItemShucai");
		MinecraftForge.addGrassSeed(new ItemStack(ItemShucai), 1);
		ItemShucai.setTextureName("FoodCraft:ItemShucai");
		ItemShucai.setCreativeTab(FoodCraft.FcTab);
		
		ItemDouzi = new ItemDouzi(ModBlocks.BlockDouzi);
		MinecraftForge.addGrassSeed(new ItemStack(ItemDouzi), 2);
		ItemDouzi.setUnlocalizedName("ItemDouzi");
		ItemDouzi.setTextureName("FoodCraft:ItemDouzi");
		ItemDouzi.setCreativeTab(FoodCraft.FcTab);
		
		Itemfan = new ItemKb();
		Itemfan.setUnlocalizedName("Itemfan");
		Itemfan.setTextureName("FoodCraft:Itemfan");
		Itemfan.setCreativeTab(FoodCraft.FcTab);

		//���
		ItemMianfen = new ItemKb();
		ItemMianfen.setUnlocalizedName("ItemMianfen");
		ItemMianfen.setTextureName("FoodCraft:ItemMianfen");
		ItemMianfen.setCreativeTab(FoodCraft.FcTab);
		
		ItemHuashenyou = new ItemKb();
		ItemHuashenyou.setUnlocalizedName("ItemHuashenyou");
		ItemHuashenyou.setTextureName("FoodCraft:ItemHuashenyou");
		ItemHuashenyou.setCreativeTab(FoodCraft.FcTab);
		
		ItemDoujiang = new ITemFood(2, 2F, false, "ItemDoujiang");
		ItemDoujiang.setUnlocalizedName("ItemDoujiang");
		ItemDoujiang.setTextureName("FoodCraft:ItemDoujiang");
		ItemDoujiang.setCreativeTab(FoodCraft.FcTab);
		
		ItemDianluban = new ItemKb();
		ItemDianluban.setUnlocalizedName("ItemDianluban");
		ItemDianluban.setTextureName("FoodCraft:ItemDianluban");
		ItemDianluban.setCreativeTab(FoodCraft.FcTab);
		
		ItemJianjidan = new ITemFood(3, 2F, false, "ItemJianjidan");
		ItemJianjidan.setUnlocalizedName("ItemJianjidan");
		ItemJianjidan.setTextureName("FoodCraft:ItemJianjidan");
		ItemJianjidan.setCreativeTab(FoodCraft.FcTab);
		
		ItemLaobing = new ITemFood(3, 2F, false, "ItemLaobing");
		ItemLaobing.setUnlocalizedName("ItemLaobing");
		ItemLaobing.setTextureName("FoodCraft:Itembing");
		ItemLaobing.setCreativeTab(FoodCraft.FcTab);
		
		ItemMianpi = new ItemKb();
		ItemMianpi.setUnlocalizedName("ItemMianpi");
		ItemMianpi.setTextureName("FoodCraft:ItemMianpi");
		ItemMianpi.setCreativeTab(FoodCraft.FcTab);
		
		ItemJiaozixian = new ItemKb();
		ItemJiaozixian.setUnlocalizedName("ItemJiaozixian");
		ItemJiaozixian.setTextureName("FoodCraft:ItemJiaozixian");
		ItemJiaozixian.setCreativeTab(FoodCraft.FcTab);		
		
		ItemJiaozi = new ITemFood(3, 5F, false, "ItemJiaozi");
		ItemJiaozi.setUnlocalizedName("ItemJiaozi");
		ItemJiaozi.setTextureName("FoodCraft:ItemJiaozi");
		ItemJiaozi.setCreativeTab(FoodCraft.FcTab);
		
		ItemJianjiao = new ITemFood(3, 7F, false, "ItemJianJiao");
		ItemJianjiao.setUnlocalizedName("ItemJianJiao");
		ItemJianjiao.setTextureName("FoodCraft:ItemJianJiao0");
		ItemJianjiao.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiaokelifen = new ItemKb();
		ItemQiaokelifen.setUnlocalizedName("ItemQiaokelifen");
		ItemQiaokelifen.setTextureName("FoodCraft:ItemQiaokelifen");
		ItemQiaokelifen.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiaokeli = new ITemFood(3, 4F, false, "ItemQiaokeli");
		ItemQiaokeli.setUnlocalizedName("ItemQiaokeli");
		ItemQiaokeli.setTextureName("FoodCraft:ItemQiaokeli");
		ItemQiaokeli.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLajiao = new ItemLajiao(ModBlocks.BlockLajiao);
		MinecraftForge.addGrassSeed(new ItemStack(ItemLajiao), 2);
		ItemLajiao.setUnlocalizedName("ItemLajiao");
		ItemLajiao.setTextureName("FoodCraft:ItemLajiao");
		ItemLajiao.setCreativeTab(FoodCraft.FcTab);
		
		ItemFanqie = new ItemFanqie(ModBlocks.BlockFanqie);
		MinecraftForge.addGrassSeed(new ItemStack(ItemFanqie), 2);
		ItemFanqie.setUnlocalizedName("ItemFanqie");
		ItemFanqie.setTextureName("FoodCraft:ItemFanqie");
		ItemFanqie.setCreativeTab(FoodCraft.FcTab);
		
		ItemPutao = new ItemPutao(ModBlocks.BlockPutao);
		MinecraftForge.addGrassSeed(new ItemStack(ItemPutao), 2);
		ItemPutao.setUnlocalizedName("ItemPutao");
		ItemPutao.setTextureName("FoodCraft:ItemPutao");
		ItemPutao.setCreativeTab(FoodCraft.FcTab);
		
		ItemQiezi = new ItemQiezi(ModBlocks.BlockQiezi);
		MinecraftForge.addGrassSeed(new ItemStack(ItemQiezi), 2);
		ItemQiezi.setUnlocalizedName("ItemQiezi");
		ItemQiezi.setTextureName("FoodCraft:ItemQiezi");
		ItemQiezi.setCreativeTab(FoodCraft.FcTab);

		ItemYan = new ItemKb();
		ItemYan.setUnlocalizedName("ItemYan");
		ItemYan.setTextureName("FoodCraft:ItemYan");
		ItemYan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufu = new ITemFood(3, 2F, false, "ItemDoufu");
		ItemDoufu.setUnlocalizedName("ItemDoufu");
		ItemDoufu.setTextureName("FoodCraft:ItemDoufu");
		ItemDoufu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJiangyou = new ItemKb();
		ItemJiangyou.setUnlocalizedName("ItemJiangyou");
		ItemJiangyou.setTextureName("FoodCraft:ItemJiangyou");
		ItemJiangyou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomi = new ItemKb();
		ItemNuomi.setUnlocalizedName("ItemNuomi");
		ItemNuomi.setTextureName("FoodCraft:ItemNuomi");
		ItemNuomi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufugan = new ITemFood(3, 4F, false, "ItemDoufugan");
		ItemDoufugan.setUnlocalizedName("ItemDoufugan");
		ItemDoufugan.setTextureName("FoodCraft:ItemDoufugan");
		ItemDoufugan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemBaifan = new ITemFood(3, 3F, false, "ItemBaifan");
		ItemBaifan.setUnlocalizedName("ItemBaifan");
		ItemBaifan.setTextureName("FoodCraft:ItemBaifan");
		ItemBaifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemFanqiechaojidanfan = new ITemFood(3, 18F, false, "ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setUnlocalizedName("ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setTextureName("FoodCraft:ItemFanqiechaojidanfan");
		ItemFanqiechaojidanfan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDisanxian = new ITemFood(3, 18F, false, "ItemDisanxian");
		ItemDisanxian.setUnlocalizedName("ItemDisanxian");
		ItemDisanxian.setTextureName("FoodCraft:ItemDisanxian");
		ItemDisanxian.setCreativeTab(FoodCraft.FcTab);	
	
		ItemYuxiangrousi = new ITemFood(3, 18F, false, "ItemYuxiangrousi");
		ItemYuxiangrousi.setUnlocalizedName("ItemYuxiangrousi");
		ItemYuxiangrousi.setTextureName("FoodCraft:ItemYuxiangrousi");
		ItemYuxiangrousi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCu = new ItemKb();
		ItemCu.setUnlocalizedName("ItemCu");
		ItemCu.setTextureName("FoodCraft:ItemCu");
		ItemCu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemGongbaojiding = new ITemFood(3, 18F, false, "ItemGongbaojiding");
		ItemGongbaojiding.setUnlocalizedName("ItemGongbaojiding");
		ItemGongbaojiding.setTextureName("FoodCraft:ItemGongbaojiding");
		ItemGongbaojiding.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJitui = new ITemFood(3, 1F, false, "ItemJitui");
		ItemJitui.setUnlocalizedName("ItemJitui");
		ItemJitui.setTextureName("FoodCraft:ItemJitui");
		ItemJitui.setCreativeTab(FoodCraft.FcTab);	
		
		ItemTudoupian = new ItemKb();
		ItemTudoupian.setUnlocalizedName("ItemTudoupian");
		ItemTudoupian.setTextureName("FoodCraft:ItemTudoupian");
		ItemTudoupian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemTudousi = new ItemKb();
		ItemTudousi.setUnlocalizedName("ItemTudousi");
		ItemTudousi.setTextureName("FoodCraft:ItemTudousi");
		ItemTudousi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemChaotudousifan = new ITemFood(3, 18F, false, "ItemChaotudousifan");
		ItemChaotudousifan.setUnlocalizedName("ItemChaotudousifan");
		ItemChaotudousifan.setTextureName("FoodCraft:ItemChaotudousifan");
		ItemChaotudousifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemChaotudoupian = new ITemFood(3, 3F, false, "ItemChaotudoupian");
		ItemChaotudoupian.setUnlocalizedName("ItemChaotudoupian");
		ItemChaotudoupian.setTextureName("FoodCraft:ItemChaotudoupian");
		ItemChaotudoupian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDuojiaoyutou = new ITemFood(3, 18F, false, "ItemDuojiaoyutou");
		ItemDuojiaoyutou.setUnlocalizedName("ItemDuojiaoyutou");
		ItemDuojiaoyutou.setTextureName("FoodCraft:ItemDuojiaoyutou");
		ItemDuojiaoyutou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDouban = new ItemKb();
		ItemDouban.setUnlocalizedName("ItemDouban");
		ItemDouban.setTextureName("FoodCraft:ItemDouban");
		ItemDouban.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMapodoufufan = new ITemFood(3, 18F, false, "ItemMapodoufufan");
		ItemMapodoufufan.setUnlocalizedName("ItemMapodoufufan");
		ItemMapodoufufan.setTextureName("FoodCraft:ItemMapodoufufan");
		ItemMapodoufufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDianfen = new ItemKb();
		ItemDianfen.setUnlocalizedName("ItemDianfen");
		ItemDianfen.setTextureName("FoodCraft:ItemDianfen");
		ItemDianfen.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHongshaoroufan = new ITemFood(3, 18F, false, "ItemHongshaoroufan");
		ItemHongshaoroufan.setUnlocalizedName("ItemHongshaoroufan");
		ItemHongshaoroufan.setTextureName("FoodCraft:ItemHongshaoroufan");
		ItemHongshaoroufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHuiguoroufan = new ITemFood(3, 18F, false, "ItemHuiguoroufan");
		ItemHuiguoroufan.setUnlocalizedName("ItemHuiguoroufan");
		ItemHuiguoroufan.setTextureName("FoodCraft:ItemHuiguoroufan");
		ItemHuiguoroufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXifan = new ITemFood(3, 4F, false, "ItemXifan");
		ItemXifan.setUnlocalizedName("ItemXifan");
		ItemXifan.setTextureName("FoodCraft:ItemXifan");
		ItemXifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDangeng = new ITemFood(3, 4F, false, "ItemDangeng");
		ItemDangeng.setUnlocalizedName("ItemDangeng");
		ItemDangeng.setTextureName("FoodCraft:ItemDangeng");
		ItemDangeng.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMogudunjitang = new ITemFood(3, 5F, false, "ItemMogudunjitang");
		ItemMogudunjitang.setUnlocalizedName("ItemMogudunjitang");
		ItemMogudunjitang.setTextureName("FoodCraft:ItemMgdjt");
		ItemMogudunjitang.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZongzi = new ITemFood(3, 6F, false, "ItemZongzi");
		ItemZongzi.setUnlocalizedName("ItemZongzi");
		ItemZongzi.setTextureName("FoodCraft:ItemZongzi");
		ItemZongzi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZongye = new ItemKb();
		ItemZongye.setUnlocalizedName("ItemZongye");
		ItemZongye.setTextureName("FoodCraft:ItemZongye");
		ItemZongye.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCong = new ItemCong();
		ItemCong.setUnlocalizedName("ItemCong");
		ItemCong.setTextureName("FoodCraft:ItemCong");
		ItemCong.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomifen = new ItemKb();
		ItemNuomifen.setUnlocalizedName("ItemNuomifen");
		ItemNuomifen.setTextureName("FoodCraft:ItemNuomifen");
		ItemNuomifen.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNuomituan = new ItemKb();
		ItemNuomituan.setUnlocalizedName("ItemNuomituan");
		ItemNuomituan.setTextureName("FoodCraft:ItemNuomituan");
		ItemNuomituan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHuashentangyuanxian = new ItemKb();
		ItemHuashentangyuanxian.setUnlocalizedName("ItemHuashentangyuanxian");
		ItemHuashentangyuanxian.setTextureName("FoodCraft:ItemHuashentangyuanxian");
		ItemHuashentangyuanxian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemTangyuan = new ITemFood(3, 6F, false, "ItemTangyuan");
		ItemTangyuan.setUnlocalizedName("ItemTangyuan");
		ItemTangyuan.setTextureName("FoodCraft:ItemTangyuan");
		ItemTangyuan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJikuai = new ITemFood(3, 4F, false, "ItemJikuai");
		ItemJikuai.setUnlocalizedName("ItemJikuai");
		ItemJikuai.setTextureName("FoodCraft:ItemJikuai");
		ItemJikuai.setCreativeTab(FoodCraft.FcTab);	
		
		ItemShutiao = new ITemFood(3, 4F, false, "ItemShutiao");
		ItemShutiao.setUnlocalizedName("ItemShutiao");
		ItemShutiao.setTextureName("FoodCraft:ItemShutiao");
		ItemShutiao.setCreativeTab(FoodCraft.FcTab);	
		 
		ItemAeljichi = new ITemFood(3, 6F, false, "ItemAeljichi");
		ItemAeljichi.setUnlocalizedName("ItemAeljichi");
		ItemAeljichi.setTextureName("FoodCraft:ItemAeljichi");
		ItemAeljichi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJimihua = new ITemFood(3, 3F, false, "ItemJimihua");
		ItemJimihua.setUnlocalizedName("ItemJimihua");
		ItemJimihua.setTextureName("FoodCraft:ItemJimihua");
		ItemJimihua.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYuanweijikuai = new ITemFood(3, 6F, false, "ItemYuanweijikuai");
		ItemYuanweijikuai.setUnlocalizedName("ItemYuanweijikuai");
		ItemYuanweijikuai.setTextureName("FoodCraft:ItemYuanweijikuai");
		ItemYuanweijikuai.setCreativeTab(FoodCraft.FcTab);	
		
		ItemAeljichifan = new ITemFood(3, 20F, false, "ItemAeljichifan");
		ItemAeljichifan.setUnlocalizedName("ItemAeljichifan");
		ItemAeljichifan.setTextureName("FoodCraft:ItemAeljichifan");
		ItemAeljichifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMahua = new ITemFood(3, 3F, false, "ItemMahua");
		ItemMahua.setUnlocalizedName("ItemMahua");
		ItemMahua.setTextureName("FoodCraft:ItemMahua");
		ItemMahua.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNiangao = new ITemFood(3, 5F, false, "ItemNiangao");
		ItemNiangao.setUnlocalizedName("ItemNiangao");
		ItemNiangao.setTextureName("FoodCraft:ItemNiangao");
		ItemNiangao.setCreativeTab(FoodCraft.FcTab);	
		
		ItemChunjuan = new ITemFood(3, 4F, false, "ItemChunjuan");
		ItemChunjuan.setUnlocalizedName("ItemChunjuan");
		ItemChunjuan.setTextureName("FoodCraft:ItemChunjuan");
		ItemChunjuan.setCreativeTab(FoodCraft.FcTab);	

		ItemZhadoufu = new ITemFood(3, 4F, false, "ItemZhadoufu");
		ItemZhadoufu.setUnlocalizedName("ItemZhadoufu");
		ItemZhadoufu.setTextureName("FoodCraft:ItemZhadoufu");
		ItemZhadoufu.setCreativeTab(FoodCraft.FcTab);	

		ItemZhaniangao = new ITemFood(3, 5F, false, "ItemZhaniangao");
		ItemZhaniangao.setUnlocalizedName("ItemZhaniangao");
		ItemZhaniangao.setTextureName("FoodCraft:ItemZhaniangao");
		ItemZhaniangao.setCreativeTab(FoodCraft.FcTab);	

		ItemShupian = new ITemFood(3, 3F, false, "ItemShupian");
		ItemShupian.setUnlocalizedName("ItemShupian");
		ItemShupian.setTextureName("FoodCraft:ItemShupian");
		ItemShupian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZhamianbao = new ITemFood(3, 4F, false, "ItemZhamianbao");
		ItemZhamianbao.setUnlocalizedName("ItemZhamianbao");
		ItemZhamianbao.setTextureName("FoodCraft:ItemZhamianbao");
		ItemZhamianbao.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZhachunjuan = new ITemFood(3, 5F, false, "ItemZhachunjuan");
		ItemZhachunjuan.setUnlocalizedName("ItemZhachunjuan");
		ItemZhachunjuan.setTextureName("FoodCraft:ItemZhachunjuan");
		ItemZhachunjuan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZhamahua = new ITemFood(3, 4F, false, "ItemZhamahua");
		ItemZhamahua.setUnlocalizedName("ItemZhamahua");
		ItemZhamahua.setTextureName("FoodCraft:ItemZhamahua");
		ItemZhamahua.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZhajitui = new ITemFood(3, 4F, false, "ItemZhajitui");
		ItemZhajitui.setUnlocalizedName("ItemZhajitui");
		ItemZhajitui.setTextureName("FoodCraft:ItemZhajitui");
		ItemZhajitui.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDajirou = new ItemKb();
		ItemDajirou.setUnlocalizedName("ItemDajirou");
		ItemDajirou.setTextureName("FoodCraft:ItemDajirou");
		ItemDajirou.setCreativeTab(FoodCraft.FcTab);	

		ItemZhongjirou = new ItemKb();
		ItemZhongjirou.setUnlocalizedName("ItemZhongjirou");
		ItemZhongjirou.setTextureName("FoodCraft:ItemZhongjirou");
		ItemZhongjirou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXiaojirou = new ItemKb();
		ItemXiaojirou.setUnlocalizedName("ItemXiaojirou");
		ItemXiaojirou.setTextureName("FoodCraft:ItemXiaojirou");
		ItemXiaojirou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJichi = new ITemFood(3, 2F, false, "ItemJichi");
		ItemJichi.setUnlocalizedName("ItemJichi");
		ItemJichi.setTextureName("FoodCraft:ItemJichi");
		ItemJichi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemDoufusi = new ItemKb();
		ItemDoufusi.setUnlocalizedName("ItemDoufusi");
		ItemDoufusi.setTextureName("FoodCraft:ItemDoufusi");
		ItemDoufusi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLuobosi = new ItemKb();
		ItemLuobosi.setUnlocalizedName("ItemLuobosi");
		ItemLuobosi.setTextureName("FoodCraft:ItemLuobosi");
		ItemLuobosi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHongjiu = new ItemFoodJiu(3, 4F, false, "ItemHongjiu").setAlwaysEdible();
		ItemHongjiu.setUnlocalizedName("ItemHongjiu");
		ItemHongjiu.setTextureName("FoodCraft:ItemHongjiu");
		ItemHongjiu.setCreativeTab(FoodCraft.FcTab);	

		ItemBaijiu = new ItemFoodJiu(3, 4F, false, "ItemBaijiu").setAlwaysEdible();
		ItemBaijiu.setUnlocalizedName("ItemBaijiu");
		ItemBaijiu.setTextureName("FoodCraft:ItemBaijiu");
		ItemBaijiu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPingguojiu = new ItemFoodJiu(3, 4F, false, "ItemPingguojiu").setAlwaysEdible();
		ItemPingguojiu.setUnlocalizedName("ItemPingguojiu");
		ItemPingguojiu.setTextureName("FoodCraft:ItemPingguojiu");
		ItemPingguojiu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPutaojiu = new ItemFoodJiu(3, 4F, false, "ItemPutaojiu").setAlwaysEdible();
		ItemPutaojiu.setUnlocalizedName("ItemPutaojiu");
		ItemPutaojiu.setTextureName("FoodCraft:ItemPutaojiu");
		ItemPutaojiu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinputao = new ITemFood(3, 20F, false, "ItemJinputao" ,true);
		ItemJinputao.setUnlocalizedName("ItemJinputao");
		ItemJinputao.setTextureName("FoodCraft:ItemJinputao");
		ItemJinputao.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinputaojiu = new ItemFoodJinputaojiu(3, 8F, false, "ItemJinputaojiu").setAlwaysEdible();
		ItemJinputaojiu.setUnlocalizedName("ItemJinputaojiu");
		ItemJinputaojiu.setTextureName("FoodCraft:ItemJinputaojiu");
		ItemJinputaojiu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinpingguojiu = new ItemFoodJinpingguojiu(3, 8F, false, "ItemJinpingguojiu").setAlwaysEdible();
		ItemJinpingguojiu.setUnlocalizedName("ItemJinpingguojiu");
		ItemJinpingguojiu.setTextureName("FoodCraft:ItemJinpingguojiu");
		ItemJinpingguojiu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemQiaokelishui = new ItemYingliao(3, 4F, false, "ItemQiaokelishui");
		ItemQiaokelishui.setUnlocalizedName("ItemQiaokelishui");
		ItemQiaokelishui.setTextureName("FoodCraft:ItemQiaokelishui");
		ItemQiaokelishui.setCreativeTab(FoodCraft.FcTab);	
		
		ItemQiaokelinai = new ItemMilk(3, 4F, false, "ItemQiaokelinai").setAlwaysEdible();
		ItemQiaokelinai.setUnlocalizedName("ItemQiaokelinai");
		ItemQiaokelinai.setTextureName("FoodCraft:ItemQiaokelinai");
		ItemQiaokelinai.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHuluobozhi = new ItemYingliao(3, 4F, false, "ItemHuluobozhi");
		ItemHuluobozhi.setUnlocalizedName("ItemHuluobozhi");
		ItemHuluobozhi.setTextureName("FoodCraft:ItemHuluobozhi");
		ItemHuluobozhi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPutaozhi = new ItemYingliao(3, 4F, false, "ItemPutaozhi");
		ItemPutaozhi.setUnlocalizedName("ItemPutaozhi");
		ItemPutaozhi.setTextureName("FoodCraft:ItemPutaozhi");
		ItemPutaozhi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPingguozhi = new ItemYingliao(3, 4F, false, "ItemPingguozhi");
		ItemPingguozhi.setUnlocalizedName("ItemPingguozhi");
		ItemPingguozhi.setTextureName("FoodCraft:ItemPingguozhi");
		ItemPingguozhi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemShucaizhi = new ItemYingliao(3, 4F, false, "ItemShucaizhi");
		ItemShucaizhi.setUnlocalizedName("ItemShucaizhi");
		ItemShucaizhi.setTextureName("FoodCraft:ItemShucaizhi");
		ItemShucaizhi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinputaozhi = new ItemYingliao(3, 4F, false, "ItemJinputaozhi",true , 0);
		ItemJinputaozhi.setUnlocalizedName("ItemJinputaozhi");
		ItemJinputaozhi.setTextureName("FoodCraft:ItemJinputaozhi");
		ItemJinputaozhi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinpingguozhi = new ItemYingliao(3, 4F, false, "ItemJinpingguozhi",true , 1);
		ItemJinpingguozhi.setUnlocalizedName("ItemJinpingguozhi");
		ItemJinpingguozhi.setTextureName("FoodCraft:ItemJinpingguozhi");
		ItemJinpingguozhi.setCreativeTab(FoodCraft.FcTab);	
		
	
		ItemDounai = new ItemYingliao(3, 4F, false, "ItemDounai");
		ItemDounai.setUnlocalizedName("ItemDounai");
		ItemDounai.setTextureName("FoodCraft:ItemDounai");
		ItemDounai.setCreativeTab(FoodCraft.FcTab);	
		
		ItemKele = new ItemYingliao(3, 4F, false, "ItemKele");
		ItemKele.setUnlocalizedName("ItemKele");
		ItemKele.setTextureName("FoodCraft:ItemKele");
		ItemKele.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXuebi = new ItemYingliao(3, 4F, false, "ItemXuebi");
		ItemXuebi.setUnlocalizedName("ItemXuebi");
		ItemXuebi.setTextureName("FoodCraft:ItemXuebi");
		ItemXuebi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemQiaokelinaiice = new ItemMilk(3, 4.5F, false, "ItemQiaokelinaiice").setAlwaysEdible();
		ItemQiaokelinaiice.setUnlocalizedName("ItemQiaokelinaiice");
		ItemQiaokelinaiice.setTextureName("FoodCraft:ItemQiaokelinaiice");
		ItemQiaokelinaiice.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPutaozhiice = new ItemYingliao(3, 4.5F, false, "ItemPutaozhiice");
		ItemPutaozhiice.setUnlocalizedName("ItemPutaozhiice");
		ItemPutaozhiice.setTextureName("FoodCraft:ItemPutaozhiice");
		ItemPutaozhiice.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPingguozhiice = new ItemYingliao(3, 4.5F, false, "ItemPingguozhiice");
		ItemPingguozhiice.setUnlocalizedName("ItemPingguozhiice");
		ItemPingguozhiice.setTextureName("FoodCraft:ItemPingguozhiice");
		ItemPingguozhiice.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinputaozhiice = new ItemYingliao(3, 4.5F, false, "ItemJinputaozhiice" , true , 0);
		ItemJinputaozhiice.setUnlocalizedName("ItemJinputaozhiice");
		ItemJinputaozhiice.setTextureName("FoodCraft:ItemJinputaozhiice");
		ItemJinputaozhiice.setCreativeTab(FoodCraft.FcTab);	
		
		ItemJinpingguozhiice = new ItemYingliao(3, 4.5F, false, "ItemJinpingguozhiice" , true , 1);
		ItemJinpingguozhiice.setUnlocalizedName("ItemJinpingguozhiice");
		ItemJinpingguozhiice.setTextureName("FoodCraft:ItemJinpingguozhiice");
		ItemJinpingguozhiice.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXiguazhi = new ItemYingliao(3, 4F, false, "ItemXiguazhi");
		ItemXiguazhi.setUnlocalizedName("ItemXiguazhi");
		ItemXiguazhi.setTextureName("FoodCraft:ItemXiguazhi");
		ItemXiguazhi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXiguazhiice = new ItemYingliao(3, 4.5F, false, "ItemXiguazhiice");
		ItemXiguazhiice.setUnlocalizedName("ItemXiguazhiice");
		ItemXiguazhiice.setTextureName("FoodCraft:ItemXiguazhiice");
		ItemXiguazhiice.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMianfensi = new ItemKb();
		ItemMianfensi.setUnlocalizedName("ItemMianfensi");
		ItemMianfensi.setTextureName("FoodCraft:ItemMianfensi");
		ItemMianfensi.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCha = new ItemYingliao(3, 4F, false, "ItemCha");
		ItemCha.setUnlocalizedName("ItemCha");
		ItemCha.setTextureName("FoodCraft:ItemCha");
		ItemCha.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNaicha = new ItemMilk(3, 4F, false, "ItemXiguazhi").setAlwaysEdible();
		ItemNaicha.setUnlocalizedName("ItemNaicha");
		ItemNaicha.setTextureName("FoodCraft:ItemNaicha");
		ItemNaicha.setCreativeTab(FoodCraft.FcTab);	
		
		ItemKafei = new ItemMilk(3, 5F, false, "ItemKafei").setAlwaysEdible();
		ItemKafei.setUnlocalizedName("ItemKafei");
		ItemKafei.setTextureName("FoodCraft:ItemKafei");
		ItemKafei.setCreativeTab(FoodCraft.FcTab);	
		
		ItemBaiqiuji = new ITemFood(3, 18F, false, "ItemBaiqiuji");
		ItemBaiqiuji.setUnlocalizedName("ItemBaiqiuji");
		ItemBaiqiuji.setTextureName("FoodCraft:ItemBaiqiuji");
		ItemBaiqiuji.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCongyouji = new ITemFood(3, 18F, false, "ItemCongyouji");
		ItemCongyouji.setUnlocalizedName("ItemCongyouji");
		ItemCongyouji.setTextureName("FoodCraft:ItemCongyouji");
		ItemCongyouji.setCreativeTab(FoodCraft.FcTab);	
		
		ItemKoushuiji = new ITemFood(3, 18F, false, "ItemKoushuiji");
		ItemKoushuiji.setUnlocalizedName("ItemKoushuiji");
		ItemKoushuiji.setTextureName("FoodCraft:ItemKoushuiji");
		ItemKoushuiji.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLaziji = new ITemFood(3, 18F, false, "ItemLaziji");
		ItemLaziji.setUnlocalizedName("ItemLaziji");
		ItemLaziji.setTextureName("FoodCraft:ItemLaziji");
		ItemLaziji.setCreativeTab(FoodCraft.FcTab);	

		ItemQingzhenyu = new ITemFood(3, 18F, false, "ItemQingzhenyu");
		ItemQingzhenyu.setUnlocalizedName("ItemQingzhenyu");
		ItemQingzhenyu.setTextureName("FoodCraft:ItemQingzhenyu");
		ItemQingzhenyu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMalayu = new ITemFood(3, 18F, false, "ItemMalayu");
		ItemMalayu.setUnlocalizedName("ItemMalayu");
		ItemMalayu.setTextureName("FoodCraft:ItemMalayu");
		ItemMalayu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemSuancaiyu = new ITemFood(3, 18F, false, "ItemSuancaiyu");
		ItemSuancaiyu.setUnlocalizedName("ItemSuancaiyu");
		ItemSuancaiyu.setTextureName("FoodCraft:ItemSuancaiyu");
		ItemSuancaiyu.setCreativeTab(FoodCraft.FcTab);	

		ItemKelejichifan = new ITemFood(3, 20F, false, "ItemKelejichifan");
		ItemKelejichifan.setUnlocalizedName("ItemKelejichifan");
		ItemKelejichifan.setTextureName("FoodCraft:ItemKelejichifan");
		ItemKelejichifan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemGalijiroufan = new ITemFood(3, 18F, false, "ItemGalijiroufan");
		ItemGalijiroufan.setUnlocalizedName("ItemGalijiroufan");
		ItemGalijiroufan.setTextureName("FoodCraft:ItemGalijiroufan");
		ItemGalijiroufan.setCreativeTab(FoodCraft.FcTab);	
		
		ItemGalikuai = new ITemFood(3, 18F, false, "ItemGalikuai");
		ItemGalikuai.setUnlocalizedName("ItemGalikuai");
		ItemGalikuai.setTextureName("FoodCraft:ItemGalikuai");
		ItemGalikuai.setCreativeTab(FoodCraft.FcTab);	
		
		ItemShuizhuniurou = new ITemFood(3, 18F, false, "ItemShuizhuniurou");
		ItemShuizhuniurou.setUnlocalizedName("ItemShuizhuniurou");
		ItemShuizhuniurou.setTextureName("FoodCraft:ItemShuizhuniurou");
		ItemShuizhuniurou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMian = new ITemFood(3, 6F, false, "ItemMian");
		ItemMian.setUnlocalizedName("ItemMian");
		ItemMian.setTextureName("FoodCraft:ItemMian");
		ItemMian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemGuoqiaomixian = new ITemFood(3, 6F, false, "ItemGuoqiaomixian");
		ItemGuoqiaomixian.setUnlocalizedName("ItemGuoqiaomixian");
		ItemGuoqiaomixian.setTextureName("FoodCraft:ItemGuoqiaomixian");
		ItemGuoqiaomixian.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYifen = new ITemFood(3, 8F, false, "ItemYifen");
		ItemYifen.setUnlocalizedName("ItemYifen");
		ItemYifen.setTextureName("FoodCraft:ItemYifen");
		ItemYifen.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYifenpork = new ITemFood(3, 18F, false, "ItemYifenpork");
		ItemYifenpork.setUnlocalizedName("ItemYifenpork");
		ItemYifenpork.setTextureName("FoodCraft:ItemYifenpork");
		ItemYifenpork.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYifenbeef = new ITemFood(3, 18F, false, "ItemYifenbeef");
		ItemYifenbeef.setUnlocalizedName("ItemYifenbeef");
		ItemYifenbeef.setTextureName("FoodCraft:ItemYifenbeef");
		ItemYifenbeef.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYifenchicken = new ITemFood(3, 18F, false, "ItemYifenchicken");
		ItemYifenchicken.setUnlocalizedName("ItemYifenchicken");
		ItemYifenchicken.setTextureName("FoodCraft:ItemYifenchicken");
		ItemYifenchicken.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPidanshourouzhou = new ITemFood(3, 4F, false, "ItemPidanshourouzhou");
		ItemPidanshourouzhou.setUnlocalizedName("ItemPidanshourouzhou");
		ItemPidanshourouzhou.setTextureName("FoodCraft:ItemPidanshourouzhou");
		ItemPidanshourouzhou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYuebing = new ITemFood(3, 5F, false, "ItemYuebing");
		ItemYuebing.setUnlocalizedName("ItemYuebing");
		ItemYuebing.setTextureName("FoodCraft:ItemYuebing");
		ItemYuebing.setCreativeTab(FoodCraft.FcTab);	
		
		ItemMantou = new ITemFood(3, 3.5F, false, "ItemMantou");
		ItemMantou.setUnlocalizedName("ItemMantou");
		ItemMantou.setTextureName("FoodCraft:ItemMantou");
		ItemMantou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemSuancaibing = new ITemFood(3, 5F, false, "ItemSuancaibing");
		ItemSuancaibing.setUnlocalizedName("ItemSuancaibing");
		ItemSuancaibing.setTextureName("FoodCraft:ItemSuancaibing");
		ItemSuancaibing.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYoutiao = new ITemFood(3, 3.5F, false, "ItemYoutiao");
		ItemYoutiao.setUnlocalizedName("ItemYoutiao");
		ItemYoutiao.setTextureName("FoodCraft:ItemYoutiao");
		ItemYoutiao.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLatiao = new ITemFood(3, 4F, false, "ItemLatiao");
		ItemLatiao.setUnlocalizedName("ItemLatiao");
		ItemLatiao.setTextureName("FoodCraft:ItemLatiao");
		ItemLatiao.setCreativeTab(FoodCraft.FcTab);	

		ItemHetaosu = new ITemFood(3, 5F, false, "ItemHetaosu");
		ItemHetaosu.setUnlocalizedName("ItemHetaosu");
		ItemHetaosu.setTextureName("FoodCraft:ItemHetaosu");
		ItemHetaosu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemAici = new ITemFood(3, 4F, false, "ItemAici");
		ItemAici.setUnlocalizedName("ItemAici");
		ItemAici.setTextureName("FoodCraft:ItemAici");
		ItemAici.setCreativeTab(FoodCraft.FcTab);	
		
		ItemCiba = new ITemFood(3, 3.5F, false, "ItemCiba");
		ItemCiba.setUnlocalizedName("ItemCiba");
		ItemCiba.setTextureName("FoodCraft:ItemCiba");
		ItemCiba.setCreativeTab(FoodCraft.FcTab);	
		
		ItemChangfen = new ITemFood(3, 8F, false, "ItemChangfen");
		ItemChangfen.setUnlocalizedName("ItemChangfen");
		ItemChangfen.setTextureName("FoodCraft:ItemChangfen");
		ItemChangfen.setCreativeTab(FoodCraft.FcTab);	
		
		ItemXiangchang = new ITemFood(3, 3F, false, "ItemXiangchang");
		ItemXiangchang.setUnlocalizedName("ItemXiangchang");
		ItemXiangchang.setTextureName("FoodCraft:ItemXiangchang");
		ItemXiangchang.setCreativeTab(FoodCraft.FcTab);	
		
		ItemRegou = new ITemFood(3, 7.5F, false, "ItemRegou");
		ItemRegou.setUnlocalizedName("ItemRegou");
		ItemRegou.setTextureName("FoodCraft:ItemRegou");
		ItemRegou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLachang = new ITemFood(3, 5F, false, "ItemLachang");
		ItemLachang.setUnlocalizedName("ItemLachang");
		ItemLachang.setTextureName("FoodCraft:ItemLachang");
		ItemLachang.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLarou = new ITemFood(3, 5.5F, false, "ItemLarou");
		ItemLarou.setUnlocalizedName("ItemLarou");
		ItemLarou.setTextureName("FoodCraft:ItemLarou");
		ItemLarou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemZhaxiangchang = new ITemFood(3, 5F, false, "ItemZhaxiangchang");
		ItemZhaxiangchang.setUnlocalizedName("ItemZhaxiangchang");
		ItemZhaxiangchang.setTextureName("FoodCraft:ItemZhaxiangchang");
		ItemZhaxiangchang.setCreativeTab(FoodCraft.FcTab);	
		
		ItemRibendoufu = new ITemFood(3, 8F, false, "ItemRibendoufu");
		ItemRibendoufu.setUnlocalizedName("ItemRibendoufu");
		ItemRibendoufu.setTextureName("FoodCraft:ItemRibendoufu");
		ItemRibendoufu.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLabazhou = new ITemFood(3, 5F, false, "ItemLabazhou");
		ItemLabazhou.setUnlocalizedName("ItemLabazhou");
		ItemLabazhou.setTextureName("FoodCraft:ItemLabazhou");
		ItemLabazhou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemLaweixunliao = new ItemKb();
		ItemLaweixunliao.setUnlocalizedName("ItemLaweixunliao");
		ItemLaweixunliao.setTextureName("FoodCraft:ItemLaweixunliao");
		ItemLaweixunliao.setCreativeTab(FoodCraft.FcTab);	
		
		ItemNainao = new ITemFood(3, 3F, false, "ItemNainao");
		ItemNainao.setUnlocalizedName("ItemNainao");
		ItemNainao.setTextureName("FoodCraft:ItemNainao");
		ItemNainao.setCreativeTab(FoodCraft.FcTab);	
		
		ItemPisa = new ITemFood(3, 9F, false, "ItemPisa");
		ItemPisa.setUnlocalizedName("ItemPisa");
		ItemPisa.setTextureName("FoodCraft:ItemPisa");
		ItemPisa.setCreativeTab(FoodCraft.FcTab);	
		
		ItemHanbaobao = new ITemFood(3, 7F, false, "ItemHanbaobao");
		ItemHanbaobao.setUnlocalizedName("ItemHanbaobao");
		ItemHanbaobao.setTextureName("FoodCraft:ItemHanbaobao");
		ItemHanbaobao.setCreativeTab(FoodCraft.FcTab);	

		ItemYangrou = new ITemFood(3, 4F, false, "ItemYangrou");
		ItemYangrou.setUnlocalizedName("ItemYangrou");
		ItemYangrou.setTextureName("FoodCraft:ItemYangrou");
		ItemYangrou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemShuyangrou = new ITemFood(3, 8F, false, "ItemShuyangrou");
		ItemShuyangrou.setUnlocalizedName("ItemShuyangrou");
		ItemShuyangrou.setTextureName("FoodCraft:ItemShuyangrou");
		ItemShuyangrou.setCreativeTab(FoodCraft.FcTab);	

		ItemYouyurou = new ITemFood(3, 3F, false, "ItemYouyurou");
		ItemYouyurou.setUnlocalizedName("ItemYouyurou");
		ItemYouyurou.setTextureName("FoodCraft:ItemYouyurou");
		ItemYouyurou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemShuyouyurou = new ITemFood(3, 6F, false, "ItemShuyouyurou");
		ItemShuyouyurou.setUnlocalizedName("ItemShuyouyurou");
		ItemShuyouyurou.setTextureName("FoodCraft:ItemShuyouyurou");
		ItemShuyouyurou.setCreativeTab(FoodCraft.FcTab);	
		
		ItemYouyusi = new ITemFood(3, 3F, false, "ItemYouyusi");
		ItemYouyusi.setUnlocalizedName("ItemYouyusi");
		ItemYouyusi.setTextureName("FoodCraft:ItemYouyusi");
		ItemYouyusi.setCreativeTab(FoodCraft.FcTab);	
		
		GameRegistry.registerItem(ItemTiepian, "ItemTiepian");
		GameRegistry.registerItem(ItemJinghuashuitong, "ItemJinghuashuitong");
		GameRegistry.registerItem(ItemDianluban, "ItemDianluban");
		GameRegistry.registerItem(ItemCaidao, "ItemCaidao");
		GameRegistry.registerItem(Itemwater, "Itemwater");
		
		
		GameRegistry.registerItem(ItemDami, "ItemDami");
		GameRegistry.registerItem(ItemHuashen, "ItemHuashen");	
		GameRegistry.registerItem(ItemDouzi, "ItemDouzi");	
		GameRegistry.registerItem(ItemShucai, "ItemShucai");	
		GameRegistry.registerItem(ItemLajiao, "ItemLajiao");	
		GameRegistry.registerItem(ItemFanqie, "ItemFanqie");	
		GameRegistry.registerItem(ItemQiezi, "ItemQiezi");	
		GameRegistry.registerItem(ItemCong, "ItemCong");	
		GameRegistry.registerItem(ItemPutao, "ItemPutao");	
		GameRegistry.registerItem(ItemJinputao, "ItemJinputao");			
		GameRegistry.registerItem(Itemfan, "Itemfan");
		GameRegistry.registerItem(ItemMianfen, "ItemMianfen");
		GameRegistry.registerItem(ItemYan, "ItemYan");
		GameRegistry.registerItem(ItemMianpi, "ItemMianpi");
		GameRegistry.registerItem(ItemNuomi, "ItemNuomi");
		GameRegistry.registerItem(ItemDouban, "ItemDouban");
		GameRegistry.registerItem(ItemQiaokeli, "ItemQiaokeli");
		GameRegistry.registerItem(ItemQiaokelifen, "ItemQiaokelifen");
		GameRegistry.registerItem(ItemJiaozixian, "ItemJiaozixian");
		GameRegistry.registerItem(ItemHuashenyou, "ItemHuashenyou");
		GameRegistry.registerItem(ItemBaifan, "ItemBaifan");
		GameRegistry.registerItem(ItemJitui, "ItemJitui");	
		GameRegistry.registerItem(ItemJichi, "ItemJichi");	
		GameRegistry.registerItem(ItemDajirou, "ItemDajirou");	
		GameRegistry.registerItem(ItemZhongjirou, "ItemZhongjirou");	
		GameRegistry.registerItem(ItemXiaojirou, "ItemXiaojirou");	
		GameRegistry.registerItem(ItemTudoupian, "ItemTudoupian");	
		GameRegistry.registerItem(ItemTudousi, "ItemTudousi");	
		GameRegistry.registerItem(ItemJiangyou, "ItemJiangyou");	
		GameRegistry.registerItem(ItemCu, "ItemCu");	
		GameRegistry.registerItem(ItemDianfen, "ItemDianfen");	
		GameRegistry.registerItem(ItemZongye, "ItemZongye");	
		GameRegistry.registerItem(ItemNuomifen, "ItemNuomifen");	
		GameRegistry.registerItem(ItemNuomituan, "ItemNuomituan");	
		GameRegistry.registerItem(ItemHuashentangyuanxian, "ItemHuashentangyuanxian");	
		GameRegistry.registerItem(ItemDoufusi, "ItemDoufusi");	
		GameRegistry.registerItem(ItemLuobosi, "ItemLuobosi");	
		GameRegistry.registerItem(ItemMianfensi, "ItemMianfensi");	
		GameRegistry.registerItem(ItemGalikuai, "ItemGalikuai");	
		GameRegistry.registerItem(ItemLaweixunliao, "ItemLaweixunliao");	
		
		GameRegistry.registerItem(ItemYangrou, "ItemYangrou");
		GameRegistry.registerItem(ItemShuyangrou, "ItemShuyangrou");
		GameRegistry.registerItem(ItemYouyurou, "ItemYouyurou");
		GameRegistry.registerItem(ItemShuyouyurou, "ItemShuyouyurou");
		GameRegistry.registerItem(ItemYouyusi, "ItemYouyusi");
		
		GameRegistry.registerItem(ItemJianjidan, "ItemJianjidan");
		GameRegistry.registerItem(ItemDoujiang, "ItemDoujiang");
		GameRegistry.registerItem(ItemLaobing, "ItemLaobing");
		GameRegistry.registerItem(ItemJiaozi, "ItemJiaozi");
		GameRegistry.registerItem(ItemJianjiao, "ItemJianJiao");
		GameRegistry.registerItem(ItemDoufu, "ItemDoufu");
		GameRegistry.registerItem(ItemDoufugan, "ItemDoufugan");
		GameRegistry.registerItem(ItemChaotudoupian, "ItemChaotudoupian");
		GameRegistry.registerItem(ItemXifan, "ItemXifan");
		GameRegistry.registerItem(ItemZongzi, "ItemZongzi");
		GameRegistry.registerItem(ItemYuebing, "ItemYuebing");
		GameRegistry.registerItem(ItemTangyuan, "ItemTangyuan");
		GameRegistry.registerItem(ItemMahua, "ItemMahua");
		GameRegistry.registerItem(ItemNiangao, "ItemNiangao");
		GameRegistry.registerItem(ItemChunjuan, "ItemChunjuan");
		GameRegistry.registerItem(ItemShupian, "ItemShupian");
		GameRegistry.registerItem(ItemHetaosu, "ItemHetaosu");
		GameRegistry.registerItem(ItemAici, "ItemAici");
		GameRegistry.registerItem(ItemCiba, "ItemCiba");
		GameRegistry.registerItem(ItemXiangchang, "ItemXiangchang");
		GameRegistry.registerItem(ItemRegou, "ItemRegou");
		GameRegistry.registerItem(ItemLachang, "ItemLachang");
		GameRegistry.registerItem(ItemLarou, "ItemLarou");
		GameRegistry.registerItem(ItemZhaxiangchang, "ItemZhaxiangchang");
		GameRegistry.registerItem(ItemNainao, "ItemNainao");
		GameRegistry.registerItem(ItemPisa, "ItemPisa");
		GameRegistry.registerItem(ItemHanbaobao, "ItemHanbaobao");
		
		GameRegistry.registerItem(ItemMantou, "ItemMantou");
		GameRegistry.registerItem(ItemSuancaibing, "ItemSuancaibing");
		GameRegistry.registerItem(ItemYoutiao, "ItemYoutiao");
		GameRegistry.registerItem(ItemLatiao, "ItemLatiao");
		
		
		GameRegistry.registerItem(ItemJikuai, "ItemJikuai");
		GameRegistry.registerItem(ItemYuanweijikuai, "ItemYuanweijikuai");
		GameRegistry.registerItem(ItemShutiao, "ItemShutiao");
		GameRegistry.registerItem(ItemJimihua, "ItemJimihua");
		GameRegistry.registerItem(ItemAeljichi, "ItemAeljichi");
		
		GameRegistry.registerItem(ItemZhadoufu, "ItemZhadoufu");
		GameRegistry.registerItem(ItemZhaniangao, "ItemZhaniangao");
		GameRegistry.registerItem(ItemZhamianbao, "ItemZhamianbao");
		GameRegistry.registerItem(ItemZhachunjuan, "ItemZhachunjuan");
		GameRegistry.registerItem(ItemZhamahua, "ItemZhamahua");
		GameRegistry.registerItem(ItemZhajitui, "ItemZhajitui");

		GameRegistry.registerItem(ItemDangeng, "ItemDangeng");
		GameRegistry.registerItem(ItemMogudunjitang, "ItemMogudunjitang");
		GameRegistry.registerItem(ItemMian, "ItemMian");
		GameRegistry.registerItem(ItemGuoqiaomixian, "ItemGuoqiaomixian");
		GameRegistry.registerItem(ItemPidanshourouzhou, "ItemPidanshourouzhou");
		GameRegistry.registerItem(ItemLabazhou, "ItemLabazhou");
		

		GameRegistry.registerItem(ItemHongjiu, "ItemHongjiu");
		GameRegistry.registerItem(ItemBaijiu, "ItemBaijiu");
		GameRegistry.registerItem(ItemPutaojiu, "ItemPutaojiu");
		GameRegistry.registerItem(ItemPingguojiu, "ItemPingguojiu");
		
		GameRegistry.registerItem(ItemJinputaojiu, "ItemJinputaojiu");
		GameRegistry.registerItem(ItemJinpingguojiu, "ItemJinpingguojiu");
		
		GameRegistry.registerItem(ItemQiaokelishui, "ItemQiaokelishui");
		GameRegistry.registerItem(ItemHuluobozhi, "ItemHuluobozhi");
		GameRegistry.registerItem(ItemCha, "ItemCha");
		GameRegistry.registerItem(ItemPutaozhi, "ItemPutaozhi");
		GameRegistry.registerItem(ItemPingguozhi, "ItemPingguozhi");
		GameRegistry.registerItem(ItemShucaizhi, "ItemShucaizhi");
		GameRegistry.registerItem(ItemXiguazhi, "ItemXiguazhi");
		
		GameRegistry.registerItem(ItemJinputaozhi, "ItemJinputaozhi");
		GameRegistry.registerItem(ItemJinpingguozhi, "ItemJinpingguozhi");

		GameRegistry.registerItem(ItemKele, "ItemKele");
		GameRegistry.registerItem(ItemXuebi, "ItemXuebi");
		GameRegistry.registerItem(ItemNaicha, "ItemNaicha");
		GameRegistry.registerItem(ItemKafei, "ItemKafei");
		
		GameRegistry.registerItem(ItemQiaokelinai, "ItemQiaokelinai");
		GameRegistry.registerItem(ItemDounai, "ItemDounai");
		
		GameRegistry.registerItem(ItemQiaokelinaiice, "ItemQiaokelinaiice");
		GameRegistry.registerItem(ItemPutaozhiice, "ItemPutaozhiice");
		GameRegistry.registerItem(ItemPingguozhiice, "ItemPingguozhiice");
		GameRegistry.registerItem(ItemJinputaozhiice, "ItemJinputaozhiice");
		GameRegistry.registerItem(ItemXiguazhiice, "ItemXiguazhiice");
		GameRegistry.registerItem(ItemJinpingguozhiice, "ItemJinpingguozhiice");

		GameRegistry.registerItem(ItemFanqiechaojidanfan, "ItemFanqiechaojidanfan");
		GameRegistry.registerItem(ItemDisanxian, "ItemDisanxian");
		GameRegistry.registerItem(ItemYuxiangrousi, "ItemYuxiangrousi");
		GameRegistry.registerItem(ItemGongbaojiding, "ItemGongbaojiding");
		GameRegistry.registerItem(ItemChaotudousifan, "ItemChaotudousifan");
		GameRegistry.registerItem(ItemDuojiaoyutou, "ItemDuojiaoyutou");
		GameRegistry.registerItem(ItemMapodoufufan, "ItemMapodoufufan");
		GameRegistry.registerItem(ItemHongshaoroufan, "ItemHongshaoroufan");
		GameRegistry.registerItem(ItemHuiguoroufan, "ItemHuiguoroufan");
		GameRegistry.registerItem(ItemAeljichifan, "ItemAeljichifan");
		GameRegistry.registerItem(ItemLaziji, "ItemLaziji");
		GameRegistry.registerItem(ItemKoushuiji, "ItemKoushuiji");
		GameRegistry.registerItem(ItemBaiqiuji, "ItemBaiqiuji");
		GameRegistry.registerItem(ItemCongyouji, "ItemCongyouji");
		GameRegistry.registerItem(ItemSuancaiyu, "ItemSuancaiyu");
		GameRegistry.registerItem(ItemMalayu, "ItemMalayu");
		GameRegistry.registerItem(ItemQingzhenyu, "ItemQingzhenyu");
		GameRegistry.registerItem(ItemKelejichifan, "ItemKelejichifan");
		GameRegistry.registerItem(ItemGalijiroufan, "ItemGalijiroufan");
		GameRegistry.registerItem(ItemShuizhuniurou, "ItemShuizhuniurou");
		GameRegistry.registerItem(ItemYifen, "ItemYifen");
		GameRegistry.registerItem(ItemYifenpork, "ItemYifenpork");
		GameRegistry.registerItem(ItemYifenbeef, "ItemYifenbeef");
		GameRegistry.registerItem(ItemYifenchicken, "ItemYifenchicken");
		GameRegistry.registerItem(ItemRibendoufu, "ItemRibendoufu");
		GameRegistry.registerItem(ItemChangfen, "ItemChangfen");
		ItemAnlanzhishi = new ItemShi("ItemAnlanzhishi");
		ItemAnbizhishi = new ItemShi("ItemAnbizhishi");
		ItemZongjiqianguzhishi = new ItemShi("ItemZongjiqianguzhishi");
		ItemSCBlock = new ItemBook("ItemSCBlock");
		ItemSCPlant = new ItemBook("ItemSCPlant");
		ItemSCMW1 = new ItemBook("ItemSCMW1");
		ItemSCMW2 = new ItemBook("ItemSCMW2");
		ItemSCKFC = new ItemBook("ItemSCKFC");
		ItemSCCn = new ItemBook("ItemSCCn");
		ItemSCYz = new ItemBook("ItemSCYz");
		ItemSCJ = new ItemBook("ItemSCJ");
		ItemSCShui1 = new ItemBook("ItemSCShui1");
		ItemSCShui2 = new ItemBook("ItemSCShui2");
		ItemSCFan1 = new ItemBook("ItemSCFan1");
		ItemSCFan2 = new ItemBook("ItemSCFan2");
		ItemSCFan3 = new ItemBook("ItemSCFan3");
		ItemSCTh = new ItemBook("ItemSCTh");
		ItemAnlanTools = new ItemAnTools("ItemAnlanTools");
		ItemAnbiTools = new ItemAnTools("ItemAnbiTools");
	}
}