package org.example.siran.personalnotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Siran on 8/11/2015.
 */
public class NavigationDrawerAdapter extends BaseAdapter {
    private List<NavigationDrawerItem> mDrawerItems;
    private LayoutInflater mLayoutInflater;

    public NavigationDrawerAdapter(Context context, List<NavigationDrawerItem> drawerItems) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
        mDrawerItems = drawerItems;
    }

    @Override
    public int getCount() {
        return mDrawerItems.size();
    }

    @Override
    public Object getItem(int position) { // Unused
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mLayoutInflater.inflate(R.layout.custom_navigation_drawer, null);
        NavigationDrawerItem item = mDrawerItems.get(position);

        TextView title = (TextView) convertView.findViewById(R.id.navigation_item_title);
        title.setText(item.getTitle());

        ImageView icon = (ImageView) convertView.findViewById(R.id.navigation_item_icon);
        icon.setImageResource(item.getIconId());

        return convertView;
    }
}
