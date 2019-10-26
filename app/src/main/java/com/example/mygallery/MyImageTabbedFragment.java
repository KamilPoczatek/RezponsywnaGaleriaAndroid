package com.example.mygallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyImageTabbedFragment extends Fragment {
	private ImageEntity image;

	public void setImage(ImageEntity image) {
		this.image = image;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View currentView = inflater.inflate(R.layout.fragment_image_tabbed, container, false);

		((TextView) currentView.findViewById(R.id.textViewTitle2)).setText(image.getTitle());
		((TextView) currentView.findViewById(R.id.textViewAuthor2)).setText(image.getAuthor());
		((TextView) currentView.findViewById(R.id.textViewPlace2)).setText(image.getPlace());
		((TextView) currentView.findViewById(R.id.textViewDescription2)).setText(image.getDescription());
		((ImageView) currentView.findViewById(R.id.imageView2)).setImageResource(image.getImage());

		return currentView;
	}
}