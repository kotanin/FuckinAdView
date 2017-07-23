package jp.kotanin.sample;

import android.graphics.Color;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import jp.kotanin.fuckinadview.FuckinAdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FuckinAdView fuckinAdView = (FuckinAdView)findViewById(R.id.fuckinAdView);
        fuckinAdView.setBackgroundColor(Color.RED);

        findViewById(R.id.fuckinButton).setOnClickListener((v) -> fuckinAdView.fuckinAnimateGo());
        findViewById(R.id.fuckin0AlphaButton).setOnClickListener((v) -> fuckinAdView.setAlpha(0F));
    }
}
