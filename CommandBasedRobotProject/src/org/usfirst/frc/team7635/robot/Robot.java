/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7635.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team7635.robot.subsystems.DriveTrain_Subsystem;


public class Robot extends IterativeRobot {
	public OI m_oi;
	public static DriveTrain_Subsystem m_drivetrain = new DriveTrain_Subsystem();
	e
	
	@Override
	public void robotInit() {
		m_oi = new OI();
	}

	
	@Override
	public void disabledInit() {

	}

	
	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	
	@Override
	public void teleopInit() {
		
	}

	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
	}

	
	@Override
	public void testPeriodic() {
	}
}
