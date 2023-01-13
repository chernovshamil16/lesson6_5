package com.example.lesson6_5.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lesson6_5.MainViewModel
import com.example.lesson6_5.databinding.FragmentStoryBinding


class StoryFragment : Fragment() {

    private lateinit var binding: FragmentStoryBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoryBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        initObserver()
    }

    private fun initObserver() {
        viewModel.resultAdapter.observe(viewLifecycleOwner) {
            binding.tvSroty.text = it.toString()
        }
    }

}