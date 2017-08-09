package com.bskj.mysheetdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bskj.mysheetdialog.popu.OptionMenu;
import com.bskj.mysheetdialog.popu.OptionMenuView;
import com.bskj.mysheetdialog.popu.PopupMenuView;
import com.bskj.mysheetdialog.popu.PopupView;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PopuActivity extends AppCompatActivity {

    @BindView(R.id.popu_text)
    TextView popuText;
    @BindView(R.id.popu_btn1)
    Button popuBtn1;
    @BindView(R.id.popu_rl)
    RelativeLayout popuRl;
    @BindView(R.id.popu_btn2)
    Button popuBtn2;
    @BindView(R.id.popu_btn3)
    Button popuBtn3;
    @BindView(R.id.popu_btn4)
    Button popuBtn4;

    private Context ctx;
    private PopupMenuView menuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popu);
        ButterKnife.bind(this);
        ctx = this;
        // 根据menu资源文件创建
        menuView = new PopupMenuView(this);


        menuView.setMenuItems(Arrays.asList(
//                new OptionMenu("复制"), new OptionMenu("转发到朋友圈"),
//                new OptionMenu("收藏"), new OptionMenu("翻译"),
                new OptionMenu("删除")));
        menuView.setOrientation(LinearLayout.VERTICAL);
        menuView.setSites(PopupView.SITE_BOTTOM);
        // 设置点击监听事件
        menuView.setOnMenuClickListener(new OptionMenuView.OnOptionMenuClickListener() {
            @Override
            public boolean onOptionMenuClick(int position, OptionMenu menu) {
                Toast.makeText(ctx, menu.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    @OnClick({R.id.popu_text, R.id.popu_btn1, R.id.popu_rl, R.id.popu_btn2, R.id.popu_btn3, R.id.popu_btn4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popu_text:
                // 显示在mButtom控件的周围
                shopMenuView(view);
                break;
            case R.id.popu_btn1:
                //弹出选项弹窗
                shopMenuView(view);
                break;
            case R.id.popu_rl:
                //弹出选项弹窗
                shopMenuView(view);
                break;
            case R.id.popu_btn2:
                //弹出选项弹窗
                shopMenuView(view);
                break;
            case R.id.popu_btn3:
                //弹出选项弹窗
                shopMenuView(view);
                break;
            case R.id.popu_btn4:
                //弹出选项弹窗
                shopMenuView(view);
                break;
        }
    }

    private void shopMenuView(View view) {
        if(menuView != null && !menuView.isShowing()){
            menuView.show(view);
        }
    }


}
