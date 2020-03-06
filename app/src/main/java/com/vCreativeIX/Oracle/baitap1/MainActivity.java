package com.vCreativeIX.Oracle.baitap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnInput;
    Button btnUpdate;
    ListView SubList;
    EditText subInp;
    ArrayList<String> list;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Define
        btnInput = (Button) findViewById(R.id.btnInput);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        SubList = (ListView) findViewById(R.id.SubView);
        subInp = (EditText) findViewById(R.id.SubInp);
        list = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        //Function_Define
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String SubNames = subInp.getText().toString();
                list.add(SubNames);
                Context context = getApplicationContext();
                CharSequence text = "Đã Nhập!" ;
                int duration = Toast.LENGTH_SHORT ;
                Toast toast = Toast.makeText( context , text , duration );
                toast.show ();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubList.setAdapter(arrayAdapter);
                Context context = getApplicationContext();
                CharSequence text = "Cập nhập thành công!" ;
                int duration = Toast.LENGTH_SHORT ;
                Toast toast = Toast.makeText( context , text , duration );
                toast.show ();
            }
        });
    }
}
