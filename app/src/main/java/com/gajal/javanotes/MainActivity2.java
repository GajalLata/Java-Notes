package com.gajal.javanotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    String[] topics={"1. Introduction","2. Concept of JRE, JVM, JRE","3. How JAVA works",
            "4. Basic Structure of JAVA","5. Variables and Types of Variables","6. Data Types","7. Keywords and Literals",
            "8. Getting User from Input","9. Strings and its methods" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView =findViewById(R.id.lv);
        // use array adapter which is used to place data into view
        //arrayadapter takes main activity, NDROID LAYOUT, DATA
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity2.this, android.R.layout.simple_dropdown_item_1line,topics);
        listView.setAdapter(adapter);
        //click on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {


                if (position == 0) {
                    Intent intent = new Intent(MainActivity2.this, zero.class);

                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(MainActivity2.this, one.class);
                    startActivity(intent);

                } else if (position == 2) {
                    Intent intent = new Intent(MainActivity2.this, two.class);
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(MainActivity2.this, three.class);
                    startActivity(intent);

                } else if (position == 4) {
                    Intent intent = new Intent(MainActivity2.this, four.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(MainActivity2.this, five.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(MainActivity2.this, six.class);

                    startActivity(intent);

                }
                if (position == 7) {
                    Intent intent = new Intent(MainActivity2.this, seven.class);

                    startActivity(intent);

                }


                if (position == 8) {
                    Intent intent = new Intent(MainActivity2.this, eight.class);

                    startActivity(intent);

                }
                if (position == 9) {
                    Intent intent = new Intent(MainActivity2.this, nine.class);

                    startActivity(intent);

                }
                if (position == 10) {
                    Intent intent = new Intent(MainActivity2.this, ten.class);

                    startActivity(intent);

                }
                else if (position == 11) {
                    Intent intent = new Intent(MainActivity2.this, eleven.class);

                    startActivity(intent);

                }

            }
        });

            }
}