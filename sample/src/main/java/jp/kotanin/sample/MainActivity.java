package jp.kotanin.sample;

import android.graphics.Color;
import android.graphics.PixelFormat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import jp.kotanin.fuckinadview.FuckinAdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FuckinAdView fuckinAdView = (FuckinAdView)findViewById(R.id.fuckinAdView);
        fuckinAdView.setBackgroundColor(Color.RED);

        ImageView iv = new ImageView(this);
        iv.setImageDrawable(getDrawable(android.R.drawable.sym_def_app_icon));
        FrameLayout.LayoutParams ivParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER_HORIZONTAL
        );
        fuckinAdView.addView(iv, ivParams);

        findViewById(R.id.fuckinButton).setOnClickListener((v) -> fuckinAdView.fuckinAnimateGo());
        findViewById(R.id.fuckin0AlphaButton).setOnClickListener((v) -> fuckinAdView.setAlpha(0F));

        ListView fuckinList = (ListView)findViewById(R.id.fuckinList);
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) numList.add(i);
        fuckinList.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numList));
        fuckinList.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                fuckinAdView.fuckinAnimateGo();
            }
        });
    }
}
