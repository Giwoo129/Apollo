package org.firstinspires.ftc.teamcode.instance.teleOp

import ca.helios5009.hyperion.core.Motors
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.util.ElapsedTime

class Main_TeleOp: LinearOpMode() {
    override fun runOpMode() {
        val motors = Motors(hardwareMap, "FL", "FR", "BL", "BR")
        motors.setPowerRatio(1.0)

        val timer = ElapsedTime()
        var drive = 0.0

        waitForStart()
        timer.reset()

        while (opModeIsActive()) {
            drive = -gamepad1.left_stick_y.toDouble()
            val strafe = gamepad1.left_stick_x.toDouble()
            val rotate = gamepad1.right_stick_x.toDouble()
            motors.gamepadMove(drive, strafe, rotate)

            if (gamepad1.ps) {
                while (opModeIsActive()) {
                    drive = -gamepad1.left_stick_y.toDouble()
                    val strafe = gamepad1.left_stick_x.toDouble()
                    val rotate = gamepad1.right_stick_x.toDouble()
                    motors.gamepadMove(drive, strafe, rotate)
                }

            }
        }
    }
}