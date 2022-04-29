package com.amanksinghh.puset;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView mFirst, mSecond, mThird, mFourth, mFifth, mSixth, mSeven, mEight,mFollow,mUpdate,mNotify,mNotification;
    FirebaseAnalytics mFirebaseAnalytics;
    DatabaseReference ref;

    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Please Wait..");
        progressDialog.setMax(100);


        mFirst = findViewById(R.id.first);
        mSecond = findViewById(R.id.second);
        mThird = findViewById(R.id.third);
        mFourth = findViewById(R.id.fourth);
        mFifth = findViewById(R.id.fifth);
        mSixth = findViewById(R.id.sixth);
        mSeven = findViewById(R.id.seven);
        mEight = findViewById(R.id.eight);
        mFollow = findViewById(R.id.insta);
        mUpdate = findViewById(R.id.update);
        mNotify = findViewById(R.id.notify);
        mNotification = findViewById(R.id.notification);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, First.class));
            }
        });


        mSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Second.class));
            }
        });
        mThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Third.class));
            }
        });
        mFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Fourth.class));
            }
        });
        mFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Fifth.class));
            }
        });
        mSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Sixth.class));
            }
        });
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Seventh.class));
            }
        });
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
                startActivity(new Intent(MainActivity.this, Eighth.class));
            }
        });

        mFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.instagram.com/amanksinghh/"));
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });
        mUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref = FirebaseDatabase.getInstance().getReference("Update");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String A = dataSnapshot.child("A").getValue().toString();
                        String B = dataSnapshot.child("B").getValue().toString();
                        mUpdate.setText(A);
                        mNotify.setText(B);
                        mNotify.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String url = mNotify.getText().toString();
                                Intent i = new Intent(Intent.ACTION_VIEW);
                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });
            }
        });


        ref = FirebaseDatabase.getInstance().getReference("Notification");
        ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String A = dataSnapshot.child("A").getValue().toString();
                        mNotification.setText(A);
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                    }
                });


    }
    public void Dialog(){
        progressDialog.show();
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                progressDialog.dismiss();
            }
        }).start();
    }

}