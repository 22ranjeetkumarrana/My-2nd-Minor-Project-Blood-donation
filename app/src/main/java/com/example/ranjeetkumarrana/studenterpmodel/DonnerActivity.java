package com.example.ranjeetkumarrana.studenterpmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DonnerActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private List<NewsItem> mData;
    private Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donner);

        recyclerView = (RecyclerView)findViewById(R.id.recyleView);
        mData = new ArrayList<>();
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Umesh jee","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 5","987654123"));
        mData.add(new NewsItem("Name :- Umesh","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 45","987654123"));
        mData.add(new NewsItem("Name :- Umesh ","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Umesh","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Umesh jee","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 5","987654123"));
        mData.add(new NewsItem("Name :- Umesh","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 45","987654123"));
        mData.add(new NewsItem("Name :- Umesh ","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));
        mData.add(new NewsItem("Name :- Abhijeet Kumar Gupta","Blood Group :- O-","Gender :- Male",R.drawable.r,"Age:- 40","987654123"));
        mData.add(new NewsItem("Name :- Laxo","Blood Group :-B","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Umesh","Blood Group :- A+","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        //mData.add(new NewsItem("Name :- Gitu Bhabhi","Blood Group :- A-","Gender :- Female",R.drawable.g,"Age:- 16","987654123"));
        mData.add(new NewsItem("Name :- Deepak","Blood Group :- B-","Gender :- Male",R.drawable.r,"Age:- 20","987654123"));
        mData.add(new NewsItem("Name :- Nishant","Blood Group :- B+","Gender :- Male",R.drawable.r,"Age:- 50","987654123"));
        mData.add(new NewsItem("Name :- Modi","Blood Group :-O+","Gender :- Male",R.drawable.r,"Age:- 80","987654123"));
        mData.add(new NewsItem("Name :- Rajesh","Blood Group :-O-","Gender :- Male",R.drawable.r,"Age:- 35","987654123"));
        mData.add(new NewsItem("Name :- Ranjan","Blood Group :-AB-","Gender :- Male",R.drawable.r,"Age:- 37","987654123"));
        mData.add(new NewsItem("Name :- Vikram","Blood Group :- AB+","Gender :- Male",R.drawable.r,"Age:- 22","987654123"));

        itemAdapter = new ItemAdapter(this,mData);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        callButton = (Button)findViewById(R.id.conatactNumber);
       /* callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"Please wait.....",Toast.LENGTH_SHORT);
                toast.show();
            }
        });*/
    }
}
