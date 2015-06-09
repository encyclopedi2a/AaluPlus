package com.example.gokarna.aaluplus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Stack;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private RelativeLayout relativeLayout;
    private ImageView firstImage, secondImage, thirdImage, fourthImage, fifthImage, sixthImage, seventhImage, eighthImage, ninthImage;
    private boolean initialClickPositionDetector = false;
    private int i = 0;
    private ImageView[] imageViews;
    private Stack<String> stack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstImage = (ImageView) findViewById(R.id.firstimage);
        secondImage = (ImageView) findViewById(R.id.secondimage);
        thirdImage = (ImageView) findViewById(R.id.thirdimage);
        fourthImage = (ImageView) findViewById(R.id.fourthimage);
        fifthImage = (ImageView) findViewById(R.id.fifthimage);
        sixthImage = (ImageView) findViewById(R.id.sixthimage);
        seventhImage = (ImageView) findViewById(R.id.seventhimage);
        eighthImage = (ImageView) findViewById(R.id.eighthimage);
        ninthImage = (ImageView) findViewById(R.id.ninthimage);
        imageViews = new ImageView[]{firstImage, secondImage, thirdImage, fourthImage, fifthImage, sixthImage, seventhImage, eighthImage, ninthImage};
        stack = new Stack<String>();
        for (ImageView imageView : imageViews) {
            imageView.setOnClickListener(this);
        }
        gameDetector();
    }

    public void gameDetector() {
        final String firstImageName = (String) firstImage.getTag();
        Thread mainGamethread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (firstImageName.equals("firstImage")) {
                    }
                }
            }
        };
        mainGamethread.start();
    }

    //overriding the onclick method for the image
    @Override
    public void onClick(View view) {
        if ((ImageView) view == firstImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(firstImage);
            } else {
               returnAlternatingImage(firstImage);
            }
        } else if ((ImageView) view == secondImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(secondImage);
            } else {
                returnAlternatingImage(secondImage);
            }

        } else if ((ImageView) view == thirdImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(thirdImage);
            } else {
               returnAlternatingImage(thirdImage);
            }

        } else if ((ImageView) view == fourthImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(fourthImage);
            } else {
               returnAlternatingImage(fourthImage);
            }

        } else if ((ImageView) view == fifthImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(fifthImage);
            } else {
               returnAlternatingImage(fifthImage);
            }

        } else if ((ImageView) view == sixthImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(sixthImage);
            } else {
               returnAlternatingImage(sixthImage);
            }

        } else if ((ImageView) view == seventhImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(seventhImage);
            } else {
                returnAlternatingImage(seventhImage);
            }

        } else if ((ImageView) view == eighthImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(eighthImage);
            } else {
                returnAlternatingImage(eighthImage);
            }

        } else if ((ImageView) view == ninthImage) {
            if (!initialClickPositionDetector) {
                returnInitialPositionDetect(ninthImage);
            } else {
                if (stack.get(0).equals("crossimageinitialised")) {
                    ninthImage.setImageResource(R.drawable.plus);
                    stack.clear();
                    stack.push("plusimageinitialised");
                } else {
                    ninthImage.setImageResource(R.drawable.cross);
                    stack.clear();
                    stack.push("crossimageinitialised");
                }
            }
        }
    }

    private void returnInitialPositionDetect(ImageView imageView) {
        imageView.setImageResource(R.drawable.cross);
        initialClickPositionDetector = true;
        stack.push("crossimageinitialised");
    }
    private void returnAlternatingImage(ImageView image){
        if (stack.get(0).equals("crossimageinitialised")) {
            image.setImageResource(R.drawable.plus);
            stack.clear();
            stack.push("plusimageinitialised");
        } else {
            image.setImageResource(R.drawable.cross);
            stack.clear();
            stack.push("crossimageinitialised");
        }
    }
}
