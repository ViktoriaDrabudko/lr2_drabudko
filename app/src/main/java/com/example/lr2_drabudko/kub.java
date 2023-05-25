package com.example.lr2_drabudko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kub);
    }


    public void goBack(View v){
        finish();
    }
    public void count_kube(View v){
        EditText a = findViewById(R.id.storona);
        Double c = Double.parseDouble(a.getText().toString());
        c = Math.pow(c, 3);
        String out_c = c.toString();
        TextView obem = findViewById(R.id.V);
        obem.setText(out_c);
    }
}