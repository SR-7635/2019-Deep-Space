package org.usfirst.frc.team7635.robot.subsystems;

import org.usfirst.frc.team7635.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.*;

public class DriveTrain_Subsystem extends Subsystem {
	
	WPI_TalonSRX LF_MOTOR, LB_MOTOR, RF_MOTOR, RB_MOTOR;
	SpeedControllerGroup L_MOTOR, R_MOTOR;
	DifferentialDrive Motor_Drive;
	
	public DriveTrain_Subsystem() {
		LF_MOTOR = new WPI_TalonSRX(RobotMap.LF_TALON);
		LB_MOTOR = new WPI_TalonSRX(RobotMap.LB_TALON);
		RF_MOTOR = new WPI_TalonSRX(RobotMap.RF_TALON);
		RB_MOTOR = new WPI_TalonSRX(RobotMap.RB_TALON);
		
		L_MOTOR = new SpeedControllerGroup(LF_MOTOR,LB_MOTOR);
		R_MOTOR = new SpeedControllerGroup(RF_MOTOR,RB_MOTOR);
		Motor_Drive = new DifferentialDrive(L_MOTOR,R_MOTOR);
	}
	
	public void arcadeDrive(double moveSpeed, double rotateSpeed) {
		Motor_Drive.arcadeDrive(moveSpeed, rotateSpeed);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

