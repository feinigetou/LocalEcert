package com.sspku.localecert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zuosoul on 2017/6/29.
 */

public class QueryResultActivity extends Activity {
    Button btn_ret;
    TextView username,usernum,usercat;
    ImageView userimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queryresult);

        username=(TextView) findViewById(R.id.result_name_info);
        usernum=(TextView) findViewById(R.id.result_num1_info);
        usercat=(TextView) findViewById(R.id.result_cat_info);
        userimg=(ImageView) findViewById(R.id.result_img);
        btn_ret=(Button) findViewById(R.id.queryresult_return);

        Intent intent=getIntent();
        String name=intent.getStringExtra("nam");
        String cat=intent.getStringExtra("ca");
        username.setText(name);
        usernum.setText("1234567890");
        userimg.setImageResource(R.drawable.z);
        if(cat.equals("1")){
            usercat.setText("学生证");
        }
        if(cat.equals("2")){
            usercat.setText("身份证");
        }
        if(cat.equals("3")){
            usercat.setText("驾驶证");
        }
        if(cat.equals("4")){
            usercat.setText("教师证");
        }

        btn_ret.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(QueryResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}