package com.example.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Spinner spin;
    String items[]={"A","B","C","D","E","F","G","H","I","J"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        spin=(Spinner)findViewById(R.id.spin);
        ArrayAdapter adapter=new ArrayAdapter(Activity2.this,R.layout.list2,items);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=((TextView)view);
                Toast.makeText(Activity2.this,txt.getText().toString(),Toast.LENGTH_SHORT).show();
                switch(position)
                {
                    case 0:
                        Toast.makeText(Activity2.this,"First",Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(Activity2.this, Activity3.class);
                        startActivity(a);
                        break;
                    case 1:
                        Toast.makeText(Activity2.this,"Second",Toast.LENGTH_SHORT).show();
                        Intent b = new Intent(Activity2.this, Activity3.class);
                        startActivity(b);
                        break;
                    case 2:
                        Toast.makeText(Activity2.this,"Third",Toast.LENGTH_SHORT).show();

                        Intent c = new Intent(Activity2.this, Activity3.class);
                        startActivity(c);
                        break;
                    case 3:
                        Toast.makeText(Activity2.this,"Fourth",Toast.LENGTH_SHORT).show();
                        Intent d = new Intent(Activity2.this, Activity3.class);
                        startActivity(d);
                        break;
                    case 4:
                        Toast.makeText(Activity2.this,"Fifth",Toast.LENGTH_SHORT).show();
                        Intent e = new Intent(Activity2.this, Activity3.class);
                        startActivity(e);
                        break;
                    case 5:
                        Toast.makeText(Activity2.this,"Sixth",Toast.LENGTH_SHORT).show();
                        Intent f = new Intent(Activity2.this, Activity3.class);
                        startActivity(f);
                        break;
                    case 6:
                        Toast.makeText(Activity2.this,"Seventh",Toast.LENGTH_SHORT).show();
                        Intent g = new Intent(Activity2.this, Activity3.class);
                        startActivity(g);
                        break;
                    case 7:
                        Toast.makeText(Activity2.this,"Eighth",Toast.LENGTH_SHORT).show();

                        Intent h = new Intent(Activity2.this, Activity3.class);
                        startActivity(h);
                        break;
                    case 8:
                        Toast.makeText(Activity2.this,"Ninth",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Activity2.this, Activity3.class);
                        startActivity(i);
                        break;
                    case 9:
                        Toast.makeText(Activity2.this,"Tenth",Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(Activity2.this, Activity3.class);
                        startActivity(j);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
