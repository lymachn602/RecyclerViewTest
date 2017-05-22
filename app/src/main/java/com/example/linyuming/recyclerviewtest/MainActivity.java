package com.example.linyuming.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(linearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }
    private void initFruits() {
        for(int i=0;i<4;i++){
            Fruit apple = new Fruit("apple",R.drawable.blackcar);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana",R.drawable.blackshot);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange",R.drawable.bpeople);
            fruitList.add(orange);
            Fruit watermenlon = new Fruit("watermenlon",R.drawable.fcar);
            fruitList.add(watermenlon);
        }
    }
}
