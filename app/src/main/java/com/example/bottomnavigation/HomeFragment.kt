package com.example.bottomnavigation

import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    //    lateinit var select: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        select = view.findViewById(R.id.select)

//        select.setOnClickListener {
//            val c = Calendar.getInstance()
//            val hour = c.get(Calendar.HOUR_OF_DAY)
//            val minute = c.get(Calendar.MINUTE)
//            val timePicker = TimePickerDialog(requireContext(), { view, hourofday, minute ->
//                select.setText("$hourofday:$minute")
//            }, hour, minute, false)
//            timePicker.show()
    }
}

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
//    }