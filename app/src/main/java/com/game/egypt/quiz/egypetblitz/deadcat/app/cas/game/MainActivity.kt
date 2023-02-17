package com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.databinding.ActivityMainBinding


var id: String? = null

lateinit var bindingMain: ActivityMainBinding
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        supportFragmentManager
            .beginTransaction()
            .replace(bindingMain.fragmentcontainer.id, mainmenu())
            .commit()



    }
}
