package tapioca.tads.ufrn.eagrariusbiomassa.utils;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

/**
 * Created by herib on 10/12/2017.
 */

public class TTS {
    private TextToSpeech tts;
    private String sDefSystemLanguage;
    private Context context;

    public TTS(String _systemLanguage, Context _context) {
        sDefSystemLanguage = _systemLanguage;
        context = _context;

        setTextToSpeech();
    }

    public void Speak(String textToSpeak) {
        tts.speak(textToSpeak, TextToSpeech.QUEUE_FLUSH, null);
    }

    public void Flush() {
        tts.stop();
    }

    private void setTextToSpeech() {
        tts = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    tts.setLanguage(new Locale(sDefSystemLanguage));
                }
            }
        });
    }
}
