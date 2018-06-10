package com.example.chasteenredondo.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button enter;
    TextView txt;

    Validator valid = new Validator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editTxt);
        enter = findViewById(R.id.button);
        txt = findViewById(R.id.result);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = input.getText().toString();
                int val = valid.validate(password);

                //Passes only 1 rule listed on Validator class
                if (val == 1){
                    txt.setText("The Strength of the Password is Very Weak!");
                }
                //Passes only 2 rules listed on Validator class
                else if (val == 2){
                    txt.setText("The Strength of the Password is Weak!");
                }
                //passes 3 rules listed on the Validator class
                else if (val == 3){
                    txt.setText("The Strength of the Password is Fair!");
                }
                //passes 4 rules listed on the Validator class
                else if (val == 4){
                    txt.setText("The Strength of the Password is Good!");
                }
                //passes 5 rules listed on the Validator class
                else if (val == 5){
                    txt.setText("The Strength of the Password is Strong!");
                }
            }
        });
    }
}
