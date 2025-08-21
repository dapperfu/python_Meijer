package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class N6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final V6 f69657a;

    /* renamed from: b, reason: collision with root package name */
    private final C7668b7 f69658b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f69659c;

    public N6(V6 v62, C7668b7 c7668b7, Runnable runnable) {
        this.f69657a = v62;
        this.f69658b = c7668b7;
        this.f69659c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f69657a.K();
        C7668b7 c7668b7 = this.f69658b;
        if (c7668b7.c()) {
            this.f69657a.C(c7668b7.f73556a);
        } else {
            this.f69657a.B(c7668b7.f73558c);
        }
        if (this.f69658b.f73559d) {
            this.f69657a.z("intermediate-response");
        } else {
            this.f69657a.D("done");
        }
        Runnable runnable = this.f69659c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
