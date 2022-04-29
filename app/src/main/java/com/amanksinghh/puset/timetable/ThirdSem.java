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

public class ThirdSem extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23;
    Button m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23;
    FirebaseStorage storage;
    StorageReference ref1,ref2,ref3,ref4,ref5,ref6,ref7,ref8,ref9,ref10,ref11,ref12,ref13,ref14,ref15,ref16,ref17,ref18,ref19,ref20,ref21,ref22,ref23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_sem);

        img1 = (ImageView) findViewById(R.id.imgB1);
        img2 = (ImageView) findViewById(R.id.imgB2);
        img3 = (ImageView) findViewById(R.id.imgB3);
        img4 = (ImageView) findViewById(R.id.imgB4);
        img5 = (ImageView) findViewById(R.id.imgB5);
        img6 = (ImageView) findViewById(R.id.imgB6);
        img7 = (ImageView) findViewById(R.id.imgB7);
        img8 = (ImageView) findViewById(R.id.imgB8);
        img9 = (ImageView) findViewById(R.id.imgB9);
        img10 = (ImageView) findViewById(R.id.imgB10);
        img11 = (ImageView) findViewById(R.id.imgB11);
        img12 = (ImageView) findViewById(R.id.imgB12);
        img13 = (ImageView) findViewById(R.id.imgB13);
        img14 = (ImageView) findViewById(R.id.imgB14);
        img15 = (ImageView) findViewById(R.id.imgB15);
        img16 = (ImageView) findViewById(R.id.imgB16);
        img17 = (ImageView) findViewById(R.id.imgB17);
        img18 = (ImageView) findViewById(R.id.imgB18);
        img19 = (ImageView) findViewById(R.id.imgB19);
        img20 = (ImageView) findViewById(R.id.imgB20);
        img21 = (ImageView) findViewById(R.id.imgB21);
        img22 = (ImageView) findViewById(R.id.imgB22);
        img23 = (ImageView) findViewById(R.id.imgB23);


        m1 = findViewById(R.id.btnB1);
        m2 = findViewById(R.id.btnB2);
        m3 = findViewById(R.id.btnB3);
        m4 = findViewById(R.id.btnB4);
        m5 = findViewById(R.id.btnB5);
        m6 = findViewById(R.id.btnB6);
        m7 = findViewById(R.id.btnB7);
        m8 = findViewById(R.id.btnB8);
        m9 = findViewById(R.id.btnB9);
        m10 = findViewById(R.id.btnB10);
        m11 = findViewById(R.id.btnB11);
        m12 = findViewById(R.id.btnB12);
        m13 = findViewById(R.id.btnB13);
        m14 = findViewById(R.id.btnB14);
        m15 = findViewById(R.id.btnB15);
        m16 = findViewById(R.id.btnB16);
        m17 = findViewById(R.id.btnB17);
        m18 = findViewById(R.id.btnB18);
        m19 = findViewById(R.id.btnB19);
        m20 = findViewById(R.id.btnB20);
        m21 = findViewById(R.id.btnB21);
        m22 = findViewById(R.id.btnB22);
        m23 = findViewById(R.id.btnB23);

        ref1 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB1.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref2 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB2.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref3 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB3.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref4 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB4.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref5 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB5.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref6 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB6.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref7 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB7.jpg");
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
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref8 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB8.jpg");
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref8.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB8)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref9 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB9.jpg");
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref9.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB9)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref10 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB10.jpg");
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref10.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB10)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref11 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB11.jpg");
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref11.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB11)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref12 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB12.jpg");
        m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref12.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB12)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref13 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB13.jpg");
        m13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref13.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB13)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref14 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB14.jpg");
        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref14.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB14)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ref15 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB15.jpg");
        m15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref15.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB15)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref16 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB16.jpg");
        m16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref16.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB16)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref17 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB17.jpg");
        m17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref17.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB17)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref18 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB18.jpg");
        m18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref18.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB18)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref19 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB19.jpg");
        m19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref19.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB19)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref20 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB20.jpg");
        m20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref20.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB20)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref21 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB21.jpg");
        m21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref21.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB21)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref22 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB22.jpg");
        m22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref22.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB22)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ref23 =FirebaseStorage.getInstance().getReferenceFromUrl("gs://puset-ddf70.appspot.com/ThirdSem_TimeTable").child("ThirdB23.jpg");
        m23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final File file = File.createTempFile("img","jpg");
                    ref23.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

                            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                            ((ImageView) findViewById(R.id.imgB23)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
                            Toast.makeText(ThirdSem.this, "Image Failed to Load", Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}