package com.example.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation


class ProfileFragment : Fragment() {
//    lateinit var savedata : TextView
lateinit var navcontroller: NavController
    lateinit var profileFragment: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        navcontroller = Navigation.findNavController(view)
        profileFragment = view.findViewById(R.id.but)
        profileFragment.setOnClickListener {
            val action = ProfileFragmentDirections.profiletosetting("hhhhhhh")
            navcontroller.navigate(action)
        }
//        savedata = view.findViewById(R.id.savedata)
//        savedata.text = requireArguments().getString("test","dddd")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}