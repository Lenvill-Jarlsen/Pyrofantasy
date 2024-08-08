package com.Lenvill;

import com.Lenvill.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PyroFantasyMain.MODID, name = PyroFantasyMain.NAME, dependencies = PyroFantasyMain.DEPENDENCIES, version = PyroFantasyMain.VERSION)
public class PyroFantasyMain {
    public static final String MODID = "pyrofantasy";
    public static final String NAME = "PyroFantasy";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:minefantasyreforged;";

    @SidedProxy(clientSide = "com.Lenvill.proxy.ClientProxy", serverSide = "com.Lenvill.proxy.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Config());
        Config.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}