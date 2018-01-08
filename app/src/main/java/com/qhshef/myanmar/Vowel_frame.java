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
import com.qhshef.myanmar.ConsonantPackage.Frag_F;
import com.qhshef.myanmar.ConsonantPackage.Frag_G;
import com.qhshef.myanmar.ConsonantPackage.Frag_Q;
import com.qhshef.myanmar.ConsonantPackage.Frag_R;
import com.qhshef.myanmar.ConsonantPackage.Frag_S;
import com.qhshef.myanmar.ConsonantPackage.Frag_T;
import com.qhshef.myanmar.ConsonantPackage.Frag_V;
import com.qhshef.myanmar.ConsonantPackage.Frag_W;
import com.qhshef.myanmar.ConsonantPackage.Frag_X;
import com.qhshef.myanmar.ConsonantPackage.Frag_Z;
import com.qhshef.myanmar.VowelPackage.Vowel_b;
import com.qhshef.myanmar.VowelPackage.Vowel_h;
import com.qhshef.myanmar.VowelPackage.Vowel_hk;
import com.qhshef.myanmar.VowelPackage.Vowel_hl;
import com.qhshef.myanmar.VowelPackage.Vowel_ho;
import com.qhshef.myanmar.VowelPackage.Vowel_i;
import com.qhshef.myanmar.VowelPackage.Vowel_j;
import com.qhshef.myanmar.VowelPackage.Vowel_k;
import com.qhshef.myanmar.VowelPackage.Vowel_l;
import com.qhshef.myanmar.VowelPackage.Vowel_m;
import com.qhshef.myanmar.VowelPackage.Vowel_ml;
import com.qhshef.myanmar.VowelPackage.Vowel_n;
import com.qhshef.myanmar.VowelPackage.Vowel_nj;
import com.qhshef.myanmar.VowelPackage.Vowel_nl;
import com.qhshef.myanmar.VowelPackage.Vowel_np;
import com.qhshef.myanmar.VowelPackage.Vowel_o;
import com.qhshef.myanmar.VowelPackage.Vowel_p;
import com.qhshef.myanmar.VowelPackage.Vowel_u;
import com.qhshef.myanmar.VowelPackage.Vowel_y;

public class Vowel_frame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel_frame);

        setTitle(R.string.vowel);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int value = intent.getExtras().getInt("value");

        Fragment fragment = null;

        switch (value){
            case R.id.k:
                fragment = new Vowel_k();
                break;
            case R.id.i:
                fragment = new Vowel_i();
                break;
            case R.id.j:
                fragment = new Vowel_j();
                break;
            case R.id.u:
                fragment = new Vowel_u();
                break;
            case R.id.h:
                fragment = new Vowel_h();
                break;
            case R.id.y:
                fragment = new Vowel_y();
                break;
            case R.id.n:
                fragment = new Vowel_n();
                break;
            case R.id.b:
                fragment = new Vowel_b();
                break;
            case R.id.m:
                fragment = new Vowel_m();
                break;
            case R.id.l:
                fragment = new Vowel_l();
                break;
            case R.id.o:
                fragment = new Vowel_o();
                break;
            case R.id.p:
                fragment = new Vowel_p();
                break;
            case R.id.hk:
                fragment = new Vowel_hk();
                break;
            case R.id.ho:
                fragment = new Vowel_ho();
                break;
            case R.id.hl:
                fragment = new Vowel_hl();
                break;
            case R.id.nj:
                fragment = new Vowel_nj();
                break;
            case R.id.np:
                fragment = new Vowel_np();
                break;
            case R.id.nl:
                fragment = new Vowel_nl();
                break;
            case R.id.ml:
                fragment = new Vowel_ml();
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
