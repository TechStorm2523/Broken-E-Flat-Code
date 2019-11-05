/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
//import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.LiftControl;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class LiftTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public int heightM1 = 0;
  public int heightM2 = 0;

  DigitalInput hLim = new DigitalInput(RobotMap.hLim_Port);
  DigitalInput bLim = new DigitalInput(RobotMap.bLim_Port);
  static DigitalInput mid1 = new DigitalInput(RobotMap.m1Lim_Port);
  DigitalInput mid2 = new DigitalInput(RobotMap.m2Lim_Port);

  WPI_TalonSRX LiftL = new WPI_TalonSRX(RobotMap.Lift1);
  WPI_TalonSRX LiftR = new WPI_TalonSRX(RobotMap.Lift2);

  public void liftSetup(){
    LiftL.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    LiftL.setSelectedSensorPosition(0);

  }

  public int getLiftPos(){
    return -LiftL.getSelectedSensorPosition();
  }

  public void setSpeed(double s){
    LiftL.set(s);
    LiftR.set(-s);
    }

  

  public void SetLiftUp(){

    setSpeed(1);

  }


  public void SetLiftDown(){

    setSpeed(-1);

  }

  public void SetLiftStop(){

    setSpeed(0);

  }
  public boolean getTop(){
    return hLim.get();

  }

  public boolean getBottom(){
    return bLim.get();

  }
  static public boolean getMid1(){
    return mid1.get();

  }
  public boolean getMid2(){
    return mid2.get();



  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new LiftControl(1.00));
  }
}
