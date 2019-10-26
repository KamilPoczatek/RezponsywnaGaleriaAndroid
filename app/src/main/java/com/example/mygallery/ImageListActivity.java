package com.example.mygallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ImageListActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_list);

		ImageEntity[] images = new ImageGenerator().generateImages();

		MyImageListAdapter myImageListAdapter = new MyImageListAdapter(this, R.layout.fragment_image_list, images);
		ListView listView = findViewById(R.id.imagesList);

		listView.setAdapter(myImageListAdapter);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				Intent intent = new Intent(getApplicationContext(), ImageTabbedActivity.class);
				intent.putExtra("imageSelected", position);
				startActivity(intent);
			}
		});
	}
}
