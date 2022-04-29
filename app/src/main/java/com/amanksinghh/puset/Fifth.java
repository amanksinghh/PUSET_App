package com.amanksinghh.puset;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.amanksinghh.puset.five.FLAT;
import com.amanksinghh.puset.five.FiveDAA;
import com.amanksinghh.puset.five.FiveDPP;
import com.amanksinghh.puset.five.FiveIOE;
import com.amanksinghh.puset.five.FiveOOPC;
import com.amanksinghh.puset.five.FiveOOPJAVA;
import com.amanksinghh.puset.five.FivePSPE;
import com.amanksinghh.puset.five.FiveSE;
import com.amanksinghh.puset.five.FrList;
import com.amanksinghh.puset.timetable.FifthSem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Fifth extends AppCompatActivity {

    TextView sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,tt;
    DatabaseReference ref;
    FirebaseAuth mAuth;
    FirebaseAnalytics mFirebaseAnalytics;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        sub1 = findViewById(R.id.sub1);
        sub2 = findViewById(R.id.sub2);
        sub3 = findViewById(R.id.sub3);
        sub4 = findViewById(R.id.sub4);
        sub5 = findViewById(R.id.sub5);
        sub6 = findViewById(R.id.sub6);
        sub7 = findViewById(R.id.sub7);
        sub8 = findViewById(R.id.sub9);
        tt = findViewById(R.id.fiveTT);
        btn = findViewById(R.id.FrList);
        mAuth = FirebaseAuth.getInstance();

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FiveDAA.class));
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FiveSE.class));
            }
        });

        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FLAT.class));
            }
        });

        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FiveIOE.class));
            }
        });

        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FiveOOPJAVA.class));
            }
        });

        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FiveDPP.class));
            }
        });

        sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FivePSPE.class));
            }
        });
        sub8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FiveOOPC.class));
            }
        });
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fifth.this , FifthSem.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Fifth.this, "Scroll Down !", Toast.LENGTH_SHORT).show();
                FrList firstFragment = new FrList();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll1,firstFragment);
                transaction.commit();
            }
        });

    }
}