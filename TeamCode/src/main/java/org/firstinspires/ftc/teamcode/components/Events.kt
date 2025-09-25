package org.firstinspires.ftc.teamcode.components

import ca.helios5009.hyperion.misc.events.EventListener
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode

class Events(instance: LinearOpMode, private val s: Selector) {
    val listener = EventListener()
    val color = My_Color_Sensor(instance)

    init {
        val alliance = if(s.alliance_name == Selector.alliance.RED){
            "RED"
        }else{
            "BLUE"
        }
        listener.addListener("start"){
            //start here
            "started"
        }
    }
}