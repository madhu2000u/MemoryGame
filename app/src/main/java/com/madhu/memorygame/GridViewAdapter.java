package com.madhu.memorygame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;

public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflator;
    private int[][] grid_2d=new int[4][4];
    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(layoutInflator==null)
        {
            layoutInflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(view==null)
        {
            //noinspection SingleStatementInBlock
            view=layoutInflator.inflate(R.layout.mem_card_unit, null);
        }

        CardView cardView=view.findViewById(R.id.card_view);
        ImageView imageView=view.findViewById(R.id.card_image_view);



        return null;
    }
}
