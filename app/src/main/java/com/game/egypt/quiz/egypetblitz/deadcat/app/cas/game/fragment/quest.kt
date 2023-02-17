package com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.bindingMain
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.databinding.FragmentQuestBinding
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.mainmenu


class quest : Fragment() {
lateinit var binding: FragmentQuestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {

            val q1 = quest1()
            var t = requireFragmentManager()
            t.beginTransaction()
                .replace(bindingMain.fragmentcontainer.id, q1)
                .commit()

        }
        binding.button2.setOnClickListener {

            Toast.makeText(requireContext(), "Incorrect unswer", Toast.LENGTH_SHORT).show()

        }
binding.imageView20.setOnClickListener {

    val menu = mainmenu()
    var t = requireFragmentManager()
    t.beginTransaction()
        .replace(bindingMain.fragmentcontainer.id, menu)
        .commit()
}
    }
    companion object {

        fun newInstance() =
            quest()
    }
}