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
                switch (position) {
                    case 0:
                        updateIcons(0);
                        break;
                    case 1:
                        updateIcons(1);
                        break;
                    case 2:
                        updateIcons(2);
                        break;
                    case 3:
                        updateIcons(3);
                        break;
                    case 4:
                        updateIcons(4);
                        break;
                    case 5:
                        updateIcons(5);
                        break;
                    case 6:
                        updateIcons(6);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void updateIcons(int position) {
        for (int i = 0; i < 7; i++) {
            if (i == position)
                tabLayout.getTabAt(0).setIcon(R.drawable.circle_accent);
            else
                tabLayout.getTabAt(0).setIcon(R.drawable.circle);
        }
    }

}
