package com.example.mygallery;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ImageTabbedActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_tabbed);

		ImageEntity[] images = new ImageGenerator().generateImages();

		MyImageTabbedAdapter tabAdapter = new MyImageTabbedAdapter(getSupportFragmentManager(), images);
		ViewPager viewPager = findViewById(R.id.viewPager);
		TabLayout tabLayout = findViewById(R.id.tabLayout);
		int selectedImage = getIntent().getIntExtra("imageSelected", 0);

		viewPager.setAdapter(tabAdapter);
		viewPager.setCurrentItem(selectedImage);
		tabLayout.setupWithViewPager(viewPager);
	}
}