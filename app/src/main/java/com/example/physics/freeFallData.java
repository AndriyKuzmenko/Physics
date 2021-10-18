package com.example.physics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class freeFallData extends AppCompatActivity
{
    ListView planetsView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_fall_data);

        planetsView=(ListView)findViewById(R.id.plantesView);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Languages.planets);
        planetsView.setAdapter(adp);
    }
}