/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
//import frc.robot.OI;
import frc.robot.Robot;
//import frc.robot.subsystems.GameManipulator;

/**
 * An example command.  You can replace me with your own command.
 */
public class BallOut extends Command {
  public BallOut() {
    // Use requires() here to declare subsystem dependencies
    //requires(Robot.m_subsystem);
    requires(Robot.gameManipulator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    //this needs to take imput from the subsystem, then link it with a number, then pass it to the method
    Robot.gameManipulator.FeedBall();
    Robot.gameManipulator.pivotD();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  Robot.gameManipulator.neutral();
  Robot.gameManipulator.pivotN();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  Robot.gameManipulator.neutral();
  Robot.gameManipulator.pivotN();
  }
}