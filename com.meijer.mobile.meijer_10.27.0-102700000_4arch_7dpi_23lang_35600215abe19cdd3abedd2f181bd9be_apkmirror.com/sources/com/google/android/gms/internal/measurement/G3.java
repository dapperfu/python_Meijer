package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    private static F3 f81769a;

    public static synchronized void a(F3 f32) {
        if (f81769a != null) {
            throw new IllegalStateException("init() already called");
        }
        f81769a = f32;
    }

    public static synchronized F3 b() {
        try {
            if (f81769a == null) {
                a(new I3());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f81769a;
    }
}
