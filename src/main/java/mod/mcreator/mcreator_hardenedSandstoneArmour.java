package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_hardenedSandstoneArmour {

	public mcreator_hardenedSandstoneArmour() {
	}

	public static Item helmet;
	public static Item body;
	public static Item legs;
	public static Item boots;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(helmet, 0, new ModelResourceLocation("testenvironmentmod:hardenedsandstonearmourhelmet", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(body, 0, new ModelResourceLocation("testenvironmentmod:hardenedsandstonearmourbody", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(legs, 0, new ModelResourceLocation("testenvironmentmod:hardenedsandstonearmourlegs", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(boots, 0, new ModelResourceLocation("testenvironmentmod:hardenedsandstonearmourboots", "inventory"));
		}
		GameRegistry.addRecipe(new ItemStack(helmet, 1),
				new Object[]{"012", "3X5", "XXX", Character.valueOf('0'), mcreator_hardenedSandstone.block, Character.valueOf('1'),
						mcreator_hardenedSandstone.block, Character.valueOf('2'), mcreator_hardenedSandstone.block, Character.valueOf('3'),
						mcreator_hardenedSandstone.block, Character.valueOf('5'), mcreator_hardenedSandstone.block,});
		GameRegistry.addRecipe(new ItemStack(body, 1),
				new Object[]{"0X2", "345", "678", Character.valueOf('0'), mcreator_hardenedSandstone.block, Character.valueOf('2'),
						mcreator_hardenedSandstone.block, Character.valueOf('3'), mcreator_hardenedSandstone.block, Character.valueOf('4'),
						mcreator_hardenedSandstone.block, Character.valueOf('5'), mcreator_hardenedSandstone.block, Character.valueOf('6'),
						mcreator_hardenedSandstone.block, Character.valueOf('7'), mcreator_hardenedSandstone.block, Character.valueOf('8'),
						mcreator_hardenedSandstone.block,});
		GameRegistry.addRecipe(new ItemStack(legs, 1),
				new Object[]{"012", "3X5", "6X8", Character.valueOf('0'), mcreator_hardenedSandstone.block, Character.valueOf('1'),
						mcreator_hardenedSandstone.block, Character.valueOf('2'), mcreator_hardenedSandstone.block, Character.valueOf('3'),
						mcreator_hardenedSandstone.block, Character.valueOf('5'), mcreator_hardenedSandstone.block, Character.valueOf('6'),
						mcreator_hardenedSandstone.block, Character.valueOf('8'), mcreator_hardenedSandstone.block,});
		GameRegistry.addRecipe(new ItemStack(boots, 1),
				new Object[]{"XXX", "3X5", "6X8", Character.valueOf('3'), mcreator_hardenedSandstone.block, Character.valueOf('5'),
						mcreator_hardenedSandstone.block, Character.valueOf('6'), mcreator_hardenedSandstone.block, Character.valueOf('8'),
						mcreator_hardenedSandstone.block,});
		helmet.setCreativeTab(CreativeTabs.COMBAT);
		body.setCreativeTab(CreativeTabs.COMBAT);
		legs.setCreativeTab(CreativeTabs.COMBAT);
		boots.setCreativeTab(CreativeTabs.COMBAT);
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void registerRenderers() {
	}

	static {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HARDENEDSANDSTONEARMOUR", "HardenedSandstoneArmour", 20, new int[]{5, 6, 5, 4},
				5, null, 0.0f);

		int armorPreffix = 0;
		helmet = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.HEAD) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("hardenedsandstonearmourhelmet");
		helmet.setMaxStackSize(1);
		body = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.CHEST) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("hardenedsandstonearmourbody");
		body.setMaxStackSize(1);
		legs = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.LEGS) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("hardenedsandstonearmourlegs");
		legs.setMaxStackSize(1);
		boots = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.FEET) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("hardenedsandstonearmourboots");
		boots.setMaxStackSize(1);

		helmet.setRegistryName("hardenedsandstonearmourhelmet");
		GameRegistry.register(helmet);
		body.setRegistryName("hardenedsandstonearmourbody");
		GameRegistry.register(body);
		legs.setRegistryName("hardenedsandstonearmourlegs");
		GameRegistry.register(legs);
		boots.setRegistryName("hardenedsandstonearmourboots");
		GameRegistry.register(boots);

	}

}
