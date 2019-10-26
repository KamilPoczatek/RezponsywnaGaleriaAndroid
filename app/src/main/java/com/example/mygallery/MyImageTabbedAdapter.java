package com.example.mygallery;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class MyImageTabbedAdapter extends FragmentStatePagerAdapter {
	private final List<Fragment> mFragmentList = new ArrayList<>();

	MyImageTabbedAdapter(FragmentManager fragmentManager, ImageEntity[] images) {
		super(fragmentManager);
		for (ImageEntity image : images) {
			mFragmentList.add(createFragment(image));
		}
	}
	@Override
	public Fragment getItem(int position) {
		return mFragmentList.get(position);
	}

	@Override
	public int getCount() {
		return mFragmentList.size();
	}

	private MyImageTabbedFragment createFragment (ImageEntity image)
	{
		MyImageTabbedFragment fragment = new MyImageTabbedFragment();
		fragment.setImage(image);
		return fragment;
	}
}