package com.example.lr2_drabudko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] item = {"Куб", "Параллелепипед", "Пирамида", "Цилиндр"};
    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.auto_complete_text);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Выбран:" + item, Toast.LENGTH_SHORT).show();
                if (item == "Куб"){
                    Intent intent = new Intent(MainActivity.this, kub.class);
                    startActivity(intent);
                }
                if (item == "Параллелепипед"){
                    Intent intent = new Intent(MainActivity.this, parallelepiped.class);
                    startActivity(intent);
                }
                if (item == "Пирамида"){
                    Intent intent = new Intent(MainActivity.this, piramida.class);
                    startActivity(intent);
                }
                if (item == "Цилиндр"){
                    Intent intent = new Intent(MainActivity.this, cilindr.class);
                    startActivity(intent);
                }
            }
        });
    }
}