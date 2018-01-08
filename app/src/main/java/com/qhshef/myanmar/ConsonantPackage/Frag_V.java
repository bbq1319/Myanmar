package com.qhshef.myanmar.ConsonantPackage;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.qhshef.myanmar.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_V extends Fragment {

    SoundPool pool;
    int sound;

    public Frag_V() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_v, container, false);

        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        sound = pool.load(getActivity(), R.raw.v, 1);

        Button bt = v.findViewById(R.id.sound_bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(sound, 1,1,0,0,1);
            }
        });

        return v;
    }

}
