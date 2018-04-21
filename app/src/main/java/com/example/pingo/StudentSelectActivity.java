package com.example.pingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentSelectActivity extends AppCompatActivity {
    private Button mBoys_hostel, mGirls_hostel, mCollege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_select);

        mBoys_hostel = (Button) findViewById(R.id.boys_hostel);
        mGirls_hostel = (Button) findViewById(R.id.girls_hostel);
        mCollege = (Button) findViewById(R.id.college);

        mBoys_hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentSelectActivity.this, StudentMapsActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mGirls_hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentSelectActivity.this, StudentMapsActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentSelectActivity.this, StudentMapsActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });


    }
}
