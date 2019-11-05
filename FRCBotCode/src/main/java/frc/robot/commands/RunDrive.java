/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Feedback;

/**
 * An example command.  You can replace me with your own command.
 */
public class RunDrive extends Command {
 int autoindex = 0;
  public RunDrive() {
    // Use requires() here to declare subsystem dependencies
    //requires(Robot.m_subsystem);
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
      
     //Robot.driveTrain.howdoesthiswork.arcadeDrive(-Robot.m_oi.stick.getY()*RobotMap.speedMod,Robot.m_oi.stick.getTwist()*.75*RobotMap.turnMod);
     
     Robot.driveTrain.howdoesthiswork.arcadeDrive((Robot.m_oi.xb.getTriggerAxis(Hand.kRight)-Robot.m_oi.xb.getTriggerAxis(Hand.kLeft))*-(RobotMap.speedMod), (Robot.m_oi.xb.getX(Hand.kLeft)/1.5)*RobotMap.turnMod);
     //Robot.driveTrain.howdoesthiswork.arcadeDrive(Robot.m_oi.xb.getY(Hand.kRight)*-(RobotMap.speedMod), (Robot.m_oi.xb.getX(Hand.kLeft)/1.5)*RobotMap.turnMod);
      /*
      Robot.m_oi.xb.setRumble(RumbleType.kLeftRumble, Math.abs(Feedback.getForward()/10));
      Robot.m_oi.xb.setRumble(RumbleType.kRightRumble, Math.abs(Feedback.getForward()/10));
      */




    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
