package uu;

import android.os.Looper;

/* renamed from: uu.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17331b {

    /* renamed from: a, reason: collision with root package name */
    private static Thread f163524a;

    public static boolean b() {
        if (f163524a == null) {
            f163524a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f163524a;
    }

    public static void a() {
        if (b()) {
        } else {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
