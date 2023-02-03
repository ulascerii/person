package com.example.personsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.personsapp.R
import com.example.personsapp.databinding.FragmentMainPageBinding


class MainPageFragment : Fragment() {
    private lateinit var design:FragmentMainPageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = FragmentMainPageBinding.inflate(inflater, container, false)
        design.toolbarMainPage.title="Kişiler"
        design.fab.setOnClickListener {
         Navigation.findNavController(it).navigate(R.id.mainPageToRegister)
        }
        return design.root
    }
}
