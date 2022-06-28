package com.example.android.wave_box;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import me.itangqi.waveloadingview.WaveLoadingView;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor gyroscopeSensor;
    private SensorEventListener gyroscopeEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        WaveLoadingView waveLoadingView = findViewById(R.id.wave);
        waveLoadingView.setProgressValue(62);
        waveLoadingView.setBottomTitle("62% Water");
        waveLoadingView.setCenterTitle("");
        waveLoadingView.setTopTitle("");
    }
}