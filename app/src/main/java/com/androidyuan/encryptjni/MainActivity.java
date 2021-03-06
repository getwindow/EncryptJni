package com.androidyuan.encryptjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.androidyuan.Encrypt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       toast(
               "native: "+Encrypt.MD5("bW9ua2V5cyBhbmQgZG9ncw==")
                       +" \n java:"+
                       Encrypt.javaMD5("bW9ua2V5cyBhbmQgZG9ncw=="));

        toast(
                "native: "+Encrypt.base64Decode("bW9ua2V5cyBhbmQgZG9ncw==")
                +" \n java:"+
                Encrypt.javaBase64Decode("bW9ua2V5cyBhbmQgZG9ncw==")
        );


        toast(
                "native: "+Encrypt.base64Encode("耍侯")
                        +" \n java:"+
                        Encrypt.javaBase64Encode("耍侯")
        );
    }


    private void toast(String str)
    {
        Toast.makeText(this,str+"",Toast.LENGTH_LONG).show();
    }
}
