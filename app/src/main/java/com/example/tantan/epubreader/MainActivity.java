package com.example.tantan.epubreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.folioreader.Config;
import com.folioreader.FolioReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Config config = new Config()
                .setShowTts(false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FolioReader folioReader = FolioReader.get().setConfig(config, true);
        folioReader.openBook(R.raw.moby_dick);
    }
}

