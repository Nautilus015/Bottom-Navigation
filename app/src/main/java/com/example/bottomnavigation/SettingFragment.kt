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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SettingFragment : Fragment() {
    lateinit var myrec : RecyclerView
    lateinit var itemlist : ArrayList<MyData>
//    lateinit var savedata : TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    itemlist= ArrayList()
    itemlist.add(MyData("jovany"))
    itemlist.add(MyData("jogn"))
    itemlist.add(MyData("tadros"))
    myrec=view.findViewById(R.id.myrec)
    myrec.layoutManager= LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
    myrec.adapter=CustomAdapter(itemlist)
//        savedata = view.findViewById(R.id.savedata)
//        savedata.text = requireArguments().getString("test","dddd")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }
}