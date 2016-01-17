package com.finepointmobile.customrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        ContactAdapterNew ca = new ContactAdapterNew(createList(30));
        recList.setAdapter(ca);
    }

    private List<Person> createList(int size) {

        List<Person> result = new ArrayList<Person>();
        for (int i=1; i <= size; i++) {
            Person ci = new Person();
            ci.firstName = "" + i;
            result.add(ci);
        }

        Person asdf = new Person();
        asdf.firstName = "Daniel Malone";
        result.add(asdf);

        return result;
    }
}
