package edu.hzuapps.androidlabs.net1814080903237;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThingAdapter extends ArrayAdapter<Thing> {
    private Context context;
    private int resourceId;
    public ThingAdapter(Context context, int resourceId, List<Thing> thingList){
        super(context,resourceId,thingList);

        this.context=context;
        this.resourceId=resourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Thing thing = getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView ivThing = view.findViewById(R.id.thing_image);
        TextView tvThing = view.findViewById(R.id.thing_name);
        ivThing.setImageResource(thing.getImageId());
        tvThing.setText(thing.getName());
        return view;
    }

}
