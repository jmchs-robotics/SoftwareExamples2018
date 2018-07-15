package org.usfirst.frc.team5933.robot.subsystems;

import org.usfirst.frc.team5933.robot.RobotMap;
import org.usfirst.frc.team5933.robot.commands.ReleaseRamp;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RampSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
//	private final DoubleSolenoid rampSubsystemSolenoid = RobotMap.armAndRampSubsystemSolenoid;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new ReleaseRamp());
    }
    
    public void releaseRamp() {
//    	rampSubsystemSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void stopPistons() {
//    	rampSubsystemSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}

