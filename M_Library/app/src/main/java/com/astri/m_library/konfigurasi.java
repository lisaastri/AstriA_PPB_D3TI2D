package com.astri.m_library;
public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD_BUKU="http://192.168.43.36/dbandroid/tambahBuku.php";
    public static final String URL_GET_PEMINJAM = "http://192.168.43.36/dbandroid/tampilPeminjam.php?id=";
    public static final String URL_ADD="http://192.168.43.36/dbandroid/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.43.36/dbandroid/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.43.36/dbandroid/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.36/dbandroid/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.36/dbandroid/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih

    public static final String KEY_BUKU_ID = "id";
    public static final String KEY_BUKU_NAMA = "namae";
    public static final String KEY_BUKU_NIM =  "nime";
    public static final String KEY_BUKU_KELAS = "kelase";
    public static final String KEY_BUKU_JUDULBUKU = "judulbukue";
    public static final String KEY_BUKU_TGLPINJAM = "tglpinjame";
    public static final String KEY_BUKU_TGLKEMBALI = "tglkembalie";



    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

    public static final String TAG_BUKU_ID = "id";
    public static final String TAG_BUKU_NAMA = "namae";
    public static final String TAG_BUKU_NIM =  "nime";
    public static final String TAG_BUKU_KELAS = "kelase";
    public static final String TAG_BUKU_JUDULBUKU = "judulbukue";
    public static final String TAG_BUKU_TGLPINJAM = "tglpinjame";
    public static final String TAG_BUKU_TGLKEMBALI = "tglkembalie";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
    public static final String BUKU_ID = "buku_id";
}