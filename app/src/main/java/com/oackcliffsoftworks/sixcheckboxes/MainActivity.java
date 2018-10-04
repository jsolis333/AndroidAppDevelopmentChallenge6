package com.oackcliffsoftworks.sixcheckboxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cH1, cH2, cH3,cH4;
    Button displayButton;
    TextView showResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cH1 = findViewById(R.id.ChBox1);
        cH2 = findViewById(R.id.ChBox2);
        cH3 = findViewById(R.id.ChBox3);
        cH4 = findViewById(R.id.ChBox4);

        displayButton = findViewById(R.id.ButtonDisplay);
        showResults = findViewById(R.id.DispalyResults);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("CheckBox1 check ").append(cH1.isChecked());
                result.append("\nCheckBox2 is check :").append(cH2.isChecked());
                result.append("\nCheckBox3 is chech : ").append(cH3.isChecked());
                result.append("\nCheckBox4 is check : ").append((cH4.isChecked()));

                showResults.setText(result);


            }
        });
    }
}
