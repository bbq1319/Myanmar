package com.qhshef.myanmar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Consonant extends AppCompatActivity implements View.OnClickListener{

    static final int[] TXTS = {
            R.id.r,
            R.id.s,
            R.id.e,
            R.id.f,
            R.id.a,
            R.id.q,
            R.id.t,
            R.id.d,
            R.id.w,
            R.id.c,
            R.id.z,
            R.id.x,
            R.id.v,
            R.id.g,
            R.id.rr,
            R.id.ee,
            R.id.qq,
            R.id.tt,
            R.id.ww
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.qhshef.myanmar.R.layout.activity_consonant);

        setTitle(com.qhshef.myanmar.R.string.consonant);
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
        Intent intent = new Intent(this, Consonant_frag.class);
        intent.putExtra("value", v.getId());
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left);
    }
}
