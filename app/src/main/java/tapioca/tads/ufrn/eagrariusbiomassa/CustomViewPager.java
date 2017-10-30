package tapioca.tads.ufrn.eagrariusbiomassa;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.github.pwittchen.swipe.library.Swipe;
import com.github.pwittchen.swipe.library.SwipeListener;

/**
 * Created by herib on 12/10/2017.
 */

public class CustomViewPager extends ViewPager{
    Context context;
    int position=1,limite=2;
    private Swipe swipe;
    boolean movimento_valido = false;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        swipe = new Swipe();
        swipe.setListener(new SwipeListener() {
            @Override public void onSwipingLeft(final MotionEvent event) {
                Log.i("swipe","SWIPING_LEFT");
            }

            @Override public void onSwipedLeft(final MotionEvent event) {
                Log.i("swipe","SWIPED_LEFT");
                //block
            }

            @Override public void onSwipingRight(final MotionEvent event) {
                Log.i("swipe","SWIPING_RIGHT");
            }

            @Override public void onSwipedRight(final MotionEvent event) {
                Log.i("swipe","SWIPED_RIGHT");
            }

            @Override public void onSwipingUp(final MotionEvent event) {
                Log.i("swipe","SWIPING_UP");
            }

            @Override public void onSwipedUp(final MotionEvent event) {
                Log.i("swipe","SWIPED_UP");
            }

            @Override public void onSwipingDown(final MotionEvent event) {
                Log.i("swipe","SWIPING_DOWN");
            }

            @Override public void onSwipedDown(final MotionEvent event) {
                Log.i("swipe","SWIPED_DOWN");
                //block
            }
        });
    }

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    //Aqui desativo as respostas a eventos de toque
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(position<limite){
//            Log.i("event",event.toString());
            return super.onTouchEvent(event);
        }else {
            return false;
        }
    }

    public void limitarScroll(int position, int limite){
        this.position=position;
        this.limite=limite;
    }


    //-------------------

}
