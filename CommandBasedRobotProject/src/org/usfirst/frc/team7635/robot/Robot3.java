/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7635.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team7635.robot.commands.*;
import org.usfirst.frc.team7635.robot.subsystems.Chassis;

import org.usfirst.frc.team7635.robot.subsystems.DriveTrain_Subsystem;


public class Robot extends TimedRobot {

	public static Chassis chassis;
	public static UsbCamera camera;
	public static OI m_OI;

	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();

	/**public static ExampleSubsystem m_subsystem = new ExampleSubsystem();
	 * This function is run when the robot is first started up

	 * and should be used for any initalization code. */

	@Override
	public void robotInit() {

		CameraServer.getInstance().startAutomaticCapture();

		m_oi = new OI();
		chassis = new Chassis();
		/** m_chooser.addDefault("Default Auto", new Examplecommand());
		chooser.addObject("My Auto", new MyAutoCommand()); **/
		SmartDashboard.putData("Auto mode" , m_chooser);

	}
}
