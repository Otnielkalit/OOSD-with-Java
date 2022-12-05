/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualanbuku;

import java.util.Scanner;

/**
 *
 * @author otnie
 */

//public class PenjualanBuku {

    
    
//    public static void main(String[] args) {
//        Autentikasi auth = new Autentikasi();
//        Scanner sc = new Scanner(System.in);
//        int opsi = 0;
//            do {
//            System.out.println("1.Admin\n2.Pembeli");
//            System.out.print("Pilih : ");
//            opsi = sc.nextInt();
//            switch(opsi) {
//                case 1 -> {
////                    auth.loginAdmin();
//                        System.out.println("========= Selamat Datang Admin Baen hamu na denggan tu Customer ==========");
//                        System.out.println("\t   ====== ADMIN TOKO BUKU JAYA SUKSES =======");
//                    while(true) {
//                        do {
//                        System.out.println("1. Profil Toko Buku Jaya Sukses");
//                        System.out.println("2. Deskripsi Toko");
//                        System.out.println("3. Kelola Buku ");
//                        System.out.println("4. Kelola Penjualan");
//                        System.out.println("5. Kelola Event Bazar");
//                        System.out.println("6. Kelola Laporan Keuangan");
//                        System.out.println("7. Laporan");
//                        System.out.println("0. Back");
//                        System.out.print("Silahkan pilih : ");
//                        opsi = sc.nextInt();
//                        switch(opsi) {
//                            case 1 -> {
//                                System.out.print(" || ======== PROFIL TOKO ======== ||");
//                                Toko toko = new Toko();
//                                toko.setToko("Toko Buku Jaya Sukses", "Porsea", "Otniel Simanungkalit", "1. Gilbert", "jayasukses21@gmail.com", "0812425354");
//                                System.out.println("============================");
//                                toko.display();
//                                System.out.println("============================");
//                            }
//                            
//                            case 2 -> {
//                                DataDeskripsi dataDeskripsi = new DataDeskripsi();
//                                dataDeskripsi.show();
//                                System.out.println("1.Tampil\n2.Tambah\n3.Edit\n4.Hapus");
//                                opsi = sc.nextInt();
//                                    switch(opsi) {
//                                        case 1 -> dataDeskripsi.show();
//                                        case 2 -> dataDeskripsi.addDeksripsi();
//                                        default -> System.out.println("Tidak ada dalam opsi");
//                                    }
//                            }
//                            
//                            default -> System.out.println("Pilihan anda tidak ada dalam opsi");
//                            }
//                        }while(opsi > 7);
//                    }
//                }
//                case 2 -> auth.loginPembeli();
//            }
//        }while(opsi > 2);
//    }       
//}

// =========================================================================================================================================================

public class PenjualanBuku{
    
    /**
    * @param args the command line arguments
    */
    static String namaToko, alamat, pemilik, karyawan, email, no_telp, isi, biaya;
    static String description, detailProduk, packing;
    
    public static void main(String[] args){
        
        PenjualanBuku toko = new PenjualanBuku();
        Autentikasi auten = new Autentikasi();
        Buku buku = new Buku();
        Penjualan penjualan = new Penjualan();
        Pemesanan pesan = new Pemesanan();
        Komentar komen = new Komentar();
        Scanner scan = new Scanner(System.in);
        Komentar.shows show = komen.new  shows();
        
        
        /* PROFIL TOKO BUKU JAYA SUKSES */
        Toko profil = new Toko();
        Toko Toko[] = new Toko[100];
        for (int i = 0; i < Toko.length; i++){
            Toko[i] = new Toko(namaToko, alamat, pemilik, karyawan, email, no_telp);
        }
        Toko[0].setToko("Toko Buku Jaya Sukses", "Porsea", "Otniel Simanungkalit", "1. Gilbert", "jayasukses21@gmail.com", "0812425354");

        /* DESKRIPSI TOKO BUKU JAYA SUKSES */
        Deskripsi deskrip = new Deskripsi();
        Deskripsi Deskripsi[] = new Deskripsi[100];
        for (int i = 0; i < Deskripsi.length; i++) {
            Deskripsi[i] = new Deskripsi(description, detailProduk, packing);
        }
        Deskripsi[0].setDeskripsi("Terimakasih telah berkunjung ke Toko Buku Jaya Sukses", "Anda Dapat memesan buku yang anda inginkan kami pasti memberikan yang terbaik untuk anda.", 
                "Kami pastikan Pengiriman barang anda sesuai dengan pesanan dan selamat sampai tujuan");
        Deskripsi[1].setDeskripsi("Terimakasih telah berkunjung ke Toko Buku Jaya Sukses", "Anda Dapat memesan buku yang anda inginkan kami pasti memberikan yang terbaik untuk anda.", 
                "Kami pastikan Pengiriman barang anda sesuai dengan pesanan dan selamat sampai tujuan");
        Deskripsi[2].setDeskripsi("Terimakasih telah berkunjung ke Toko Buku Jaya Sukses", "Anda Dapat memesan buku yang anda inginkan kami pasti memberikan yang terbaik untuk anda.", 
                "Kami pastikan Pengiriman barang anda sesuai dengan pesanan dan selamat sampai tujuan");

        
        /* EVENT BAZAR TOKO BUKU JAYA SUKSES */
        EventBazar event = new EventBazar();
        event.addEventBazar("Futsal", "10/12/2019", "AFF");
        event.addEventBazar("Inovasi", "05/10/2019", "Desa");
        
        // Customer Service
        CustomerService laporan = new CustomerService();
        laporan.addLaporan("haol", "5", "olo");
        laporan.addLaporan("tiang", "4", "daong");
        
        
        /* KOMENTAR */
        Komentar komentar = new Komentar();
        
        /* PENGEMBALIAN BARANG */
        PengembalianBuku form = new PengembalianBuku();
        
        
        int awal, utama, sub;
        do {
            toko.menuLogin();
            System.out.print("Login sebagai : ");
            awal = scan.nextInt();
            if (awal == 1) {

                auten.loginAdmin();
                do {
                    toko.menuUtamaAdmin();
                    System.out.print("Pilih : ");
                    utama = scan.nextInt();
                    if (utama == 1) {
                        do {
                            for (int i = 0; i < Toko.length; i++) {
                                if (Toko[i].getNamaToko()!= null) {
                                    System.out.println("\n\t ======= Profil Toko Buku Jaya Sukses ========");
                                    Toko[i].display();
                                }
                            }
                            System.out.println("1. Edit ");
                            System.out.println("0. Back");
                            System.out.print("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                toko.editProfil();
                                Toko[0].setToko(namaToko, alamat, pemilik, karyawan, email, no_telp);
                            }

                        } while (sub != 0);
                    }
                    if (utama == 2) {
                        do {
                            System.out.println("\n\t ======= Deskripsi Toko Buku Jaya Sukses ========");
                            for (int i = 0; i < Deskripsi.length; i++) {
                                if (Deskripsi[i].getDescription()!= null) {
                                    System.out.println(i + 1 + ".");
                                    Deskripsi[i].display();
                                }
                            }
                            System.out.println("1. Tambah Deskripsi ");
                            System.out.println("2. Edit Deskripsi ");
                            System.out.println("3. Hapus Deskripsi ");
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                int x = 0;
                                int t = 0;
                                for (int i = 0; i < Deskripsi .length; i++) {
                                    if (Deskripsi [i].getDescription()== null) {
                                        t = i;
                                        x = 1;
                                        break;
                                    } else {

                                    }
                                }
                                if (x == 1) {
                                    System.out.println("==================================");
                                    System.out.printf("Deskripsi : ");
                                    description = scan.next();
                                    Deskripsi[t].setDescription(description);
                                    System.out.printf("Detail : ");
                                    detailProduk = scan.next();
                                    Deskripsi[t].setDetailProduk(detailProduk);
                                    System.out.printf("Hukuman : ");
                                    packing = scan.next();
                                    Deskripsi[t].setPacking(packing);
                                    System.out.println("==================================");
                                    System.out.println(" Deskripsi Berhasil Ditambahkan ");
                                } else {
                                    System.out.println("Deskripsi gagal ditambahkan");
                                }
                            }

                            if (sub == 2) {
                                System.out.println("=====Edit Peraturan=====");
                                for (int i = 0; i < Deskripsi.length; i++) {
                                    if (Deskripsi[i].getDescription()!= null) {
                                        System.out.println(i + 1 + ".");
                                        Deskripsi[i].display();
                                    }
                                }
                                System.out.println("Pilih aturan ke : ");
                                int in = scan.nextInt();
                                int ac = in - 1;
                                System.out.printf("Deskripsi  : ");
                                description = scan.next();
                                System.out.print("Detail : ");
                                detailProduk = scan.next();
                                System.out.printf("System Packing : ");
                                packing = scan.next();
                                Deskripsi[ac].setDeskripsi(description, detailProduk, packing);
                            }

                            if (sub == 3) {
                                System.out.printf("Masukkan Deskripsi ke berapa yang ingin anda hapus: ");
                                int in = scan.nextInt();
                                int ac = in - 1;
                                Deskripsi[ac].setDeskripsi(null, null, null);
                                System.out.println("----- Deskripsi Berhasil dihapus-----");
                                for (int i = ac + 1; i < Deskripsi.length; i++) {
                                    Deskripsi[i - 1] = Deskripsi[i];
                                }
                                Deskripsi[Deskripsi.length - 1].setDeskripsi(null, null, null);
                            }
                        } while (sub != 0);
                    }
                    if (utama == 3) {
                        int dl;
                        do {
                            System.out.println("======= Kelola Buku =======");
                            buku.tampilBuku();
                            System.out.println("\n");

                            System.out.println("1. Tambah Buku");
                            System.out.println("2. Edit Buku");
                            System.out.println("3. Hapus Buku");
                            System.out.println("4. Daftar Buku");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String nama, tipe, alamat;
                                int jumlah_buku, harga;
                                System.out.printf("Nama Buku: ");
                                nama = scan.next();
                                System.out.printf("Jumlah Buku : ");
                                jumlah_buku = scan.nextInt();
                                System.out.printf("Harga Buku : ");
                                harga = scan.nextInt();
                                System.out.println("Pilihan : Pelajaran, Tutorial, Novel");
                                System.out.printf("Tipe : ");
                                tipe = scan.next();
                                System.out.printf("Alamat : ");
                                alamat = scan.next();
                                buku.addBuku(nama, jumlah_buku, harga, TipeBuku.valueOf(tipe), alamat);

                            }
                            if (sub == 2) {
                                String nama, tipe, alamat;
                                int jumlah_kamar, harga;
                                System.out.println("Pilih Homestay : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Jumlah Kamar : ");
                                    jumlah_kamar = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();
                                    System.out.println("Pilihan : Standar, Delux, VIP");
                                    System.out.printf("Tipe : ");
                                    tipe = scan.next();
                                    System.out.printf("Alamat : ");
                                    alamat = scan.next();
                                    buku.updateBuku(nama, jumlah_kamar, harga, TipeBuku.valueOf(tipe), alamat, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Buku yang ingin dihapus : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    buku.deleteHomestay(dl - 1);
                                } else {
                                    break;
                                }
                            }

                            if (sub == 4) {
                                int ops;
                                int jumlah_buku;
                                String nama, status, alamat;
                                long no_telp;
                                pesan.show();
                                String satu = "Tolak Pesanan";
                                String dua = "Terima Pesanan";
                                //                            pesan.
                                System.out.println("Pilih pesanan : ");
                                ops = scan.nextInt();
                                System.out.println("Action :");
                                System.out.println("1. Terima");
                                System.out.println("2. Tolak");
                                System.out.println("Pilih");
                                //                            jumlah_kamar =
                                dl = scan.nextInt();
                                if (dl == 1) {
                                    pesan.updateBuku(ops - 1, jumlah_buku = pesan.pemesanan.get(ops - 1).jumlah_buku, nama = pesan.pemesanan.get(ops - 1).nama, alamat = pesan.pemesanan.get(ops - 1).alamat, no_telp = pesan.pemesanan.get(ops - 1).no_telp, status = dua);
                                }
                                if (dl == 2) {
                                    pesan.updateBuku(ops - 1, jumlah_buku = pesan.pemesanan.get(ops - 1).jumlah_buku, nama = pesan.nama, alamat = pesan.pemesanan.get(ops - 1).alamat, no_telp = pesan.no_telp, status = satu);
                                }
                            }

                        } while (sub != 0);
                    }

                    if (utama == 4) {
                        int dl;
                        do {
                            int stok, harga;
                            String nama;

                            System.out.println("======= Penjualan Buku =======");
                            penjualan.tampilPenjualan();
                            System.out.println("\n");

                            System.out.println("1. Tambah Penjualan Buku");
                            System.out.println("2. Edit Penjualan Buku");
                            System.out.println("3. Hapus Penjualan Buku");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                System.out.printf("Nama : ");
                                nama = scan.next();
                                System.out.printf("Stok : ");
                                stok = scan.nextInt();
                                System.out.printf("Harga : ");
                                harga = scan.nextInt();

                                penjualan.addPenjualan(nama, stok, harga);

                            }
                            if (sub == 2) {

                                System.out.println("Pilih Penjualan Buku: ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Stok : ");
                                    stok = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();

                                    penjualan.updatePenjualan(nama, stok, harga, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Buku : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    penjualan.deletePenjualan(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);

                    }
                    if (utama == 5) {
                        int dl;
                        do {
                            System.out.println("======= Event Bazar Buku =======");
                            event.tampilEventBazar();
                            System.out.println("1. Tambah Event Bazar");
                            System.out.println("2. Edit Event");
                            System.out.println("3. Hapus Event");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String kades, penyelanggara;
                                System.out.printf("Judul : ");
                                description = scan.next();
                                System.out.printf("Tanggal : ");
                                kades = scan.next();
                                System.out.println("Penyelenggara : ");
                                penyelanggara = scan.next();
                                event.addEventBazar(description, pemilik, penyelanggara);
                            }
                            if (sub == 2) {
                                String description, pemilik, penyelanggara;
                                System.out.println("Pilih Event : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Judul : ");
                                    description = scan.next();
                                    System.out.printf("Tanggal : ");
                                    pemilik = scan.next();
                                    System.out.println("Nama  Desa : ");
                                    penyelanggara = scan.next();
                                    event.updateEventBazar(dl - 1, description, pemilik, penyelanggara);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Event : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    event.deleteEventBazar(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);
                    }
                    if (utama == 6) {
                        do {
                            System.out.println("Laporan Keuangan");
                            laporan.tampil();
                            System.out.println("1. Tambah Laporan");
                            System.out.println("2. Edit Laporan");
                            System.out.println("3. Hapus Laporan");
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String isi, tanggal, biaya;
                                System.out.print("Perihal : ");
                                isi = scan.next();
                                System.out.print("Tanggal : ");
                                tanggal = scan.next();
                                System.out.print("Biaya : Rp.");
                                biaya = scan.next();
                                laporan.addLaporan(isi, tanggal, biaya);
                            }
                            if (sub == 2) {
                                int dl;
                                System.out.println("Pilih laporan yang akan diupdate : ");
                                dl = scan.nextInt();
                                String isi, tanggal, biaya;
                                System.out.print("Perihal : ");
                                isi = scan.next();
                                System.out.print("Tanggal : ");
                                tanggal = scan.next();
                                System.out.print("Biaya : Rp.");
                                biaya = scan.next();
                                laporan.updateLaporan(dl - 1, isi, tanggal, biaya);
                            }

                            if (sub == 3) {
                                int dl;
                                System.out.println("Pilih laporan yang akan dihapus : ");
                                dl = scan.nextInt();
                                laporan.deleteLaporan(dl - 1);
                            }
                        } while (sub != 0);

                    }
                    if (utama == 7) {
                        int a;
                        
                        System.out.println("\t======= Laporan ======");
                        System.out.println("1. Daftar Request Pengembalian Buku");
                        System.out.println("2. Daftar Komentar");
                        System.out.println("0. Keluar");
                        a = scan.nextInt();
                        if (a == 1) {
                            System.out.println("\t====== Daftar Request =======");
                            form.tampil();
                        }
                        if (a == 2) {
                            System.out.println("\t====== Daftar Komentar ======");
                            show.tampil();
                        }
                    }
                } while (utama != 0);
            }
            if (awal == 2) {
                auten.loginPembeli();
                do {
                    toko.menuUtamaCustomer();
                    System.out.print("Pilih : ");
                    utama = scan.nextInt();
                    if (utama == 1) {
                        do{
                            for (int i = 0; i < Toko.length; i++) {
                                if (Toko[i].getNamaToko()!= null) {
                                    System.out.printf(i + 1 + ".");
                                    Toko[i].display();
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 2) {
                        do{    
                            System.out.println("\n\t ======= Deskripsi Toko Buku Jaya Sukses ========");
                            for (int i = 0; i < Deskripsi.length; i++) {
                                if (Deskripsi[i].getDescription()!= null) {
                                    System.out.println(i + 1 + ".");
                                    Deskripsi[i].display();
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 3) {
                        do{
                            event.tampilEventBazar();
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 4) {
                        do {
                            System.out.println("\t======== Daftar Buku =======");
                            buku.tampilBuku();
                            System.out.println("\n\t======== Daftar Pemesanan Buku =======");
                            pesan.show();
                            System.out.println("\n");
                            int dl;
                            int jumlah_kamar,jumlah,total,alamat1;
                            String nama1, status, lokasi1 = null;
                            long no_telp;
                            System.out.println("Homestay no : ");
                            dl = scan.nextInt();
                            int pos = dl - 1;

                            for (int i = 0; i < buku.buku.size(); i++) {
                                if (pos == i) {
                                    System.out.println(buku.buku.get(i).nama);
                                    lokasi1 = buku.buku.get(i).nama;
                                }
                            }
                            System.out.print("Nama : ");
                            nama1 = scan.next();
                            System.out.print("No Telepon :");
                            no_telp = scan.nextLong();
                            System.out.print("Jumlah BUku : ");
                            jumlah_kamar = scan.nextInt();
                            for (int i = 0; i < buku.buku.size(); i++) {
                                if (pos == i) {
                                    System.out.println(buku.buku.get(i).nama);
                                    System.out.println("Otneil");
                                    jumlah = buku.buku.get(i).jumlah_buku;
                                    System.out.println(jumlah);
                                    buku.updateBuku(buku.buku.get(dl-1).nama , buku.buku.get(dl-1).jumlah_buku= jumlah, utama = buku.buku.get(dl-1).harga, buku.buku.get(dl-1).tipeBuku.PELAJARAN,  buku.buku.get(dl-1).alamat, dl-1);
                                    
                                }
                            }
                            System.out.print("Total Harga : Rp.");
                            for(int i = 0;i<buku.buku.size();i++){
                                if(pos==i){
                                    total = jumlah_kamar * buku.buku.get(i).harga;
                                    System.out.println(total);
                                }
                            }
                            int asd;
                            System.out.println("Apakah anda yakin memesan ?");
                            System.out.println("1. Ya\n2. Tidak");
                            asd = scan.nextInt();
                            if(asd == 1){
                                pesan.pesanBuku(jumlah_kamar, nama1, no_telp, lokasi1, status = "Proses");
                            }
                            else if(asd == 2){
                                break;
                            }
                            for (int i = 0; i < buku.buku.size(); i++) {
                                if (pos == i) {
                                    if(buku.buku.get(i).jumlah_buku < 0){
                                        System.out.println("Stok Buku Tidak Mencukupi");
                                        pesan.hapusPemesanan(i);
                                    }
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();

                        } while (sub != 0);
                    }
                    if (utama == 5) {
                        String hal, nama;
                        System.out.println("\t======= Pengembalian Buku =======");
                        System.out.print("Alasan : ");
                        hal = scan.next();
                        System.out.print("Nama Buku : ");
                        nama = scan.next();
                        form.addPermohonan(hal, nama);
                    }
                    if (utama == 6) {
                        int dl;
                        do {
                            int stok, harga;
                            String nama;

                            System.out.println("======= Penjualan =======");
                            penjualan.tampilPenjualan();
                            System.out.println("\n");

                            System.out.println("1. Tambah Penjualan");
                            System.out.println("2. Edit Penjualan");
                            System.out.println("3. Hapus Penjualan");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                System.out.printf("Nama : ");
                                nama = scan.next();
                                System.out.printf("Stok : ");
                                stok = scan.nextInt();
                                System.out.printf("Harga : ");
                                harga = scan.nextInt();

                                penjualan.addPenjualan(nama, stok, harga);

                            }
                            if (sub == 2) {

                                System.out.println("Pilih Penjualan : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Stok : ");
                                    stok = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();

                                    penjualan.updatePenjualan(nama, stok, harga, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Penjualan : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    penjualan.deletePenjualan(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);

                    }
                    if (utama == 7) {
                        do{
                            System.out.println("Pengambalian Buku ");
                            form.tampil();
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub!=0);
                    }
                    if (utama == 8) {
                        String koment;
                        System.out.println("\t========== Berikan Penilaina Anda  ==========");
                        System.out.print("Masukkan Penilaian Anda : ");
                        koment = scan.next();
                        komen.addKomentar(koment);
                    }
                } while (utama != 0);
            }
        } while (awal != 0);
    }
    public void menuLogin(){
        System.out.println("|| ========  Selamat datan di Toko Buku Jaya Suskse Silahkan Login ======== ||");
        System.out.println("1. Login Sebagai Admin ");
        System.out.println("2. Login Sebagai Pembeli");
        System.out.println("0. Keluar");
    }
    public void menuUtamaAdmin() {
        System.out.println("========= Selamat Datang Admin Baen hamu na denggan tu Customer ==========");
        System.out.println("\t   ====== ADMIN TOKO BUKU JAYA SUKSES =======");
        System.out.println("1. Profil Toko Buku Jaya Sukses");
        System.out.println("2. Penjualan Buku");
        System.out.println("3. Buat Event Bazar");
        System.out.println("4. Kelola Penjualan");
        System.out.println("5. Kelola Event Bazar");
        System.out.println("6. Kelola Laporan Keuangan");
        System.out.println("7. Laporan");
        System.out.println("0. Back");
    }
    
    public void menuUtamaCustomer() {
        System.out.println("========= Selamat Datang Customer kami Buku adalah jendela Dunia ==========");
        System.out.println("1. Profil Toko Buku Jaya Suskes");
        System.out.println("2. Deskripsi Toko");
        System.out.println("3. Informasi Event Bazar Buku");
        System.out.println("4. Pemesanan HomeStay");
        System.out.println("5. Request Surat Permohonan");
        System.out.println("6. Kelola Penjualan");
        System.out.println("7. Laporan Keuangan");
        System.out.println("8. Komentar");
        System.out.println("0. Back");
    }
    
    public void editProfil() {
        System.out.println("\t======== Edit Profil Toko Buku Jaya Sukses =======");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Toko : ");
        namaToko = scan.next();
        System.out.print("Alamat : ");
        alamat = scan.next();
        System.out.print("Pemilik Toko : ");
        pemilik = scan.next();
        System.out.print("Karyawan : ");
        karyawan = scan.next();
        System.out.print("Email : ");
        email = scan.next();
        System.out.print("Nomor Telepon : ");
        no_telp = scan.next();
    }
}