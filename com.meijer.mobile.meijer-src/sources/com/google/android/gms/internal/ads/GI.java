package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class GI {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC10071xh f68002a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC9750uh f68003b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC7057Lh f68004c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC6955Ih f68005d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC8047ek f68006e;

    /* renamed from: f, reason: collision with root package name */
    final Z.n0 f68007f = new Z.n0();

    /* renamed from: g, reason: collision with root package name */
    final Z.n0 f68008g = new Z.n0();

    public final GI a(InterfaceC9750uh interfaceC9750uh) {
        this.f68003b = interfaceC9750uh;
        return this;
    }

    public final GI b(InterfaceC10071xh interfaceC10071xh) {
        this.f68002a = interfaceC10071xh;
        return this;
    }

    public final GI d(InterfaceC8047ek interfaceC8047ek) {
        this.f68006e = interfaceC8047ek;
        return this;
    }

    public final GI e(InterfaceC6955Ih interfaceC6955Ih) {
        this.f68005d = interfaceC6955Ih;
        return this;
    }

    public final GI f(InterfaceC7057Lh interfaceC7057Lh) {
        this.f68004c = interfaceC7057Lh;
        return this;
    }

    public final GI c(String str, InterfaceC6819Eh interfaceC6819Eh, InterfaceC6717Bh interfaceC6717Bh) {
        this.f68007f.put(str, interfaceC6819Eh);
        if (interfaceC6717Bh != null) {
            this.f68008g.put(str, interfaceC6717Bh);
        }
        return this;
    }

    public final II g() {
        return new II(this);
    }
}
