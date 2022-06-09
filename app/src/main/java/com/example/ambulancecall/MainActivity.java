package com.example.ambulancecall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private TextView callText1;
    private Button callBtn1;

    private TextView callText2;
    private Button callBtn2;

    private TextView callText3;
    private Button callBtn3;

    private TextView callText4;
    private Button callBtn4;

    private TextView callText5;
    private Button callBtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callText1 = findViewById(R.id.callTxt1);
        callBtn1 = findViewById(R.id.callButton1);

        callText2 = findViewById(R.id.callTxt2);
        callBtn2 = findViewById(R.id.callButton2);

        callText3 = findViewById(R.id.callTxt3);
        callBtn3 = findViewById(R.id.callButton3);

        callText4 = findViewById(R.id.callTxt4);
        callBtn4 = findViewById(R.id.callButton4);

        callText5 = findViewById(R.id.callTxt5);
        callBtn5 = findViewById(R.id.callButton5);

        callBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CallButton1();
            }
        });

        callBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CallButton2();
            }
        });

        callBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CallButton3();
            }
        });

        callBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CallButton4();
            }
        });

        callBtn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CallButton5();
            }
        });
    }


    private void CallButton1() {
        String number = callText1.getText().toString();
        if(number.trim().length() > 0){
            if(ContextCompat.checkSelfPermission(  MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else{
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton2() {
        String number = callText2.getText().toString();
        if(number.trim().length() > 0){
            if(ContextCompat.checkSelfPermission(  MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else{
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton3() {
        String number = callText3.getText().toString();
        if(number.trim().length() > 0){
            if(ContextCompat.checkSelfPermission(  MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else{
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton4() {
        String number = callText4.getText().toString();
        if(number.trim().length() > 0){
            if(ContextCompat.checkSelfPermission(  MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else{
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton5() {
        String number = callText5.getText().toString();
        if(number.trim().length() > 0){
            if(ContextCompat.checkSelfPermission(  MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else{
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CallButton1();
                CallButton2();
                CallButton3();
                CallButton4();
                CallButton5();
            }
            else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}