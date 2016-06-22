package com.example.tobias.myapplication;

/**
 * Created by Tobias on 02.06.2016.
 */
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RssItem {
    // item title
    private String title;
    // item link
    private String link;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString() {
        return title;
    }
}