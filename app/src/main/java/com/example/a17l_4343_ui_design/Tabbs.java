package com.example.a17l_4343_ui_design;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.a17l_4343_ui_design.ui.main.SectionsPagerAdapter;

public class Tabbs extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.logoutmenu) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.instructions) {
            Intent intent = new Intent(this, Instructions.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.changePassword)
        {
            Intent intent = new Intent(this, changepassword.class);
            startActivity(intent);

        }
        else if(item.getItemId()==R.id.feedback)
        {
            Intent intent = new Intent(this, feedback.class);
            startActivity(intent);

        }
        return true;
    }

    private TextView tv;
    final int[] toolbar_icons = new int[]{
            R.drawable.home_icon,
            R.drawable.profile_icon,
            R.drawable.search_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbs);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        setupTabIcons(tabs, toolbar_icons);
    }

    private void setupTabIcons(TabLayout tabs, int[] toolbar_icons) {
        for (int i = 0; i < 3; i++)
            tabs.getTabAt(i).setIcon(toolbar_icons[i]);

        tabs.getTabAt(0).getIcon().setColorFilter(Color.parseColor(getResources().getString(R.string.orangeColor)), PorterDuff.Mode.SRC_IN);
        tabs.getTabAt(1).getIcon().setColorFilter(Color.parseColor(getResources().getString(R.string.blackColor)), PorterDuff.Mode.SRC_IN);
        tabs.getTabAt(2).getIcon().setColorFilter(Color.parseColor(getResources().getString(R.string.blackColor)), PorterDuff.Mode.SRC_IN);

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor(getResources().getString(R.string.orangeColor)), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor(getResources().getString(R.string.blackColor)), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void openLogin() {
        Intent it = new Intent(this, Login.class);
        startActivity(it);
    }
}