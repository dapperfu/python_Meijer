package k2;

import android.os.Handler;
import android.os.Looper;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C15089b {
    static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
