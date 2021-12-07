package com.example.recyclerview4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<CountryPojo> countryList=new ArrayList<>();
    String [] countryNameList={"Azerbaijan","Baladesh","Brazil","Canada","Germany","Portugal","South-Africa","Sri-Lanka","Turkey"};
    String [] countryDescriptionList={"Azerbaijan is located near black sea","Bangladesh is a riverine country","Brazil is famous for Aazon",
            "Canada is a secular country","Germany is a rich country in Europe","Portugal is famous for cr7","South-Africa is in Africa",
            "Sri-Lanka is an island","Turkey is a Muslim country"};
    int [] countryFlags={R.drawable.azerbaijan,R.drawable.bangladesh,R.drawable.brazil,R.drawable.canada,R.drawable.germany,
            R.drawable.portugal,R.drawable.south_africa,R.drawable.sri_lanka,R.drawable.turkey};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.country_RV);
        for(int i=0;i<countryNameList.length;i++){
            countryList.add(new CountryPojo(countryNameList[i],countryDescriptionList[i],countryFlags[i]));
        }
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        programAdapter=new ProgramAdapter(this,countryList);
        recyclerView.setAdapter(programAdapter);
    }
}