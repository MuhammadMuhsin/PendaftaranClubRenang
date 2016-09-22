package id.sch.smktelkom_mlg.tugas01.xiirpl4022.pendaftaranclubrenang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    }
}


