package com.zero.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView num=(TextView) findViewById(R.id.numbers);
        TextView phrase=(TextView) findViewById(R.id.phrases);
        TextView fam=(TextView) findViewById(R.id.family);
        TextView col=(TextView) findViewById(R.id.color);


        final Intent numI=new Intent(this,Numbers.class);

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(numI);
            }
        });
        final Intent phrI=new Intent(this,Phrases.class);

        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(phrI);
            }
        });
        final Intent famI=new Intent(this,Famly.class);

        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(famI);
            }
        });
        final Intent colI=new Intent(this,Colors.class);

        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(colI);
            }
        });

    }

}
