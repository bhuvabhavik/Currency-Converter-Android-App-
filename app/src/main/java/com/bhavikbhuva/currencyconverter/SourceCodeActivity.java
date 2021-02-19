package com.bhavikbhuva.currencyconverter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SourceCodeActivity extends AppCompatActivity {

    TextView textView,tvCodeXml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);

        textView = findViewById(R.id.tvCode);
        tvCodeXml = findViewById(R.id.tvCodeXml);


        textView.setText("package com.bhavikbhuva.currencyconverter;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.text.TextUtils;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.TextView;\n" +
                "import java.text.DecimalFormat;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    Button euro,dollar,pound,canadiandollar,ugx,ksh,omanRial,yen,australiandollar,btnSCode;\n" +
                "    EditText editText;\n" +
                "    TextView textView,tvcRate;\n" +
                "\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        euro = findViewById(R.id.euro);\n" +
                "        dollar = findViewById(R.id.dollar);\n" +
                "        pound = findViewById(R.id.pound);\n" +
                "        canadiandollar = findViewById(R.id.dollarCanada);\n" +
                "        ugx = findViewById(R.id.ugandaShillings);\n" +
                "        ksh = findViewById(R.id.kenyaShillings);\n" +
                "        omanRial = findViewById(R.id.omanRial);\n" +
                "        yen = findViewById(R.id.yen);\n" +
                "        australiandollar = findViewById(R.id.dollarAustralia);\n" +
                "        tvcRate = findViewById(R.id.tvCurrencyRate);\n" +
                "        btnSCode = findViewById(R.id.btnSCode);\n" +
                "        editText = findViewById(R.id.editText);\n" +
                "        textView = findViewById(R.id.textView);\n" +
                "        tvcRate.setVisibility(View.GONE);\n" +
                "               euro.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"Invalid Error\");\n" +
                "                } else\n" +
                "                {\n" +
                "                    double n,k;\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setText(null);\n" +
                "                    textView.setError(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 0.013 $\");\n" +
                "\n" +
                "                    k = n * 0.012;\n" +
                "                    DecimalFormat numberFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\" + numberFormat.format(k));\n" +
                "\n" +
                "\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        dollar.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "             String Z = editText.getText().toString();\n" +
                "\n" +
                "             if (TextUtils.isEmpty(Z))\n" +
                "             {\n" +
                "                 textView.setError(\"Invalid Error\");\n" +
                "             }\n" +
                "             else\n" +
                "             {\n" +
                "\n" +
                "                 double n,k;\n" +
                "                 textView.setText(null);\n" +
                "                 textView.setError(null);\n" +
                "                 tvcRate.setVisibility(View.VISIBLE);\n" +
                "                 tvcRate.setText(\"1 ₹ = 0.013 $\");\n" +
                "                 n = Double.parseDouble(Z);\n" +
                "                 k = n * 0.013;\n" +
                "                 DecimalFormat numberFormatter = new DecimalFormat(\"#.00\");\n" +
                "                 textView.setText(\"\"+numberFormatter.format(k));\n" +
                "             }\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "        pound.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"invalid Input\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    Double n,k;\n" +
                "                    textView.setText(null);\n" +
                "                    textView.setError(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 0.010 £\");\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    k = n*0.010;\n" +
                "                    DecimalFormat numberformat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+numberformat.format(k));\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "        canadiandollar.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"Invalid Error\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    double n,k;\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setError(null);\n" +
                "                    textView.setText(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 0.018 CAD $\");\n" +
                "                    k = n * 0.018;\n" +
                "                    DecimalFormat decimalFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+decimalFormat.format(k));\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "        ugx.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"Invalid Input\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    double n,k;\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setText(null);\n" +
                "                    textView.setError(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 49.05 UGX\");\n" +
                "                    k = n* 49.05;\n" +
                "                    DecimalFormat decimalFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+ decimalFormat.format(k));\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "        ksh.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"Invalid Input\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    Double  n,k;\n" +
                "                    textView.setText(null);\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setError(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 1.45 Ksh\");\n" +
                "                    k = n * 1.45;\n" +
                "                    DecimalFormat decimalFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+decimalFormat.format(k));\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "        omanRial.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                   textView.setError(\"Invalid Input\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    Double n,k;\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setText(null);\n" +
                "                    textView.setError(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 0.0053 Oman Rial\");\n" +
                "                    k = n * 0.0053;\n" +
                "\n" +
                "                    DecimalFormat decimalFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+ decimalFormat.format(k));\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "        yen.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"Invalid Input\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    Double n,k;\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setText(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 1.42 ¥\");\n" +
                "                    k = n * 1.42;\n" +
                "                    textView.setError(null);\n" +
                "\n" +
                "                    DecimalFormat decimalFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+decimalFormat.format(k));\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        australiandollar.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                String Z = editText.getText().toString();\n" +
                "                if (TextUtils.isEmpty(Z))\n" +
                "                {\n" +
                "                    textView.setError(\"Invalid Error\");\n" +
                "                }\n" +
                "                else\n" +
                "                {\n" +
                "                    Double n,k;\n" +
                "                    n = Double.parseDouble(Z);\n" +
                "                    textView.setText(null);\n" +
                "                    textView.setError(null);\n" +
                "                    tvcRate.setVisibility(View.VISIBLE);\n" +
                "                    tvcRate.setText(\"1 ₹ = 0.019 $\");\n" +
                "                    k = n * 0.019;\n" +
                "\n" +
                "                    DecimalFormat decimalFormat = new DecimalFormat(\"#.00\");\n" +
                "                    textView.setText(\"\"+decimalFormat.format(k));\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "        btnSCode.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                Intent intent = new Intent(MainActivity.this,SourceCodeActivity.class);\n" +
                "                startActivity(intent);\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}");


        tvCodeXml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<ScrollView xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#2C3335\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/textView\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginHorizontal=\"16dp\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:height=\"100dp\"\n" +
                "            android:background=\"#333945\"\n" +
                "            android:text=\"0.00\"\n" +
                "            android:paddingTop=\"20dp\"\n" +
                "            android:textAlignment=\"center\"\n" +
                "            android:textColor=\"#FFF\"\n" +
                "            android:textSize=\"45sp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editText\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"54dp\"\n" +
                "        android:layout_marginHorizontal=\"16dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:height=\"75dp\"\n" +
                "        android:background=\"#BB586776\"\n" +
                "        android:ems=\"10\"\n" +
                "        android:hint=\"Enter INR\"\n" +
                "        android:inputType=\"number\"\n" +
                "        android:text=\"\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textColor=\"#FFF\"\n" +
                "        android:textColorHint=\"#AfFFFFFF\"\n" +
                "\n" +
                "        android:textSize=\"36sp\"\n" +
                "        android:theme=\"@style/MyEditText\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.542\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/textView2\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/textView\" />\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:id=\"@+id/linearLayout2\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:orientation=\"horizontal\"\n" +
                "        android:weightSum=\"3\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"1.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/linearLayout\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/yen\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:background=\"@drawable/btnstete\"\n" +
                "            android:text=\"¥\"\n" +
                "            android:textColor=\"#7b8788\"\n" +
                "            android:textSize=\"30sp\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/dollarAustralia\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:background=\"@drawable/btnstete\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "\n" +
                "            android:text=\"$ AUd\"\n" +
                "            android:textColor=\"#7b8788\"\n" +
                "            android:textSize=\"30sp\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/dollarCanada\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:background=\"@drawable/btnstete\"\n" +
                "            android:text=\"$ CAD\"\n" +
                "            android:textColor=\"#7b8788\"\n" +
                "            android:textSize=\"30sp\" />\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:id=\"@+id/linearLayout\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:orientation=\"horizontal\"\n" +
                "        android:weightSum=\"3\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"1.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editText\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/dollar\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:background=\"@drawable/btnstete\"\n" +
                "            android:text=\"$\"\n" +
                "            android:textColor=\"#7b8788\"\n" +
                "            android:textSize=\"30sp\"\n" +
                "            tools:ignore=\"ButtonStyle\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/pound\"\n" +
                "\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:background=\"@drawable/btnstete\"\n" +
                "            android:text=\"£\"\n" +
                "            android:textColor=\"#7b8788\"\n" +
                "            android:textSize=\"30sp\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/euro\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:background=\"@drawable/btnstete\"\n" +
                "            android:text=\"€\"\n" +
                "            android:textColor=\"#7b8788\"\n" +
                "            android:textSize=\"30sp\" />\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:id=\"@+id/linearLayout3\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:orientation=\"horizontal\"\n" +
                "        android:weightSum=\"3\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"1.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/linearLayout2\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:orientation=\"horizontal\">\n" +
                "\n" +
                "            <Button\n" +
                "                android:id=\"@+id/omanRial\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"match_parent\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:background=\"@drawable/btnstete\"\n" +
                "                android:text=\"OMAN Rial\"\n" +
                "                android:textColor=\"#7b8788\"\n" +
                "                android:textSize=\"30sp\" />\n" +
                "\n" +
                "            <Button\n" +
                "                android:id=\"@+id/ugandaShillings\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"match_parent\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:background=\"@drawable/btnstete\"\n" +
                "                android:text=\"UGX\"\n" +
                "                android:textColor=\"#7b8788\"\n" +
                "                android:textSize=\"30sp\" />\n" +
                "\n" +
                "            <Button\n" +
                "                android:id=\"@+id/kenyaShillings\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"match_parent\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:background=\"@drawable/btnstete\"\n" +
                "                android:text=\"KSh\"\n" +
                "                android:textAllCaps=\"false\"\n" +
                "                android:textColor=\"#7b8788\"\n" +
                "                android:textSize=\"30sp\" />\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView2\"\n" +
                "        android:layout_width=\"58dp\"\n" +
                "        android:layout_height=\"59dp\"\n" +
                "        android:text=\"₹\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textColor=\"#FFC107\"\n" +
                "        android:textSize=\"46sp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/linearLayout\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/textView\"\n" +
                "        app:layout_constraintVertical_bias=\"0.384\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView3\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"4dp\"\n" +
                "        android:background=\"#333945\"\n" +
                "        android:text=\"2020 @bhavik bhuva\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textAllCaps=\"true\"\n" +
                "        android:textColor=\"#FFF\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/btnSCode\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/tvCurrencyRate\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:textColor=\"#c1c1c1\"\n" +
                "        android:textSize=\"16sp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/editText\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.912\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btnSCode\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginEnd=\"16dp\"\n" +
                "        android:text=\"View Source Code\"\n" +
                "        android:textColor=\"#FFF\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        android:background=\"@drawable/btnstyle\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/linearLayout3\" />\n" +
                "\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n" +
                "</ScrollView>");


    }
}