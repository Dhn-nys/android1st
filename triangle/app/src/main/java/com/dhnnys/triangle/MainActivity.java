package com.dhnnys.triangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText kotakalas,kotaktinggi;
    Button Hitung;
    TextView Hasilluas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kotakalas = findViewById(R.id.kotakalas);
        kotaktinggi = findViewById(R.id.kotaktinggi);
        Hitung = findViewById(R.id.hitung);
        Hasilluas = findViewById(R.id.hasil);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kotakalas.length() == 0 && kotaktinggi.length() == 0) {
                    Toast.makeText(MainActivity.this, "Silahkan isi nilai terlebih dahulu", Toast.LENGTH_SHORT).show();

                } else if (kotakalas.length() == 0) {
                    Toast.makeText(MainActivity.this, "Silahkan isi nilai Alas", Toast.LENGTH_SHORT).show();
                } else if (kotaktinggi.length() == 0) {
                    Toast.makeText(MainActivity.this, "Silahkan isi nilai Tinggi", Toast.LENGTH_SHORT).show();
                } else {
                    String Alas = kotakalas.getText().toString();
                    String Tinggi = kotaktinggi.getText().toString();

                    double a = Double.parseDouble(Alas);
                    double t = Double.parseDouble(Tinggi);
                    double hasil = LuasSegitiga(a, t);

                    String output = String.valueOf(hasil);
                    Hasilluas.setText(output);
                }
            }
        });
    }
        public double LuasSegitiga(double Alas, double Tinggi){
            double hasil = Alas * Tinggi / 2 ;
            return hasil;


    }
}
