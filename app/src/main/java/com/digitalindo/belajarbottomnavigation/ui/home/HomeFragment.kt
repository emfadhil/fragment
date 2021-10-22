package com.digitalindo.belajarbottomnavigation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.digitalindo.belajarbottomnavigation.R
import com.digitalindo.belajarbottomnavigation.databinding.FragmentHomeBinding
import com.digitalindo.belajarbottomnavigation.ui.adapter.BuahAdapter
import com.digitalindo.belajarbottomnavigation.ui.model.Buah

class HomeFragment : Fragment() {

    var dataBuah = ArrayList<Buah>()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addData()
        binding.listBuah.adapter = BuahAdapter(dataBuah)
        binding.listBuah.layoutManager = StaggeredGridLayoutManager(1,0)

    }

    fun addData(){

        val buah1 = Buah()
        buah1.img = R.drawable.nanas
        buah1.title = "Nanas"

        val buah2 = Buah()
        buah2.img = R.drawable.orange
        buah2.title = "Jeruk"

        val buah3 = Buah()
        buah3.img = R.drawable.delima
        buah3.title = "Delima"

        val buah4 = Buah()
        buah4.img = R.drawable.sirsak
        buah4.title = "Sirsak"

        dataBuah.add(buah1)
        dataBuah.add(buah2)
        dataBuah.add(buah3)
        dataBuah.add(buah4)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}