package com.canbartukilic.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var name = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()


        // Void - Unit
        // mySum(10,20)

        // Return

        val result = myMultiply(10,20)
        // textView.text = "Result: ${result}"

        /*
        button.setOnClickListener {
            println("clicked")
        }
        */



        // Class
        // Object & Instance
        val homer = Simpsons("Homer Simpson",50,"Nuclear")
        homer.hairColor = "Blonde"

        //homer.age = 60
        //homer.job = "Nuc"
        //homer.name = "Homer"

        val bart = Simpsons("Bart Simpson",13,"Student")
        //bart.age = 13
        //bart.name = "Bart Simpson"
        //bart.job = "Student"

        println(homer.hairColor)


        /*
        // Nullability
        // Nullable (?) && Non-null
        // !!(kesin var) vs ?(bilmiyorum)

        var myString : String? = null
        var myAge : Int? = null

        // 1) Null Safety

        if (myAge != null) {
            println(myAge * 10)
        } else {
            println("myAge null")
        }

        // 2) Safe Call

        println(myAge?.compareTo(2))

        // 3) Elvis Operator

        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)
         */
    }



    fun test() {
        println("test function")
    }

    // Input && Return
    fun mySum(a: Int, b: Int) {
       // resultText.text = "Result: ${a+b}"
    }

    fun myMultiply(x: Int, y:Int) : Int {
        return x * y
    }

    fun makeSimpson(view : View) {
        name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if (age == null) {
            age = 0
        }
        val job = jobText.text.toString()

        val simpson = Simpsons(name,age,job)

        resultText.text = "Name: ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"





    }

    fun scopeExample(view : View) {
        //Scope (Kapsam)

        println(name)
    }

}