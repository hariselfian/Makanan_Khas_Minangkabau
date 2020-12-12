package com.hariselfian.submission_fundamental;

import java.util.ArrayList;

public class DataMakanan {
    private static String[] namaMakanan = {
            "Nasi Kapau",
            "Kalio Baluik",
            "Lamang Tapai",
            "Lompong Sagu",
            "Gulai Itiak",
            "Bubur Kampiun",
            "Sala Lauak",
            "Palai Rinuak",
            "Dendeng Balado",
            "Sate Padang"
    };

    private static String[] detailMakanan = {
            "Nasi Kapau adalah nasi, sambal dan beberapa jenis lauk pauk khas Kapau, beberapa lauk yang biasanya disajikan dengan nasi kapau adalah gulai tunjang atau urat kaki sapi atau kaki kerbau, gulai tulang daging sapi atau daging kerbau dan juga gulai bebek. Selain lauk juga biasanya disajikan dengan sayur nangka.",
            "Kuliner yang satu ini juga memiliki tekstur yang lengket dan basah dan beraroma seperti karamel, sementara rendang cenderung lebih kering dengan tekstur yang kasar dan aroma rempah yang khas. Biasanya kuliner ini bisa Anda dapatkan di beberapa rumah makan padang di luar Sumater Barat",
            "Makanan khas minangkabau yang lezat berikutnya adalah jajanan ini, Lamang Tapai adalah jenis jajanan yang legit berasal dari Sumatera Barat dengan berbahan dasar ketan. Beras ketan yang dimasak dengan santan kelapa dam bambu mudah yang kemudian dibakar di atas bara api, membuat ciri khas rasanya sangat unik dan enak, jajanan yang satu ini biasanya disajikan dengan tape ketan hitam.",
            "Selama ini mungkin olahan sagu sangat mudah kita nikmati di wilayah indonesia timur, namun di wilayah Indonesia barat juga kita bisa menyantap olahan sagu yang lezat ini. Lempon sagu adalah kue yang lezat berbahan dasar sagu, dengan campurang pisang gepok, gula merah dan kelapa parut.",
            "Jika selama ini Anda sering mengkonsumsi gulai dalam bentuk ayam, atau sapi di minangkabau Anda bisa menyantap gulai dari olahan bebek, gulai bebek ini menggunakan bebek yang usianya sekitar 6 bulan sehingga teksturnya sangat empuk dan lembut sangat nikmat untuk dikonsumsi.",
            "Bubur kampiun adalah makanan khas Bukittinggi yang terbuat dari campuran ketan putih dan bubut sumsum, bubur ketan hitam, bubur kacang hijau, bubur candil dan kolak pisang atau juga ubi, semua bahan di kukus dan disajikan menjadi satu, bisa dibayangkan kenikmatannya.",
            "Makanan khas minangkabau berikutnya yang enak adalah Sala Lauak kuliner ini berbahan dasar bakso, bakso yang biasanya disajikan dengan cara dikukus atau direbus, kali ini bakso disajikan dengan cara digoreng. Berbahan daging ikanyang dihaluskan yang kemudian dicampur dengan adonan tepung yang kemudian di goreng kering.",
            "Kuliner pepes ikan ini tidak bisa ditolah kelezatannya, bagi Anda yang sedang berada di daerah minangkabau, jangan sampai melewati kuliner lezat yang satu ini. Kuleriner ini berbahan dasar ikan riunak yang bentuknya seperti ikan teri dan memang banyak didapatkan di Danau Maninjau.",
            "Siapa yang tidak tergoda dengan kelezatan dendeng, dan siapa juga yang tidak mengenal kelezatan bumbu balado? Lalu bagaimana jika daging dendeng diolah dengan bumbu balado. Inilah salah satu makanan khas di Minangkabau yang enak, dendeng balado ini diolah dengan berbagai bumbu dan rempah pilhan seperti bawang merah, cabai merah, dan lainnya.",
            "Sate padang adalah salah satu kuliner sate yang wajib Anda santap saat berada di sumatera barat, sate padang memang berbeda dari segi bumbunya karena jika biasanya sate menggunakan bumbu kacang dan kecap, sate padang menggunakan bumbu kuah kaldu dengan berbagai macam rempah sehingga menjadikan tekstur bumbu yang kental dan berwarna coklat cerah, dengan berbagai rempah yang digunakan membuat rasa bumbu sate ini sangat berbeda dan menjadi khas sate padang.",
    };

    private static String[] hargaMakanan = {
            "Rp. 20.000 - 25.000/Porsi",
            "Rp. 17.000 - 25.000/Porsi",
            "Rp. 5.000 - 15.000/Porsi",
            "Rp. 3.000 - 7.000/Porsi",
            "Rp. 15.000 - 21.000/Porsi",
            "Rp. 12.000 - 18.000/Porsi",
            "Rp. 500 - 1.000/buah",
            "Rp. 12.000 - 15.000/Porsi",
            "Rp. 10.000 - 17.000/Porsi",
            "Rp. 10.000 - 20.000/Porsi",
    };

    private static int[] gambarMakanan = {
            R.drawable.sate_klopo,
            R.drawable.sate_lisidu,
            R.drawable.sate_karak,
            R.drawable.sego_sambel,
            R.drawable.lontong_kupang,
            R.drawable.lontong_balap,
            R.drawable.rujak_cingur,
            R.drawable.tahu_tek,
            R.drawable.nasi_goreng_jnck,
            R.drawable.mie_akherat
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNama_makanan(namaMakanan[position]);
            makanan.setDetail_makanan(detailMakanan[position]);
            makanan.setPhoto(gambarMakanan[position]);
            makanan.setHarga(hargaMakanan[position]);
            list.add(makanan);
        }
        return list;
    }
}