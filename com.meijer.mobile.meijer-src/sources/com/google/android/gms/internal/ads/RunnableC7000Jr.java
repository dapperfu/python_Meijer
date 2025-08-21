package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7000Jr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final zzcbg f68822a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68823b = false;

    RunnableC7000Jr(zzcbg zzcbgVar) {
        this.f68822a = zzcbgVar;
    }

    public final void a() {
        this.f68823b = true;
        this.f68822a.w();
    }

    public final void b() {
        this.f68823b = false;
        e();
    }

    private final void e() {
        HandlerC6982Jd0 handlerC6982Jd0 = Rc.D0.f32295l;
        handlerC6982Jd0.removeCallbacks(this);
        handlerC6982Jd0.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f68823b) {
            return;
        }
        this.f68822a.w();
        e();
    }
}
