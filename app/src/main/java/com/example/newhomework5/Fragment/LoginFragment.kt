package com.example.newhomework5.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

import com.example.myapplication.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var refractPass: EditText
    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnLogin = binding.btnLogin
        refractPass = binding.etPassword


            btnLogin.setOnClickListener{
            val password = refractPass.text.toString().trim().length
                if (password < 8) {
                    refractPass.error ="Password < 8"
                    return@setOnClickListener}
                else{
            btnLogin.setOnClickListener{
                findNavController().navigate(R.id.action_loginFragment_to_newRoomFragment)
            }
                }
            }
    }
}