package com.example.abb_tasks.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.abb_tasks.R
import com.example.abb_tasks.data.model.ChocolateModel
import com.example.abb_tasks.view.adapter.ChocolateAdapter
import com.example.abb_tasks.databinding.FragmentProductBinding
import com.example.abb_tasks.data.util.ChocolateList
import com.example.abb_tasks.view.behavior.ChocolateSetOnClickListener


class ProductFragment : Fragment() {
    private lateinit var binding: FragmentProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ChocolateAdapter(requireContext(), ChocolateList.list)
        binding.recyclerChocolateView.adapter = adapter
        binding.recyclerChocolateView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        adapter.onClick(object: ChocolateSetOnClickListener{
            override fun setOnClickListener(chocolate: ChocolateModel) {
                val bundle = Bundle()
                bundle.putSerializable("chocolate",chocolate)
                findNavController().navigate(R.id.action_toProduct, bundle)
            }
        })
    }
}