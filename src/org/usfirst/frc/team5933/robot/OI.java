/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5933.robot;

//import org.usfirst.frc.team5933.robot.commands.OpenTongs;
//import org.usfirst.frc.team5933.robot.commands.ReleaseCube;
//import org.usfirst.frc.team5933.robot.commands.ReleaseRamp;
//import org.usfirst.frc.team5933.robot.commands.CloseTongs;
//import org.usfirst.frc.team5933.robot.commands.GrabCube;
//import org.usfirst.frc.team5933.robot.commands.LiftArm;
//import org.usfirst.frc.team5933.robot.commands.LowerArm;
import org.usfirst.frc.team5933.robot.commands.NullCommand;
//import org.usfirst.frc.team5933.robot.commands.StopArm;
//import org.usfirst.frc.team5933.robot.commands.UnpowerTongs;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



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
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

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

	public Joystick driverJoystick;
	
	public JoystickButton aButton;
	public JoystickButton bButton;
	public JoystickButton xButton;
	public JoystickButton yButton;
	public JoystickButton startButton;
	public JoystickButton backButton;
	public JoystickButton rightBumper;
	public JoystickButton leftBumper;
	
	public Joystick subsystemJoystick;
	
	public JoystickButton aButtonSub;
	public JoystickButton bButtonSub;
	public JoystickButton xButtonSub;
	public JoystickButton yButtonSub;
	public JoystickButton startButtonSub;
	public JoystickButton backButtonSub;
	public JoystickButton rightBumperSub;
	public JoystickButton leftBumperSub;

	public OI() {
		
		driverJoystick = new Joystick(0);
		
//		aButton = new JoystickButton(driverJoystick, 1);
//		aButton.whenPressed(new NullCommand());
//		
//		bButton = new JoystickButton(driverJoystick, 2);
//		bButton.whenPressed(new NullCommand());
//		
//		xButton = new JoystickButton(driverJoystick, 3);
//		xButton.whenPressed(new NullCommand()); //will be climber
//		
//		yButton = new JoystickButton(driverJoystick, 4);
//		yButton.whenPressed(new ReleaseRamp());
//		
//		startButton = new JoystickButton(driverJoystick, 8);
//		startButton.whenPressed(new NullCommand());
//		
//		backButton = new JoystickButton(driverJoystick, 7);
//		backButton.whenPressed(new NullCommand());
//		
//		rightBumper = new JoystickButton(driverJoystick, 6);
//		rightBumper.whenPressed(new NullCommand());
//		
//		leftBumper = new JoystickButton(driverJoystick, 5);
//		leftBumper.whenPressed(new NullCommand());
//		
		
		subsystemJoystick = new Joystick(1);
//		
//		aButtonSub = new JoystickButton(driverJoystick, 1);
//		aButtonSub.whenPressed(new NullCommand());
//		
//		bButtonSub = new JoystickButton(driverJoystick, 2);
//		bButtonSub.whenPressed(new NullCommand());
//		
//		xButtonSub = new JoystickButton(driverJoystick, 3);
//		xButtonSub.whenPressed(new ReleaseCube());
//		
//		yButtonSub = new JoystickButton(driverJoystick, 4);
//		yButtonSub.whenPressed(new GrabCube());
//		
//		startButtonSub = new JoystickButton(driverJoystick, 8);
//		startButtonSub.whenPressed(new NullCommand());
//		
//		backButtonSub = new JoystickButton(driverJoystick, 7);
//		backButtonSub.whenPressed(new NullCommand());
//		
//		rightBumperSub = new JoystickButton(driverJoystick, 6);
//		rightBumperSub.whenPressed(new CloseTongs());
//		
//		leftBumperSub = new JoystickButton(driverJoystick, 5);
//		leftBumperSub.whenPressed(new OpenTongs());
	}

	public Joystick getDriverJoystick() {
		return driverJoystick;
	}
	
	public Joystick getSubsystemJoystick() {
		return subsystemJoystick;
	}
}
