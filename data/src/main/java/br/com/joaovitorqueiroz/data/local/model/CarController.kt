package br.com.joaovitorqueiroz.data.local.model

object CarController {
    
    // parâmetro
    lateinit var car: Car
    
    fun describeCar(): String {
        return car.model + " | " + car.engine.model
    }
    
}