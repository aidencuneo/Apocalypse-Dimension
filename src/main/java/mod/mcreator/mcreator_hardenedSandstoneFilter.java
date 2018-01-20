

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;

@SuppressWarnings("unchecked")
public class mcreator_hardenedSandstoneFilter {

	public mcreator_hardenedSandstoneFilter() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:HardenedSandstoneFilter", "inventory"));

		GameRegistry.addRecipe(new ItemStack(block, 1),
				new Object[]{"0X2", "3X5", "X7X", Character.valueOf('0'), mcreator_hardenedSandstone.block, Character.valueOf('2'),
						mcreator_hardenedSandstone.block, Character.valueOf('3'), mcreator_hardenedSandstone.block, Character.valueOf('5'),
						mcreator_hardenedSandstone.block, Character.valueOf('7'), new ItemStack(Blocks.SANDSTONE, 1, 0),});
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
		block = (new ItemhardenedSandstoneFilter());

	}

	static class ItemhardenedSandstoneFilter extends Item {

		public ItemhardenedSandstoneFilter() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("HardenedSandstoneFilter");
			setRegistryName("HardenedSandstoneFilter");
			GameRegistry.register(this);
			setCreativeTab(CreativeTabs.MISC);
			setContainerItem(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1.0F;
		}

	}
}
