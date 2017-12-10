package tapioca.tads.ufrn.eagrariusbiomassa;


import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Aluno on 05/10/2016.
 */
public class Fragment1 extends Fragment {
    @BindView(R.id.frag_01_bt_01)
    Button mBtContinuar;
    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b){
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        unbinder = ButterKnife.bind(this, v);
        setListeners();
//logica do fragment
        return v;
    }
    public void setListeners(){
        mBtContinuar.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Button view = (Button) v;
                        view.getBackground().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        // Your action here on button click
                        ((MainActivity)getActivity()).onPageSelected(1);
                        ((MainActivity)getActivity()).pageSelect(1);
                    case MotionEvent.ACTION_CANCEL: {
                        Button view = (Button) v;
                        view.getBackground().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return true;
            }
        });
    }
}
