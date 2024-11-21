package com.example.qrcode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // View Objects
    private Button buttonScan;
    private TextView textViewName, textViewAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View objects
        buttonScan = findViewById(R.id.buttonScan);
        textViewName = findViewById(R.id.textViewName);
        textViewAddress = findViewById(R.id.textViewAddress);

        // Attach onclick listener
        buttonScan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonScan) {

            Toast.makeText(this, "Scan button clicked", Toast.LENGTH_SHORT).show();
        }
    }
}