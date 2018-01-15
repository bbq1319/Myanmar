package com.qhshef.myanmar;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;

public class Word extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        setTitle(R.string.vowel);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec ts1 = tabHost.newTabSpec("Tab1");
        ts1.setContent(R.id.tab1);
        ts1.setIndicator("1");
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("Tab2");
        ts2.setContent(R.id.tab2);
        ts2.setIndicator("2");
        tabHost.addTab(ts2);

        TabHost.TabSpec ts3 = tabHost.newTabSpec("Tab3");
        ts3.setContent(R.id.tab3);
        ts3.setIndicator("3");
        tabHost.addTab(ts3);

        TabHost.TabSpec ts4 = tabHost.newTabSpec("Tab4");
        ts4.setContent(R.id.tab4);
        ts4.setIndicator("4");
        tabHost.addTab(ts4);

        TabHost.TabSpec ts5 = tabHost.newTabSpec("Tab5");
        ts5.setContent(R.id.tab5);
        ts5.setIndicator("5");
        tabHost.addTab(ts5);

    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
