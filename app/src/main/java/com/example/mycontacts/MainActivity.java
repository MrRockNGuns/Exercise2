package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Mail;
    private DatePicker Date;
    private EditText Phone;
    private EditText Description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Name  = (EditText) findViewById(R.id.etFullname);
       Mail  = (EditText) findViewById(R.id.etEmail);
       Phone  = (EditText) findViewById(R.id.etPhone);
       Description  = (EditText) findViewById(R.id.etDescription);
       Date = (DatePicker) findViewById(R.id.dpCalendar);
    }

    public void Next(View v){
        String name = Name.toString();
        String phone = Mail.toString();
        String email = Phone.toString();
        String desc = Description.toString();
        String date = Date.toString();

        Intent confirmData = new Intent(MainActivity.this, contactDetail.class);
        confirmData.putExtra(getResources().getString(R.string.pName),name);
        //confirmData.putExtra(getResources().getString(R.string.pPhone),phone);
        //confirmData.putExtra(getResources().getString(R.string.pEmail),email);
        //confirmData.putExtra(getResources().getString(R.string.pPhone),desc);
        //confirmData.putExtra(getResources().getString(R.string.pDate),date);
        startActivity(confirmData);

    }
}