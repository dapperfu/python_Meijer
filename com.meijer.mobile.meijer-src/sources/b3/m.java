package b3;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import d3.C13599a;
import d3.C13600b;
import d3.C13609k;
import d3.P;
import d3.r;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static AudioManager f59972a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f59973b;

    public static /* synthetic */ void a(Context context, C13609k c13609k) {
        f59972a = (AudioManager) context.getSystemService("audio");
        c13609k.e();
    }

    public static int b(AudioManager audioManager, g gVar) {
        return P.f127888a >= 26 ? audioManager.abandonAudioFocusRequest(gVar.c()) : audioManager.abandonAudioFocus(gVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f59973b != applicationContext) {
                f59972a = null;
            }
            AudioManager audioManager = f59972a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final C13609k c13609k = new C13609k();
                C13600b.a().execute(new Runnable() { // from class: b3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a(applicationContext, c13609k);
                    }
                });
                c13609k.b();
                return (AudioManager) C13599a.e(f59972a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f59972a = audioManager2;
            return (AudioManager) C13599a.e(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int e(AudioManager audioManager, int i10) {
        if (P.f127888a >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return P.f127888a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    public static int h(AudioManager audioManager, g gVar) {
        return P.f127888a >= 26 ? audioManager.requestAudioFocus(gVar.c()) : audioManager.requestAudioFocus(gVar.f(), gVar.b().b(), gVar.e());
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            r.j("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }
}
