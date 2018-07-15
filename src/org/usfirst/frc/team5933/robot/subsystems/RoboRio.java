package org.usfirst.frc.team5933.robot.subsystems;

import org.usfirst.frc.team5933.robot.Robot;
import org.usfirst.frc.team5933.robot.RobotMap;
import org.usfirst.frc.team5933.robot.commands.NullCommand;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RoboRio extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
		
		setDefaultCommand(new NullCommand());
	}

//	private final ADXRS450_Gyro gyro = RobotMap.robotGyro;
	private final PowerDistributionPanel powerDistributionPanel = RobotMap.robotPowerDistributionPanel;
	
	
	public static boolean gyroCalibration = false;

	/**
	 * Contains appropriate {@link SmartDashboard} outputs for the driver station.
	 */
	public void sensorPeriodic() {
//		SmartDashboard.putNumber("Gyroscope: ", readGyro());
//		SmartDashboard.putBoolean("Is the gyro calibrated? ", gyroCalibration);
	}

//	public double readGyro() {
//		return gyro.getAngle();
//	}
//
//	public void resetGyro() {
//		gyro.reset();
//	}
//
//	public void calibrateGyro() {
//		gyro.calibrate();
//		gyroCalibration = true;
//	}
//	
//	public void setGyro(double speedy, double degrees) {
//		degrees = degrees + gyro.getAngle();
//		RobotMap.driveTrainRobotDrive.arcadeDrive(speedy, degrees);
//	}
}

