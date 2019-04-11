package com.haier.cellarette;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.haier.cellarette.libwebview.hioscommon.HiosRegister;
import com.haier.cellarette.libwebview.hois2.HiosHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HiosRegister.load();
        HiosHelper.config("ad.web.page", "web.page");
    }

    public void TV1(View view) {
//        startActivity(new Intent("hs.ac.webview.DemoWebviewMainActivity"));
        startActivity(new Intent("hs.act.BtnActivity"));
    }

}
