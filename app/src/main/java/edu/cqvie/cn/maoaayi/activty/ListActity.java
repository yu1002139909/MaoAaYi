package edu.cqvie.cn.maoaayi.activty;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import edu.cqvie.cn.maoaayi.R;


public class ListActity extends ListActivity {
    String[] from={"name","id"};
    int[] to={R.id.user_name,R.id.user_id};
    String[] userName={"服务时长","服务地址","服务电话","地址昵称","门牌号","结束服务时间","是否有小孩","是否有宠物","经度","维度","订单编号","服务Id","服务状态",
            "电话","用户昵称","服务时间","服务类型","顾客性别","开始服务时间","服务类型"
    };
    String[] post = null;
    String[] userId=new String[19];
    ArrayList<HashMap<String,String>> list=null;
    HashMap<String,String> map=null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xx_layout);
        list=new ArrayList<HashMap<String,String>>();
        Intent intent = getIntent();
        Bundle b=this.getIntent().getExtras();
        post = b.getStringArray("userId");

           for(int i=0; i<19; i++){
            map=new HashMap<String,String>();
            map.put("id", post[i]);
            map.put("name", userName[i]);
            list.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.list_ite,from,to);
        setListAdapter(adapter);
    }
}
