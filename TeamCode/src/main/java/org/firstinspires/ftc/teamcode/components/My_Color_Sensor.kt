package org.firstinspires.ftc.teamcode.components

import android.graphics.Color
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.hardware.ColorSensor
import com.qualcomm.robotcore.hardware.DistanceSensor
import com.qualcomm.robotcore.hardware.NormalizedColorSensor
import org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit

class My_Color_Sensor (private val instance: LinearOpMode) {

    var CS : NormalizedColorSensor
    init {
        CS = Java_Color_Sensor().get("CS", instance.hardwareMap)
    }
    fun sensor() : String{
        val hsvValues = FloatArray(3)
        val colors = CS.getNormalizedColors()
        Color.colorToHSV(colors.toColor(), hsvValues)

        if(hsvValues[0] > 120.0 && hsvValues[0] < 155.0){
            return "GREEN"
        }else if(hsvValues[0] > 270.0 && hsvValues[0] < 300.0){
            return "PURPLE"
        }else {
            return "NOTHING"
        }
    }
    fun dist() : Double{
        return (CS as DistanceSensor).getDistance(DistanceUnit.CM)
    }
}