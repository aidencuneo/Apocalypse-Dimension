package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Set;
import java.util.Random;
import java.util.HashMap;

public class mcreator_hardenedSandstonePickaxe {

	public mcreator_hardenedSandstonePickaxe() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:hardenedsandstonepickaxe", "inventory"));

		GameRegistry.addRecipe(stack,
				new Object[]{"012", "X4X", "X7X", Character.valueOf('0'), mcreator_hardenedSandstone.block, Character.valueOf('1'),
						mcreator_hardenedSandstone.block, Character.valueOf('2'), mcreator_hardenedSandstone.block, Character.valueOf('4'),
						Items.STICK, Character.valueOf('7'), Items.STICK,});
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
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("HARDENEDSANDSTONEPICKAXE", 2, 128, 4F, 1, 5);
		block = (Item) (new ItemPickaxe(enumt) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}).setUnlocalizedName("HardenedSandstonePickaxe");
		block.setRegistryName("HardenedSandstonePickaxe");
		GameRegistry.register(block);
		block.setCreativeTab(CreativeTabs.TOOLS);

	}

}
