package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    private static F3 f82609a;

    public static synchronized void a(F3 f32) {
        if (f82609a != null) {
            throw new IllegalStateException("init() already called");
        }
        f82609a = f32;
    }

    public static synchronized F3 b() {
        try {
            if (f82609a == null) {
                a(new I3());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f82609a;
    }
}
