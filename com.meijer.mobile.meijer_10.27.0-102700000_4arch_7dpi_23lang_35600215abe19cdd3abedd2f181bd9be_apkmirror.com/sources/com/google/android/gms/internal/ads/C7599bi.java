package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7599bi {

    /* renamed from: a, reason: collision with root package name */
    private final Hc.k f72857a;

    /* renamed from: b, reason: collision with root package name */
    private final Hc.j f72858b;

    /* renamed from: c, reason: collision with root package name */
    private C9304rh f72859c;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized C9304rh f(InterfaceC9198qh interfaceC9198qh) {
        C9304rh c9304rh = this.f72859c;
        if (c9304rh != null) {
            return c9304rh;
        }
        C9304rh c9304rh2 = new C9304rh(interfaceC9198qh);
        this.f72859c = c9304rh2;
        return c9304rh2;
    }

    public final InterfaceC6592Bh c() {
        C7402Zh c7402Zh = null;
        if (this.f72858b == null) {
            return null;
        }
        return new BinderC7336Xh(this, c7402Zh);
    }

    public final InterfaceC6694Eh d() {
        return new BinderC7369Yh(this, null);
    }

    public C7599bi(Hc.k kVar, Hc.j jVar) {
        this.f72857a = kVar;
        this.f72858b = jVar;
    }
}
