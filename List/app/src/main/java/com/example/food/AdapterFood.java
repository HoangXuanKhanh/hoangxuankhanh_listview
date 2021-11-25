package com.example.food;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.List;

public class AdapterFood extends BaseAdapter {

      List<Foodlist> foodExpress;

    public AdapterFood(List<Foodlist> foodExpress) {
        this.foodExpress = foodExpress;
    }

    @Override
    public int getCount() {
        return foodExpress.size();
    }

    @Override
    public Object getItem(int position) {
        return foodExpress.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        convertView = layoutInflater.inflate(R.layout.icon_food,null);

        TextView tvName = convertView.findViewById(R.id.tv_Name);
        TextView tvMota = convertView.findViewById(R.id.tv_Mota);
        TextView tvMota1 = convertView.findViewById(R.id.tv_Mota1);
        TextView tvMota2 = convertView.findViewById(R.id.tv_Mota2);
        ImageView imgPic = convertView.findViewById(R.id.imgPicTure);

        Foodlist foodlist = foodExpress.get(position);

        tvName.setText(foodlist.getNameFood());
        tvMota.setText(foodlist.getMoTa());
        tvMota1.setText(foodlist.getMoTa1());
        tvMota2.setText(foodlist.getMoTa2());
        imgPic.setImageResource(foodlist.getImga());

        return convertView;
    }
}
