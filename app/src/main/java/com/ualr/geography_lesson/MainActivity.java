package com.ualr.geography_lesson;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.ualr.geography_lesson.databinding.ActivityMainBinding;


// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity
{

    private ActivityMainBinding mBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        this.mBinding.countryDescriptionText.setText(R.string.country_description);

        this.mBinding.lessonLearnedButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onLessonLearnedClicked();
            }
        });


    }



    public void onLessonLearnedClicked()
    {
       this.mBinding.lessonLearnedButton.setText(R.string.lesson_completed_label);

       Snackbar.make(this.mBinding.rootLayout, R.string.congrats_text, Snackbar.LENGTH_SHORT).show();


        return;


    }





}


