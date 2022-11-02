package com.social.chatapp.chat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.social.chatapp.R;
import com.social.chatapp.databinding.ChatWindowHomeBinding;
import com.social.chatapp.story.VerticalSlideLauncher;


public class ChatHomeView extends AppCompatActivity {

    private ChatWindowHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_chat_home_view);

        binding = ChatWindowHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //here, always listen to the button click

        SetListenerGoBackToStory();
        SetListenerEnterActiveChat();


    }


    private void SetListenerEnterActiveChat(){
        binding.chatUser0.setOnClickListener(m->
                startActivity(new Intent(getApplicationContext(), ChatWindowActive.class)));

        binding.chatUser1.setOnClickListener(m->
                startActivity(new Intent(getApplicationContext(), ChatWindowActive.class)));

    }

    private void SetListenerGoBackToStory(){
        binding.backToStoryButton.setOnClickListener(m->
                startActivity(new Intent(getApplicationContext(), VerticalSlideLauncher.class)));
    }



}