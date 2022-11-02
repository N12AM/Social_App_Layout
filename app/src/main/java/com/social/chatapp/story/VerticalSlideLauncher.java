package com.social.chatapp.story;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.social.chatapp.R;
import com.social.chatapp.chat.ChatHomeView;
import com.social.chatapp.databinding.VerticalUserView0Binding;

public class VerticalSlideLauncher extends AppCompatActivity {


//    private ViewPager mSlideViewPager;
//    private VerticalViewPager verticalViewPager;

    VerticalUserView0Binding binding0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_story_launcher);

//        mSlideViewPager = findViewById(R.id.pager);

        final VerticalViewPager verticalViewPager = (VerticalViewPager)findViewById(R.id.pager2);


        verticalViewPager.setAdapter(new ViewPagerAdapter(this));


        binding0 = VerticalUserView0Binding.inflate(getLayoutInflater());


        SetListener0();

    }

//        mSlideViewPager.addOnPageChangeListener(viewListener);


    private void SetListener0(){
        Log.d("button", "listeners working ");
        binding0.enterChatButton.setOnClickListener(m ->
                startActivity(new Intent(getApplicationContext(), ChatHomeView.class)));
    }
}

