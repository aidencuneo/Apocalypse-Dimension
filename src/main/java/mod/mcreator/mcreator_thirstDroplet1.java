package mod.mcreator;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import net.minecraft.world.World;
import net.minecraft.util.Timer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;

import java.util.Random;
import java.io.*;
import java.nio.file.*;

public class mcreator_thirstDroplet1 {

     static float countdown = 10.0f;
     static int repeatCount = 4;
     static boolean allowed;

     static File confFile = new File("ApocDimConfig.txt");
	
	public static class GUIRenderEventClass {
		@SubscribeEvent(priority = EventPriority.NORMAL)
     	
     	public void eventHandler(RenderGameOverlayEvent event){
    		
     		if(!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET){

                    EntityPlayer entity = Minecraft.getMinecraft().player; // This variable is used to inflict damage, detect gamemodes, etc.
                    
                    // One tick is one frame.
                    // At 60 Frames Per Second we want the water to go down one droplet every 1.5 minutes.
                    // Frames = 60.00 ( 1 Second ).
                    // 90 Second Timer on Thirst Count.
                    // Frames * ThirstTimer = 60 * 90 = 5400.
                    // MAXTHIRST = 10000000.
                    //
                    // 0.1000 is one second.
                    // 0.0100 is 100 milliseconds.
                    // 0.0010 is 10 milliseconds.
                    // 0.0001 is 1 millisecond.
                    //
                    // 00.000185 - 10
                    // 00.00185 - 100
                    // 00.0185 - 1000
                    // 00.185 - 10000
                    // 01.85 - 100000
                    // 18.5 - 1000000
                    // 185 - 10000000

                    if(!confFile.exists()) {
                         writeConfig();
                    }

                    if (mcreator_VarListtestenvironmentmod.thirstBarEnabled == true && mcreator_VarListtestenvironmentmod.thirstCount > 0) {
                         if (entity.capabilities.isCreativeMode != true && mcreator_VarListtestenvironmentmod.playerAlive == true) {
                              allowed = true;
                         }
                    }

                    if (allowed == true) {
                         mcreator_VarListtestenvironmentmod.thirstCount = mcreator_VarListtestenvironmentmod.thirstCount - 185; // Correct number: 0.000185f. 185 for large scale.
                         if (mcreator_VarListtestenvironmentmod.thirstCount <= 0 ) {
                              mcreator_VarListtestenvironmentmod.thirstCount = 0;
                         }
                    }
                    
                    if (mcreator_VarListtestenvironmentmod.thirstCount == 0) {
                         if (mcreator_VarListtestenvironmentmod.playerAlive == true) {
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
                              mcreator_VarListtestenvironmentmod.playerAlive = false;
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

                    if (allowed == true) {
          			if(mcreator_VarListtestenvironmentmod.thirstCount>0){
          			     Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(10), posY-(50), 0, 0, 256, 256);
          			}
                         if(mcreator_VarListtestenvironmentmod.thirstCount>1000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(18), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>2000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(26), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>3000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(34), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>4000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(42), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>5000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(50), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>6000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(58), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>7000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(66), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>8000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(74), posY-(50), 0, 0, 256, 256);
                         }
                         if(mcreator_VarListtestenvironmentmod.thirstCount>9000000){
                              Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                              Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(82), posY-(50), 0, 0, 256, 256);
                         }      
                    }
               }
     	}    
	}

	public static void writeConfig() {

          /*try {
               FileWriter confWriter = new FileWriter("ApocDimConfig.txt");
          } catch(FileNotFoundException e) {
               confFile.createNewFile();
          }*/
          try {
               PrintWriter confPrint = new PrintWriter(confFile);
               confPrint.print("Thirst Bar:");
               confPrint.print(mcreator_VarListtestenvironmentmod.thirstBarEnabled);
               confPrint.close();
          } catch(IOException e) {
               System.out.println("IOException: " + e);
          }
          
     }

     public static void readConfig() {

          String string1;

          try {
               
               BufferedReader confRead = new BufferedReader(new FileReader("ApocDimConfig.txt"));
               for (int i = 0; i < 2; i++) {
                    confRead.readLine();
               }
               string1 = confRead.readLine();

               if (string1 == "true") {
                    mcreator_VarListtestenvironmentmod.thirstBarEnabled = true;
               } else {
                    mcreator_VarListtestenvironmentmod.thirstBarEnabled = false;
               }
          
          } catch(IOException e) {
               System.out.println("IOException: " + e);
          }
          

          
          
     }
     
     public void EntityJoinWorldEvent(net.minecraftforge.event.entity.EntityJoinWorldEvent event) {
          mcreator_VarListtestenvironmentmod.playerAlive = true;
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