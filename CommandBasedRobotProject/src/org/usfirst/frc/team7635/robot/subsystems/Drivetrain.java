package org.usfirst.frc.team7635.robot.subsystems;

import org.usfirst.frc.team7635.robot.RobotMap;
import org.usfirst.frc.team7635.robot.commands.ExampleCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team7635.robot.subsystems.Drivetrain;

import com.ctre.phoenix.motorcontrol.*;

/**
 *
 */
public class Drivetrain extends Command {
	
	private WPI_TalonSRX masterTalon;
	private WPI_TalonSRX slaveTalon;
	
    public Drivetrain() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	masterTalon = new WPI_TalonSRX(RobotMap.DRIVE_MASTER_PORT);
    	slaveTalon = new WPI_TalonSRX(RobotMap.DRIVE_SLAVE_PORT);
    	
    	slaveTalon.follow(masterTalon, FollowerType.PercentOutput);
    }

    public void forward() {
    	masterTalon.set(0.1);
    }
    
    public void backbard() {
    	masterTalon.set(-0.1);
    }
    
    public void stop() {
    	masterTalon.set(0);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
