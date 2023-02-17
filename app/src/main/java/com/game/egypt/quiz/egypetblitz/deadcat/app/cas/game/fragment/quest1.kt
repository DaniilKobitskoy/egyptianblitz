package com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.bindingMain
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.databinding.FragmentQuest1Binding
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.mainmenu


class quest1 : Fragment() {
lateinit var binding: FragmentQuest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuest1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button3.setOnClickListener {

            val q2 = quest2()
            var t = requireFragmentManager()
            t.beginTransaction()
                .replace(bindingMain.fragmentcontainer.id, q2)
                .commit()

        }
        binding.button4.setOnClickListener {

            Toast.makeText(requireContext(), "Incorrect unswer", Toast.LENGTH_SHORT).show()

        }
        binding.imageView19.setOnClickListener {

            val menu = mainmenu()
            var t = requireFragmentManager()
            t.beginTransaction()
                .replace(bindingMain.fragmentcontainer.id, menu)
                .commit()
        }

    }


    companion object {

        fun newInstance() =
            quest1()
    }
}