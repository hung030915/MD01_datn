package com.example.s_shop.view.login;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.s_shop.databinding.StartRegisterMemberSellerBinding;

public class StartRegisterMemberSeller extends AppCompatActivity {
    private StartRegisterMemberSellerBinding binding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = StartRegisterMemberSellerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
