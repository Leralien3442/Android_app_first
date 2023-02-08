package com.IUT_Lyon1.HA_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnValidate);
        btn.setOnClickListener(View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkName();
            }
        })
        Log.i("TestLog", "onCreate");
        tv = findViewById(R.id.radioButtonTitle);
        tv.setText(R.string.radioGenderSelectorTitle);
    }

    private void checkName(){

    }
    @Override
    protected void onResume() {
        Log.i("TestDebug", "onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.i("TestDebug", "onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.i("TestDebug", "onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i("TestDebug", "onDestroy");
        super.onDestroy();
    }
}
