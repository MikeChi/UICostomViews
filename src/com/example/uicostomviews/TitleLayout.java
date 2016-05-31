package com.example.uicostomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout {

	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title, this);
		Button buttonBack = (Button)findViewById(R.id.button_back);
		Button buttonEdit = (Button)findViewById(R.id.edit);
		buttonBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
               ( (Activity) getContext()).finish();			
			}
			
		});
		buttonEdit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
               Toast.makeText(getContext(), "You type edit", Toast.LENGTH_SHORT).show();  				
			}
			
		});
	}
     
}
