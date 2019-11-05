/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int bLim_Port = 9 ;
  
  public static int hLim_Port =1;
  

  public static int m1Lim_Port = 0;

  public static int m2Lim_Port = 3;

  public static int autoIndex = 0;

  public static double speedMod = 1;
  public static double turnMod = 1;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

public static int gmPort = 4;



public static int LeftFront = 8;
public static int RightFront  = 5;
public static int LeftBack = 4;
public static int RightBack = 9;
public static int Lift1 = 3;
public static int Lift2 = 15;
 public static int GMMotor = 8;

public static int leftservo = 8;

public static int rightservo = 9;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
