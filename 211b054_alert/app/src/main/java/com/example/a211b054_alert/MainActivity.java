package com.example.a211b054_alert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("BE ALERT..!!")
                        .setMessage("Follow Social Distancing")
                                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                Toast.makeText(getApplicationContext(),"hello", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                ).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}