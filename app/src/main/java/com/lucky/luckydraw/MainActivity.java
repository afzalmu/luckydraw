package com.lucky.luckydraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView message;
    Boolean isExists;
    Button b1;
    ArrayList<Integer> array = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        message = (TextView) findViewById(R.id.message);
        b1 = findViewById(R.id.b1);


        array.add(4310196);
        array.add(4323687);
        array.add(4341033);
        array.add(4350214);
        array.add(4360810);
        array.add(4408234);
        array.add(8346208);
        array.add(4101818);
        array.add(4111307);
        array.add(4112149);
        array.add(4340220);
        array.add(5364770);







        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().length() == 0) {
                    input.setError("Please enter a value");
                } else {

                    int numberGuessed = Integer.parseInt(input.getText().toString());


                    if (array.contains(numberGuessed)) {
                        Toast.makeText(MainActivity.this, "Congratulations", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "no match", Toast.LENGTH_SHORT).show();
                    }
                }
//                if(numberString == numberToGuess) {
//                    message.setText("Congratulations");
//                }else if (numberGuessed != numberToGuess){
//                    message.setText("No Match");
//                }
            }
        });


    }


}
