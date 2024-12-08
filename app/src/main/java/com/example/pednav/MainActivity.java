package com.example.pednav;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.skt.tmap.TMapData;
import com.skt.tmap.TMapInfo;
import com.skt.tmap.TMapPoint;
import com.skt.tmap.TMapTapi;
import com.skt.tmap.TMapView;
import com.skt.tmap.overlay.TMapCircle;
import com.skt.tmap.overlay.TMapMarkerItem;
import com.skt.tmap.overlay.TMapPolyLine;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout container = findViewById(R.id.tmapViewContainer);
        TMapView tMapView = new TMapView(this);
        container.addView(tMapView);
        tMapView.setSKTMapApiKey("3UGs4iztJq9pPRWIE7Yrl7JlmbMO3jZu2XDMNDZe");
        tMapView.setOnMapReadyListener(new TMapView.OnMapReadyListener(){
            @Override
            public void onMapReady(){
                // TO-DO 맵 로딩 완료 후 구현
                // 마커 생상
                TMapMarkerItem marker = new TMapMarkerItem();
                marker.setId("marker1");
                marker.setTMapPoint(37.468954, 126.4544153);
                marker.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.point_dot));
                tMapView.addTMapMarkerItem(marker);
            }
        });
    }
}