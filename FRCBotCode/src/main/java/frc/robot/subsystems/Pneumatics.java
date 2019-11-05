/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
//import frc.robot.commands.frontOut;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  DoubleSolenoid front = new DoubleSolenoid(7,6);
  DoubleSolenoid back = new DoubleSolenoid(2,3);

  boolean frontIsOut = false;
  boolean backIsOut = false;


  public void frontOut(){
    front.set(Value.kForward);
    frontIsOut = true;
    
  }
  public void frontIn(){
    front.set(Value.kReverse);
    frontIsOut = false;
  }
  public void backOut(){
    back.set(Value.kForward);
    backIsOut = true;
  }
  public void backIn(){
    back.set(Value.kReverse);
    backIsOut = false;
  }

  public void toggleFront(){
    if(frontIsOut){
      frontIn();
    } else {
      frontOut();
    }

  }

  public void toggleBack(){
    if(backIsOut){
      backIn();
    } else {
      backOut();
    }

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  }
}
