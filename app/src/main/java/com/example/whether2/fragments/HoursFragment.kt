package com.example.whether2.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whether2.MainViewModel
import com.example.whether2.R
import com.example.whether2.adapters.WeatherAdapter
import com.example.whether2.adapters.WeatherModel
import com.example.whether2.databinding.FragmentHoursBinding
import org.json.JSONArray
import kotlin.math.max
import kotlin.math.min


class HoursFragment : Fragment() {
private lateinit var binding: FragmentHoursBinding
private lateinit var adapter: WeatherAdapter
private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
        model.liveDataCurrent.observe(viewLifecycleOwner){

        }

    }
    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter= WeatherAdapter()
        rcView.adapter=adapter


    }
    private fun getHoursList(item: WeatherModel): List<WeatherModel>{
        val  hoursArray= JSONArray(item.hours)
        val list = ArrayList<WeatherModel>()
        for (i in 0 until hoursArray.length()){
            val item = WeatherModel (

                    )


        }

    }
    companion object {

        @JvmStatic
        fun newInstance() =
            HoursFragment()
    }
}