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
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_sandstoneArmour {

	public mcreator_sandstoneArmour() {
	}

	public static Item helmet;
	public static Item body;
	public static Item legs;
	public static Item boots;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(helmet, 0, new ModelResourceLocation("testenvironmentmod:sandstonearmourhelmet", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(body, 0, new ModelResourceLocation("testenvironmentmod:sandstonearmourbody", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(legs, 0, new ModelResourceLocation("testenvironmentmod:sandstonearmourlegs", "inventory"));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(boots, 0, new ModelResourceLocation("testenvironmentmod:sandstonearmourboots", "inventory"));
		}
		GameRegistry.addRecipe(new ItemStack(helmet, 1), new Object[]{"012", "3X5", "XXX", Character.valueOf('0'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('1'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('2'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('3'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('5'),
				new ItemStack(Blocks.SANDSTONE, 1, 0),});
		GameRegistry.addRecipe(new ItemStack(body, 1), new Object[]{"0X2", "345", "678", Character.valueOf('0'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('2'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('3'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('4'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('5'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('6'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('7'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('8'), new ItemStack(Blocks.SANDSTONE, 1, 0),});
		GameRegistry.addRecipe(new ItemStack(legs, 1), new Object[]{"012", "3X5", "6X8", Character.valueOf('0'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('1'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('2'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('3'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('5'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('6'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('8'),
				new ItemStack(Blocks.SANDSTONE, 1, 0),});
		GameRegistry.addRecipe(new ItemStack(boots, 1), new Object[]{"0X2", "3X5", "XXX", Character.valueOf('0'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('2'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('3'),
				new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('5'), new ItemStack(Blocks.SANDSTONE, 1, 0),});
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
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SANDSTONEARMOUR", "SandstoneArmour", 11, new int[]{2, 3, 4, 2}, 0, null, 0.0f);

		int armorPreffix = 0;
		helmet = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.HEAD) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("sandstonearmourhelmet");
		helmet.setMaxStackSize(1);
		body = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.CHEST) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("sandstonearmourbody");
		body.setMaxStackSize(1);
		legs = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.LEGS) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("sandstonearmourlegs");
		legs.setMaxStackSize(1);
		boots = (new ItemArmor(enuma, armorPreffix, EntityEquipmentSlot.FEET) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("sandstonearmourboots");
		boots.setMaxStackSize(1);

		helmet.setRegistryName("sandstonearmourhelmet");
		GameRegistry.register(helmet);
		body.setRegistryName("sandstonearmourbody");
		GameRegistry.register(body);
		legs.setRegistryName("sandstonearmourlegs");
		GameRegistry.register(legs);
		boots.setRegistryName("sandstonearmourboots");
		GameRegistry.register(boots);

	}

}
