spackage org.usfirst.frc.team7635.robot.commands;

import org.usfirst.frc.team7635.robot.OI;
import org.usfirst.frc.team7635.robot.Robot;
import org.usfirst.frc.team7635.robot.RobotMap;
import org.usfirst.frc.team7635.robot.subsystems.DriveTrain_Subsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrain_Command extends Command {

    public DriveTrain_Command() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.m_drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double moveSpeed = OI.getJoystick().getY();
		double rotateSpeed = OI.getJoystick().getX();

		Robot.m_drivetrain.arcadeDrive(moveSpeed, rotateSpeed);
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
