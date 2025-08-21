package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7162Ok extends C7503Yq {

    /* renamed from: d, reason: collision with root package name */
    private final Rc.E f70002d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f70001c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f70003e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f70004f = 0;

    public final C6993Jk g() {
        C6993Jk c6993Jk = new C6993Jk(this);
        Rc.p0.k("createNewReference: Trying to acquire lock");
        synchronized (this.f70001c) {
            Rc.p0.k("createNewReference: Lock acquired");
            f(new C7027Kk(this, c6993Jk), new C7061Lk(this, c6993Jk));
            com.google.android.gms.common.internal.r.p(this.f70004f >= 0);
            this.f70004f++;
        }
        Rc.p0.k("createNewReference: Lock released");
        return c6993Jk;
    }

    public final void h() {
        Rc.p0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f70001c) {
            Rc.p0.k("markAsDestroyable: Lock acquired");
            com.google.android.gms.common.internal.r.p(this.f70004f >= 0);
            Rc.p0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f70003e = true;
            i();
        }
        Rc.p0.k("markAsDestroyable: Lock released");
    }

    protected final void i() {
        Rc.p0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f70001c) {
            try {
                Rc.p0.k("maybeDestroy: Lock acquired");
                com.google.android.gms.common.internal.r.p(this.f70004f >= 0);
                if (this.f70003e && this.f70004f == 0) {
                    Rc.p0.k("No reference is left (including root). Cleaning up engine.");
                    f(new C7128Nk(this), new C7371Uq());
                } else {
                    Rc.p0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Rc.p0.k("maybeDestroy: Lock released");
    }

    protected final void j() {
        Rc.p0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f70001c) {
            Rc.p0.k("releaseOneReference: Lock acquired");
            com.google.android.gms.common.internal.r.p(this.f70004f > 0);
            Rc.p0.k("Releasing 1 reference for JS Engine");
            this.f70004f--;
            i();
        }
        Rc.p0.k("releaseOneReference: Lock released");
    }

    public C7162Ok(Rc.E e10) {
        this.f70002d = e10;
    }
}
