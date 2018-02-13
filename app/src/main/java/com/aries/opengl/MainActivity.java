package com.aries.opengl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aries.opengl.change.TutorialPartIActivity;
import com.aries.opengl.helloworld.HelloActivity;
import com.aries.opengl.helloworld.TriangleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFFmpegClick(View view) {
        switch (view.getId()) {
            case R.id.opengl_hello:
                startActivity(new Intent(this, HelloActivity.class));
                break;
            case R.id.opengl_triangle:
                startActivity(new Intent(this, TriangleActivity.class));
                break;
            case R.id.opengl_square:
                startActivity(new Intent(this, TutorialPartIActivity.class));

                break;
            default:
                break;
        }
    }
}
