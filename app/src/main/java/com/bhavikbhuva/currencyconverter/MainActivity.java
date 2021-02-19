package com.bhavikbhuva.currencyconverter;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button euro,dollar,pound,canadiandollar,ugx,ksh,omanRial,yen,australiandollar,btnSCode;
    EditText editText;
    TextView textView,tvcRate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        pound = findViewById(R.id.pound);
        canadiandollar = findViewById(R.id.dollarCanada);
        ugx = findViewById(R.id.ugandaShillings);
        ksh = findViewById(R.id.kenyaShillings);
        omanRial = findViewById(R.id.omanRial);
        yen = findViewById(R.id.yen);
        australiandollar = findViewById(R.id.dollarAustralia);
        tvcRate = findViewById(R.id.tvCurrencyRate);
        btnSCode = findViewById(R.id.btnSCode);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        tvcRate.setVisibility(View.GONE);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Error");
                } else
                {
                    double n,k;
                    n = Double.parseDouble(Z);
                    textView.setText(null);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 0.013 $");

                    k = n * 0.012;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k) + " $" );


                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Error");
                }
                else
                {

                    double n,k;
                    textView.setText(null);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 0.013 $");
                    n = Double.parseDouble(Z);
                    k = n * 0.013;
                    DecimalFormat numberFormatter = new DecimalFormat("#.00");
                    textView.setText(""+numberFormatter.format(k));
                }

            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();
                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("invalid Input");
                }
                else
                {
                    Double n,k;
                    textView.setText(null);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 0.010 £");
                    n = Double.parseDouble(Z);
                    k = n*0.010;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText(""+numberformat.format(k));
                }
            }
        });
        canadiandollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Error");
                }
                else
                {
                    double n,k;
                    n = Double.parseDouble(Z);
                    textView.setError(null);
                    textView.setText(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 0.018 CAD $");
                    k = n * 0.018;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }

            }
        });
        ugx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();
                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Input");
                }
                else
                {
                    double n,k;
                    n = Double.parseDouble(Z);
                    textView.setText(null);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 49.05 UGX");
                    k = n * 49.05;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });
        ksh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();
                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Input");
                }
                else
                {
                    Double  n,k;
                    textView.setText(null);
                    n = Double.parseDouble(Z);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 1.45 Ksh");
                    k = n * 1.45;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        omanRial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Input");
                }
                else
                {
                    Double n,k;
                    n = Double.parseDouble(Z);
                    textView.setText(null);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 0.0053 Oman Rial");
                    k = n * 0.0053;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }

            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();
                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Input");
                }
                else
                {
                    Double n,k;
                    n = Double.parseDouble(Z);
                    textView.setText(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 1.42 ¥");
                    k = n * 1.42;
                    textView.setError(null);

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        australiandollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Z = editText.getText().toString();
                if (TextUtils.isEmpty(Z))
                {
                    textView.setError("Invalid Error");
                }
                else
                {
                    Double n,k;
                    n = Double.parseDouble(Z);
                    textView.setText(null);
                    textView.setError(null);
                    tvcRate.setVisibility(View.VISIBLE);
                    tvcRate.setText("1 ₹ = 0.019 $");
                    k = n * 0.019;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        btnSCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SourceCodeActivity.class);
                startActivity(intent);
            }
        });


    }
}

