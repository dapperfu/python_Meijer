package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC6875Jr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final zzcbg f67982a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f67983b = false;

    RunnableC6875Jr(zzcbg zzcbgVar) {
        this.f67982a = zzcbgVar;
    }

    public final void a() {
        this.f67983b = true;
        this.f67982a.w();
    }

    public final void b() {
        this.f67983b = false;
        e();
    }

    private final void e() {
        HandlerC6857Jd0 handlerC6857Jd0 = Pc.D0.f25081l;
        handlerC6857Jd0.removeCallbacks(this);
        handlerC6857Jd0.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f67983b) {
            return;
        }
        this.f67982a.w();
        e();
    }
}
