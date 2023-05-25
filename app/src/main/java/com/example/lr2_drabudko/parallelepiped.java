package com.example.lr2_drabudko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class parallelepiped extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelepiped);
    }

    public void goBack(View v){
        finish();
    }

    public void count_para(View v){
        EditText et1 = findViewById(R.id.So_para_in);
        EditText et2 = findViewById(R.id.h_para_in);
        Double v_para = Double.parseDouble(et1.getText().toString()) * Double.parseDouble(et2.getText().toString());
        String out_v_para = v_para.toString();
        TextView obem_para = findViewById(R.id.count_para);
        obem_para.setText(out_v_para);
    }
}