package tapioca.tads.ufrn.eagrariusbiomassa;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    int currentPage;
    boolean inibitFlag = true;
    int maxAllowedPage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pa = new FixedTabsPageAdapter(MainActivity.this, getSupportFragmentManager());
        vp.setAdapter(pa);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);

        tabLayout.getTabAt(0).setIcon(R.drawable.circle_accent);
        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
        tabLayout.getTabAt(6).setIcon(R.drawable.circle);

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                switch (
                        position){
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle_accent);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle_accent);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle_accent);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle);
                        break;
                    case 3:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle_accent);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle);
                        break;
                    case 4:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle_accent);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle);
                        break;
                    case 5:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle_accent);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle);
                        break;
                    case 6:
                        tabLayout.getTabAt(0).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(1).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(2).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(3).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(4).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(5).setIcon(R.drawable.circle);
                        tabLayout.getTabAt(6).setIcon(R.drawable.circle_accent);
                        break;
                    default:
                        return;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
