package za.co.riggaroo.android.arch.lifecycles;

import android.arch.lifecycle.LifecycleActivity;
import android.os.Bundle;

import com.google.android.exoplayer2.ui.SimpleExoPlayerView;

/**
 * @author rebeccafranks
 * @since 2017/07/13.
 */

public class VideoPlayerActivity extends LifecycleActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleExoPlayerView playerView = findViewById(R.id.simple_exoplayer_view);

        String videoUrl = "http://docs.evostream.com/sample_content/assets/bunny.mp4";
        getLifecycle().addObserver(new VideoPlayerComponent(getApplicationContext(), playerView, videoUrl));

    }
}
