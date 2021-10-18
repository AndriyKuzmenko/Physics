package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button pendulumButton, springButton, freeFallButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Languages.toHebrew();

        pendulumButton=(Button)findViewById(R.id.pendulumButton);
        springButton=(Button)findViewById(R.id.springButton);
        freeFallButton=(Button)findViewById(R.id.freeFallButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add("Credits");
        menu.add("English");
        menu.add("עברית");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        String name=item.getTitle().toString();

        if(name.equals("Credits"))
        {
            Intent si=new Intent(this, CreditsActivity.class);
            startActivity(si);
            return true;
        }
        else if(name.equals("English"))
        {
            Languages.toEnglish();
        }
        else if(name.equals("עברית"))
        {
            Languages.toHebrew();
        }

        changeLanguage();

        return true;
    }

    public void changeLanguage()
    {
        pendulumButton.setText(Languages.pendulum);
        springButton.setText(Languages.springElongation);
    }
}
