package Library;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Perpus perpus = new Perpus("Perpustakaan Kampus X");

        Kategori teknologi = new Kategori("Teknologi");
        teknologi.tambahBuku(new Buku("Buku Teknologi 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        teknologi.tambahBuku(new Buku("Buku Teknologi 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        teknologi.tambahBuku(new Buku("Buku Teknologi 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        teknologi.tambahBuku(new Buku("Buku Teknologi 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        teknologi.tambahBuku(new Buku("Buku Teknologi 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        Kategori filsafat = new Kategori("Filsafat");
        filsafat.tambahBuku(new Buku("Buku Filsafat 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        filsafat.tambahBuku(new Buku("Buku Filsafat 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        filsafat.tambahBuku(new Buku("Buku Filsafat 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        filsafat.tambahBuku(new Buku("Buku Filsafat 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        filsafat.tambahBuku(new Buku("Buku Filsafat 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        Kategori sejarah = new Kategori("Sejarah");
        sejarah.tambahBuku(new Buku("Buku Sejarah 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        sejarah.tambahBuku(new Buku("Buku Sejarah 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        sejarah.tambahBuku(new Buku("Buku Sejarah 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        sejarah.tambahBuku(new Buku("Buku Sejarah 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        sejarah.tambahBuku(new Buku("Buku Sejarah 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        Kategori agama = new Kategori("Agama");
        agama.tambahBuku(new Buku("Buku Agama 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        agama.tambahBuku(new Buku("Buku Agama 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        agama.tambahBuku(new Buku("Buku Agama 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        agama.tambahBuku(new Buku("Buku Agama 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        agama.tambahBuku(new Buku("Buku Agama 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        Kategori psikologi = new Kategori("Psikologi");
        psikologi.tambahBuku(new Buku("Buku Psikologi 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        psikologi.tambahBuku(new Buku("Buku Psikologi 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        psikologi.tambahBuku(new Buku("Buku Psikologi 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        psikologi.tambahBuku(new Buku("Buku Psikologi 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        psikologi.tambahBuku(new Buku("Buku Psikologi 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        Kategori politik = new Kategori("Politik");
        politik.tambahBuku(new Buku("Buku Politik 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        politik.tambahBuku(new Buku("Buku Politik 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        politik.tambahBuku(new Buku("Buku Politik 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        politik.tambahBuku(new Buku("Buku Politik 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        politik.tambahBuku(new Buku("Buku Politik 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        Kategori fiksi = new Kategori("Fiksi");
        fiksi.tambahBuku(new Buku("Buku Fiksi 1", 2020, Arrays.asList(new Penulis("Penulis 1"))));
        fiksi.tambahBuku(new Buku("Buku Fiksi 2", 2021, Arrays.asList(new Penulis("Penulis 2"))));
        fiksi.tambahBuku(new Buku("Buku Fiksi 3", 2022, Arrays.asList(new Penulis("Penulis 3"))));
        fiksi.tambahBuku(new Buku("Buku Fiksi 4", 2023, Arrays.asList(new Penulis("Penulis 4"))));
        fiksi.tambahBuku(new Buku("Buku Fiksi 5", 2024, Arrays.asList(new Penulis("Penulis 5"))));

        perpus.tambahKategori(teknologi);
        perpus.tambahKategori(filsafat);
        perpus.tambahKategori(sejarah);
        perpus.tambahKategori(agama);
        perpus.tambahKategori(psikologi);
        perpus.tambahKategori(politik);
        perpus.tambahKategori(fiksi);

        perpus.display();
    }
}