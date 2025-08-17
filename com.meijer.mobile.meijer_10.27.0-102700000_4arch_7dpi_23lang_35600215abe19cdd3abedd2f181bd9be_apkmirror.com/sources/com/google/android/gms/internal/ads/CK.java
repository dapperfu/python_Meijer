package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class CK {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f65769a;

    /* renamed from: b, reason: collision with root package name */
    private final C7084Px f65770b;

    /* renamed from: c, reason: collision with root package name */
    private final C7561bG f65771c;

    /* renamed from: d, reason: collision with root package name */
    private final C8269hx f65772d;

    CK(Executor executor, C7084Px c7084Px, C7561bG c7561bG, C8269hx c8269hx) {
        this.f65769a = executor;
        this.f65771c = c7561bG;
        this.f65770b = c7084Px;
        this.f65772d = c8269hx;
    }

    public final void a(final InterfaceC9008ot interfaceC9008ot) {
        if (interfaceC9008ot == null) {
            return;
        }
        this.f65771c.R0(interfaceC9008ot.zzF());
        this.f65771c.H0(new InterfaceC9827wb() { // from class: com.google.android.gms.internal.ads.yK
            @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
            public final void D0(C9720vb c9720vb) {
                InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
                Rect rect = c9720vb.f79084d;
                interfaceC8156guZzN.c0(rect.left, rect.top, false);
            }
        }, this.f65769a);
        this.f65771c.H0(new InterfaceC9827wb() { // from class: com.google.android.gms.internal.ads.zK
            @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
            public final void D0(C9720vb c9720vb) {
                HashMap map = new HashMap();
                map.put("isVisible", true != c9720vb.f79090j ? "0" : "1");
                interfaceC9008ot.L("onAdVisibilityChanged", map);
            }
        }, this.f65769a);
        this.f65771c.H0(this.f65770b, this.f65769a);
        this.f65770b.q(interfaceC9008ot);
        InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
        if (((Boolean) Mc.A.c().a(C8659lf.f76246Z9)).booleanValue() && interfaceC8156guZzN != null) {
            interfaceC8156guZzN.M0(this.f65772d);
            interfaceC8156guZzN.N0(this.f65772d, null, null);
        }
        interfaceC9008ot.h0("/trackActiveViewUnit", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.AK
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f65119a.b((InterfaceC9008ot) obj, map);
            }
        });
        interfaceC9008ot.h0("/untrackActiveViewUnit", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.BK
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f65523a.c((InterfaceC9008ot) obj, map);
            }
        });
    }

    final /* synthetic */ void b(InterfaceC9008ot interfaceC9008ot, Map map) {
        this.f65770b.i();
    }

    final /* synthetic */ void c(InterfaceC9008ot interfaceC9008ot, Map map) {
        this.f65770b.a();
    }
}
