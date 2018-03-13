package com.example.feifei.myviewtest;


import android.graphics.Point;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //onMeature
    private TextView text;
    private Button b1;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        System.out.println("fdfdsf");
        System.out.println("fdfdsf");

        MyFragment myFragment = new MyFragment();
        MyFragment2 myFragment2 = new MyFragment2();
        List<Fragment> list = new ArrayList<>();
        list.add(myFragment);
        list.add(myFragment2);
        MyFragmentAdapter myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(myFragmentAdapter);
        viewPager.setCurrentItem(0);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        System.out.println(point.x);
        System.out.println(point.y);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            int position;
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    System.out.println("position---" + position);
                    System.out.println("positionOffset---" + positionOffset);
                    System.out.println("positionOffsetPixels---" + positionOffsetPixels);

            }

            @Override
            public void onPageSelected(int position) {
                this.position = position;
                System.out.println("position---" + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                System.out.println("state---" + state);
            }
        });
    }

    public void test(){
        System.out.println("fffff");
    }

    private void initView() {
        b1 = (Button) findViewById(R.id.b1);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
    }
}
