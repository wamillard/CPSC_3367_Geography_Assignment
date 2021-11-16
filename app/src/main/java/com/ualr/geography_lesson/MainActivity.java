package com.ualr.geography_lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;


import com.ualr.geography_lesson.databinding.ActivityMainBinding;

import java.util.Locale;

// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity
{

    private ActivityMainBinding mBinding;


    private String currLocale=new String(Locale.getDefault().getLanguage());


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

 //       updateLocale();


/*  Playing with Intent
          Intent newIntent= Intent.createChooser(new Intent(),null);

          newIntent.setAction(Intent.ACTION_SEND);
          newIntent.putExtra(Intent.EXTRA_TEXT,"Extra Text!!");
          newIntent.setType("text/plain");
          startActivity(newIntent);
*/



    }

 /*   private void updateLocale()
    {
        if (currLocale=="es")
        {
            mBinding.countryImage.setImageResource(R.drawable.ic_spain);
        }

    }
*/


}
