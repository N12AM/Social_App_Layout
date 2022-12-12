package com.social.chatapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

import com.social.chatapp.chat.ChatHomeView;
import com.social.chatapp.databinding.VerticalUserView0Binding;
import com.social.chatapp.userprofile.ComponentTags;

public class Listeners extends AppCompatActivity {
    VerticalUserView0Binding binding0;

    public Listeners(){

    }
    public Listeners(LayoutInflater inflater){
//        binding0 = inflater.inflate(getLayoutInflater());
        binding0 = VerticalUserView0Binding.inflate(inflater.cloneInContext(getApplicationContext()));
        setContentView(binding0.getRoot());

    }


    public void SetListeners0(Context context){

                startActivity(new Intent(context.getApplicationContext(), ChatHomeView.class));
    }


}
