package edu.cqvie.cn.maoaayi.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import edu.cqvie.cn.maoaayi.R;
import edu.cqvie.cn.maoaayi.bean.Employe;

/**
 * Created by yuyu on 2017/6/21.
 */
public class MyListAdapter extends BaseAdapter {
    private List<Employe> list;
    private LayoutInflater inflater;

    public MyListAdapter(Context context, List<Employe> list){
        this.list = list;
        inflater = LayoutInflater.from(context);
    }


    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Employe person = (Employe) this.getItem(position);
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.my_list_item, null);
            viewHolder.testpaimin = (TextView) convertView.findViewById(R.id.text_paimin);
            viewHolder.testname = (TextView) convertView.findViewById(R.id.text_name);
            viewHolder.testmoney = (TextView) convertView.findViewById(R.id.text_momeny);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.testpaimin.setText(Integer.toString(person.getImg()));
        viewHolder.testname.setText(person.getName());
        viewHolder.testmoney.setText(Integer.toString(person.getMomeny()));
        return convertView;
    }

    public static class ViewHolder{
        public TextView testpaimin;
        public TextView testname;
        public TextView testmoney;

    }
}
