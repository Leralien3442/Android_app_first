package com.IUT_Lyon1.HA_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class DetailActivity extends AppCompatActivity {
    static String KEY_NAME = "name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String name = getIntent().getStringExtra("name");
        if(name!=null){
            Log.e("DetailActivity", name);
        }
        Button btn = findViewById(R.id.btnValidate2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
        //TextInputEditText t = findViewById(R.id.editMailField);
    }


}