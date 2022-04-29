package com.amanksinghh.puset;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.amanksinghh.puset.seven.FRList;
import com.amanksinghh.puset.seven.SevenAI;
import com.amanksinghh.puset.seven.SevenBDA;
import com.amanksinghh.puset.seven.SevenCC;
import com.amanksinghh.puset.seven.SevenCPS;
import com.amanksinghh.puset.seven.SevenDM;
import com.amanksinghh.puset.seven.SevenNS;
import com.amanksinghh.puset.timetable.SevenSem;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Seventh extends AppCompatActivity {

    TextView sub1,sub2,sub3,sub4,sub5,sub6,tt;
    DatabaseReference ref;
    FirebaseAuth mAuth;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        sub1 = findViewById(R.id.sub1);
        sub2 = findViewById(R.id.sub2);
        sub3 = findViewById(R.id.sub3);
        sub4 = findViewById(R.id.sub4);
        sub5 = findViewById(R.id.sub5);
        sub6 = findViewById(R.id.sub6);
        tt = findViewById(R.id.sevenTT);
        btn = findViewById(R.id.btnFRSeven);
        mAuth = FirebaseAuth.getInstance();

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenDM.class));
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenBDA.class));
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenCPS.class));
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenAI.class));
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenNS.class));
            }
        });
        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenCC.class));
            }
        });

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Seventh.this , SevenSem.class));
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Seventh.this, "Scroll Down!", Toast.LENGTH_SHORT).show();
                FRList firstFragment = new FRList();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll1,firstFragment);
                transaction.commit();
            }
        });


    }

}