package com.qhshef.myanmar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Vowel extends AppCompatActivity implements View.OnClickListener {

    static final int[] TXTS = {
            R.id.k,
            R.id.i,
            R.id.j,
            R.id.u,
            R.id.h,
            R.id.y,
            R.id.n,
            R.id.b,
            R.id.m,
            R.id.l,
            R.id.o,
            R.id.p,
            R.id.hk,
            R.id.ho,
            R.id.hl,
            R.id.nj,
            R.id.np,
            R.id.nl,
            R.id.ml
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel);

        setTitle(R.string.vowel);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        for(int txtId: TXTS) {
            TextView txt = findViewById(txtId);
            txt.setOnClickListener(this);
        }
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

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Vowel_frame.class);
        intent.putExtra("value", v.getId());
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left);
    }
}
