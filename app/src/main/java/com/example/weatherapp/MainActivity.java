package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weatherapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final int LENGTH_ID = 0;
    public static final int MASS_ID = 1;
    public static final int VOLUME_ID = 2;
    public static final int TEMPERATURE_ID = 3;
    public static final int AREA_ID = 4;
    public static final int DATA_ID = 5;
    public static final int SPEED_ID = 6;
    public static final int TIME_ID = 7;
    public static final int PRESSURE_ID = 8;



    private ActivityMainBinding mBinding;


    /**
     * Click listener for all units
     */
    View.OnClickListener clickListener = view -> {
        Intent iLength = new Intent(MainActivity.this, Conversion.class);

        switch (view.getId()) {
            case R.id.box1:
                iLength.putExtra("ID", LENGTH_ID);
                break;

            case R.id.box2:
                iLength.putExtra("ID", MASS_ID);
                break;
            case R.id.box3:
                iLength.putExtra("ID", VOLUME_ID);
                break;
            case R.id.box4:
                iLength.putExtra("ID", TEMPERATURE_ID);
                break;
            case R.id.box5:
                iLength.putExtra("ID", AREA_ID);
                break;
            case R.id.box6:
                iLength.putExtra("ID", DATA_ID);
                break;
            case R.id.box7:
                iLength.putExtra("ID", SPEED_ID);
                break;
            case R.id.box8:
                iLength.putExtra("ID", TIME_ID);
                break;
            case R.id.box9:
                iLength.putExtra("ID", PRESSURE_ID);
                break;
        }
        startActivity(iLength);


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Length
        mBinding.box1.setOnClickListener(clickListener);

        //Mass
        mBinding.box2.setOnClickListener(clickListener);

        //Volume
        mBinding.box3.setOnClickListener(clickListener);

        //Temperature
        mBinding.box4.setOnClickListener(clickListener);

        //Area
        mBinding.box5.setOnClickListener(clickListener);

        //Data
        mBinding.box6.setOnClickListener(clickListener);

        //Speed
        mBinding.box7.setOnClickListener(clickListener);

        //Time
        mBinding.box8.setOnClickListener(clickListener);

        //Pressure
        mBinding.box9.setOnClickListener(clickListener);
    }
}