package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6868Jk extends C7378Yq {

    /* renamed from: c, reason: collision with root package name */
    private final Object f67956c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C7037Ok f67957d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f67958e;

    public final void h() {
        Pc.p0.k("release: Trying to acquire lock");
        synchronized (this.f67956c) {
            try {
                Pc.p0.k("release: Lock acquired");
                if (this.f67958e) {
                    Pc.p0.k("release: Lock already released");
                    return;
                }
                this.f67958e = true;
                f(new C6766Gk(this), new C7246Uq());
                f(new C6800Hk(this), new C6834Ik(this));
                Pc.p0.k("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C6868Jk(C7037Ok c7037Ok) {
        this.f67957d = c7037Ok;
    }
}
