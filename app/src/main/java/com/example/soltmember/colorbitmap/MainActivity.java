package com.example.soltmember.colorbitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onWindowFocusChanged(false);

//        try {
//
//
////            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
////                    R.drawable.area_1201_1);
//
////            int width = bitmap.getWidth();
////            int height = bitmap.getHeight();
//
////            int width = 100;
////            int height = 100;
//
////            TextView textRed = findViewById(R.id.textRed);
////            TextView textGreen = findViewById(R.id.textGreen);
////
////            textRed.setText(width);
////            textGreen.setText(height);
//
////            int pix[] = new int[width * height];
////
////            bitmap.getPixels(pix, 0 , width, width / 2, height / 2, 1, 1);
////
////            textRed.setText(pix[0]);
////            textGreen.setText(pix[1]);
//
//        }catch (Exception e){
//            Toast.makeText(this, "aaa", Toast.LENGTH_SHORT).show();
//        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        int width = findViewById(R.id.imageEbisu).getWidth();
        int height = findViewById(R.id.imageEbisu).getHeight();

        TextView textRed = findViewById(R.id.textRed);
        TextView textGreen = findViewById(R.id.textGreen);

        String stWidth = String.valueOf(width);
        String stHeight = String.valueOf(height);

        textRed.setText(stWidth);
        textGreen.setText(stHeight);

//        int pix[] = new int[width * height];
//
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.id.imageEbisu);
//        bitmap.getPixels(pix, 0, width, width / 2, height / 2, 1, 1);
//
//        String stRed = String.valueOf(pix[0]);
//        String stGreen = String.valueOf(pix[1]);
//
//        TextView textRed = findViewById(R.id.textRed);
//        TextView textGreen = findViewById(R.id.textGreen);
//        textRed.setText(stRed);
//        textGreen.setText(stGreen);


    }

}
