/* 12180020 */
package com.dhnnys.testtws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText InputWord;
    private Button btnSubmit;
    private TextView OutputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputWord=findViewById(R.id.InputWord);
        btnSubmit=findViewById(R.id.btnSubmit);
        OutputText=findViewById(R.id.OuputText);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String InTxt=InputWord.getText().toString();

                OutputText.setText(InTxt);

            }
        });


    }


}