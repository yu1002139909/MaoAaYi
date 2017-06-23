package edu.cqvie.cn.maoaayi.activty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import edu.cqvie.cn.maoaayi.R;

/**
 * Created by yuyu on 2017/6/23.
 */
public class MoneyActivty extends Activity {
    private ImageView fiveMonthMoey;
    private Button btnmessage;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_layout);
        fiveMonthMoey = (ImageView) findViewById(R.id.iv_five);
        btnmessage = (Button)findViewById(R.id.btn_mess);
        btnmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MoneyActivty.this,MessageActivty.class);
                MoneyActivty.this.startActivity(intent);
            }
        });
        fiveMonthMoey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MoneyActivty.this,FiveMonthActivty.class);
                MoneyActivty.this.startActivity(intent);
            }
        });
    }
}
