<?php
/*
 
 penulis: Muhammad yusuf
 website: http://www.kodingindonesia.com/
 
 */

	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Mendapatkan Nilai Variable
		$namae = $_POST['namae'];
		$nime = $_POST['nime'];
		$kelase = $_POST['kelase'];
		$judulbukue = $_POST['judulbukue'];
		$tglpinjame = $_POST['tglpinjame'];
		$tglkembalie = $_POST['tglkembalie'];

		
		//Pembuatan Syntax SQL
		$sql = "INSERT INTO buku (nim,nama,kelas,judulbuku,tglpinjam,tglkembali) VALUES ('$nime','$namae','$kelase','$judulbukue','$tglpinjame','$tglkembalie')";
		
		//Import File Koneksi database
		require_once('koneksi.php');
		
		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil MEminjam Buku';
		}else{
			echo 'Gagal Meminjam Buku';
		}
		
		mysqli_close($con);
	}
?>