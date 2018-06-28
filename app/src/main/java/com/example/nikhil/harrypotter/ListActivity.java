package com.example.nikhil.harrypotter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

//        ActionBar actionBar = getSupportActionBar();

        //Variables from the activity list page
        TextView mNamee = findViewById(R.id.id_nameView);
        TextView mQuote = findViewById(R.id.id_quoteView);
        TextView mSkill = findViewById(R.id.id_skillView);
        TextView mPatronus = findViewById(R.id.id_patronusView);
        TextView mDesc = findViewById(R.id.id_descriptionView);

        ImageView mWicon = findViewById(R.id.id_wandView);
        ImageView mImage = findViewById(R.id.id_imageView);

        Intent intent = getIntent();

//        String mActionBarTitle = intent.getStringExtra("actionBarTitle");

        //information fetched and sent to the List Adapter in terms of a Place Holder
        int profImage = getIntent().getIntExtra("profileImage",1);
        String name = intent.getStringExtra("name");
        String quote = intent.getStringExtra("quote");
        String skill = intent.getStringExtra("skill");
        String patronus = intent.getStringExtra("patronus");
        int wandImage = getIntent().getIntExtra("wandImage",1);
        String description = intent.getStringExtra("description");

        //setting the actual holders to the exact images and information
//      actionBar.setTitle(mActionBarTitle);
        mNamee.setText(name);
        mDesc.setText(description);
        mQuote.setText(quote);
        mSkill.setText(skill);
        mPatronus.setText(patronus);
        mImage.setImageResource(profImage);
        mWicon.setImageResource(wandImage);


        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    //Transition fade out
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
