package com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.bindingMain
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.databinding.FragmentCalculatorsBinding
import com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game.mainmenu
import java.text.DecimalFormat


class calculators : Fragment() {
    lateinit var binding: FragmentCalculatorsBinding
    private lateinit var inputAmount: EditText
    private lateinit var inputRate: EditText
    private lateinit var inputYears: EditText
    private lateinit var btnCalculate: Button
    private lateinit var resultView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCalculatorsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        inputAmount = binding.etPrincipal
        inputRate = binding.etRate
        inputYears = binding.etTime
        btnCalculate = binding.btnCalculate
        resultView = binding.tvResult

        btnCalculate.setOnClickListener {
            calculateInterest()
        }
        binding.imageView21.setOnClickListener {

            val menu = mainmenu()
            var t = requireFragmentManager()
            t.beginTransaction()
                .replace(bindingMain.fragmentcontainer.id, menu)
                .commit()
        }
    }

    private fun calculateInterest() {
        val amount = inputAmount.text.toString().toDouble()
        val rate = inputRate.text.toString().toDouble()
        val years = inputYears.text.toString().toDouble()

        val interest = (amount * rate * years) / 100
        val result = amount + interest

        val df = DecimalFormat("#.##")
        resultView.text = "Result: ${df.format(result)}"
    }
    companion object {

        fun newInstance() = calculators()
    }



}
