package com.google.android.gms.vision.clearcut;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private final Object f86928b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private long f86929c = Long.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private final long f86927a = Math.round(30000.0d);

    public final boolean a() {
        synchronized (this.f86928b) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f86929c + this.f86927a > jCurrentTimeMillis) {
                    return false;
                }
                this.f86929c = jCurrentTimeMillis;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(double d10) {
    }
}
