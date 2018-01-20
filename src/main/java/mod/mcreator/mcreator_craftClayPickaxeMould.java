

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import java.util.Random;

public class mcreator_craftClayPickaxeMould {

	public mcreator_craftClayPickaxeMould() {
	}

	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack recStack = new ItemStack(mcreator_clayPickaxeMould.block, 1);

		GameRegistry.addRecipe(recStack, new Object[]{"012", "X4X", "X7X", Character.valueOf('0'), Items.CLAY_BALL, Character.valueOf('1'),
				Items.CLAY_BALL, Character.valueOf('2'), Items.CLAY_BALL, Character.valueOf('4'), Items.STICK, Character.valueOf('7'), Items.STICK,});
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
