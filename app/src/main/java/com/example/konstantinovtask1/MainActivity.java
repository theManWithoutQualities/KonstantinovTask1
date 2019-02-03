package com.example.konstantinovtask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        AppCenter.start(getApplication(), "cd0d67f1-e677-4354-af98-1f6eade8383d", Analytics.class, Crashes.class);
        setContentView(R.layout.activity_main);
        final TextView version = findViewById(R.id.version);
        version.setText(BuildConfig.VERSION_NAME);
    }
}
