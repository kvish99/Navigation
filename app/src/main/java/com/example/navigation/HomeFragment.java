package com.example.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.navigation.Model.CoffeeModel;
import com.example.navigation.adapter.MyCustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_home,container,false);

        GridView gridView= view.findViewById(R.id.grid_view1);

        List<CoffeeModel> coffeeModelList = new ArrayList<>();

       CoffeeModel coffeeModel1 = new CoffeeModel("Choclate coffee","199",R.drawable.mm);
        CoffeeModel coffeeModel2 = new CoffeeModel("vanilla coffee","199",R.drawable.m1);
        CoffeeModel coffeeModel3 = new CoffeeModel("Black coffee","199",R.drawable.m1);
        CoffeeModel coffeeModel4 = new CoffeeModel("Bru coffee","199",R.drawable.mm);
        CoffeeModel coffeeModel5 = new CoffeeModel("Nescape Choclate coffee","199",R.drawable.mm);

       coffeeModelList.add(coffeeModel1);
       coffeeModelList.add(coffeeModel2);
       coffeeModelList.add(coffeeModel3);
       coffeeModelList.add(coffeeModel4);
       coffeeModelList.add(coffeeModel5);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(coffeeModelList,getContext());
        gridView.setAdapter(myCustomAdapter);


        return view;


    }

}
