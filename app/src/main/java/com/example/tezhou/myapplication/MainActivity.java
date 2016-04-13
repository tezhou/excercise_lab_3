package com.example.tezhou.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    EditText f1;
    EditText f2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        f1  = (EditText) findViewById(R.id.editText);
        f2  = (EditText) findViewById(R.id.editText2);
        text  = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(this);
        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        text.setOnClickListener(this);

    }




        @Override
        public void onClick(View view) {
                int sum = 0;
                int t1 =Integer.parseInt(f1.getText().toString());
                int t2 =Integer.parseInt(f2.getText().toString());
                sum = sum(t1, t2);
                if(view.getId() == R.id.button) {
                    text.setText(String.valueOf(sum));
                }
        }


    public int sum(int a, int b){
        return a+b;
    }
}
