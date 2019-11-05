/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.RunDrive;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {

  WPI_TalonSRX leftfront = new WPI_TalonSRX(RobotMap.LeftFront);
  WPI_TalonSRX rightfront = new WPI_TalonSRX(RobotMap.RightFront);
  WPI_TalonSRX leftback = new WPI_TalonSRX(RobotMap.LeftBack);
  WPI_TalonSRX rightback = new WPI_TalonSRX(RobotMap.RightBack);

  SpeedControllerGroup leftwheels = new SpeedControllerGroup(leftfront, leftback);
  SpeedControllerGroup rightwheels = new SpeedControllerGroup(rightfront, rightback);


  public DifferentialDrive howdoesthiswork = new DifferentialDrive(leftwheels, rightwheels);

public void TurnLeft(double s){
  leftwheels.set(-s);
  rightwheels.set(-s);
}

public void TurnRight(double s){
  leftwheels.set(s);
  rightwheels.set(s);
}

public void SetTrain(double s){
  // set is speed; parameters: speed; 
  leftwheels.set(s);
  rightwheels.set(-s);
}

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    
    // Set the default command for a subsystem here.
     setDefaultCommand(new RunDrive());
  }
}
