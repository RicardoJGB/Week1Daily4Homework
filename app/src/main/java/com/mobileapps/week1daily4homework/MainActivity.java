package com.mobileapps.week1daily4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static int ProfileRequestCode=0;

    TextView tvFullName;
    TextView tvBirthDate;
    TextView tvStreetAddress;
    TextView tvCityStateZip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFullName=findViewById(R.id.FullName);
        tvBirthDate=findViewById(R.id.Birth_Date);
        tvStreetAddress=findViewById(R.id.StreetAddress);
        tvCityStateZip=findViewById(R.id.City_State_Zip);

    }

        public void Click (View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btnStart:
                intent = new Intent(this,UserInfo.class);
                startActivity(intent);
                break;
            case R.id.btnRetrieve:
                intent = new Intent(this,UserInfo.class);
                startActivityForResult(intent,ProfileRequestCode);
                break;

}

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ProfileRequestCode) {
            if (resultCode == RESULT_OK) {
                String FirstNameInput = data.getStringExtra("FirstName");
                String BirthDateInput = data.getStringExtra("Birth Date");

                tvFullName.setText(FirstNameInput);
                tvBirthDate.setText(BirthDateInput);

            }
            if (resultCode == RESULT_CANCELED) {

            }
        }
    }
}
