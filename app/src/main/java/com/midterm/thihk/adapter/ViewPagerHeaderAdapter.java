package com.midterm.thihk.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import com.midterm.thihk.R;
import com.midterm.thihk.model.Plants;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewPagerHeaderAdapter extends PagerAdapter {

    private List<Plants.Plant> plants;
    private Context context;
    private static ClickListener clickListener;

    public ViewPagerHeaderAdapter(List<Plants.Plant> plants, Context context) {
        this.plants = plants;
        this.context = context;
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        ViewPagerHeaderAdapter.clickListener = clickListener;
    }

    @Override
    public int getCount() {
        if(plants != null){
            return plants.size();
        }
        else return plants.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_view_pager_header,
                container,
                false
        );

        ImageView plantThumb = view.findViewById(R.id.plantThumb);
        TextView plantName = view.findViewById(R.id.plantName);

        String strPlantThumb = plants.get(position).getStrPlantThumb();
        Picasso.get().load(strPlantThumb).into(plantThumb);

        String strPlantName = plants.get(position).getStrPlant();
        plantName.setText(strPlantName);

        view.setOnClickListener(v -> clickListener.onClick(v, position));

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    public interface ClickListener {
        void onClick(View v, int position);
    }
}
