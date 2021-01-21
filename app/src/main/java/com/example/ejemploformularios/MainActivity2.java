package com.example.ejemploformularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView lbCourse, lbSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        dataValues data = new dataValues(
//                ((dataValues) savedInstanceState.getSerializable("data")).isNet(),
//                ((dataValues) savedInstanceState.getSerializable("data")).isJava(),
//                ((dataValues) savedInstanceState.getSerializable("data")).isOracle(),
//                ((dataValues) savedInstanceState.getSerializable("data")).getSchedule()
//        );
        //Bundle objetoRecibido = .getExtras();

        Intent inta = getIntent();

        dataValues data = (dataValues) inta.getSerializableExtra("data");
        lbSchedule = findViewById(R.id.lbSchedule);
        //String dataCourse = getIntent().getStringExtra("course");
        lbSchedule.setText("Horario: " + data.getSchedule());
    }

    public void closeWindow(View view) {
        finish();
    }
}