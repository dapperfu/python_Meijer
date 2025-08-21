package qu;

import android.os.Looper;

/* renamed from: qu.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16767b {

    /* renamed from: a, reason: collision with root package name */
    private static Thread f159000a;

    public static boolean b() {
        if (f159000a == null) {
            f159000a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f159000a;
    }

    public static void a() {
        if (b()) {
        } else {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
