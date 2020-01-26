package com.amalitech.journalio_clone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Profile extends Activity {

	TextView tab_0;
	TextView tab_1;
	TextView tab_2;
	
	Context ctx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_profile);
		
		//setting context to this class
		ctx = Activity_Profile.this;
		
		//Reference ui elements
		tab_0 = (TextView )findViewById(R.id.nav_tv_0);
		tab_1 = (TextView )findViewById(R.id.nav_tv_1);
		tab_2 = (TextView )findViewById(R.id.nav_tv_2);
		
		//displaying view in this layout
		nav_V(3, "nav_v_", 2).setVisibility(View.VISIBLE);
		
		//tab 0(Trending or Main News Page) event
		tab_0.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				if(v.getId()==tab_0.getId()) {
				switch (event.getActionMasked()){

  						case MotionEvent.ACTION_DOWN:
  						case MotionEvent.ACTION_POINTER_DOWN: {
  							//change color or background  ( new )
  							break;
  						}

  						case MotionEvent.ACTION_UP:
  						case MotionEvent.ACTION_POINTER_UP: {
  							
  							//change color to default
  							
  							//do the action
  							Intent activity_Post_intent = new Intent(Activity_Profile.this, Activity_MainNewsPage.class );
  							startActivity(activity_Post_intent);
  							
  							break;
  						}
  						case MotionEvent.ACTION_MOVE:{
  							
  							//finger moved : deactivate the whole action 
  							
  							break;
  						}
  					}
				}
				return true;
			}
		});
		
		//tab 1(My posts) event
		tab_1.setOnTouchListener(new OnTouchListener() {
					
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						
						if(v.getId()==tab_1.getId()) {
						switch (event.getActionMasked()){
		
		  						case MotionEvent.ACTION_DOWN:
		  						case MotionEvent.ACTION_POINTER_DOWN: {
		  							//change color or background  ( new )
		  							break;
		  						}
		
		  						case MotionEvent.ACTION_UP:
		  						case MotionEvent.ACTION_POINTER_UP: {
		  							
		  							//change color to default
		  							
		  							//do the action
		  							Intent activity_Post_intent = new Intent(Activity_Profile.this, Activity_Poster.class );
		  							startActivity(activity_Post_intent);
		  							
		  							break;
		  						}
		  						case MotionEvent.ACTION_MOVE:{
		  							
		  							//finger moved : deactivate the whole action 
		  							
		  							break;
		  						}
		  					}
						}
						return true;
					}
				});

		
		
	}
	
	
	public TextView nav_TV(int total_num_i, String prefix_str, int tv_i){

		String[] textView_tv_ids = new String[total_num_i];

		TextView[] textView_full_IDs = new TextView[total_num_i];

		textView_tv_ids[tv_i] = prefix_str+Integer.toString(tv_i);

		int textView_tv_ID = ctx.getResources().getIdentifier(textView_tv_ids[tv_i], "id", "com.amalitech.journalio_clone");
		textView_full_IDs[tv_i] = (TextView)findViewById(textView_tv_ID);

		return textView_full_IDs[tv_i];
	}
	
	public View nav_V(int total_num_i, String prefix_str, int v_i){

		String[] view_ids = new String[total_num_i];

		View[] view_full_IDs = new View[total_num_i];

		view_ids[v_i] = prefix_str+Integer.toString(v_i);

		int view_ID = ctx.getResources().getIdentifier(view_ids[v_i], "id", "com.amalitech.journalio_clone");
		view_full_IDs[v_i] = (View)findViewById(view_ID);

		return view_full_IDs[v_i];
	}
	
}
