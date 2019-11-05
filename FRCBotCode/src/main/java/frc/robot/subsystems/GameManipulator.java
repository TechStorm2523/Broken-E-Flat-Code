/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
//one motor, need to turn one way to suck things in, other way to spit things out. 
//
package frc.robot.subsystems;
/*
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.RunDrive;
*/
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class GameManipulator extends Subsystem {



//Spark something = new Spark(19);

Spark Ballmotor = new Spark(1);

public Spark GMPivot = new Spark(0);



public void pivotU(){
  GMPivot.set(1);

}
public void pivotD(){
  GMPivot.set(-1);
  
}
public void pivotN(){
  GMPivot.set(0);
  
}





public void FeedBall() //might need to switch - not sure which direction.
{
Ballmotor.set(-1); 
}


public void SuckBall()
{
Ballmotor.set(1);
}


public void neutral()
{
Ballmotor.set(0); 
}

public void ManipulatorInput(double input)
{
Ballmotor.set(input);    
}





public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
