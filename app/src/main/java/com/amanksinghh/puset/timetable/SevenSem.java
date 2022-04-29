package com.amanksinghh.puset.timetable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.amanksinghh.puset.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class SevenSem extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7;
    Button m1,m2,m3,m4,m5,m6,m7;
    StorageReference ref1,ref2,ref3,ref4,ref5,ref6,ref7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_sem);

        img1 = (ImageView) findViewById(R.id.imgB1);
        img2 = (ImageView) findViewById(R.id.imgB2);
        img3 = (ImageView) findViewById(R.id.imgB3);
        img4 = (ImageView) findViewById(R.id.imgB4);
        img5 = (ImageView) findViewById(R.id.imgB5);
        img6 = (ImageView) findViewById(R.id.imgB6);
        img7 = (ImageView) findViewById(R.id.imgB7);

        m1 = findViewById(R.id.btnB1);
        m2 = findViewById(R.id.btnB2);
        m3 = findViewById(R.id.btnB3);
        m4 = findViewById(R.id.btnB4);
        m5 = findViewById(R.id.btnB5);
        m6 = findViewById(R.id.btnB6);
        m7 = findViewById(R.id.btnB7);

        ref1 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB1.jpg");
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref1.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB1)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref2 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB2.jpg");
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref2.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB2)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref3 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB3.jpg");
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref3.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB3)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref4 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB4.jpg");
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref4.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB4)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref5 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB5.jpg");
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref5.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB5)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref6 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB6.jpg");
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref6.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB6)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref7 = FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/SevenSem_TimeTable").child("SevenB7.jpg");
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref7.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB7)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(SevenSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}