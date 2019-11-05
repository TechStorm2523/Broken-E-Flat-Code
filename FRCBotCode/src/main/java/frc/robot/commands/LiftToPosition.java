/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class LiftToPosition extends Command {
  public int rocket1 = 625;
  public int rocket2 = 5142;
  public int rocket3 = 9829;
  public int id;
  public int initial;
  public int target;
  public LiftToPosition(int id) {
    // Use requires() here to declare subsystem dependencies
    this.id = id;
    // eg. requires(chassis);
    requires(Robot.liftTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    if(id == 2){
      target = rocket2;
    } else if(id == 3){
      target = rocket3;
    } else if(id == 1){
      target = rocket1;
    }
    
    Robot.liftTrain.setSpeed(-1);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    SmartDashboard.putString("DB/String 1", Integer.toString(target));
    if((Robot.liftTrain.getLiftPos())>target){
      Robot.liftTrain.setSpeed(-.2);
    }
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
