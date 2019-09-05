package com.example.tugasppbdianahudani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtPanjang, edtLebar;
    private Button btnHasil;
    private TextView Luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.inputPanjang);
        edtLebar = findViewById(R.id.inputLebar);
        btnHasil = findViewById(R.id.btnHasil);
        Luas = findViewById(R.id.Hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang, lebar;
                panjang = edtPanjang.getText().toString();
                lebar= edtLebar.getText().toString();

                if(TextUtils.isEmpty(panjang)){
                    edtPanjang.setError("Tidak boleh kosong!");
                    edtPanjang.requestFocus();
                }else if(TextUtils.isEmpty(lebar)){
                    edtLebar.setError("Tidak boleh kosong!");
                }else{
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hasil = p * l ;

                    Luas.setText("Luas :" +hasil);
                }
            }
        });


    }
}
