package com.astri.m_library;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by muhammadyusuf on 01/19/2017.
 * kodingindonesia
 */

public class tampilPeminjam extends AppCompatActivity implements View.OnClickListener{

    private TextView txtId;
    private TextView txtJudul;

    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_peminjam);


        txtId = (TextView) findViewById(R.id.txtId);
        txtJudul = (TextView) findViewById(R.id.txtJudul);

        txtId.setText("5");
        txtJudul.setText("Analisa Perancangan Sistem Session");


    }

    private void getEmployee(){
        class GetEmployee extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(tampilPeminjam.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showEmployee(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(konfigurasi.URL_GET_PEMINJAM,id);
                return s;
            }
        }
        GetEmployee ge = new GetEmployee();
        ge.execute();
    }

    private void showEmployee(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(konfigurasi.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String judulbukue = c.getString(konfigurasi.TAG_BUKU_JUDULBUKU);


            txtJudul.setText(judulbukue);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public void onclik(View view){
        Toast.makeText(this,"Peminjaman Buku di Perpanjang", Toast.LENGTH_SHORT).show();
    }
    public void onclok(View view){
        Toast.makeText(this,"Buku Telah di Kembalikan", Toast.LENGTH_SHORT).show();
        txtId.setText("0");
        txtJudul.setText("-");
    }


    @Override
    public void onClick(View v) {

    }
}