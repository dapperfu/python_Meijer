package com.android.volley;

/* loaded from: classes4.dex */
public class VolleyError extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final h f63716a;

    /* renamed from: b, reason: collision with root package name */
    private long f63717b;

    public VolleyError() {
        this.f63716a = null;
    }

    void a(long j10) {
        this.f63717b = j10;
    }

    public VolleyError(h hVar) {
        this.f63716a = hVar;
    }

    public VolleyError(Throwable th2) {
        super(th2);
        this.f63716a = null;
    }
}
