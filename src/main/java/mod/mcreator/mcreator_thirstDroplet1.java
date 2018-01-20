

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;

import java.util.Random;

//import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.*;

//import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.*;

public class mcreator_thirstDroplet1 {
     
	public static class GUIRenderEventClass {
		@SubscribeEvent(priority = EventPriority.NORMAL)
          //int newThirstCount;
          //int currentThirstCount;
     	
     	public void eventHandler(RenderGameOverlayEvent event){
    		
     		if(!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET){

                    // One tick is one frame. (At 60 Frames Per Second we want the water to go down one droplet every 1.5 minutes.
                    // Frames = 60.00 ( 1 Second ).
                    // 90 Second Timer on Thirst Count.
                    // Frames * ThirstTimer = 60 * 90 = 5400.
                    // MaximumThirstInt = 10.
                    // 
                    // 1.000 is one second.
                    // 0.100 is 100 milliseconds.
                    // 0.010 is 10 milliseconds.
                    // 0.001 is 1 millisecond.
                    if ( mcreator_VarList%MAINMODNAME%.ThirstCount > 0 ) {
                         mcreator_VarList%MAINMODNAME%.ThirstCount = ((double)mcreator_VarList%MAINMODNAME%.ThirstCount - 0.00185);
                    }
                         
     			int posX = (event.getResolution().getScaledWidth()) /2;
     			int posY = (event.getResolution().getScaledHeight());
     
     			EntityPlayer entity = Minecraft.getMinecraft().player;
     			int i = (int)entity.posX;
     			int j = (int)entity.posY;
     			int k = (int)entity.posZ;
     			int x = i;
     			int y = j;
     			int z = k;
     			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
     			World world = server.worlds[0];
     
     			if(mcreator_VarList%MAINMODNAME%.ThirstCount>0){
     			     Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(10), posY-(50), 0, 0, 256, 256);
     			}
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>100000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(18), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>200000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(26), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>300000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(34), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>400000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(42), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>500000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(50), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>600000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(58), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>700000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(66), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>800000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(74), posY-(50), 0, 0, 256, 256);
                    }
                    if(mcreator_VarList%MAINMODNAME%.ThirstCount>900000){
                         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Water_Droplet.png"));
                         Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(posX+(82), posY-(50), 0, 0, 256, 256);
                    }               
               }
     	}    
	}

	public mcreator_thirstDroplet1() {
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
