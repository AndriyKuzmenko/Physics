package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add("English");
        menu.add("עברית");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        String name=item.getTitle().toString();

        if(name.equals("English"))
        {
            Languages.toEnglish();
        }
        else if(name.equals("עברית"))
        {
            Languages.toHebrew();
        }

        return true;
    }
}
