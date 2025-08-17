package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class HE0 extends AbstractC10121zE0 {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f67410h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Handler f67411i;

    /* renamed from: j, reason: collision with root package name */
    private Pu0 f67412j;

    protected abstract void A(Object obj, InterfaceC7666cF0 interfaceC7666cF0, AbstractC7307Wl abstractC7307Wl);

    protected int C(Object obj, int i10) {
        return 0;
    }

    protected long D(Object obj, long j10, C7453aF0 c7453aF0) {
        return j10;
    }

    protected abstract C7453aF0 E(Object obj, C7453aF0 c7453aF0);

    protected final void B(final Object obj, InterfaceC7666cF0 interfaceC7666cF0) {
        C8086gC.d(!this.f67410h.containsKey(obj));
        InterfaceC7560bF0 interfaceC7560bF0 = new InterfaceC7560bF0() { // from class: com.google.android.gms.internal.ads.EE0
            @Override // com.google.android.gms.internal.ads.InterfaceC7560bF0
            public final void a(InterfaceC7666cF0 interfaceC7666cF02, AbstractC7307Wl abstractC7307Wl) {
                this.f66372a.A(obj, interfaceC7666cF02, abstractC7307Wl);
            }
        };
        FE0 fe0 = new FE0(this, obj);
        this.f67410h.put(obj, new GE0(interfaceC7666cF0, interfaceC7560bF0, fe0));
        Handler handler = this.f67411i;
        handler.getClass();
        interfaceC7666cF0.f(handler, fe0);
        Handler handler2 = this.f67411i;
        handler2.getClass();
        interfaceC7666cF0.o(handler2, fe0);
        interfaceC7666cF0.i(interfaceC7560bF0, this.f67412j, p());
        if (z()) {
            return;
        }
        interfaceC7666cF0.d(interfaceC7560bF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public void j() throws IOException {
        Iterator it = this.f67410h.values().iterator();
        while (it.hasNext()) {
            ((GE0) it.next()).f67144a.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0
    protected final void u() {
        for (GE0 ge0 : this.f67410h.values()) {
            ge0.f67144a.d(ge0.f67145b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0
    protected final void v() {
        for (GE0 ge0 : this.f67410h.values()) {
            ge0.f67144a.n(ge0.f67145b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0
    protected void w(Pu0 pu0) {
        this.f67412j = pu0;
        this.f67411i = OV.Q(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0
    protected void y() {
        for (GE0 ge0 : this.f67410h.values()) {
            ge0.f67144a.g(ge0.f67145b);
            ge0.f67144a.l(ge0.f67146c);
            ge0.f67144a.e(ge0.f67146c);
        }
        this.f67410h.clear();
    }

    protected HE0() {
    }
}
