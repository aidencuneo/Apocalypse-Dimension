package mod.mcreator;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import java.util.Random;

public class mcreator_craftFurnace {

	public mcreator_craftFurnace() {
	}

	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(Blocks.FURNACE, 1);

		GameRegistry.addRecipe(recStack,
				new Object[]{"012", "3X5", "678", Character.valueOf('0'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('1'),
						new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('2'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('3'),
						new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('5'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('6'),
						new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('7'), new ItemStack(Blocks.SANDSTONE, 1, 0), Character.valueOf('8'),
						new ItemStack(Blocks.SANDSTONE, 1, 0),});
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
