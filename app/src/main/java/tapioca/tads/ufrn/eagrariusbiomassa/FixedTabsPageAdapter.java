package tapioca.tads.ufrn.eagrariusbiomassa;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Aluno on 05/10/2016.
 */
public class FixedTabsPageAdapter extends FragmentPagerAdapter {
    Context context;
    CustomViewPager vp;
    int position;

    public FixedTabsPageAdapter(Context contex, FragmentManager fm, CustomViewPager vp) {
        super(fm);
        this.context = contex;
        this.vp = vp;
    }

    public CharSequence getPageTitle(int position) {
        this.position = position;
        switch (position) {
            case 0:
                return "";
            case 1:
                return "";
            case 2:
                return "";
            case 3:
                return "";
            case 4:
                return "";
            case 5:
                return "";
            case 6:
                return "";
            default:
                return null;
        }
    }

    @Override
    public Fragment getItem(int position) {
        this.position = position;
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            case 3:
                return new Fragment4();
            case 4:
                return new Fragment5();
            case 5:
                return new Fragment6();
            case 6:
                return new Fragment7();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 7;
    }

}