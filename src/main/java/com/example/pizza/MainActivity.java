package com.example.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String items[]={"A","B","C","D","E","F","G","H","I","J"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.listview,items);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=(TextView)view;
                Toast.makeText(MainActivity.this,txt.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i);
            }
        });
    }
}
