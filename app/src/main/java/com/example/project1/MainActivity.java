package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button utp,ptu,reset;
    EditText ed;
    TextView txt;
    ImageView imageView;

    Float conversionFactor=0.77f;
    Float conversionFactor1=1.35f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=findViewById(R.id.editTextTextPersonName);
        txt=findViewById(R.id.textView);
        imageView=findViewById(R.id.imageView);
        utp=findViewById(R.id.button);
        ptu=findViewById(R.id.button3);
        reset=findViewById(R.id.button2);

       utp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                   int amount= Integer.parseInt(ed.getText().toString());

                   float p = (amount*conversionFactor);
                   txt.setText("The Pounds value of "+amount+" USD is "+p);
                   imageView.setImageResource(R.drawable.pound);


           }
       });
       ptu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {



                  int amount= Integer.parseInt(ed.getText().toString());

                  double usd = (amount*conversionFactor1);

                  txt.setText("The USD value of "+amount+" Pounds is "+usd);
                  imageView.setImageResource(R.drawable.dollar);

           }
       });
       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ed.getText().clear();
               txt.setText(" ");
               imageView.setImageResource(R.drawable.dollar);


           }
       });

    }

}