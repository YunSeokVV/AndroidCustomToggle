package com.example.customtoggle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatButton hot_btn;
    AppCompatButton ice_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hot_btn=(AppCompatButton)findViewById(R.id.hot_btn);
        ice_btn=(AppCompatButton)findViewById(R.id.ice_btn);

        hot_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                ChooseHot();
            }
        });

        ice_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                ChooseIced();
            }
        });

    }

    // 뜨거운 음료를 선택 했을 때 버튼을 토글 버튼을 설정하는 메소드 입니다.
    private void ChooseHot(){
        hot_btn.setBackground(ContextCompat.getDrawable(this, R.drawable.hot_button_radius));
        hot_btn.setTextColor(getResources().getColor(R.color.white));

        ice_btn.setBackground(ContextCompat.getDrawable(this, R.drawable.iced_button_white));
        ice_btn.setTextColor(getResources().getColor(R.color.black));

    }

    // 차가운 음료를 선택 했을 때 버튼을 토글 버튼을 설정하는 메소드 입니다.
    private void ChooseIced(){
        hot_btn.setBackground(ContextCompat.getDrawable(this, R.drawable.hot_button_white));
        hot_btn.setTextColor(getResources().getColor(R.color.black));

        ice_btn.setBackground(ContextCompat.getDrawable(this, R.drawable.iced_button_radius));
        ice_btn.setTextColor(getResources().getColor(R.color.white));

    }
}