package G;

import android.os.Handler;
import android.os.Looper;
import j2.C14928h;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f11127a;

    public static Handler a() {
        if (f11127a != null) {
            return f11127a;
        }
        synchronized (l.class) {
            try {
                if (f11127a == null) {
                    f11127a = C14928h.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11127a;
    }

    private l() {
    }
}
