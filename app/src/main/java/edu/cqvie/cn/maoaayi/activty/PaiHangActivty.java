package edu.cqvie.cn.maoaayi.activty;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.cqvie.cn.maoaayi.R;
import edu.cqvie.cn.maoaayi.bean.Employe;
import edu.cqvie.cn.maoaayi.utils.MyListAdapter;

/**
 * Created by yuyu on 2017/6/21.
 */
public class PaiHangActivty extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.paihang_layout);
        ViewGroup listtitle = (ViewGroup) findViewById(R.id.table_title);
        listtitle.setBackgroundColor(Color.rgb(255, 100, 10));
        List<Employe> list = new ArrayList<Employe>();
        list.add(new Employe(1,"老张",5000));
        list.add(new Employe(2,"汪小菲",5000));
        ListView listView = (ListView) findViewById(R.id.my_list);
        MyListAdapter myListAdapter = new MyListAdapter(this,list);
        listView.setAdapter(myListAdapter);
    }
}
