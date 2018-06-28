package com.example.nikhil.harrypotter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //variables
    Context ctx;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;
    Transition transition;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        ctx = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(ctx);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);

    }

    //viewholder for grabbing information needed in the list view
    public class ViewHolder {
        TextView mName, mDesc;
        ImageView mIcon;
        CardView layout;
    }

    //viewholder for grabbing information needed in the list view
    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    //Actual View for the List View page with animation
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.listview, null);

            holder.mName = convertView.findViewById(R.id.id_nameView);
            holder.mDesc = convertView.findViewById(R.id.id_descView);
            holder.mIcon = convertView.findViewById(R.id.id_imageView);
            holder.layout = convertView.findViewById(R.id.list_view);
            convertView.setTag(holder);


        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //set entry animation for list view
        Animation fadeIn = AnimationUtils.loadAnimation(ctx, R.anim.fade_in);
        fadeIn.setInterpolator(new AccelerateInterpolator());
        fadeIn.setStartOffset(500); // Start fading out after 500 milli seconds
        fadeIn.setDuration(500); // Fadeout duration should be 500 milli seconds
        convertView.startAnimation(fadeIn);

        //set the results into text view
        holder.mName.setText(modellist.get(position).getName());
        holder.mDesc.setText(modellist.get(position).getDesc());
        //set the results into image view
        holder.mIcon.setImageResource(modellist.get(position).getIcon());

        //listview items click
        final Model profile = modellist.get(position);


        //view holders for getting the main profile page to display the items needed
        holder.layout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent In = new Intent(ctx, ListActivity.class);

                In.putExtra("profileImage", profile.getIcon());
                In.putExtra("name", profile.getName());
                In.putExtra("quote", profile.getQuote());
                In.putExtra("skill", profile.getSkill());
                In.putExtra("patronus", profile.getPatronus());
                In.putExtra("wandImage", profile.getWicon());
                In.putExtra("description", profile.getDescription());

                ctx.startActivity(In);
            }
        });
        return convertView;

    }

}

