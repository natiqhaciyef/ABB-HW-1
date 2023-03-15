package com.example.abb_tasks.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.abb_tasks.R
import com.example.abb_tasks.databinding.FragmentProductDetailsBinding


class ProductDetailsFragment : Fragment() {
    private lateinit var binding: FragmentProductDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data: ProductDetailsFragmentArgs by navArgs()
        val chocolate = data.chocolate
        binding.detailsImage.setImageResource(
            requireContext().resources.getIdentifier(
                chocolate.imagePng,
                "drawable",
                requireContext().packageName
            )
        )

        binding.descriptionText.text = chocolate.description
        binding.priceText.text = "Price : ${chocolate.price}$"

        binding.orderButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.saleFragment)
        }
    }

}