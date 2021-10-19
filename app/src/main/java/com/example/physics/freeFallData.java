package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class freeFallData extends AppCompatActivity
{
    ListView planetsView;
    TextView freeFallDataLabel, massLabel, heightLabel, planetLabel;
    int planet;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fall_data);

        freeFallDataLabel=(TextView)findViewById(R.id.freeFallDataLabel);
        massLabel=(TextView)findViewById(R.id.massLabel);
        heightLabel=(TextView)findViewById(R.id.heightLabel);
        planetLabel=(TextView)findViewById(R.id.planetLabel);
        planet=2;

        planetsView=(ListView)findViewById(R.id.plantesView);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Languages.planets);
        planetsView.setAdapter(adp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();

        if(id==R.id.Credits)
        {
            Intent si=new Intent(this, CreditsActivity.class);
            startActivity(si);
            return true;
        }
        else if(id==R.id.English)
        {
            Languages.toEnglish();
        }
        else if(id==R.id.Hebrew)
        {
            Languages.toHebrew();
        }

        changeLanguage();

        return true;
    }

    public void changeLanguage()
    {
        freeFallDataLabel.setText(Languages.freeFall);
        massLabel.setText(Languages.mass);
        heightLabel.setText(Languages.height);
        planetLabel.setText(Languages.planet+": "+Languages.planets[planet]);
    }
}