package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6993Jk extends C7503Yq {

    /* renamed from: c, reason: collision with root package name */
    private final Object f68796c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C7162Ok f68797d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f68798e;

    public final void h() {
        Rc.p0.k("release: Trying to acquire lock");
        synchronized (this.f68796c) {
            try {
                Rc.p0.k("release: Lock acquired");
                if (this.f68798e) {
                    Rc.p0.k("release: Lock already released");
                    return;
                }
                this.f68798e = true;
                f(new C6891Gk(this), new C7371Uq());
                f(new C6925Hk(this), new C6959Ik(this));
                Rc.p0.k("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C6993Jk(C7162Ok c7162Ok) {
        this.f68797d = c7162Ok;
    }
}
