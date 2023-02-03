package com.example.personsapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.personsapp.R
import com.example.personsapp.databinding.FragmentPersonsRegisterBinding


class PersonsRegisterFragment : Fragment() {
    private lateinit var design:FragmentPersonsRegisterBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_persons_register,container,false)
        design.personRegisterFragment = this
        design.toolbarPersonsRegister.title ="Kişi Kayıt"



        return design.root

    }
    fun buttonRegistery(person_name:String,person_Phone:String){
        Log.e("Kişi Kayıt","$person_name - $person_Phone")

    }
}