package id.sch.smktelkom_mlg.tugas01.xiirpl4022.pendaftaranclubrenang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etTgl, etBulan, etTahun, etAlamat;
    RadioButton rbL, rbP;
    CheckBox cbB, cbD, cbK, cbP;
    Button bOk;
    Spinner spK;
    TextView tvHasil, tvHasil1, tvHasil2, tvHasil3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spK = (Spinner) findViewById(R.id.spinner);
        cbB = (CheckBox) findViewById(R.id.cbGB);
        cbD = (CheckBox) findViewById(R.id.cbGD);
        cbK = (CheckBox) findViewById(R.id.cbGK);
        cbP = (CheckBox) findViewById(R.id.cbGP);
        rbL = (RadioButton) findViewById(R.id.radioL);
        rbP = (RadioButton) findViewById(R.id.radioP);
        etNama = (EditText) findViewById(R.id.nama);
        etTgl = (EditText) findViewById(R.id.tgl);
        etBulan = (EditText) findViewById(R.id.bulan);
        etTahun = (EditText) findViewById(R.id.tahun);
        etAlamat = (EditText) findViewById(R.id.alamat);
        bOk = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.hasil);
        tvHasil1 = (TextView) findViewById(R.id.hasil1);
        tvHasil2 = (TextView) findViewById(R.id.hasil2);
        tvHasil3 = (TextView) findViewById(R.id.hasil3);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText();
                RadioButton();
                Spinner();
                CheckBox();
            }
        });
    }


    private void RadioButton() {
        String hasil = null;
        if (rbL.isChecked()) {
            hasil = rbL.getText().toString();
        } else if (rbP.isChecked()) {
            hasil = rbP.getText().toString();
        }

        if (hasil == null) {
            tvHasil1.setText("Belum memilih Jenis Kelamin");
        } else {
            tvHasil1.setText("\nJenis Kelamin\n" + hasil);
        }
    }

    private void EditText() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            String alamat = etAlamat.getText().toString();
            int tgl = Integer.parseInt(etTgl.getText().toString());
            int tahun = Integer.parseInt(etTahun.getText().toString());
            int bulan = Integer.parseInt(etBulan.getText().toString());
            if (bulan == 1) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir \n" + tgl + " Januari "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 2) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Februari "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 3) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Maret "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 4) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " April "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 5) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Mei "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 6) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Juni "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 7) {
                tvHasil.setText("Nama \n" + nama + " \n\nTanggal Lahir \n" + tgl + " Juli "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 8) {
                tvHasil.setText("Nama \n" + nama + "\n \nTanggal Lahir\n " + tgl + " Agustus "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 9) {
                tvHasil.setText("Nama \n" + nama + " \n\nTanggal Lahir\n" + tgl + " September "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 10) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n" + tgl + " Oktober "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 11) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n" + tgl + " November "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 12) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n" + tgl + " Desember "
                        + tahun + "\n\nAlamat\n" + alamat);
            }
        }
    }

    private boolean isValid() {
        boolean valid = true;
        String nama = etNama.getText().toString();
        String tgl = etTgl.getText().toString();
        String bulan = etBulan.getText().toString();
        String tahun = etTahun.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (tahun.isEmpty()) {
            etTahun.setError("Tahun Kelahiran belum diisi");
            valid = false;
        } else if (Integer.parseInt(etTahun.getText().toString()) >= 2017) {
            etTahun.setError("Tahun melebihi 2016");
            valid = false;
        } else {
            etTahun.setError(null);
        }

        if (tgl.isEmpty()) {
            etTgl.setError("Tanggal Kelahiran belum diisi");
            valid = false;
        } else if (Integer.parseInt(etTgl.getText().toString()) >= 32) {
            etTgl.setError("Tanggal melebihi 31");
            valid = false;
        } else {
            etTgl.setError(null);
        }

        if (bulan.isEmpty()) {
            etBulan.setError("Bulan Kelahiran belum diisi");
            valid = false;
        } else if (Integer.parseInt(etBulan.getText().toString()) >= 13) {
            etBulan.setError("Bulan melebihi 12");
            valid = false;
        } else {
            etBulan.setError(null);
        }

        if (nama.isEmpty()) {
            etAlamat.setError("Alamat belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etAlamat.setError("Alamat minimal 3 karakter");
            valid = false;
        } else {
            etAlamat.setError(null);
        }

        return valid;
    }

    private void Spinner() {
        tvHasil2.setText("\nKemampuan Berenang Anda \n" + spK.getSelectedItem().toString());
    }

    private void CheckBox() {
        String hasil = "\nGaya yang dikuasai\n";
        int pilih = hasil.length();
        if (cbB.isChecked()) hasil += cbB.getText() + "\n";
        if (cbD.isChecked()) hasil += cbD.getText() + "\n";
        if (cbK.isChecked()) hasil += cbK.getText() + "\n";
        if (cbP.isChecked()) hasil += cbP.getText() + "\n";

        if (hasil.length() == pilih) hasil += "Tidak ada yang dipilih";
        tvHasil3.setText(hasil);
    }
    }



