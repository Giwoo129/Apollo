package org.firstinspires.ftc.teamcode.instance.auto

import ca.helios5009.hyperion.pathing.Point
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.util.ElapsedTime
import org.firstinspires.ftc.teamcode.Robot
import org.firstinspires.ftc.teamcode.components.Events
import org.firstinspires.ftc.teamcode.components.Selector

class Red_Close(private val instance: LinearOpMode) {
    fun run(timer: ElapsedTime, s: Selector) {
        val eventListener = Events(instance, s)
        val bot = Robot(instance, eventListener.listener, true)

        //start
        bot.path.start(Point(0.0, 0.0).setDeg(0.0))

    }
}
