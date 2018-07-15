package org.usfirst.frc.team5933.robot.commands;

import org.usfirst.frc.team5933.robot.Robot;

import edu.wpi.first.wpilibj.MotorSafetyHelper;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DefaultTeleopCommand extends Command {

    public DefaultTeleopCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.DriveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("DefaultTeleop Running: ", "duh");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.DriveTrain.teleopDrive(Robot.m_oi.getDriverJoystick());
    	SmartDashboard.putString("DefaultTeleop Running: ", "execute");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.DriveTrain.stop();
    	
    	SmartDashboard.putString("DefaultTeleop Running: ", "just finished");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
