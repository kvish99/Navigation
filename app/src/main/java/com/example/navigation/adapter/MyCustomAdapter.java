package com.example.navigation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navigation.Model.CoffeeModel;
import com.example.navigation.R;

import java.util.List;

public class MyCustomAdapter extends BaseAdapter {

    List<CoffeeModel>coffeeModelList;

    Context context;

    public MyCustomAdapter(List<CoffeeModel> coffeeModelList, Context context) {
        this.coffeeModelList = coffeeModelList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return coffeeModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return coffeeModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){

            LayoutInflater layoutInflater;

            layoutInflater=LayoutInflater.from(context);

            convertView=layoutInflater.inflate(R.layout.gridview,parent,false);

        }

        CoffeeModel coffeeModel= coffeeModelList.get(position);

        ImageButton imageButton = convertView.findViewById(R.id.image) ;

        TextView name = convertView.findViewById(R.id.name);

        TextView price = convertView.findViewById(R.id.price);

        imageButton.setImageResource(coffeeModel.getImageview());

        name.setText(coffeeModel.getName());

        price.setText(coffeeModel.getPrice());

        return convertView;
    }
}
