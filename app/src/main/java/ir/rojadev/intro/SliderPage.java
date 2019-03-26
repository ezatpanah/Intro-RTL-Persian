package ir.rojadev.intro;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

public class SliderPage extends AppIntro
{
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);



        addSlide(IntroSlider.newInstance(R.layout.slider_one));
        addSlide(IntroSlider.newInstance(R.layout.slider_two));
        addSlide(IntroSlider.newInstance(R.layout.slider_three));
        addSlide(IntroSlider.newInstance(R.layout.slider_four));

        showStatusBar(false);
        setDoneText(getString(R.string.done_title));
        setSkipText(getString(R.string.skip_title));

        setScrollDurationFactor(5);

        setFlowAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment)
    {
        super.onSkipPressed(currentFragment);
        Toast.makeText(this, "شما اسلایدر را رد کردید", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed(Fragment currentFragment)
    {
        super.onDonePressed(currentFragment);
        Toast.makeText(this, "اتمام فعالیت شما", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment)
    {
        super.onSlideChanged(oldFragment, newFragment);
    }
}
