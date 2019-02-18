package org.usfirst.frc.team7635.robot.subsystems;
import org.usfirst.frc.team7635.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import org.usfirst.frc.team7635.robot.Robot;
import org.usfirst.frc.team7635.robot.commands.DriveByJoystick;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.FollowerType;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.*;


public class ElevatorMechanism extends Subsystem {

	public ElevatorMechanism() {

	public class Motors extends Subsystem {

		CANTalon liftMotor = RobotMap.liftMotor;

	    // Put methods for controlling this subsystem
	    // here. Call these from Commands.

		public void init(){
			//motor2.clearStickyFaults();
		}

	    public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	        //setDefaultCommand(new MySpecialCommand());
	    }

	    public void runLiftWithJoystick(double y){ //lift
	    	liftMotor.set(y);
	    }
	//    public boolean isLim1Hit (){ //front hit
	//    	return lim1.get();
	//    }

	    public boolean isLiftTop (){ //top hardwired
	    	return liftMotor.isFwdLimitSwitchClosed();
	    }

	    public boolean isLiftBottom (){ //bottom hardwired
	    	return liftMotor.isRevLimitSwitchClosed();
	    }

	//    public boolean isLim6Hit (){ //close claw hardwired
	//    	return lim6.get();
	//    }

	    public void stopLift(){
	    	liftMotor.set(0);
	    }

	    public double getLift(){
	    	return liftMotor.get();
	    }

	    public void liftDown(double speed){			// Positive is Down
			liftMotor.set(Math.abs(speed));
	    }

	    public void liftUp(double speed){			// Negative is Up
			liftMotor.set(-Math.abs(speed));
	    }

	    public void runLift(double e){
	    	liftMotor.set(e);

	    }

	    public boolean getLiftBottomLim(){
	    	return liftMotor.isFwdLimitSwitchClosed();
	    }

	    public boolean getLiftTopLim(){
	    	return liftMotor.isRevLimitSwitchClosed();
	    }

	}


}
