package edu.cqvie.cn.maoaayi.activty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import edu.cqvie.cn.maoaayi.R;
import edu.cqvie.cn.maoaayi.bean.JsonDate;
import okhttp3.Call;

public class LoginActivty extends AppCompatActivity {
    private EditText userName;
    private EditText pwd;
    private Button loginbtn;
    private ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.login_layout);
        userName = (EditText) findViewById(R.id.phonenumber);
        pwd =  (EditText)findViewById(R.id.password);
        loginbtn = (Button)findViewById(R.id.loginButton);
        imageView = (ImageView)findViewById(R.id.portrait);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String editUserName =  userName.getText().toString();
                String eidtPsw = pwd.getText().toString();
                if (editUserName.equals("123")&&eidtPsw.equals("123")) {
                    OkHttpUtils.get().url("http://rapapi.org/mockjsdata/20526/catAunt/login").build().execute(new StringCallback() {
                        public void onError(Call call, Exception e, int id) {
                        }
                        public void onResponse(String response, int id) {
                            Toast.makeText(getApplicationContext(), "登录成功",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();
                            Gson gson = new Gson();
                            JsonDate jsonDate =  gson.fromJson(response, JsonDate.class);
                           String herduri = jsonDate.getData().getStrRootPath()+""+jsonDate.getData().getStrHeadImg();
                            intent.putExtra("herduri",herduri);
                            intent.setClass(LoginActivty.this,MainActivity.class);
                            LoginActivty.this.startActivity(intent);
                        }
                    });
                }
                else {
                    Toast.makeText(getApplicationContext(), "用户名或者密码错误请重新输入",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void onClick(View v) {

    }
}

