package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class N6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final V6 f68817a;

    /* renamed from: b, reason: collision with root package name */
    private final C7543b7 f68818b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f68819c;

    public N6(V6 v62, C7543b7 c7543b7, Runnable runnable) {
        this.f68817a = v62;
        this.f68818b = c7543b7;
        this.f68819c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f68817a.K();
        C7543b7 c7543b7 = this.f68818b;
        if (c7543b7.c()) {
            this.f68817a.C(c7543b7.f72716a);
        } else {
            this.f68817a.B(c7543b7.f72718c);
        }
        if (this.f68818b.f72719d) {
            this.f68817a.z("intermediate-response");
        } else {
            this.f68817a.D("done");
        }
        Runnable runnable = this.f68819c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
