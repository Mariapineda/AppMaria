package com.example.jhonatan.appmaria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btnfoto1, btnfoto2, btnfoto3;

    private Button bt, bt1, bt2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfoto1 = (Button) findViewById(R.id.foto_uno);
        btnfoto2 = (Button) findViewById(R.id.foto_dos);
        btnfoto3 = (Button) findViewById(R.id.foto_tres);

        tv = (TextView) findViewById(R.id.texto);
        bt = (Button) findViewById(R.id.cambio_color1);
        bt1 = (Button) findViewById(R.id.cambio_color2);
        bt2 = (Button) findViewById(R.id.cambio_color3);

        btnfoto1.setOnClickListener(this);
        btnfoto2.setOnClickListener(this);
        btnfoto3.setOnClickListener(this);
        bt.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
        {

        if (v == btnfoto1)
            startActivity(new Intent(MainActivity.this, ActivityFotoUno.class));

        if (v == btnfoto2)
            startActivity(new Intent(MainActivity.this, ActivityFotoDos.class));

        if (v == btnfoto3)
            startActivity(new Intent(MainActivity.this, ActivityFotoTres.class));

        if (v == bt)
        {
            int color = getResources().getColor(android.R.color.holo_blue_dark);
            tv.setTextColor(color);
        }

        if (v == bt1)
        {
            int color = getResources().getColor(android.R.color.holo_green_light);
            tv.setTextColor(color);
        }

        if (v == bt2)
        {
            int color = getResources().getColor(android.R.color.holo_red_dark);
            tv.setTextColor(color);
        }




    }


}
