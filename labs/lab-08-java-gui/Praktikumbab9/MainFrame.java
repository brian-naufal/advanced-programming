import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private JTextField txtNama, txtTglLahir, txtNoDaftar, txtTelp, txtEmail;
    private JTextArea txtAlamat;
    private JButton btnSubmit;

    public MainFrame() {
        setTitle("Daftar Ulang");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        txtNama = new JTextField(15);
        txtTglLahir = new JTextField(15);
        txtNoDaftar = new JTextField(15);
        txtTelp = new JTextField(15);
        txtAlamat = new JTextArea(4, 15);
        txtAlamat.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtEmail = new JTextField(15);

        addRow(panel, "Nama Lengkap", txtNama, gbc, 0);
        addRow(panel, "Tanggal Lahir", txtTglLahir, gbc, 1);
        addRow(panel, "Nomor Pendaftaran", txtNoDaftar, gbc, 2);
        addRow(panel, "No. Telp", txtTelp, gbc, 3);
        addRow(panel, "Alamat", new JScrollPane(txtAlamat), gbc, 4);
        addRow(panel, "E-mail", txtEmail, gbc, 5);

        btnSubmit = new JButton("submit");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(btnSubmit, gbc);

        btnSubmit.addActionListener(e -> handleSubmit());

        add(panel);
        setVisible(true);
    }

    private void addRow(JPanel p, String label, Component c, GridBagConstraints g, int row) {
        g.gridy = row;
        g.gridx = 0;
        g.weightx = 0.1;
        p.add(new JLabel(label), g);
        g.gridx = 1;
        g.weightx = 0.9;
        p.add(c, g);
    }

    private void handleSubmit() {
        if (txtNama.getText().isEmpty() || txtTglLahir.getText().isEmpty() ||
                txtNoDaftar.getText().isEmpty() || txtTelp.getText().isEmpty() ||
                txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin data yang Anda isi sudah benar?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            showResultWindow();
        }
    }

    private void showResultWindow() {
        JFrame resultFrame = new JFrame("Data Mahasiswa");
        resultFrame.setSize(400, 350);
        resultFrame.setLocationRelativeTo(this);
        resultFrame.setLayout(new BorderLayout(10, 10));

        JLabel lblTitle = new JLabel("Data Mahasiswa", JLabel.CENTER);
        lblTitle.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText(
                "Nama                : " + txtNama.getText() + "\n" +
                        "Tanggal Lahir       : " + txtTglLahir.getText() + "\n" +
                        "No. Pendaftaran     : " + txtNoDaftar.getText() + "\n" +
                        "No. Telp            : " + txtTelp.getText() + "\n" +
                        "Alamat              : " + txtAlamat.getText() + "\n" +
                        "E-mail              : " + txtEmail.getText());

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 20, 20, 20),
                BorderFactory.createLineBorder(new Color(150, 180, 210), 2)));
        contentPanel.add(area, BorderLayout.CENTER);
        area.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        resultFrame.add(lblTitle, BorderLayout.NORTH);
        resultFrame.add(contentPanel, BorderLayout.CENTER);

        resultFrame.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}