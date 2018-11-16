package com.mobileapps.week1daily4homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class UserInfo extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userinfo);

    }
    public void Click (View view){
        EditText etFirstName;
    etFirstName=findViewById(R.id.etFirstName);
    String FirstNameinput= etFirstName.getText().toString();

    Intent Intent2=new Intent();
    Intent2.putExtra("First Name",FirstNameinput);

    setResult(RESULT_OK,Intent2);
    finish();
    }
}
