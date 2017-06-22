package edu.cqvie.cn.maoaayi.activty;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.cqvie.cn.maoaayi.R;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    private Fragment  indexfragment,serviceOrderFragment,daymanagefragment,contentfragment;
    //初始化Fragment管理对象
    private FragmentManager fragmentManager;
    //底部图标展示
    private ImageView ivmain,ivorder,ivdaymange,ivcontent;
    //底部文字
    private TextView tvmain,tvorder,tvdatemange,tvcontent;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        fragmentManager = getSupportFragmentManager();

        ivmain = (ImageView)findViewById(R.id.iv_index);
        ivorder = (ImageView)findViewById(R.id.iv_order);
        ivdaymange = (ImageView)findViewById(R.id.iv_day);
        ivcontent = (ImageView)findViewById(R.id.iv_content);

        tvmain = (TextView) findViewById(R.id.tv_index);
        tvorder = (TextView) findViewById(R.id.tv_order);
        tvdatemange = (TextView) findViewById(R.id.tv_day);
        tvcontent = (TextView) findViewById(R.id.tv_content);
        selectButton(0);
    }
    private void selectButton(int i) {
        FragmentTransaction tran = fragmentManager.beginTransaction();
        //初始化
        initview();
        hideFragment(tran);
        switch (i) {
            case 0:
                ivmain.setImageResource(R.drawable.menu_home_selected);
                tvmain.setTextColor(getResources().getColor(R.color.dibu));

                if (indexfragment == null) {
                    indexfragment = new IndexFragment();
                    tran.add(R.id.content, indexfragment);
                } else {
                    tran.show(indexfragment);
                }

                break;
            case 1:
                ivorder.setImageResource(R.drawable.menu_order_selected);
                tvorder.setTextColor(getResources().getColor(R.color.dibu));
                if (serviceOrderFragment == null) {
                    serviceOrderFragment = new ServiceOrderFragment();
                    tran.add(R.id.content, serviceOrderFragment);
                } else {
                    tran.show(serviceOrderFragment);
                }
                break;
            case 2:
                ivdaymange.setImageResource(R.drawable.menu_richeng_selected);
                tvdatemange.setTextColor(getResources().getColor(R.color.dibu));

                if (daymanagefragment == null) {
                    daymanagefragment = new DayManageFragment();
                    tran.add(R.id.content, daymanagefragment);
                } else {
                    tran.show(daymanagefragment);
                }
                break;
            case 3:
                ivcontent.setImageResource(R.drawable.menu_user_selected);
                tvcontent.setTextColor(getResources().getColor(R.color.dibu));
                if (contentfragment == null) {
                    contentfragment = new ContentFragment();
                    tran.add(R.id.content, contentfragment);
                } else {
                    tran.show(contentfragment);
                }
                break;
        }
        tran.commit();
    }
    private void hideFragment(FragmentTransaction tran) {
        if (indexfragment != null) {
            tran.hide(indexfragment);
        }
        if (serviceOrderFragment != null) {
            tran.hide(serviceOrderFragment);
        }
        if (daymanagefragment != null) {
            tran.hide(daymanagefragment);
        }
        if (contentfragment != null) {
            tran.hide(contentfragment);
        }
    }

    private void initview() {
     ivmain.setImageResource(R.drawable.menu_home);
     ivorder.setImageResource(R.drawable.menu_order);
     ivdaymange.setImageResource(R.drawable.menu_richeng);
     ivcontent.setImageResource(R.drawable.menu_user);
     tvmain.setTextColor(getResources().getColor(R.color.lightgray));
     tvorder.setTextColor(getResources().getColor(R.color.lightgray));
     tvdatemange.setTextColor(getResources().getColor(R.color.lightgray));
     tvcontent.setTextColor(getResources().getColor(R.color.lightgray));
    }

    @OnClick({R.id.iv_index,R.id.tv_index, R.id.iv_order, R.id.tv_order, R.id.iv_day, R.id.tv_day, R.id.iv_content,R.id.tv_content})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_index:
                selectButton(0);
                break;
            case R.id.tv_index:
                selectButton(0);
                break;
            case R.id.iv_order:
                selectButton(1);
                break;
            case R.id.tv_order:
                selectButton(1);
                break;
            case R.id.iv_day:
                selectButton(2);
                break;
            case R.id.tv_day:
                selectButton(2);
            case R.id.iv_content:
                selectButton(3);
                break;
            case R.id.tv_content:
                selectButton(3);
                break;
        }

    }
}
