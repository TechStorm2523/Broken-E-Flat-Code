/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.BackToggle;
import frc.robot.commands.BallOut;
import frc.robot.commands.Ballin;
import frc.robot.commands.DownMax;
import frc.robot.commands.LiftToPosition;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
//import frc.robot.commands.AutoPlace;
//import frc.robot.commands.AutoPlatform;
//import frc.robot.commands.Flap;
//import frc.robot.commands.FrontToggle;
//import frc.robot.commands.GoF;
//import frc.robot.commands.HatchHeight;
//import frc.robot.commands.LiftControl;
//import frc.robot.commands.LiftGoDown;
//import frc.robot.commands.LiftGoUp;

//import frc.robot.commands.ModifySpeed;
//import frc.robot.commands.Pivotdown;
//import frc.robot.commands.Pivotup;
//import frc.robot.commands.TurnLeft;
//import frc.robot.commands.TurnRight;
//import frc.robot.commands.Unflap;
//import frc.robot.commands.backIn;
//import frc.robot.commands.backOut;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  
  public XboxController xb = new XboxController(0);

  Button XBFront = new JoystickButton(xb, 4);
  Button XBBack = new JoystickButton(xb, 2);

	public JoystickButton aButton = new JoystickButton(xb, 1);
	public JoystickButton bButton = new JoystickButton(xb, 2);
	public JoystickButton xButton = new JoystickButton(xb, 3);
	public JoystickButton yButton = new JoystickButton(xb, 4);
  
	// following 4 have to check ports
  /*
	public JoystickButton upArrow = new JoystickButton(xb, 3);
	public JoystickButton downArrow = new JoystickButton(xb, 4);
	public JoystickButton leftArrow = new JoystickButton(xb, 1);
	public JoystickButton rightArrow = new JoystickButton(xb, 2);
  */
  
	public JoystickButton rightBumper = new JoystickButton(xb, 6);
	public JoystickButton leftBumper = new JoystickButton(xb, 5);

  

  
  /*
  public Joystick stick = new Joystick(0);
  public Joystick liftStick = new Joystick(1);

  Button autoClimb = new JoystickButton(stick, 7);
  Button BallInButton = new JoystickButton(liftStick, 1);
  Button BallOutButton = new JoystickButton(liftStick, 2);
  Button turnLeft = new JoystickButton(stick, 3);
  Button turnRight = new JoystickButton(stick, 4);
  //Button flap = new JoystickButton(liftStick, 3);
  //Button unflap = new JoystickButton(liftStick, 5);
  Button hatchButton = new JoystickButton(liftStick, 12);

  Button SpeedMod = new JoystickButton(liftStick, 4);
  Button place = new JoystickButton(liftStick, 6);
  Button pivotU = new JoystickButton(liftStick, 8);
  Button pivotD = new JoystickButton(liftStick, 18);

  Button pos2 = new JoystickButton(liftStick, 10);
  Button pos3 = new JoystickButton(liftStick, 8);

  Button frontOut = new JoystickButton(stick, 9);
  Button frontIn = new JoystickButton(stick, 10);

  Button backOut = new JoystickButton(stick, 11);
  Button backIn = new JoystickButton(stick, 12);
*/
  
Button frontToggle = new JoystickButton(xb, 1);
  

Button backToggle = new JoystickButton(xb, 2);

  public OI(){


  rightBumper.whileHeld(new BallOut());
 /* 
	if (Robot.m_oi.xb.getTriggerAxis(Hand.kRight) > 0.75){
		Ballin b = new Ballin();
		
  }
  */
	// rightTrigger.whileHeld(new BallIn());
	/*
  xButton.whileHeld(new DownMax());
  aButton.whileHeld(new LiftToPosition(1));
	bButton.whileHeld(new LiftToPosition(2));
  yButton.whileHeld(new LiftToPosition(3));
  //yButton.whileHeld(new LiftControl(1.00));
  */
 // rightBumper.whileHeld(new LiftControl(0));

  //leftBumper.whileHeld(new frc.robot.commands.FrontToggle());
  
/*
	if (Robot.m_oi.xb.getTriggerAxis(Hand.kLeft) > 0.75){
		BackToggle t = new BackToggle();
		
  }
  */
/*
//autoClimb.whenPressed(new GoF());
BallInButton.whileHeld(new Ballin()); 
BallOutButton.whileHeld(new BallOut()); 
place.whileHeld(new AutoPlace());
SpeedMod.whileHeld(new ModifySpeed());
//frontToggle.whenPressewd(new FrontToggle());
//backToggle.whenPressed(ne BackToggle());
pos2.whileHeld(new LiftToPosition(2));
pos3.whileHeld(new LiftToPosition(3));
//hatchButton.whileHeld(new LiftToPosition(1));
frontIn.whenPressed(new frc.robot.commands.FrontToggle());
//frontOut.whenPressed(new frc.robot.commands.frontOut());

backIn.whenPressed(new BackToggle());

XBFront.whenPressed(new FrontToggle());
XBBack.whenPressed(new BackToggle());
//backOut.whenPressed(new frc.robot.commands.backOut());
turnLeft.whileHeld(new TurnLeft());
turnRight.whileHeld(new TurnRight());


pivotD.whileHeld(new Pivotdown());
pivotU.whileHeld(new Pivotup());
  
hatchButton.whileHeld(new HatchHeight());
*/

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
  } 
}
