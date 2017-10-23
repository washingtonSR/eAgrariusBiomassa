package tapioca.tads.ufrn.eagrariusbiomassa;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by herib on 12/10/2017.
 */

public class CustomViewPager extends ViewPager {
    Context context;
    int position=1,limite=2;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
    }


    //Aqui desativo as respostas a eventos de toque
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(position<limite){
            return super.onTouchEvent(event);
        }else {
            return false;
        }
    }

    public void limitarScroll(int position, int limite){
        this.position=position;
        this.limite=limite;
    }
}
