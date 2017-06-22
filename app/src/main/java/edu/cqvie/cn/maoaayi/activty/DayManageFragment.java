package edu.cqvie.cn.maoaayi.activty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cqvie.cn.maoaayi.R;


public class DayManageFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_day_manage, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
