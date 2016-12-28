package com.example.nayra.proyectofinal_studyjam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btndecora;
    private Button btnmanuali;
    private Button btnCombina;
    private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initOnclick();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btndecora:
                intent = new Intent(getApplicationContext(), DecoracionesActivity.class);
                startActivity(intent);
                break;

            case R.id.btnCombina:
                intent = new Intent(getApplicationContext(), CombinacionActivity.class);
                startActivity(intent);
                break;

        }
    }
    public void initUI() {
       // btnmanuali= (Button) findViewById(R.id.btnmanuali);
        btndecora = (Button) findViewById(R.id.btndecora);
        btnCombina = (Button) findViewById(R.id.btnCombina);

    }

    public void initOnclick() {
        btnCombina.setOnClickListener(this);
        btndecora.setOnClickListener(this);
       // btnmanuali.setOnClickListener(this);

    }


}
