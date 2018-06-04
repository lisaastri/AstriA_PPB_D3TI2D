package com.astri.m_library;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.HashMap;

/**

 *    <Button
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:text="Daftar Pegawai"
 android:id="@+id/buttonView" />
 */

public class tampilBuku extends AppCompatActivity implements View.OnClickListener{

    //Dibawah ini merupakan perintah untuk mendefinikan View
    private EditText editTextNama;
    private AutoCompleteTextView editTextNim;
    private EditText editTextKelas;
    private Spinner editTextJudulBuku;
    private EditText editTextTglPinjam;
    private EditText editTextTglKembali;

    private Button buttonAdd;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_buku);

        //Inisialisasi dari View
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextNim = (AutoCompleteTextView) findViewById(R.id.editTextNim);
        editTextKelas = (EditText) findViewById(R.id.editTextKelas);
        editTextJudulBuku = (Spinner) findViewById(R.id.editTextJudulBuku);
        editTextTglPinjam = (EditText) findViewById(R.id.editTextTglPinjam);
        editTextTglKembali = (EditText) findViewById(R.id.editTextTglKembali);

        String [] nimm = {"1603091","1603092","1603093","1603094","1603095"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1, nimm);
        editTextNim.setAdapter(adapter2);

        String [] judul ={"Analisa Perancangan Sistem Session","ANALISIS dan DESAIN SISTEM INFORMASI","Arsitektur Sistem Komputer","Bagan Terstruktur (Structured Chart)","Dasar-dasar UML"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, judul);
        editTextJudulBuku.setAdapter(adapter);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);

        //Setting listeners to button
        buttonAdd.setOnClickListener(this);
    }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addEmployee(){

        final String namae  = editTextNama.getText().toString().trim();
        final String nime = editTextNim.getText().toString().trim();
        final String kelase = editTextKelas.getText().toString().trim();
        final String judulbukue = editTextJudulBuku.getSelectedItem().toString().trim();
        final String tglpinjame = editTextTglPinjam.getText().toString().trim();
        final String tglkembalie = editTextTglKembali.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(tampilBuku.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(tampilBuku.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_BUKU_NAMA,namae);
                params.put(konfigurasi.KEY_BUKU_NIM,nime);
                params.put(konfigurasi.KEY_BUKU_KELAS,kelase);
                params.put(konfigurasi.KEY_BUKU_JUDULBUKU,judulbukue);
                params.put(konfigurasi.KEY_BUKU_TGLPINJAM,tglpinjame);
                params.put(konfigurasi.KEY_BUKU_TGLKEMBALI,tglkembalie);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD_BUKU, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            addEmployee();
        }

        if(v == buttonView){
            startActivity(new Intent(this,TampilanSemuaPgw.class));
        }
    }
}