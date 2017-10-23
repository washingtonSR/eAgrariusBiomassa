package tapioca.tads.ufrn.eagrariusbiomassa;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by herib on 12/10/2017.
 */

public class CustomViewPager extends ViewPager implements GestureDetector.OnGestureListener{
    Context context;
    GestureDetector mGestureDetector;
    int position=1,limite=2;
    boolean movimento_valido = false;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        mGestureDetector = new GestureDetector(context,this);
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

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        movimento_valido=true;
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
