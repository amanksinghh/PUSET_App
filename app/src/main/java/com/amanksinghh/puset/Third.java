package com.amanksinghh.puset;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.amanksinghh.puset.third.FRList;
import com.amanksinghh.puset.third.ThirdCOA;
import com.amanksinghh.puset.third.ThirdDBMS;
import com.amanksinghh.puset.third.ThirdDE;
import com.amanksinghh.puset.third.ThirdDM;
import com.amanksinghh.puset.third.ThirdDS;
import com.amanksinghh.puset.third.ThirdITW;
import com.amanksinghh.puset.third.ThirdOOCUML;
import com.amanksinghh.puset.third.ThirdOOPC;
import com.amanksinghh.puset.third.ThirdPCS;
import com.amanksinghh.puset.timetable.ThirdSem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Third extends AppCompatActivity {

    TextView sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,tt;
    DatabaseReference ref;
    FirebaseAuth mAuth;
    Button btn;
    FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        sub1 = findViewById(R.id.sub1);
        sub2 = findViewById(R.id.sub2);
        sub3 = findViewById(R.id.sub3);
        sub4 = findViewById(R.id.sub4);
        sub5 = findViewById(R.id.sub5);
        sub6 = findViewById(R.id.sub6);
        sub7 = findViewById(R.id.su7);
        sub8 = findViewById(R.id.sub8);
        sub9 = findViewById(R.id.su9);
        tt = findViewById(R.id.thirdTT);
        btn = findViewById(R.id.btnFRThird);
        mAuth = FirebaseAuth.getInstance();

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdDBMS.class));
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdCOA.class));
            }
        });


        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdDS.class));
            }
        });


        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdOOPC.class));
            }
        });


        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdDM.class));
            }
        });

        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdITW.class));

            }
        });

        sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdPCS.class));
            }
        });

        sub8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdDE.class));
            }
        });

        sub9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdOOCUML.class));
            }
        });


        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Third.this , ThirdSem.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Third.this, "Scroll Down!", Toast.LENGTH_SHORT).show();
                FRList firstFragment = new FRList();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll1,firstFragment);
                transaction.commit();
            }
        });



    }
    }
