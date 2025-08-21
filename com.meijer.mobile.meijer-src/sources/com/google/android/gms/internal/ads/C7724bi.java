package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7724bi {

    /* renamed from: a, reason: collision with root package name */
    private final Jc.k f73697a;

    /* renamed from: b, reason: collision with root package name */
    private final Jc.j f73698b;

    /* renamed from: c, reason: collision with root package name */
    private C9429rh f73699c;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized C9429rh f(InterfaceC9323qh interfaceC9323qh) {
        C9429rh c9429rh = this.f73699c;
        if (c9429rh != null) {
            return c9429rh;
        }
        C9429rh c9429rh2 = new C9429rh(interfaceC9323qh);
        this.f73699c = c9429rh2;
        return c9429rh2;
    }

    public final InterfaceC6717Bh c() {
        C7527Zh c7527Zh = null;
        if (this.f73698b == null) {
            return null;
        }
        return new BinderC7461Xh(this, c7527Zh);
    }

    public final InterfaceC6819Eh d() {
        return new BinderC7494Yh(this, null);
    }

    public C7724bi(Jc.k kVar, Jc.j jVar) {
        this.f73697a = kVar;
        this.f73698b = jVar;
    }
}
