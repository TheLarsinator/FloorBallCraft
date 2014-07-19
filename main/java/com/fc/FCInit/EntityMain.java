package com.fc.FCInit;

import com.fc.FCBall.Blue.EntityBallB;
import com.fc.FCBall.Green.EntityBallG;
import com.fc.FCBall.Orange.EntityBallO;
import com.fc.FCBall.Red.EntityBallR;
import com.fc.FCBall.White.EntityBallW;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityMain 
{
	public static void Init()
	{
		//Balls
		EntityRegistry.registerGlobalEntityID(EntityBallW.class, "Ball", 117);
		EntityRegistry.registerGlobalEntityID(EntityBallO.class, "BallO", 118);
		EntityRegistry.registerGlobalEntityID(EntityBallR.class, "BallR", 119);
		EntityRegistry.registerGlobalEntityID(EntityBallG.class, "BallG", 121);
		EntityRegistry.registerGlobalEntityID(EntityBallB.class, "BallB", 122);
	}

}
