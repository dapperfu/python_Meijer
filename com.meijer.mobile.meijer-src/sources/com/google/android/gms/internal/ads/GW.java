package com.google.android.gms.internal.ads;

import Oc.C4413m0;
import android.content.Context;

/* loaded from: classes6.dex */
public final class GW extends Oc.P {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68057a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC9135ou f68058b;

    /* renamed from: c, reason: collision with root package name */
    final C9481s60 f68059c;

    /* renamed from: d, reason: collision with root package name */
    final GI f68060d;

    /* renamed from: e, reason: collision with root package name */
    private Oc.H f68061e;

    @Override // Oc.Q
    public final void P7(InterfaceC10071xh interfaceC10071xh) {
        this.f68060d.b(interfaceC10071xh);
    }

    @Override // Oc.Q
    public final void Q2(C4413m0 c4413m0) {
        this.f68059c.v(c4413m0);
    }

    @Override // Oc.Q
    public final void Q6(InterfaceC8047ek interfaceC8047ek) {
        this.f68060d.d(interfaceC8047ek);
    }

    @Override // Oc.Q
    public final void V6(Oc.H h10) {
        this.f68061e = h10;
    }

    @Override // Oc.Q
    public final void e5(InterfaceC7057Lh interfaceC7057Lh) {
        this.f68060d.f(interfaceC7057Lh);
    }

    @Override // Oc.Q
    public final void i8(Jc.a aVar) {
        this.f68059c.N(aVar);
    }

    @Override // Oc.Q
    public final void m4(InterfaceC6955Ih interfaceC6955Ih, Oc.d2 d2Var) {
        this.f68060d.e(interfaceC6955Ih);
        this.f68059c.O(d2Var);
    }

    @Override // Oc.Q
    public final void o1(Jc.e eVar) {
        this.f68059c.g(eVar);
    }

    @Override // Oc.Q
    public final void q1(InterfaceC9750uh interfaceC9750uh) {
        this.f68060d.a(interfaceC9750uh);
    }

    @Override // Oc.Q
    public final void s7(String str, InterfaceC6819Eh interfaceC6819Eh, InterfaceC6717Bh interfaceC6717Bh) {
        this.f68060d.c(str, interfaceC6819Eh, interfaceC6717Bh);
    }

    @Override // Oc.Q
    public final void t8(C7088Mg c7088Mg) {
        this.f68059c.d(c7088Mg);
    }

    @Override // Oc.Q
    public final void w2(C7364Uj c7364Uj) {
        this.f68059c.S(c7364Uj);
    }

    @Override // Oc.Q
    public final Oc.N zze() {
        II iiG = this.f68060d.g();
        this.f68059c.e(iiG.i());
        this.f68059c.f(iiG.h());
        C9481s60 c9481s60 = this.f68059c;
        if (c9481s60.D() == null) {
            c9481s60.O(Oc.d2.b0());
        }
        return new HW(this.f68057a, this.f68058b, this.f68059c, iiG, this.f68061e);
    }

    public GW(AbstractC9135ou abstractC9135ou, Context context, String str) {
        C9481s60 c9481s60 = new C9481s60();
        this.f68059c = c9481s60;
        this.f68060d = new GI();
        this.f68058b = abstractC9135ou;
        c9481s60.P(str);
        this.f68057a = context;
    }
}
