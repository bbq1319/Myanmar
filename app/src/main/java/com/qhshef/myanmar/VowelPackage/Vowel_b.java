package com.qhshef.myanmar.VowelPackage;


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
public class Vowel_b extends Fragment {

    SoundPool pool;
    int sound;
    int soundWord;

    public Vowel_b() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_vowel_b, container, false);

        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound = pool.load(getActivity(), R.raw.a, 1);
        soundWord = pool.load(getActivity(), R.raw.word_b, 1);

        RelativeLayout sound_word = v.findViewById(R.id.sound_word);
        sound_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(soundWord, 1,1,0,0,1);
            }
        });

        return v;
    }

}