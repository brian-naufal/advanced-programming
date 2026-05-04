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
    private CheckboxGroup groupMatkul;
    private TextField txtTugas, txtKuis, txtUts, txtUas, txtHasil;
    private TextArea txtAreaRekap;
    private Button btnHitung, btnTampilkan;
    private StringBuilder dataRekap = new StringBuilder("HASIL NILAI SEMUA MATA KULIAH\n\n");

    public MainFrame() {
        setTitle("Hitung Nilai Akhir (AWT Version)");
        setSize(400, 650);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Label lblHeader = new Label("Hitung Nilai Akhir", Label.CENTER);
        lblHeader.setFont(new Font("Arial", Font.BOLD, 16));

        // Radio Buttons (Checkboxes with CheckboxGroup)
        Panel pnlRadio = new Panel(new FlowLayout());
        groupMatkul = new CheckboxGroup();
        cbASD = new Checkbox("ASD", groupMatkul, false);
        cbPemlan = new Checkbox("Pemlan", groupMatkul, true);
        cbMatkomlan = new Checkbox("Matkomlan", groupMatkul, false);
        cbProbstat = new Checkbox("Probstat", groupMatkul, false);
        pnlRadio.add(cbASD);
        pnlRadio.add(cbPemlan);
        pnlRadio.add(cbMatkomlan);
        pnlRadio.add(cbProbstat);

        Panel pnlInput = new Panel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        txtTugas = new TextField(15);
        txtKuis = new TextField(15);
        txtUts = new TextField(15);
        txtUas = new TextField(15);
        txtHasil = new TextField(15);
        txtHasil.setEditable(false);

        addRow(pnlInput, "Tugas :", txtTugas, gbc, 0);
        addRow(pnlInput, "Kuis :", txtKuis, gbc, 1);
        addRow(pnlInput, "UTS :", txtUts, gbc, 2);
        addRow(pnlInput, "UAS :", txtUas, gbc, 3);
        addRow(pnlInput, "Hasil :", txtHasil, gbc, 4);

        btnHitung = new Button("Hitung");
        txtAreaRekap = new TextArea(10, 40);
        txtAreaRekap.setEditable(false);
        btnTampilkan = new Button("Tampilkan nilai semua matkul");

        Panel mainContent = new Panel();
        mainContent.setLayout(new GridLayout(0, 1, 10, 10));

        add(lblHeader);
        add(pnlRadio);
        add(pnlInput);
        add(btnHitung);
        add(txtAreaRekap);
        add(btnTampilkan);

        btnHitung.addActionListener(e -> {
            try {
                double tgs = Double.parseDouble(txtTugas.getText());
                double kuis = Double.parseDouble(txtKuis.getText());
                double uts = Double.parseDouble(txtUts.getText());
                double uas = Double.parseDouble(txtUas.getText());

                MataKuliah mk;
                Checkbox selected = groupMatkul.getSelectedCheckbox();

                if (selected == cbASD)
                    mk = new ASD();
                else if (selected == cbPemlan)
                    mk = new Pemlan();
                else if (selected == cbMatkomlan)
                    mk = new Matkomlan();
                else
                    mk = new Probstat();

                double hasil = mk.hitungNilai(uts, uas, tgs, kuis);
                txtHasil.setText(String.format("%.2f", hasil));
                dataRekap.append(String.format("%-15s : %.1f\n", mk.getNama(), hasil));
            } catch (Exception ex) {
                showSimpleError("Input tidak valid!");
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

    private void showSimpleError(String msg) {
        Dialog d = new Dialog(this, "Error", true);
        d.setLayout(new FlowLayout());
        d.add(new Label(msg));
        Button ok = new Button("OK");
        ok.addActionListener(e -> d.dispose());
        d.add(ok);
        d.setSize(200, 100);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}