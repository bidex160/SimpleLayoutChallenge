package com.example.layoutchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewF, textViewE, textViewN;
    EditText editTextF, editTextE, editTextN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextF =(EditText)findViewById(R.id.editF);
        editTextE = (EditText)findViewById(R.id.editE);
        editTextN = (EditText)findViewById(R.id.editN);

        textViewF = (TextView)findViewById(R.id.textF);
        textViewE = (TextView) findViewById(R.id.textE);
        textViewN = (TextView) findViewById(R.id.textN);
    }

    public void button(View view){
        textViewF.setText(editTextF.getText().toString());
        textViewE.setText(editTextE.getText().toString());
        textViewN.setText(editTextN.getText().toString());

    }
}
