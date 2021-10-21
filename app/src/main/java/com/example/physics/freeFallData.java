package com.example.physics;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class freeFallData extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView planetsView;
    TextView freeFallDataLabel, massLabel, heightLabel, planetLabel;
    EditText massET, heightET;
    AlertDialog.Builder adb;
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
        planetsView=(ListView)findViewById(R.id.plantesView);
        massET=(EditText)findViewById(R.id.massET);
        heightET=(EditText)findViewById(R.id.heightET);
        planet=2;

        planetsView.setOnItemClickListener(this);

        changeLanguage();
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
        planetLabel.setText(Languages.planet+": "+Languages.planets[planet].trim());

        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Languages.planets);
        planetsView.setAdapter(adp);
    }

    /**
     * Callback method to be invoked when an item in this AdapterView has
     * been clicked.
     * <p>
     * Implementers can call getItemAtPosition(position) if they need
     * to access the data associated with the selected item.
     *
     * @param parent   The AdapterView where the click happened.
     * @param view     The view within the AdapterView that was clicked (this
     *                 will be a view provided by the adapter)
     * @param position The position of the view in the adapter.
     * @param id       The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        planet=position;
        planetLabel.setText(Languages.planet+": "+Languages.planets[planet].trim());
    }

    public void start(View view)
    {
        if(planet==2)
        {
            adb=new AlertDialog.Builder(this);
            adb.setMessage("You have chosen Planet Earth. Do you want to substitute g=10 or g=9.807?");

            adb.setPositiveButton("9.907", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    startAnimation(false);
                }
            });

            adb.setNegativeButton("10", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    startAnimation(true);
                }
            });

            AlertDialog ad=adb.create();
            ad.show();
        }
        else
        {
            startAnimation(false);
        }
    }

    public void startAnimation(boolean b)
    {
        Intent si=new Intent(this, FreeFallAnimation.class);

        Log.i("TAG","planet="+planet+", g="+Languages.gravity[planet]);

        si.putExtra("mass",Integer.parseInt(massET.getText().toString()));
        si.putExtra("height",Integer.parseInt(heightET.getText().toString()));
        if(b) si.putExtra("planet",-1);
        else     si.putExtra("planet",planet);

        startActivity(si);
    }
}