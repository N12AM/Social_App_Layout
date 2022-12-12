package com.social.chatapp.story;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.social.chatapp.Listeners;
import com.social.chatapp.R;
import com.social.chatapp.chat.ChatHomeView;
import com.social.chatapp.databinding.VerticalUserView0Binding;

public class ViewPagerAdapter extends PagerAdapter implements View.OnClickListener{

//    List<SliderItems> sliderItems;
    LayoutInflater mLayoutInflater;
    Context context;

    VerticalUserView0Binding binding0;

    public ViewPagerAdapter(Context context) {

        this.context = context;
    }

    @Override
    public void onClick(View view)
    {
//        Listeners listeners = new Listeners();
//        listeners.SetListeners0(view.getContext());

//    check which button is clicked
        switch (view.getId()) {
            case com.social.chatapp.R.id.enterChatButton:
                Log.d("button", "listeners working ");
                Intent intent = new Intent(view.getContext(), ChatHomeView.class);
                view.getContext().startActivity(intent);
                break;
        }



//        Intent intent = new Intent(view.getContext(), ChatHomeView.class);
//        view.getContext().startActivity(intent);
//        Log.d("view tag", "onClick: " + view.getId());
    }

    public String[] slide_headings = {
            "1",
            "2",
            "3",
            "4"
    };




//    public ViewPagerAdapter(Context context, List<SliderItems> sliderItems) {
//        this.context = context;
//        this.sliderItems = sliderItems;
//        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }

    @Override
    public int getCount() {
//        return sliderItems.size();
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }

    @NonNull
    @SuppressLint("ClickableViewAccessibility")
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


//        View itemView = mLayoutInflater.inflate(R.layout.item_container, container, false);
//        ImageView imageView = itemView.findViewById(R.id.imageView);
//        imageView.setImageResource(sliderItems.get(position).getImage());
//
//        container.addView(itemView);
//        return itemView;
//        Listeners listeners = new Listeners(mLayoutInflater);
//        listeners.SetListeners0();

        if (position == 0) {
            View view = mLayoutInflater.inflate(R.layout.vertical_user_view_0, container, false);
//            int v =view.findViewById(R.id.enterChatButton).setOnClickListener();


            //set listeners
            FrameLayout frameLayout = view.findViewById(R.id.enterChatButton);
            frameLayout.setOnClickListener(this);


            container.addView(view);
            return view;
        }
        else if (position == 1) {
            View view = mLayoutInflater.inflate(R.layout.vertical_user_view_1, container, false);

            //set listeners
            FrameLayout frameLayout = view.findViewById(R.id.enterChatButton);
            frameLayout.setOnClickListener(this);

            container.addView(view);
            return view;
        }
        else if (position == 2) {
            View view = mLayoutInflater.inflate(R.layout.vertical_user_view_2, container, false);

            //set listeners
            FrameLayout frameLayout = view.findViewById(R.id.enterChatButton);
            frameLayout.setOnClickListener(this);

            container.addView(view);
            return view;
        }
        else {
            View view = mLayoutInflater.inflate(R.layout.vertical_user_view_3, container, false);

            //set listeners
            FrameLayout frameLayout = view.findViewById(R.id.enterChatButton);
            frameLayout.setOnClickListener(this);

            container.addView(view);
            return view;
        }

//        View view = mLayoutInflater.inflate(R.layout.test_fragment_layout, container, false);
//        container.addView(view);
//        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
