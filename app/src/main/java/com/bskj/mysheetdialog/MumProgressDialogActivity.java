package com.bskj.mysheetdialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bskj.mysheetdialog.dialog.MumProgressDialog;
import com.bskj.mysheetdialog.dialog.SimpleLoadingDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MumProgressDialogActivity extends AppCompatActivity {

    private Activity act;
    private MumProgressDialog progressDialog;

    private SimpleLoadingDialog aviProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumprogress_dialog);
        ButterKnife.bind(this);
        act = this;

        progressDialog = new MumProgressDialog(act);
        progressDialog.setMessage("加载中...");


        aviProgressDialog = new SimpleLoadingDialog(act);
    }

    @OnClick({R.id.btnOpen, R.id.btnClose,R.id.btnAviOpen, R.id.btnAviClose})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOpen:
                showMumDialog();
                break;
            case R.id.btnClose:
                cancleMumDialog();
                break;
            case R.id.btnAviOpen:
                showAviDialog();
                break;
            case R.id.btnAviClose:
                cancleAviDialog();
                break;
        }
    }

    private void showMumDialog() {
        if(null != progressDialog ){
            progressDialog.show();
        }
    }


    private void cancleMumDialog() {
        if(null != progressDialog ){
            progressDialog.dismiss();
        }
    }

    private void showAviDialog() {
        if(null != aviProgressDialog ){
            aviProgressDialog.show();
        }
    }


    private void cancleAviDialog() {
        if(null != aviProgressDialog ){
            aviProgressDialog.dismiss();
        }
    }
}
