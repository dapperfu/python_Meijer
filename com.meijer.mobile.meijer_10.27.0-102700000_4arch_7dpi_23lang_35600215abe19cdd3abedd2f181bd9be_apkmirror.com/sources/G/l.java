package G;

import android.os.Handler;
import android.os.Looper;
import j2.C14840h;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f11202a;

    public static Handler a() {
        if (f11202a != null) {
            return f11202a;
        }
        synchronized (l.class) {
            try {
                if (f11202a == null) {
                    f11202a = C14840h.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11202a;
    }

    private l() {
    }
}
