package com.astri.m_library;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class book extends AppCompatActivity {
    Context context = this;

    Button btnKlik, btnKlik2, btnKlik3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        btnKlik = (Button) findViewById(R.id.buku1);
        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Konfirmasi");
                builder.setMessage("Apakah anda ingin meminjam buku?");
                // Membuat tombol negativ
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                //Membuat tombol positif
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Bila pilih ok, maka muncul toast
                        Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(book.this, tampilBuku.class);
                        startActivity(intent);
                        finish();
                    }
                });
                builder.show();
            }
        });

        btnKlik2 = (Button) findViewById(R.id.buku2);
        btnKlik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Konfirmasi");
                builder.setMessage("Apakah anda ingin meminjam buku?");
                // Membuat tombol negativ
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                //Membuat tombol positif
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Bila pilih ok, maka muncul toast
                        Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(book.this, tampilBuku.class);
                        startActivity(intent);
                        finish();
                    }
                });
                builder.show();
            }
        });

        btnKlik3 = (Button) findViewById(R.id.buku3);
        btnKlik3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Konfirmasi");
                builder.setMessage("Apakah anda ingin meminjam buku?");
                // Membuat tombol negativ
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                //Membuat tombol positif
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Bila pilih ok, maka muncul toast
                        Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(book.this, tampilBuku.class);
                        startActivity(intent);
                        finish();
                    }
                });
                builder.show();
            }
        });
    }
}