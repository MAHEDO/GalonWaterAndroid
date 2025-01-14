package com.example.galonwater

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.fragment_login, container, false)
        val btnNavigate = root.findViewById<Button>(R.id.btnLoginUser)

        btnNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }
        return root
    }
}