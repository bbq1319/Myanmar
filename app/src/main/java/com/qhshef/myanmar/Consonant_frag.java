package com.qhshef.myanmar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.qhshef.myanmar.ConsonantPackage.Frag_A;
import com.qhshef.myanmar.ConsonantPackage.Frag_C;
import com.qhshef.myanmar.ConsonantPackage.Frag_D;
import com.qhshef.myanmar.ConsonantPackage.Frag_E;
import com.qhshef.myanmar.ConsonantPackage.Frag_EE;
import com.qhshef.myanmar.ConsonantPackage.Frag_F;
import com.qhshef.myanmar.ConsonantPackage.Frag_G;
import com.qhshef.myanmar.ConsonantPackage.Frag_Q;
import com.qhshef.myanmar.ConsonantPackage.Frag_QQ;
import com.qhshef.myanmar.ConsonantPackage.Frag_R;
import com.qhshef.myanmar.ConsonantPackage.Frag_RR;
import com.qhshef.myanmar.ConsonantPackage.Frag_S;
import com.qhshef.myanmar.ConsonantPackage.Frag_T;
import com.qhshef.myanmar.ConsonantPackage.Frag_TT;
import com.qhshef.myanmar.ConsonantPackage.Frag_V;
import com.qhshef.myanmar.ConsonantPackage.Frag_W;
import com.qhshef.myanmar.ConsonantPackage.Frag_WW;
import com.qhshef.myanmar.ConsonantPackage.Frag_X;
import com.qhshef.myanmar.ConsonantPackage.Frag_Z;

public class Consonant_frag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consonant_frag);

        setTitle(com.qhshef.myanmar.R.string.consonant);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int value = intent.getExtras().getInt("value");

        Fragment fragment = null;

        switch (value){
            case R.id.a:
                fragment = new Frag_A();
                break;
            case R.id.c:
                fragment = new Frag_C();
                break;
            case R.id.d:
                fragment = new Frag_D();
                break;
            case R.id.e:
                fragment = new Frag_E();
                break;
            case R.id.f:
                fragment = new Frag_F();
                break;
            case R.id.g:
                fragment = new Frag_G();
                break;
            case R.id.q:
                fragment = new Frag_Q();
                break;
            case R.id.r:
                fragment = new Frag_R();
                break;
            case R.id.s:
                fragment = new Frag_S();
                break;
            case R.id.t:
                fragment = new Frag_T();
                break;
            case R.id.v:
                fragment = new Frag_V();
                break;
            case R.id.w:
                fragment = new Frag_W();
                break;
            case R.id.x:
                fragment = new Frag_X();
                break;
            case R.id.z:
                fragment = new Frag_Z();
                break;
            case R.id.rr:
                fragment = new Frag_RR();
                break;
            case R.id.ee:
                fragment = new Frag_EE();
                break;
            case R.id.qq:
                fragment = new Frag_QQ();
                break;
            case R.id.tt:
                fragment = new Frag_TT();
                break;
            case R.id.ww:
                fragment = new Frag_WW();
                break;
        }
        
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

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
