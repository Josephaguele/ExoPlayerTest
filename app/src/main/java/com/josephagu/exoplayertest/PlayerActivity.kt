package com.josephagu.exoplayertest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.SimpleExoPlayer
import com.josephagu.exoplayertest.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity()
{

    private val viewBinding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityPlayerBinding.inflate(layoutInflater)
    }

    private var player: SimpleExoPlayer? = null

    /*
    * Create a SimpleExoPlayer.Builder using your context, then call build to create your
    * SimpleExoPlayer object. This is then assigned to player, which you need to declare as
    * a member field. You then use the viewBinding.videoView.player mutable property to bind the
    *  player to its corresponding view.*/
    private fun initializePlayer()
    {
        player = SimpleExoPlayer.Builder (this)
            .build()
            .also{ exoPlayer ->
                viewBinding.videoView.player = exoPlayer
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}