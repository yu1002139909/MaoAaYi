package edu.cqvie.cn.maoaayi.activty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import edu.cqvie.cn.maoaayi.R;
import edu.cqvie.cn.maoaayi.utils.BadgeView;

/**
 * Created by yuyu on 2017/6/23.
 */
public class MessageActivty extends Activity {
    private TextView txMessage;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_layout);
        txMessage = (TextView)findViewById(R.id.tv_message);
        BadgeView bv = new BadgeView(this,txMessage);
        bv.setText("5");
        bv.show();
        txMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MessageActivty.this,MessageXXActivty.class);
                MessageActivty.this.startActivity(intent);
            }
        });
    }
}
