package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class GI {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC9946xh f67162a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC9625uh f67163b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC6932Lh f67164c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC6830Ih f67165d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC7922ek f67166e;

    /* renamed from: f, reason: collision with root package name */
    final Z.n0 f67167f = new Z.n0();

    /* renamed from: g, reason: collision with root package name */
    final Z.n0 f67168g = new Z.n0();

    public final GI a(InterfaceC9625uh interfaceC9625uh) {
        this.f67163b = interfaceC9625uh;
        return this;
    }

    public final GI b(InterfaceC9946xh interfaceC9946xh) {
        this.f67162a = interfaceC9946xh;
        return this;
    }

    public final GI d(InterfaceC7922ek interfaceC7922ek) {
        this.f67166e = interfaceC7922ek;
        return this;
    }

    public final GI e(InterfaceC6830Ih interfaceC6830Ih) {
        this.f67165d = interfaceC6830Ih;
        return this;
    }

    public final GI f(InterfaceC6932Lh interfaceC6932Lh) {
        this.f67164c = interfaceC6932Lh;
        return this;
    }

    public final GI c(String str, InterfaceC6694Eh interfaceC6694Eh, InterfaceC6592Bh interfaceC6592Bh) {
        this.f67167f.put(str, interfaceC6694Eh);
        if (interfaceC6592Bh != null) {
            this.f67168g.put(str, interfaceC6592Bh);
        }
        return this;
    }

    public final II g() {
        return new II(this);
    }
}
