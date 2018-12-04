package com.ak.user.treeview_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ak.user.treeview_recyclerview.RecyclerViewAdapter.RecyclerViewAdapter;
import com.ak.user.treeview_recyclerview.data.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Data> records = new ArrayList<Data>(); //список значений
    Data record;
    RecyclerViewAdapter adapter;
    int parentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycler_list);

        record = new Data();

        record.setValueId(1);
        record.setValueText("Родительское значение 1");
        record.setItemParent(true); //родительское значение
        records.add(record);
        parentId = records.size() - 1;

        for (int ind = 1; ind <= 3; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Текст " + ind);
            record.setParentId(parentId);
            records.add(record);
        }

        record = new Data();
        record.setValueId(1);
        record.setValueText("Второе родительское значение");
        record.setItemParent(true); //родительское значение
        records.add(record);
        parentId = records.size() - 1;
        for (int ind = 4; ind <= 7; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Дочерний текст " + ind);
            record.setParentId(parentId);
            records.add(record);
        }

        record = new Data();
        record.setValueId(1);
        record.setValueText("Еще родительское значение");
        record.setItemParent(true); //родительское значение
        records.add(record);
        parentId = records.size() - 1;
        for (int ind = 8; ind <= 12; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Значение " + ind);
            record.setParentId(parentId);
            records.add(record);
        }

        for (int ind = 13; ind <= 18; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Текст без родителя" + ind);
            records.add(record);
        }

        for (int ind = 19; ind <= 21; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Элемент тоже без родителя" + ind);
            records.add(record);
        }

        record = new Data();
        record.setValueId(1);
        record.setValueText("Опять родительское значение");
        record.setItemParent(true); //родительское значение
        records.add(record);
        parentId = records.size() - 1;
        for (int ind = 22; ind <= 30; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Дочернее: " + ind);
            record.setParentId(parentId);
            records.add(record);
        }

        for (int ind = 31; ind <= 45; ind++) {
            record = new Data();
            record.setValueId(ind);
            record.setValueText("Последние без родителя " + ind);
            records.add(record);
        }

        adapter = new RecyclerViewAdapter(records);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(itemAnimator);
    }
}
