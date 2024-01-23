package com.aniket.userdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.aniket.userdemo.model.Userdata;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.recyclerViewparent);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        Bitmap avatarBitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.gr1);
        Bitmap avatarBitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.gr2);
        Bitmap avatarBitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.gr3);
        Bitmap avatarBitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.gr4);
        Bitmap avatarBitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.gr5);
        Bitmap avatarBitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.gr6);
        Bitmap avatarBitmap7= BitmapFactory.decodeResource(getResources(), R.drawable.gr7);
        Bitmap avatarBitmap8 = BitmapFactory.decodeResource(getResources(), R.drawable.gradient);



//        Userdata[] myListData = new Userdata[] {
//               Userdata userdata1= new Userdata(12000,"HHK","Border",avatarBitmap1);
//        Userdata userdata2= new Userdata(12000,"HHK","Border",avatarBitmap3);
//        Userdata userdata3= new Userdata(12000,"HHK","Border",avatarBitmap4);
//        Userdata userdata4= new Userdata(12000,"HHK","Border",avatarBitmap5);
//        Userdata userdata5=new Userdata(12000,"HHK","Border",avatarBitmap1);
//        Userdata userdata6= new Userdata(12000,"HHK","Border",avatarBitmap7);
//        Userdata userdata7= new Userdata(12000,"HHK","Border",avatarBitmap3);
        List<Userdata> myListData = Arrays.asList(
                new Userdata(12000, "HHK", "Border", avatarBitmap1),
                new Userdata(12000, "HHK", "Border", avatarBitmap2),
                new Userdata(12000, "HHK", "Border", avatarBitmap3),
                new Userdata(12000, "HHK", "Border", avatarBitmap4),
                new Userdata(12000, "HHK", "Border", avatarBitmap5),
                new Userdata(12000, "HHK", "Border", avatarBitmap1),
                new Userdata(12000, "HHK", "Border", avatarBitmap7),
                new Userdata(12000, "HHK", "Border", avatarBitmap3)
        );


// Concatenate the two lists
//        List<Userdata> combinedList = new ArrayList<>(existingList);
//        combinedList.addAll(myListData);

//        };
        UserAdapter userAdapter=new UserAdapter(this,myListData);









        recyclerView.setAdapter(userAdapter);



    }
}