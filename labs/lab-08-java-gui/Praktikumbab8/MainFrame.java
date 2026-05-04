import java.awt.*;
import java.awt.event.*;

abstract class MataKuliah {
    protected String nama;

    public MataKuliah(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungNilai(double uts, double uas, double tugas, double kuis);
}

// UTS 35% UAS 25% TUGAS 25% KUIS 15%
class ASD extends MataKuliah {
    public ASD() {
        super("ASD");
    }

    @Override
    public double hitungNilai(double uts, double uas, double tugas, double kuis) {
        return (uts * 0.35) + (uas * 0.25) + (tugas * 0.25) + (kuis * 0.15);
    }
}

class Pemlan extends MataKuliah {
    public Pemlan() {
        super("Pemlan");
    }

    @Override
    public double hitungNilai(double uts, double uas, double tugas, double kuis) {
        return (uts * 0.35) + (uas * 0.25) + (tugas * 0.25) + (kuis * 0.15);
    }
}

class Matkomlan extends MataKuliah {
    public Matkomlan() {
        super("Matkomlan");
    }

    @Override
    public double hitungNilai(double uts, double uas, double tugas, double kuis) {
        return (uts * 0.35) + (uas * 0.25) + (tugas * 0.25) + (kuis * 0.15);
    }
}

class Probstat extends MataKuliah {
    public Probstat() {
        super("Probstat");
    }

    @Override
    public double hitungNilai(double uts, double uas, double tugas, double kuis) {
        return (uts * 0.35) + (uas * 0.25) + (tugas * 0.25) + (kuis * 0.15);
    }
}

public class MainFrame extends Frame {
    private Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    private CheckboxGroup bg;
    private TextField txtTugas, txtKuis, txtUts, txtUas, txtHasil;
    private TextArea txtAreaRekap;
    private Button btnHitung, btnTampilkan;
    private StringBuilder dataRekap = new StringBuilder("HASIL NILAI SEMUA MATA KULIAH\n\n");

    public MainFrame() {
        setTitle("Hitung Nilai Akhir");
        setSize(400, 650);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        Label lblHeader = new Label("Hitung Nilai Akhir", Label.CENTER);
        lblHeader.setFont(new Font("Arial", Font.BOLD, 16));

        Panel pnlRadio = new Panel(new FlowLayout());
        bg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", bg, false);
        cbPemlan = new Checkbox("Pemlan", bg, true);
        cbMatkomlan = new Checkbox("Matkomlan", bg, false);
        cbProbstat = new Checkbox("Probstat", bg, false);
        pnlRadio.add(cbASD);
        pnlRadio.add(cbPemlan);
        pnlRadio.add(cbMatkomlan);
        pnlRadio.add(cbProbstat);

        Panel pnlInput = new Panel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        txtTugas = new TextField(12);
        txtKuis = new TextField(12);
        txtUts = new TextField(12);
        txtUas = new TextField(12);
        txtHasil = new TextField(12);
        txtHasil.setEditable(false);

        addRow(pnlInput, "Tugas :", txtTugas, gbc, 0);
        addRow(pnlInput, "Kuis :", txtKuis, gbc, 1);
        addRow(pnlInput, "UTS :", txtUts, gbc, 2);
        addRow(pnlInput, "UAS :", txtUas, gbc, 3);
        addRow(pnlInput, "Hasil :", txtHasil, gbc, 4);

        btnHitung = new Button("Hitung");
        txtAreaRekap = new TextArea(10, 35);
        txtAreaRekap.setEditable(false);
        btnTampilkan = new Button("Tampilkan nilai semua matkul");

        add(lblHeader);
        add(pnlRadio);
        add(pnlInput);
        add(btnHitung);
        add(txtAreaRekap);
        add(btnTampilkan);

        ActionListener resetAction = e -> {
            txtTugas.setText("");
            txtKuis.setText("");
            txtUts.setText("");
            txtUas.setText("");
            txtHasil.setText("");
        };

        cbASD.addItemListener(e -> resetAction.actionPerformed(null));
        cbPemlan.addItemListener(e -> resetAction.actionPerformed(null));
        cbMatkomlan.addItemListener(e -> resetAction.actionPerformed(null));
        cbProbstat.addItemListener(e -> resetAction.actionPerformed(null));

        btnHitung.addActionListener(e -> {
            try {
                double tgs = Double.parseDouble(txtTugas.getText());
                double kuis = Double.parseDouble(txtKuis.getText());
                double uts = Double.parseDouble(txtUts.getText());
                double uas = Double.parseDouble(txtUas.getText());

                MataKuliah mk;
                Checkbox selected = bg.getSelectedCheckbox();
                if (selected == cbASD)
                    mk = new ASD();
                else if (selected == cbPemlan)
                    mk = new Pemlan();
                else if (selected == cbMatkomlan)
                    mk = new Matkomlan();
                else
                    mk = new Probstat();

                double hasil = mk.hitungNilai(uts, uas, tgs, kuis);
                txtHasil.setText(String.valueOf(hasil));
                dataRekap.append(String.format("%-15s : %.1f\n", mk.getNama(), hasil));
            } catch (Exception ex) {

                Dialog d = new Dialog(this, "Alert", true);
                d.setLayout(new FlowLayout());
                d.add(new Label("Input tidak valid!"));
                Button ok = new Button("OK");
                ok.addActionListener(ev -> d.dispose());
                d.add(ok);
                d.setSize(150, 100);
                d.setLocationRelativeTo(this);
                d.setVisible(true);
            }
        });

        btnTampilkan.addActionListener(e -> txtAreaRekap.setText(dataRekap.toString()));

        setVisible(true);
    }

    private void addRow(Panel p, String l, TextField f, GridBagConstraints c, int y) {
        c.gridx = 0;
        c.gridy = y;
        p.add(new Label(l), c);
        c.gridx = 1;
        p.add(f, c);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}