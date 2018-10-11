package com.example.asif.day9ext2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asif.day9ext2.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String [] value;
    int [] img;
    LayoutInflater inflator;

    public CustomAdapter(Context context, String[] value, int[] img) {
        this.context = context;
        this.value = value;
        this.img = img;
    }


    @Override
    public int getCount() {
        return value.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.sample, parent, false);
        }

            TextView textView = convertView.findViewById(R.id.tv);
            ImageView imageview = convertView.findViewById(R.id.im);

            textView.setText(value[position]);
            imageview.setImageResource(img[position]);



        return convertView;
    }
}
