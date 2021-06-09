package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText dollar_input= findViewById(R.id.input_edit_Text);
        Log.i("print",dollar_input.getText().toString());
        Double dollar_amount=Double.parseDouble(dollar_input.getText().toString());
        Double rupees_amount=dollar_amount*73.38;
        TextView display_output= findViewById(R.id.textView_display);
        display_output.setText(String.format("%.2f",rupees_amount));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}