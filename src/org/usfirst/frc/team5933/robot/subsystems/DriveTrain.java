package org.usfirst.frc.team5933.robot.subsystems;


import org.usfirst.frc.team5933.robot.Robot;
import org.usfirst.frc.team5933.robot.RobotMap;
import org.usfirst.frc.team5933.robot.commands.DefaultTeleopCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private final WPI_TalonSRX masterLeftMotor = RobotMap.driveTrainMasterLeftMotor;
	private final WPI_TalonSRX masterRightMotor = RobotMap.driveTrainMasterRightMotor;
	private final DifferentialDrive robotDrive = RobotMap.driveTrainRobotDrive;
//	private final WPI_TalonSRX followerLeftFrontMotor = RobotMap.driveTrainFollowerLeftFrontMotor;
//	private final WPI_TalonSRX followerRightFrontMotor = RobotMap.driveTrainFollowerRightFrontMotor;
//	private final WPI_TalonSRX followerLeftRearMotor = RobotMap.driveTrainFollowerLeftRearMotor;
//	private final WPI_TalonSRX followerRightRearMotor = RobotMap.driveTrainFollowerRightRearMotor;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());

		setDefaultCommand(new DefaultTeleopCommand());
	}

//	public void setFollowers() {
//		followerLeftFrontMotor.follow(masterLeftMotor);
//		followerLeftRearMotor.follow(masterLeftMotor);
//		followerRightFrontMotor.follow(masterRightMotor);
//		followerRightRearMotor.follow(masterRightMotor);
//	}

	public void teleopDrive(Joystick joystick) {
		robotDrive.arcadeDrive(joystick.getY(), -joystick.getX(), false);
		
		SmartDashboard.putNumber("JoystickX", joystick.getX());
		SmartDashboard.putNumber("JoystickY", joystick.getY());
	}

	public void stop() {
		robotDrive.stopMotor();
	}
	
	public void turnRight() {
		robotDrive.tankDrive(1, 0);
	}
}

