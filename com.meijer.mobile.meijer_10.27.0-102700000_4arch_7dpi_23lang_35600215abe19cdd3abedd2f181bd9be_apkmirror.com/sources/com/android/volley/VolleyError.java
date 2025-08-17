package com.android.volley;

/* loaded from: classes4.dex */
public class VolleyError extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final h f62877a;

    /* renamed from: b, reason: collision with root package name */
    private long f62878b;

    public VolleyError() {
        this.f62877a = null;
    }

    void a(long j10) {
        this.f62878b = j10;
    }

    public VolleyError(h hVar) {
        this.f62877a = hVar;
    }

    public VolleyError(Throwable th2) {
        super(th2);
        this.f62877a = null;
    }
}
