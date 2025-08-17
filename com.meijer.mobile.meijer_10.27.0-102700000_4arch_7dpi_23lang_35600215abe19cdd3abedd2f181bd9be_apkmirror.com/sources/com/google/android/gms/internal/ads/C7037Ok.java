package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7037Ok extends C7378Yq {

    /* renamed from: d, reason: collision with root package name */
    private final Pc.E f69162d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f69161c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f69163e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f69164f = 0;

    public final C6868Jk g() {
        C6868Jk c6868Jk = new C6868Jk(this);
        Pc.p0.k("createNewReference: Trying to acquire lock");
        synchronized (this.f69161c) {
            Pc.p0.k("createNewReference: Lock acquired");
            f(new C6902Kk(this, c6868Jk), new C6936Lk(this, c6868Jk));
            com.google.android.gms.common.internal.r.p(this.f69164f >= 0);
            this.f69164f++;
        }
        Pc.p0.k("createNewReference: Lock released");
        return c6868Jk;
    }

    public final void h() {
        Pc.p0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f69161c) {
            Pc.p0.k("markAsDestroyable: Lock acquired");
            com.google.android.gms.common.internal.r.p(this.f69164f >= 0);
            Pc.p0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f69163e = true;
            i();
        }
        Pc.p0.k("markAsDestroyable: Lock released");
    }

    protected final void i() {
        Pc.p0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f69161c) {
            try {
                Pc.p0.k("maybeDestroy: Lock acquired");
                com.google.android.gms.common.internal.r.p(this.f69164f >= 0);
                if (this.f69163e && this.f69164f == 0) {
                    Pc.p0.k("No reference is left (including root). Cleaning up engine.");
                    f(new C7003Nk(this), new C7246Uq());
                } else {
                    Pc.p0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Pc.p0.k("maybeDestroy: Lock released");
    }

    protected final void j() {
        Pc.p0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f69161c) {
            Pc.p0.k("releaseOneReference: Lock acquired");
            com.google.android.gms.common.internal.r.p(this.f69164f > 0);
            Pc.p0.k("Releasing 1 reference for JS Engine");
            this.f69164f--;
            i();
        }
        Pc.p0.k("releaseOneReference: Lock released");
    }

    public C7037Ok(Pc.E e10) {
        this.f69162d = e10;
    }
}
