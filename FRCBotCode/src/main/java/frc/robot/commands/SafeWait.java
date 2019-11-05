/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class SafeWait extends Command {
  Timer t = new Timer();
  double secs;
  public SafeWait(double secs) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.secs = secs;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    t.reset();
    t.start();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if(t.get()>secs)
    return true;
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    t.stop();
    t.reset();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
