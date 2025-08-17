package com.google.android.gms.vision.clearcut;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private final Object f86088b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private long f86089c = Long.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private final long f86087a = Math.round(30000.0d);

    public final boolean a() {
        synchronized (this.f86088b) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f86089c + this.f86087a > jCurrentTimeMillis) {
                    return false;
                }
                this.f86089c = jCurrentTimeMillis;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(double d10) {
    }
}
