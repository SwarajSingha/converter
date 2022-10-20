package com.example.weatherapp;

import static com.example.weatherapp.TemperatureConvert.convertTemperatureValue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weatherapp.databinding.ActivityConversionBinding;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.util.List;

public class Conversion extends AppCompatActivity {


    private List<Unit> unitList;
    private Unit fromUnit;
    private Unit toUnit;
    private TextView digit;
    private TextView white_digit;
    private int id;

    /**
     * keyboard listener
     */
    private View.OnClickListener keyboardListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            TextView tv = (TextView) view;
            String nv = tv.getText().toString();
            String pv = digit.getText().toString();

            if (nv.equals("C")) {
                if (pv.equals("")) return;
                nv = pv.substring(0, pv.length() - 1);
                digit.setText(nv);

            } else if (nv.equals(".")) {

                if (pv.contains(".")) {
                    return;
                }

                nv = pv + nv;
                digit.setText(nv);


            } else {
                nv = pv + nv;
                digit.setText(nv);
            }


        }
    };


    private TextWatcher textChangeListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            calculateOutput();

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    private View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            digit.setText("");
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityConversionBinding mBinding = DataBindingUtil.setContentView(this, R.layout.activity_conversion);

        ImageView lengthBackArrow = findViewById(R.id.length_back_arrow);
        TextView lengthUnit = findViewById(R.id.length_unit);
        TextView lengthBlackUnit = findViewById(R.id.length_black_unit);
        TextView title = findViewById(R.id.length);
        digit = findViewById(R.id.digit);
        white_digit = findViewById(R.id.white_digit);
        LinearLayout redUnit = findViewById(R.id.units);
        LinearLayout whiteUnit = findViewById(R.id.white_unit);

        digit.addTextChangedListener(textChangeListener);

        //keyboard
        mBinding.keyboard.one.setOnClickListener(keyboardListener);
        mBinding.keyboard.two.setOnClickListener(keyboardListener);
        mBinding.keyboard.three.setOnClickListener(keyboardListener);
        mBinding.keyboard.four.setOnClickListener(keyboardListener);
        mBinding.keyboard.five.setOnClickListener(keyboardListener);
        mBinding.keyboard.six.setOnClickListener(keyboardListener);
        mBinding.keyboard.seven.setOnClickListener(keyboardListener);
        mBinding.keyboard.eight.setOnClickListener(keyboardListener);
        mBinding.keyboard.nine.setOnClickListener(keyboardListener);
        mBinding.keyboard.c.setOnClickListener(keyboardListener);
        mBinding.keyboard.c.setOnLongClickListener(longClickListener);
        mBinding.keyboard.zero.setOnClickListener(keyboardListener);
        mBinding.keyboard.decimal.setOnClickListener(keyboardListener);


         id = getIntent().getIntExtra("ID", -1);
        switch (id) {
            case MainActivity.LENGTH_ID:
                unitList = Manager.getLengthUnits();
                title.setText("Length");
                break;
            case MainActivity.MASS_ID:
                unitList = Manager.getWeightUnits();
                title.setText("Mass");
                break;
            case MainActivity.VOLUME_ID:
                unitList = Manager.getVolumeUnits();
                title.setText("Volume");
                break;
            case MainActivity.AREA_ID:
                unitList = Manager.getAreaUnits();
                title.setText("Area");
                break;
            case MainActivity.DATA_ID:
                unitList = Manager.getStorageUnits();
                title.setText("Data");
                break;
            case MainActivity.TIME_ID:
                unitList = Manager.getTimeConversions();
                title.setText("Time");
                break;
            case MainActivity.PRESSURE_ID:
                unitList = Manager.getPressureUnits();
                title.setText("Pressure");
                break;
            case MainActivity.SPEED_ID:
                unitList = Manager.getSpeedUnits();
                title.setText("Speed");
                break;
            case MainActivity.TEMPERATURE_ID:
                unitList = Manager.getTemperatureUnits();
                title.setText("Temperature");
                break;



        }

        fromUnit = unitList.get(0);
        toUnit = unitList.get(0);
        lengthUnit.setText(fromUnit.getUnitName());
        lengthBlackUnit.setText(toUnit.getUnitName());


        String[] unitNames = new String[unitList.size()];
        for (int i = 0; i < unitList.size(); i++) {
            Unit cu = unitList.get(i);
            String unitName = cu.getUnitName();
            unitNames[i] = unitName;
        }

        lengthBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        redUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Conversion.this);
                builder.setItems(unitNames, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        fromUnit = unitList.get(position);
                        String currentUnit = unitNames[position];
                        lengthUnit.setText(currentUnit);
                        calculateOutput();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        whiteUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Conversion.this);
                builder.setItems(unitNames, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        toUnit = unitList.get(position);
                        String currentUnit = unitNames[position];
                        lengthBlackUnit.setText(currentUnit);

                        calculateOutput();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


    }

    private void calculateOutput() {

        double result = 0;

        if (digit.getText().toString().equals("")) {
            white_digit.setText("");
            return;
        }

        double inputValue = Double.parseDouble(digit.getText().toString());

        switch (id) {
            case MainActivity.TEMPERATURE_ID:
                result = convertTemperatureValue(inputValue, fromUnit, toUnit);
                white_digit.setText(result + "");
                break;

            default: {

                // use BigDecimal to eliminate multiplication rounding errors
                BigDecimal multiplier = new BigDecimal(fromUnit.getConversionToBase()).multiply(new BigDecimal(toUnit.getConversionFromBase()));
                BigDecimal bdResult = new BigDecimal(inputValue).multiply(multiplier);
                result = bdResult.doubleValue();

                white_digit.setText(result + "");
            }
        }

    }
    

}