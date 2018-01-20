

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import java.util.Random;

public class mcreator_craftMushroomSnack {

	public mcreator_craftMushroomSnack() {
	}

	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_mushroomSnack.block, 1);

		GameRegistry.addShapelessRecipe(recStack, new Object[]{Blocks.BROWN_MUSHROOM, Blocks.RED_MUSHROOM, Blocks.RED_MUSHROOM,
				Blocks.BROWN_MUSHROOM,});
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
