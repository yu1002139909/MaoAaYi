package edu.cqvie.cn.maoaayi.activty;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.StringCallback;

import edu.cqvie.cn.maoaayi.R;
import edu.cqvie.cn.maoaayi.bean.Order;
import edu.cqvie.cn.maoaayi.bean.PaiMin;
import okhttp3.Call;

public class IndexFragment extends Fragment {
    private ImageView ayhead;
    private TextView orderNum;
    private TextView goodpj;
    private TextView phnum;
    private TextView orderTime;
    private TextView orderAddres;
    private PaiMin pm;
    private Button mapbtn, xq;
    private Order order;
    private TextView serviceDate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_index, container, false);
        ayhead = (ImageView)view.findViewById(R.id.m_ayhear);
        orderNum = (TextView)view.findViewById(R.id.t_orderNum);
        goodpj = (TextView) view.findViewById(R.id.t_googpj);
        phnum = (TextView) view.findViewById(R.id.t_pm);
        orderTime = (TextView)view.findViewById(R.id.t_date);
        orderAddres = (TextView) view.findViewById(R.id.t_orderAddres);
        mapbtn = (Button) view.findViewById(R.id.b_mapbtn);
        serviceDate = (TextView)view.findViewById(R.id.t_servicedate);
        xq = (Button)view.findViewById(R.id.xx);
        mapbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openBrowserToGuide();
            }
        });
        xq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OkHttpUtils.get().url("http://rapapi.org/mockjsdata/20526/catAunt/orderInfo").build().execute(new StringCallback() {
                                                                                                                  public void onError(Call call, Exception e, int id) {

                                                                                                                  }

                                                                                                                  public void onResponse(String response, int id) {
                                                                                                                      Gson gson = new Gson();
                                                                                                                      Order jsonDate = gson.fromJson(response, Order.class);
                                                                                                                      String servicetime = Integer.toString(jsonDate.getData().getServiceTime());
                                                                                                                      String address = jsonDate.getData().getStrAddress();
                                                                                                                      String addressphone = jsonDate.getData().getStrAddressPhone();
                                                                                                                      String addressName = jsonDate.getData().getStrAddressRealName();
                                                                                                                      String DoorNo = jsonDate.getData().getStrDoorNo();
                                                                                                                      String endtime = jsonDate.getData().getStrEndTime();
                                                                                                                      String child = jsonDate.getData().getStrIsChild();
                                                                                                                      String pet = jsonDate.getData().getStrIsPet();
                                                                                                                      String lat = jsonDate.getData().getStrLat();
                                                                                                                      String lng = jsonDate.getData().getStrLng();
                                                                                                                      String orderNo = jsonDate.getData().getStrOrderNo();
                                                                                                                      String orderTask = jsonDate.getData().getStrOrderTaskId();
                                                                                                                      String orderstus = jsonDate.getData().getStrOrderTaskStatus();
                                                                                                                      String phote = jsonDate.getData().getStrPhone();
                                                                                                                      String realName = jsonDate.getData().getStrRealName();
                                                                                                                      String serviceDate = jsonDate.getData().getStrServiceDate();
                                                                                                                      String serviceType = jsonDate.getData().getStrServiceType();
                                                                                                                      String stersex = jsonDate.getData().getStrSex();
                                                                                                                      String startTime = jsonDate.getData().getStrStartTime();
                                                                                                                      String strType = jsonDate.getData().getStrType();
                                                                                                                      String[] strlist = {servicetime, address, addressphone, addressName, DoorNo, endtime, child, pet,
                                                                                                                              lat, lng, orderNo, orderTask, orderstus, phote, realName, serviceDate, serviceType, stersex, startTime
                                                                                                                              , strType


                                                                                                                      };
                                                                                                                      Intent intent = new Intent();

                                                                                                                      Bundle b = new Bundle();
                                                                                                                      b.putStringArray("userId", strlist);
                                                                                                                      intent.putExtras(b);
                                                                                                                      intent.setClass(getActivity(),ListActity.class);
                                                                                                                      IndexFragment.this.startActivity(intent);
                                                                                                                  }
                                                                                                              }
                );
            }
        });

       //获取头像
        Intent intent = getActivity().getIntent();
        //从Intent当中根据key取得value
        String herduri = intent.getStringExtra("herduri");
        OkHttpUtils
                .get()
                .url(herduri)
                .build()
                .execute(new BitmapCallback() {
                    public void onError(Call call, Exception e, int id) {

                    }

                    public void onResponse(Bitmap response, int id) {
                        ayhead.setImageBitmap(response);
                    }
                });

        //排行
        OkHttpUtils.get().url("http://rapapi.org/mockjs/20526/catAunt/top").build().execute(new StringCallback() {
            public void onError(Call call, Exception e, int id) {
            }

            public void onResponse(String response, int id) {
                Gson gson = new Gson();
                pm = gson.fromJson(response, PaiMin.class);
                phnum.setText(Integer.toString(pm.getData().getStrTop()) + "名");
                orderNum.setText(Integer.toString(pm.getData().getStrTotalOrder()) + "单");
                goodpj.setText(pm.getData().getStrTopOrderComment());
            }
        });

        //地址
        OkHttpUtils.get().url("http://rapapi.org/mockjsdata/20526/catAunt/orderInfo").build().execute(new StringCallback() {
            public void onError(Call call, Exception e, int id) {
            }

            public void onResponse(String response, int id) {
                Gson gson = new Gson();
                order = gson.fromJson(response, Order.class);
                orderTime.setText(order.getData().getStrServiceDate() + "  " + order.getData().getStrStartTime() + ":00-" +
                        order.getData().getStrEndTime() + ":00"
                );
                serviceDate.setText(Integer.toString(order.getData().getServiceTime()) + "小时服务");
                orderAddres.setText(order.getData().getStrAddress() + " " + order.getData().getStrDoorNo());
            }
        });
        phnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(),PaiHangActivty.class);
                IndexFragment.this.startActivity(intent);
            }
        });
        return view;
    }

    //高德地图打开
    private void openGaodeMapToGuide() {
        Intent intent = new Intent();
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        String url = "androidamap://route?sourceApplication=amap&slat=" + 29.345308 + "&slon=" + 106.259553 + "+&dlat=" + 29.628605666075 + "&dlon=" + 106.48131203492 + "&dname=B&dev=0&t=0";
        Uri uri = Uri.parse(url);
        //将功能Scheme以URI的方式传入data
        intent.setData(uri);
        //启动该页面即可
        startActivity(intent);
    }

    //高德地图浏览器版本
    private void openBrowserToGuide() {
        String storeName = "ss";
        String url = "http://uri.amap.com/navigation?from=106.259553,29.345308,重庆工程职业技术学院&to=106.259553,29.628605666075,渝北&,midwaypoint&mode=car&policy=1&src=mypage&coordinate=gaode&callnative=0";
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
