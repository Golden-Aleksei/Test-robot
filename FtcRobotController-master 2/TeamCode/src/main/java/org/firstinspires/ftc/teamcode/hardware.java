package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class hardware {
    DcMotor motor1;
    DcMotor motor2;
    DcMotor motor3;
    DcMotor motor4;
    Servo test;

    private static hardware myInstance = null;

    public static hardware getInstance() {
        if (myInstance == null) {
            myInstance = new hardware();
        }
        return myInstance;
}


    public void init(hardwareMap hwMap)
    {
        motor1 = hwMap.get(DcMotor.class, "bottomleft");
        motor1.setDirection(DcMotorSimple.Direction.REVERSE);
        motor2 = hwMap.get(DcMotor.class, "topleft");
        motor2.setDirection(DcMotorSimple.Direction.REVERSE);
        motor3 = hwMap.get(DcMotor.class, "topright");
        motor4 = hwMap.get(DcMotor.class, "bottomright");



    }

