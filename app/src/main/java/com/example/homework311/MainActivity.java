package com.example.homework311;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterBook adapterBook;
    ArrayList list;

//    Stringh[] nameMassiv = {"Январь",  "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
//            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь", "Январь",  "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
//            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_main);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        list = new ArrayList<>();
        list = (ArrayList) Stringh.getBookList();
        adapterBook = new AdapterBook(list);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapterBook);

    }
}