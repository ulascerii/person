package com.example.personsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personsapp.R
import com.example.personsapp.databinding.FragmentPersonsDetailBinding

class PersonsDetailFragment : Fragment() {
    private lateinit var design:FragmentPersonsDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    design = FragmentPersonsDetailBinding.inflate(inflater, container, false)
        return design.root
    }
}
