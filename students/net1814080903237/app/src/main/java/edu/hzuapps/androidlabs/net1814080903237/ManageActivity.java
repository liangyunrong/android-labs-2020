package edu.hzuapps.androidlabs.net1814080903237;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ManageActivity extends AppCompatActivity{
    private ListView listView;
    private ArrayList<Thing> thingList=new ArrayList<Thing>();
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        initThings();
        initView();
    }
    public void initView() {
        listView = findViewById(R.id.listView);
        ThingAdapter adapter = new ThingAdapter(ManageActivity.this,R.layout.thing_item,thingList);
        listView.setAdapter(adapter);
    }
    //初始化物品数据
    private void initThings(){
        for(int i=0;i<2;i++) {
            Thing vase =new Thing("花瓶",R.drawable.huaping);
            thingList.add(vase);
            Thing knife =new Thing("刀子",R.drawable.daozi);
            thingList.add(knife);
            Thing wok =new Thing("锅",R.drawable.guo);
            thingList.add(wok);
            Thing bread =new Thing("面包",R.drawable.mianbao);
            thingList.add(bread);
            Thing iphone =new Thing("手机",R.drawable.shouji);
            thingList.add(iphone);
            Thing book =new Thing("书本",R.drawable.shuben);
            thingList.add(book);
            Thing cup =new Thing("水杯",R.drawable.shuibei);
            thingList.add(cup);
            Thing tissue =new Thing("纸巾",R.drawable.zhijin);
            thingList.add(tissue);
        }
        }

}
/*
package edu.hzuapps.androidlabs.net1814080903237;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
public class ManageActivity extends AppCompatActivity{
    private String[] data={"书本","戒指","花瓶"};
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                ManageActivity.this,android.R.layout.simple_list_item_1,data);

        ListView listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}*/
