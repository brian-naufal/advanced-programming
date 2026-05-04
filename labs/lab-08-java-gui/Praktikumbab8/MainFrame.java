import javax.swing.*;
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

// UTS:35%, UAS:25%, Tugas:25%, Kuis:15%
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

public class MainFrame extends JFrame {
    private JRadioButton rbASD, rbPemlan, rbMatkomlan, rbProbstat;
    private JTextField txtTugas, txtKuis, txtUts, txtUas, txtHasil;
    private JTextArea txtAreaRekap;
    private JButton btnHitung, btnTampilkan;
    private StringBuilder dataRekap = new StringBuilder("HASIL NILAI SEMUA MATA KULIAH\n\n");

    public MainFrame() {
        setTitle("Hitung Nilai Akhir");
        setSize(400, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel lblHeader = new JLabel("Hitung Nilai Akhir");
        lblHeader.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblHeader.setFont(new Font("Arial", Font.BOLD, 16));
        lblHeader.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));

        JPanel pnlRadio = new JPanel(new FlowLayout());
        rbASD = new JRadioButton("ASD");
        rbPemlan = new JRadioButton("Pemlan", true);
        rbMatkomlan = new JRadioButton("Matkomlan");
        rbProbstat = new JRadioButton("Probstat");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbASD);
        bg.add(rbPemlan);
        bg.add(rbMatkomlan);
        bg.add(rbProbstat);
        pnlRadio.add(rbASD);
        pnlRadio.add(rbPemlan);
        pnlRadio.add(rbMatkomlan);
        pnlRadio.add(rbProbstat);

        JPanel pnlInput = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        txtTugas = new JTextField(12);
        txtKuis = new JTextField(12);
        txtUts = new JTextField(12);
        txtUas = new JTextField(12);
        txtHasil = new JTextField(12);
        txtHasil.setEditable(false);

        addRow(pnlInput, "Tugas :", txtTugas, gbc, 0);
        addRow(pnlInput, "Kuis :", txtKuis, gbc, 1);
        addRow(pnlInput, "UTS :", txtUts, gbc, 2);
        addRow(pnlInput, "UAS :", txtUas, gbc, 3);
        addRow(pnlInput, "Hasil :", txtHasil, gbc, 4);

        btnHitung = new JButton("Hitung");
        btnHitung.setAlignmentX(Component.CENTER_ALIGNMENT);

        txtAreaRekap = new JTextArea(10, 25);
        txtAreaRekap.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtAreaRekap);

        btnTampilkan = new JButton("Tampilkan nilai semua matkul");
        btnTampilkan.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(lblHeader);
        add(pnlRadio);
        add(pnlInput);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(btnHitung);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(scroll);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(btnTampilkan);
        add(Box.createRigidArea(new Dimension(0, 20)));

        ActionListener resetAction = e -> {
            txtTugas.setText("");
            txtKuis.setText("");
            txtUts.setText("");
            txtUas.setText("");
            txtHasil.setText("");
        };
        rbASD.addActionListener(resetAction);
        rbPemlan.addActionListener(resetAction);
        rbMatkomlan.addActionListener(resetAction);
        rbProbstat.addActionListener(resetAction);

        btnHitung.addActionListener(e -> {
            try {
                double tgs = Double.parseDouble(txtTugas.getText());
                double kuis = Double.parseDouble(txtKuis.getText());
                double uts = Double.parseDouble(txtUts.getText());
                double uas = Double.parseDouble(txtUas.getText());

                MataKuliah mk;
                if (rbASD.isSelected())
                    mk = new ASD();
                else if (rbPemlan.isSelected())
                    mk = new Pemlan();
                else if (rbMatkomlan.isSelected())
                    mk = new Matkomlan();
                else
                    mk = new Probstat();

                double hasil = mk.hitungNilai(uts, uas, tgs, kuis);
                txtHasil.setText(String.valueOf(hasil));
                dataRekap.append(String.format("%-15s : %.1f\n", mk.getNama(), hasil));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid!");
            }
        });

        btnTampilkan.addActionListener(e -> txtAreaRekap.setText(dataRekap.toString()));

        setVisible(true);
    }

    private void addRow(JPanel p, String l, JTextField f, GridBagConstraints c, int y) {
        c.gridx = 0;
        c.gridy = y;
        p.add(new JLabel(l), c);
        c.gridx = 1;
        p.add(f, c);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}