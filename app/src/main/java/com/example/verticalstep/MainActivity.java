package com.example.verticalstep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;

import com.baoyachi.stepview.VerticalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    VerticalStepView verticalStepView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verticalStepView = findViewById(R.id.step_view);

        stepview();


    }

    void stepview()
    {

        List<String> list0 = new ArrayList<>();
        list0.add("Step-1");
        list0.add("Step-2");
        list0.add("Step-3");
        list0.add("Step-4");
        list0.add("Step-5");
        list0.add("Step-6");
        verticalStepView.setStepsViewIndicatorComplectingPosition( 2)
                .reverseDraw(false)
                .setStepViewTexts(list0)
                .setLinePaddingProportion(2)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(MainActivity.this, android.R.color.white))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(MainActivity.this, R.color.nest_Step_item))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.white))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(MainActivity.this, R.color.nest_Step_item))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(MainActivity.this, com.baoyachi.stepview.R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(MainActivity.this, com.baoyachi.stepview.R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(MainActivity.this,com.baoyachi.stepview.R.drawable.attention));//设置StepsViewIndicator AttentionIcon

    }
}