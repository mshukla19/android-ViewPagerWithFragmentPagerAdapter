package nonsensecoder.com.viewpagerwithfragmentpageradapter.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;

import nonsensecoder.com.viewpagerwithfragmentpageradapter.R;
import nonsensecoder.com.viewpagerwithfragmentpageradapter.adapter.ViewPagerAdapter;
import nonsensecoder.com.viewpagerwithfragmentpageradapter.ui.fragment.TestFragment;


public class MainActivity extends ActionBarActivity implements ViewPager.OnPageChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewsAndConfigure();

    }

    private void findViewsAndConfigure() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // set number of cache page
        // I am setting it to 2 , so that all our fragments remain in cached state
        viewPager.setOffscreenPageLimit(1);

        ArrayList<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(TestFragment.newInstance("Fragment A", "#770000"));
        fragments.add(TestFragment.newInstance("Fragment B", "#007700"));
        fragments.add(TestFragment.newInstance("Fragment C", "#000077"));
        fragments.add(TestFragment.newInstance("Fragment D", "#000077"));
        fragments.add(TestFragment.newInstance("Fragment E", "#000077"));
        fragments.add(TestFragment.newInstance("Fragment F", "#000077"));


        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragments));

        viewPager.setOnPageChangeListener(this);


    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        // called when a new page been selected
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
