package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etlokasi;
    Button btnlokasi;
    String nama_lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etlokasi = findViewById(R.id.et_lokasi);

        btnlokasi = findViewById(R.id.btn_lokasi);

        btnlokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama_lokasi = etlokasi.getText().toString();

                Uri uri_nama_lokasi = Uri.parse("geo:0,0?q=" + nama_lokasi);
                Intent carilokasi = new Intent(Intent.ACTION_VIEW, uri_nama_lokasi);
                startActivity(carilokasi);
            }
        });

    }
}