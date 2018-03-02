package com.example.qsdkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.qianclass.qclasssdk.activity.ClassroomActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        etText = (EditText) findViewById(R.id.et_text);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String agreement = etText.getText().toString();
                if (TextUtils.isEmpty(agreement)) {
                    return;
                }
                ClassroomActivity.jumpToClassroomActivity(MainActivity.this, agreement);
            }
        });
    }
}
