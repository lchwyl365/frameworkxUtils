package com.frameworkxutils.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

public class MainActivity extends BaseActivity
{

	@ViewInject(R.id.car_llyt_news)
	LinearLayout car_llyt_news;
	@ViewInject(R.id.car_iv_news)
	ImageView car_iv_news;
	@ViewInject(R.id.car_tv_news)
	TextView car_tv_news;
	
	@ViewInject(R.id.car_llyt_find)
	LinearLayout car_llyt_find;
	@ViewInject(R.id.car_iv_find)
	ImageView car_iv_find;
	@ViewInject(R.id.car_tv_find)
	TextView car_tv_find;
	
	@ViewInject(R.id.car_llyt_price)
	LinearLayout car_llyt_price;
	@ViewInject(R.id.car_iv_price)
	ImageView car_iv_price;
	@ViewInject(R.id.car_tv_price)
	TextView car_tv_price;
	
	@ViewInject(R.id.car_llyt_question)
	LinearLayout car_llyt_question;
	@ViewInject(R.id.car_iv_question)
	ImageView car_iv_question;
	@ViewInject(R.id.car_tv_question)
	TextView car_tv_question;
	
	@ViewInject(R.id.car_llyt_self)
	LinearLayout car_llyt_self;
	@ViewInject(R.id.car_iv_self)
	ImageView car_iv_self;
	@ViewInject(R.id.car_tv_self)
	TextView car_tv_self;
	
	@Override
	protected int getLayoutId()
	{
		return R.layout.activity_main;
	}

	@Override
	protected void initParams()
	{
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(savedInstanceState == null){
			viewOnClick(car_llyt_news);
		}
	}

	@OnClick({R.id.car_llyt_news, R.id.car_llyt_find,R.id.car_llyt_price, R.id.car_llyt_question, R.id.car_llyt_self})
	public void viewOnClick(View view) {
		
	}
	
}
