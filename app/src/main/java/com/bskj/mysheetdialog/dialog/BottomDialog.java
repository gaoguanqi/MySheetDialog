package com.bskj.mysheetdialog.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.bskj.mysheetdialog.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/7/15.
 */
public class BottomDialog extends Dialog {
    private Context mContext;
    public BottomDialog(Context context) {
        super(context, R.style.ActionSheetDialogStyle);
        this.mContext = context;
        Window window = getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setWindowAnimations(R.style.ActionSheetDialogAnimation);
        //默认的Dialog只有5/6左右的宽度
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setAttributes(lp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dialog_bottom);
        ButterKnife.bind(this);
    }



    @OnClick({R.id.bd_text_1, R.id.bd_text_2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bd_text_1:
                dismiss();
                Toast.makeText(mContext,"ITEM 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bd_text_2:
                dismiss();
                Toast.makeText(mContext,"ITEM 2",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
