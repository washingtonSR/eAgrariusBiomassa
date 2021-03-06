package tapioca.tads.ufrn.eagrariusbiomassa;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import tapioca.tads.ufrn.eagrariusbiomassa.model.Biomassa;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    TabLayout tabLayout;
    CustomViewPager vp;
    Biomassa biomassa;
    Button mBtConfirmar;
    PagerAdapter pa;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        biomassa = new Biomassa();

        //Remove a sombra do cabeçalho
        getSupportActionBar().setElevation(0);
        //Versão customizada do ViewPager, assim o swipe fica desligado
        vp = findViewById(R.id.pager);

        pa = new FixedTabsPageAdapter(MainActivity.this, getSupportFragmentManager(), vp);
        vp.setAdapter(pa);
        vp.addOnPageChangeListener(this);
        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);
        //Impede de clicar no seletor de tabs
        tabLayout.clearOnTabSelectedListeners();
        setTabs();
    }

    private void setTabs() {
        tabLayout.getTabAt(0).setIcon(R.drawable.geo_circle_accent);
        tabLayout.getTabAt(1).setIcon(R.drawable.geo_circle);
        tabLayout.getTabAt(2).setIcon(R.drawable.geo_circle);
        tabLayout.getTabAt(3).setIcon(R.drawable.geo_circle);
        tabLayout.getTabAt(4).setIcon(R.drawable.geo_circle);
        tabLayout.getTabAt(5).setIcon(R.drawable.geo_circle);
        tabLayout.getTabAt(6).setIcon(R.drawable.geo_circle);
    }

    public void updateIcons(int position) {
        for (int i = 0; i < 7; i++) {
            if (i == position)
                tabLayout.getTabAt(i).setIcon(R.drawable.geo_circle_accent);
            else
                tabLayout.getTabAt(i).setIcon(R.drawable.geo_circle);
        }
    }

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

    public void pageSelect(int page) {
        vp.setCurrentItem(page);
    }

    public Biomassa getBiomassa() {
        return biomassa;
    }

    public void setBiomassa(Biomassa biomassa) {
        this.biomassa = biomassa;
    }
}
