package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import java.util.Set;
import java.util.Random;

public class mcreator_hardenedSandstoneAxe {

	public mcreator_hardenedSandstoneAxe() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:hardenedsandstoneaxe", "inventory"));

		GameRegistry.addRecipe(stack,
				new Object[]{"X12", "X45", "X7X", Character.valueOf('1'), mcreator_hardenedSandstone.block, Character.valueOf('2'),
						mcreator_hardenedSandstone.block, Character.valueOf('4'), Items.STICK, Character.valueOf('5'),
						mcreator_hardenedSandstone.block, Character.valueOf('7'), Items.STICK,});
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
		block = (new ItemHardenedSandstoneAxe() {
		}).setUnlocalizedName("HardenedSandstoneAxe");
		block.setRegistryName("HardenedSandstoneAxe");
		GameRegistry.register(block);
		block.setCreativeTab(CreativeTabs.TOOLS);

	}

	static class ItemHardenedSandstoneAxe extends ItemTool {

		private static final Set<Block> EFFECTIVE_ON = com.google.common.collect.Sets.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF,
				Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON,
				Blocks.WOODEN_PRESSURE_PLATE});

		protected ItemHardenedSandstoneAxe() {
			super(EnumHelper.addToolMaterial("HardenedSandstoneAxe", 2, 128, 4, 1, 5), EFFECTIVE_ON);
			this.damageVsEntity = 1;
			this.attackSpeed = -3.1F;
		}

		@Override
		public float getStrVsBlock(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getStrVsBlock(stack, state)
					: this.efficiencyOnProperMaterial;
		}

	}
}
