package com.example.testchat.Adapters;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testchat.R;
import com.example.testchat.Services.DatabaseHelper;

import java.util.ArrayList;

public class list_viewActivity extends AppCompatActivity {
    ListView lv;
    ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        list= new ArrayList();
        DatabaseHelper dbhelper = new DatabaseHelper(this);
        lv = findViewById(R.id.list2);

        Cursor c = dbhelper.getInfo();
        c.moveToFirst();

        while (c.moveToNext()){
            list.add(c.getString(0)+"kg"+" " +c.getString(1) + " "  + c.getString(2)+"mn" +" " + c.getString(3)+"m");

        }
        // System.out.println("PPPPPPPPPPPPP"+list.size());

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);

    }
}

