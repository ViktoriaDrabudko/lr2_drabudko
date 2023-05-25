package com.example.lr2_drabudko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class piramida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramida);
    }

    public void goBack(View v){
        finish();
    }

    public void count_pir(View v){
        EditText et1 = findViewById(R.id.So_pir_in);
        EditText et2 = findViewById(R.id.h_pir_in);
        Double v_pir = (Double.parseDouble(et1.getText().toString()) * Double.parseDouble(et2.getText().toString())) / 3;
        String out_v_pir = v_pir.toString();
        TextView obem_pir = findViewById(R.id.count_pir);
        obem_pir.setText(out_v_pir);
    }
}