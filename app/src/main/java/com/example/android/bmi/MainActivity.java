package com.example.android.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


//  Floating Bar action
//        -------------------------------------------------------------------
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void calculateBMI(View view) {

        EditText height = (EditText) findViewById(R.id.height);
        EditText weight = (EditText) findViewById(R.id.weight);
        TextView result = (TextView) findViewById(R.id.result);

        float getHeight, getWeight;

        if (height.getText().toString().equals("")) {
            getHeight = 0f;
        } else {
            getHeight = Float.parseFloat(height.getText().toString());
        }
        if (weight.getText().toString().equals("")) {
            getWeight = 0f;
        } else {
            getWeight = Float.parseFloat(weight.getText().toString());
        }

        float bmi = getWeight / (getHeight * getHeight);

        result.setText("Your BMI is " + bmi);
    }

    /*public void bodyFat(View view)
    {
        Intent intent=new Intent(this,BodyFat.class);
        startActivity(intent);
    }*/


    public void calorieCalculate(View view)
    {
        Intent intent=new Intent(this,CalorieIntake.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
