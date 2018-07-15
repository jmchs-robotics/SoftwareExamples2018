package org.usfirst.frc.team5933.robot.commands;

import org.usfirst.frc.team5933.robot.Robot;
import org.usfirst.frc.team5933.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimedDriveStraight extends Command {

    public TimedDriveStraight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.DriveTrain);
    }
    
    double timer = 3.0;

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(timer);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.driveTrainRobotDrive.tankDrive(1, 1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.driveTrainRobotDrive.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
