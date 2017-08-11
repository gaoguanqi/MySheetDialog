package com.bskj.mysheetdialog.dialog;

import android.app.Activity;
import android.app.Dialog;

import com.bskj.mysheetdialog.R;

/**
 * Created by Administrator on 2017/8/11.
 */
public class SimpleLoadingDialog {
    private Dialog progressDialog;

    public SimpleLoadingDialog(Activity activity) {
        progressDialog = new Dialog(activity, R.style.progress_dialog);
        progressDialog.setContentView(R.layout.simple_loading_dialog);
        progressDialog.setCancelable(true);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }




    public void show() {
        progressDialog.show();
    }

    public void dismiss() {
        progressDialog.dismiss();
    }

    public void setCancelable(boolean cancelable) {
        progressDialog.setCancelable(cancelable);
    }
}
