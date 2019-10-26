package com.example.mygallery;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyImageListAdapter extends ArrayAdapter<ImageEntity> {
	private Context context;
	private int layoutResourceId;
	private ImageEntity[] images;

	MyImageListAdapter(Context context, int layoutResourceId, ImageEntity[] images) {
		super(context, layoutResourceId, images);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.images = images;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = ((Activity)context).getLayoutInflater();
		View currentView = inflater.inflate(layoutResourceId, parent, false);
		ImageEntity image = images[position];

		((TextView)currentView.findViewById(R.id.textViewTitle)).setText(image.getTitle());
		((TextView)currentView.findViewById(R.id.textViewAuthor)).setText(image.getAuthor());
		((TextView)currentView.findViewById(R.id.textViewPlace)).setText(image.getPlace());
		((TextView)currentView.findViewById(R.id.textViewDescription)).setText(image.getDescription());
		((ImageView)currentView.findViewById(R.id.imageView)).setImageResource(image.getImage());

		return currentView;
	}
}