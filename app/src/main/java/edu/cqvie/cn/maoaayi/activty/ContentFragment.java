package edu.cqvie.cn.maoaayi.activty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import edu.cqvie.cn.maoaayi.R;


public class ContentFragment extends Fragment {
    private ImageView ivkb;
    private ImageView ivmoney;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_content, container, false);
        ivkb =(ImageView)view.findViewById(R.id.iv_kb);
        ivmoney = (ImageView)view.findViewById(R.id.iv_money);
        ivkb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),KouBeiActivty.class);
                ContentFragment.this.startActivity(intent);
            }
        });
        ivmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),MoneyActivty.class);
                ContentFragment.this.startActivity(intent);
            }
        });
        return view;
    }


}
