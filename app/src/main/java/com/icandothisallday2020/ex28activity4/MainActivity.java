package com.icandothisallday2020.ex28activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        // 묵시적 인텐트로 실행[Activity 의 class 명을 모를때 호출방법]
        Intent intent= new Intent();
        //해당 액티비티의 고유식별자 키워드 설정
        intent.setAction("ZICO");
        startActivity(intent);
    }
}
