package com.example.main1

open class Cars (
    val model: String,
    val color: String,
    val yearOfProducion: Int,
        ) {
    open fun Model1() {
        println("$model Model")
    }

    open fun Color1() {
        println("$color Color")
    }

    open fun YearOfProduction() {
        println("$yearOfProducion Year of production")
    }

    class ford : Cars(model = "G35", color = "blue", yearOfProducion = 2023) {
        override fun Model1() {
            println("$model Model = G35")
        }

        override fun Color1() {
            println("$color Color = blue")
        }

        override fun YearOfProduction() {
            println("$yearOfProducion Year of production = 2023")
        }
    }

    class ferrari : Cars(model = "f21", color = "black", yearOfProducion = 2022) {
        override fun Model1() {
            println("$model Model = f21")
        }

        override fun Color1() {
            println("$color Color = black")
        }

        override fun YearOfProduction() {
            println("$yearOfProducion Year of production = 2022")
        }
    }

}

