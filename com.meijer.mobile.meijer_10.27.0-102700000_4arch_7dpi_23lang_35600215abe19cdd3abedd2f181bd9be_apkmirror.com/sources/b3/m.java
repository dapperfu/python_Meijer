package b3;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import d3.C13466a;
import d3.C13467b;
import d3.C13476k;
import d3.P;
import d3.r;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static AudioManager f59765a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f59766b;

    public static /* synthetic */ void a(Context context, C13476k c13476k) {
        f59765a = (AudioManager) context.getSystemService("audio");
        c13476k.e();
    }

    public static int b(AudioManager audioManager, g gVar) {
        return P.f127086a >= 26 ? audioManager.abandonAudioFocusRequest(gVar.c()) : audioManager.abandonAudioFocus(gVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f59766b != applicationContext) {
                f59765a = null;
            }
            AudioManager audioManager = f59765a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final C13476k c13476k = new C13476k();
                C13467b.a().execute(new Runnable() { // from class: b3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a(applicationContext, c13476k);
                    }
                });
                c13476k.b();
                return (AudioManager) C13466a.e(f59765a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f59765a = audioManager2;
            return (AudioManager) C13466a.e(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int e(AudioManager audioManager, int i10) {
        if (P.f127086a >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return P.f127086a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    public static int h(AudioManager audioManager, g gVar) {
        return P.f127086a >= 26 ? audioManager.requestAudioFocus(gVar.c()) : audioManager.requestAudioFocus(gVar.f(), gVar.b().b(), gVar.e());
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
