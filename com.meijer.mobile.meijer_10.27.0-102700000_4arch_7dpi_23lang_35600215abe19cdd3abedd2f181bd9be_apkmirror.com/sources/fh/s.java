package fh;

import android.os.Looper;

/* loaded from: classes7.dex */
public class s {
    public static void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
