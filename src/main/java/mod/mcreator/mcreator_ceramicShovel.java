

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Set;
import java.util.Random;
import java.util.HashMap;

public class mcreator_ceramicShovel {

	public mcreator_ceramicShovel() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:ceramicshovel", "inventory"));

		GameRegistry.addSmelting(mcreator_clayShovelMould.block, stack, 1.0f);
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
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("CERAMICSHOVEL", 1, 32, 4F, 1, 5);
		block = (Item) (new ItemSpade(enumt) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 1);
				return ret.keySet();
			}
		}).setUnlocalizedName("CeramicShovel");
		block.setRegistryName("CeramicShovel");
		GameRegistry.register(block);
		block.setCreativeTab(CreativeTabs.TOOLS);

	}

}
