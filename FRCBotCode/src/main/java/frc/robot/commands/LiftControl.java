/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import frc.robot.OI;
import frc.robot.Robot;
//import frc.robot.subsystems.GameManipulator;
import frc.robot.subsystems.LiftTrain;

/**
 * An example command.  You can replace me with your own command.
 */
public class LiftControl extends Command {
  double var;
  public LiftControl(double var) {
    // Use requires() here to declare subsystem dependencies
   // requires(Robot.m_subsystem);
    this.var = var;
    requires(Robot.liftTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.liftTrain.setSpeed(var);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(LiftTrain.getMid1()){
      SmartDashboard.putBoolean("DB/LED 0", true);
    } else {
     SmartDashboard.putBoolean("DB/LED 0", false);
    }
    //this needs to take imput from the subsystem, then link it with a number, then pass it to the method
    //Robot.liftTrain.setSpeed(Robot.m_oi.liftStick.getY()-.2);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
   Robot.liftTrain.SetLiftStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.liftTrain.SetLiftStop();
  }
}