package com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.databinding.FragmentMainmenuBinding
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.fragment.calculators
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.fragment.quest


class mainmenu : Fragment() {
lateinit var  binding: FragmentMainmenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainmenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button19.setOnClickListener {
            val calc = calculators()
            var tranport = requireFragmentManager()
            tranport.beginTransaction()
                .replace(bindingMain.fragmentcontainer.id, calc)
                .commit()

        }
        binding.button20.setOnClickListener {
            val quiz = quest()
            var tranport = requireFragmentManager()
            tranport.beginTransaction()
                .replace(bindingMain.fragmentcontainer.id, quiz)
                .commit()

        }
    }
    companion object {

        fun newInstance() =
            mainmenu()
    }
}