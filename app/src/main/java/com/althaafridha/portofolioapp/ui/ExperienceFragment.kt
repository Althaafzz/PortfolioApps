package com.althaafridha.portofolioapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.althaafridha.portofolioapp.R
import com.althaafridha.portofolioapp.adapter.RVExperienceAdapter
import com.althaafridha.portofolioapp.data.PortfolioData
import com.althaafridha.portofolioapp.databinding.FragmentExperienceBinding

class ExperienceFragment : Fragment() {

    private var _binding : FragmentExperienceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentExperienceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterExperience = RVExperienceAdapter()

        adapterExperience.onItemClicked = { experience ->
            findNavController().navigate(
                ExperienceFragmentDirections.actionExperienceFragmentToExperienceDetailFragment(
                    experience
                )
            )
        }

        adapterExperience.setData(PortfolioData.listDataExperience)

        with(binding.rvExperience){
            layoutManager = StaggeredGridLayoutManager(2, GridLayoutManager.VERTICAL)
            setHasFixedSize(true)
            adapter = adapterExperience
        }
    }
}