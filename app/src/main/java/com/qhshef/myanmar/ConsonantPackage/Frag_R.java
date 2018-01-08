package com.qhshef.myanmar.ConsonantPackage;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.qhshef.myanmar.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_R extends Fragment {

    SoundPool pool;
    int sound;
    int soundWord;

    public Frag_R() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_r, container, false);

        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound = pool.load(getActivity(), R.raw.r, 1);
        soundWord = pool.load(getActivity(), R.raw.word_r, 1);

        RelativeLayout sound_bt = v.findViewById(R.id.sound_bt);
        sound_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(sound, 1,1,0,0,1);
            }
        });
        RelativeLayout sound_word = v.findViewById(R.id.sound_word);
        sound_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(soundWord, 1,1,0,0,1);
            }
        });

        return v;

         /*
        flipper = findViewById(R.id.viewFlipper);
        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);

        LinearLayout linearLayout[] = new LinearLayout[10];
        for(int i=0; i<10; i++){
            linearLayout[i] = new LinearLayout(getApplicationContext());
        }

        linearLayout[0].setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.re_1));
        flipper.addView(linearLayout[0]);
        linearLayout[1].setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.re_2));
        flipper.addView(linearLayout[1]);

        final Animation show_next = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        final Animation show_prev = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.startAnimation(show_next);
                flipper.showNext();
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.startAnimation(show_prev);
                flipper.showPrevious();
            }
        });

        */
    }

}
