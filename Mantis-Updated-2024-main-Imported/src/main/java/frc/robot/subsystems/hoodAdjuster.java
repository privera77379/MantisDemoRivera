// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


// WE DON'T USE THIS THING
// WHY IS THIS THING HERE


public class hoodAdjuster extends SubsystemBase {
  /** Creates a new hoodAdjuster. */
  public hoodAdjuster() {
    Servo actuator = new Servo(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
