package com.maverick.onboardingscreen_nc_ss.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maverick.onboardingscreen_nc_ss.databinding.FragmentViewPagerBinding
import com.maverick.onboardingscreen_nc_ss.onboarding.screens.FirstScreen
import com.maverick.onboardingscreen_nc_ss.onboarding.screens.SecondScreen
import com.maverick.onboardingscreen_nc_ss.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf(
            FirstScreen(), SecondScreen(), ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}