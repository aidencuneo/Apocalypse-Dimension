package mod.mcreator;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import net.minecraft.world.World;
import net.minecraft.util.Timer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.CommandException;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_thirstDroplet1 {

     static boolean playerAlive = true;
     static float thirstCount = 10.0f;
     static float countdown = 10.0f;
     static int repeatCount = 4;
	
	public static class GUIRenderEventClass {
		@SubscribeEvent(priority = EventPriority.NORMAL)
     	
     	public void eventHandler(RenderGameOverlayEvent event){
    		
     		if(!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET){

                    EntityPlayer entity = Minecraft.getMinecraft().player; // This variable is used to inflict damage, detect gamemodes, etc.
                    // One tick is one frame. (At 60 Frames Per Second we want the water to go down one droplet every 1.5 minutes.
                    // Frames = 60.00 ( 1 Second ).
                    // 90 Second Timer on Thirst Count.
                    // Frames * ThirstTimer = 60 * 90 = 5400.
                    // MaximumThirstInt = 10.
                    // 
                    // 0.1000 is one second.
                    // 0.0100 is 100 milliseconds.
                    // 0.0010 is 10 milliseconds.
                    // 0.0001 is 1 millisecond.
                    if (thirstCount > 0) {
                         if (entity.capabilities.isCreativeMode != true) {
                              if (playerAlive == true) {
                                   thirstCount = thirstCount - 0.000185f; // Correct number: 0.000185f.
                                   if (thirstCount <= 0 ) {
                                        thirstCount = 0;
                                   }
                              }
                         }
                    }
                    if (thirstCount == 0.0f) {
                         if (playerAlive == true) {
                              countdown = countdown - 0.05f;
                              if (countdown <= 0.0f) {
                                   if (repeatCount <= 0) {
                                   } else {
                                        entity.setHealth(entity.getHealth() - 5);
                                        countdown = 10.0f;
                                        repeatCount--;
                                   }
                              }
                         }
                         if (repeatCount < 0) {
                              playerAlive = false;
                              entity.setHealth(20);
                              repeatCount = 4;
                         }
                    }
     			int posX = (event.getResolution().getScaledWidth()) /2;
     			int posY = (event.getResolution().getScaledHeight());
     			int i = (int)entity.posX;
     			int j = (int)entity.posY;
     			int k = (int)entity.posZ;
     			int x = i;
     			int y = j;
     			int z = k;
     			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
     			World world = server.worlds[0];

                    if (entity.capabilities.isCreativeMode != true) {
          			if(thirstCount>0){
          			     Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(10), posY-(50), 0, 0, 256, 256);
          			}
                         if(thirstCount>1){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(18), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>2){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(26), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>3){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(34), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>4){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(42), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>5){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(50), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>6){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(58), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>7){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(66), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>8){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(74), posY-(50), 0, 0, 256, 256);
                         }
                         if(thirstCount>9){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(82), posY-(50), 0, 0, 256, 256);
                         }      
                    }         
               }
     	}    
	}

	/*public thirstDroplet1() {
	}*/

     public void EntityJoinWorldEvent(net.minecraftforge.event.entity.EntityJoinWorldEvent event) {
          playerAlive = true;
     }     

	public static Object instance;

	public void load(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass());
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
