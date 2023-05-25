package com.example.lr2_drabudko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cilindr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindr);
    }

    public void goBack(View v){
        finish();
    }

    public void count_cilindr(View v){
        EditText et1 = findViewById(R.id.So_in);
        EditText et2 = findViewById(R.id.h_in);
        Double v_cil = Double.parseDouble(et1.getText().toString()) * Double.parseDouble(et2.getText().toString());
        String out_v_cil = v_cil.toString();
        TextView obem_cil = findViewById(R.id.count_cil);
        obem_cil.setText(out_v_cil);
    }
}