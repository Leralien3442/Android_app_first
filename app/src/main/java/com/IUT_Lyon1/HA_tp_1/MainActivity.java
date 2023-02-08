package com.IUT_Lyon1.HA_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
    TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnValidate);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                checkName();
            }
        });
        Log.i("TestLog", "onCreate");
        tv = findViewById(R.id.radioButtonTitle);
        tv.setText(R.string.radioGenderSelectorTitle);
    }

    private void checkName(){
        name = findViewById(R.id.editTextTextPersonFirstName).toString();
        if(name != null){
            Toast.makeText(getApplicationContext(), name + " set", Toast.LENGTH_SHORT).show();
        }
    }


    private void openSecondActivity(){
        Intent i = new Intent(MainActivity.this, DetailActivity.class);
        i.putExtra(DetailActivity.KEY_NAME, "enterNameHere");
        startActivity(i);
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
