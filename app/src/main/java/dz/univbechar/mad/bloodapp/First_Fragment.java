package dz.univbechar.mad.bloodapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class First_Fragment extends Fragment {
    View myview;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.home,container,false);
        return myview;
    }
}
