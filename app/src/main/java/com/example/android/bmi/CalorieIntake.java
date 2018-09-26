package com.example.android.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalorieIntake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_intake);



    }

    public void calculateCalorie(View view) {

        EditText height = (EditText) findViewById(R.id.height);
        EditText weight = (EditText) findViewById(R.id.weight);
        EditText age = (EditText) findViewById(R.id.age);
        EditText activity = (EditText) findViewById(R.id.activity);
        TextView result = (TextView) findViewById(R.id.result);

        float getHeight, getWeight,getAge,getActivity;

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
        if (age.getText().toString().equals("")) {
            getAge = 0f;
        } else {
            getAge = Float.parseFloat(age.getText().toString());
        }
        if (activity.getText().toString().equals("")) {
            getActivity = 0f;
        } else {
            getActivity = Float.parseFloat(activity.getText().toString());
        }

        float calc = (float) (66.4730 + (13.7516 * getWeight) + (5.0033 * getHeight)-(6.7550 * getAge));

        result.setText("Calorie Intake : " + calc);
    }


    public void dietPlan(View view)
    {
        Intent intent=new Intent(this,DietPlan.class);
        startActivity(intent);
    }
}
