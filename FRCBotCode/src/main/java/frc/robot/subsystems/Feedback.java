/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.ADXL362;
//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

/**
 * Add your docs here.
 */
public class Feedback extends Subsystem {
  static BuiltInAccelerometer accel = new BuiltInAccelerometer(Accelerometer.Range.k4G);
  //ADXL362 accel = new ADXL362(Accelerometer.Range.k8G);
  //ADXRS450_Gyro gyro= new ADXRS450_Gyro();
  
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

 public static double getForward(){

    return -10*accel.getX();

 }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
