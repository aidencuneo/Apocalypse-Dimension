package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

import java.util.Random;

public class mcreator_craftSapling {

	public mcreator_craftSapling() {
	}

	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(Blocks.SAPLING, 1);

		GameRegistry.addRecipe(recStack, new Object[]{"012", "345", "X7X", Character.valueOf('0'), Items.WHEAT_SEEDS, Character.valueOf('1'),
				Items.STICK, Character.valueOf('2'), Items.WHEAT_SEEDS, Character.valueOf('3'), Items.WHEAT_SEEDS, Character.valueOf('4'),
				Items.STICK, Character.valueOf('5'), Items.WHEAT_SEEDS, Character.valueOf('7'), Blocks.PLANKS,});
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
}