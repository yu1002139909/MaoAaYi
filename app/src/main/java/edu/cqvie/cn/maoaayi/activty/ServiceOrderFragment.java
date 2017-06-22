package edu.cqvie.cn.maoaayi.activty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cqvie.cn.maoaayi.R;


public class ServiceOrderFragment extends Fragment {



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_service_order, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
