package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class TambahData extends AppCompatActivity {

    EditText etNama, etPhone, etEmail, etAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        etNama   = (EditText) findViewById(R.id.addnama);
        etPhone  = (EditText) findViewById(R.id.addNoTelp);
        etEmail  = (EditText) findViewById(R.id.addEmail);
        etAlamat = (EditText) findViewById(R.id.addAlamat);
    }
}
