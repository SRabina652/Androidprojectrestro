package com.cs50.recycleview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcview;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcview=(RecyclerView) findViewById(R.id.rcview);

        rcview.setLayoutManager(new LinearLayoutManager(this));

      adapter =new Adapter(arr(),getApplicationContext());
      rcview.setAdapter(adapter);

//      For horizontal dragging layout mathi ko header scroll garne types
//        LinearLayoutManager Lmanager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        rcview.setLayoutManager(Lmanager);

//        For grid layout Types
//            GridLayoutManager Gmanager=new GridLayoutManager(this,2);
//            rcview.setLayoutManager(Gmanager);




    }

    public ArrayList<Model> arr(){

        ArrayList<Model> newData=new ArrayList<>();

        Model model1=new Model();

        model1.setName("C++");
        model1.setDesc("this one is C++");
        model1.setImg(R.drawable.cplus);
        newData.add(model1);


        Model model2 = new Model();
        model2.setName("JAVA");
        model2.setDesc("this one is JAVA");
        model2.setImg(R.drawable.java);
        newData.add(model2);

        Model model3= new Model();
        model3.setName("CSS");
        model3.setDesc("this one is CSS");
        model3.setImg(R.drawable.css);
        newData.add(model3);


        Model model4= new Model();
        model4.setName("HTML");
        model4.setDesc("this one is HTLM");
        model4.setImg(R.drawable.html);
        newData.add(model4);

        Model model5= new Model();
        model5.setName("PHP");
        model5.setDesc("this one is PHP");
        model5.setImg(R.drawable.php);
        newData.add(model5);



        Model model6=new Model();

        model6.setName("C++");
        model6.setDesc("this one is C++");
        model6.setImg(R.drawable.cplus);
        newData.add(model6);


        Model model7 = new Model();
        model7.setName("JAVA");
        model7.setDesc("this one is JAVA");
        model7.setImg(R.drawable.java);
        newData.add(model7);

        Model model8= new Model();
        model8.setName("CSS");
        model8.setDesc("this one is CSS");
        model8.setImg(R.drawable.css);
        newData.add(model8);


        Model model9= new Model();
        model9.setName("HTML");
        model9.setDesc("this one is HTLM");
        model9.setImg(R.drawable.html);
        newData.add(model9);

        Model model0= new Model();
        model0.setName("PHP");
        model0.setDesc("this one is PHP");
        model0.setImg(R.drawable.php);
        newData.add(model0);
        return newData;
    }
}