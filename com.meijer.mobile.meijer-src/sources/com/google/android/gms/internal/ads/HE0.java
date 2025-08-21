package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class HE0 extends AbstractC10246zE0 {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f68250h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Handler f68251i;

    /* renamed from: j, reason: collision with root package name */
    private Pu0 f68252j;

    protected abstract void A(Object obj, InterfaceC7791cF0 interfaceC7791cF0, AbstractC7432Wl abstractC7432Wl);

    protected int C(Object obj, int i10) {
        return 0;
    }

    protected long D(Object obj, long j10, C7578aF0 c7578aF0) {
        return j10;
    }

    protected abstract C7578aF0 E(Object obj, C7578aF0 c7578aF0);

    protected final void B(final Object obj, InterfaceC7791cF0 interfaceC7791cF0) {
        C8211gC.d(!this.f68250h.containsKey(obj));
        InterfaceC7685bF0 interfaceC7685bF0 = new InterfaceC7685bF0() { // from class: com.google.android.gms.internal.ads.EE0
            @Override // com.google.android.gms.internal.ads.InterfaceC7685bF0
            public final void a(InterfaceC7791cF0 interfaceC7791cF02, AbstractC7432Wl abstractC7432Wl) {
                this.f67212a.A(obj, interfaceC7791cF02, abstractC7432Wl);
            }
        };
        FE0 fe0 = new FE0(this, obj);
        this.f68250h.put(obj, new GE0(interfaceC7791cF0, interfaceC7685bF0, fe0));
        Handler handler = this.f68251i;
        handler.getClass();
        interfaceC7791cF0.f(handler, fe0);
        Handler handler2 = this.f68251i;
        handler2.getClass();
        interfaceC7791cF0.o(handler2, fe0);
        interfaceC7791cF0.i(interfaceC7685bF0, this.f68252j, p());
        if (z()) {
            return;
        }
        interfaceC7791cF0.d(interfaceC7685bF0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public void j() throws IOException {
        Iterator it = this.f68250h.values().iterator();
        while (it.hasNext()) {
            ((GE0) it.next()).f67984a.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0
    protected final void u() {
        for (GE0 ge0 : this.f68250h.values()) {
            ge0.f67984a.d(ge0.f67985b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0
    protected final void v() {
        for (GE0 ge0 : this.f68250h.values()) {
            ge0.f67984a.n(ge0.f67985b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0
    protected void w(Pu0 pu0) {
        this.f68252j = pu0;
        this.f68251i = OV.Q(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0
    protected void y() {
        for (GE0 ge0 : this.f68250h.values()) {
            ge0.f67984a.g(ge0.f67985b);
            ge0.f67984a.l(ge0.f67986c);
            ge0.f67984a.e(ge0.f67986c);
        }
        this.f68250h.clear();
    }

    protected HE0() {
    }
}
