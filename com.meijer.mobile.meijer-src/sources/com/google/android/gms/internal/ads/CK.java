package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class CK {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f66609a;

    /* renamed from: b, reason: collision with root package name */
    private final C7209Px f66610b;

    /* renamed from: c, reason: collision with root package name */
    private final C7686bG f66611c;

    /* renamed from: d, reason: collision with root package name */
    private final C8394hx f66612d;

    CK(Executor executor, C7209Px c7209Px, C7686bG c7686bG, C8394hx c8394hx) {
        this.f66609a = executor;
        this.f66611c = c7686bG;
        this.f66610b = c7209Px;
        this.f66612d = c8394hx;
    }

    public final void a(final InterfaceC9133ot interfaceC9133ot) {
        if (interfaceC9133ot == null) {
            return;
        }
        this.f66611c.R0(interfaceC9133ot.zzF());
        this.f66611c.G0(new InterfaceC9952wb() { // from class: com.google.android.gms.internal.ads.yK
            @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
            public final void C0(C9845vb c9845vb) {
                InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
                Rect rect = c9845vb.f79924d;
                interfaceC8281guZzN.b0(rect.left, rect.top, false);
            }
        }, this.f66609a);
        this.f66611c.G0(new InterfaceC9952wb() { // from class: com.google.android.gms.internal.ads.zK
            @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
            public final void C0(C9845vb c9845vb) {
                HashMap map = new HashMap();
                map.put("isVisible", true != c9845vb.f79930j ? "0" : "1");
                interfaceC9133ot.L("onAdVisibilityChanged", map);
            }
        }, this.f66609a);
        this.f66611c.G0(this.f66610b, this.f66609a);
        this.f66610b.q(interfaceC9133ot);
        InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
        if (((Boolean) Oc.A.c().a(C8784lf.f77086Z9)).booleanValue() && interfaceC8281guZzN != null) {
            interfaceC8281guZzN.L0(this.f66612d);
            interfaceC8281guZzN.M0(this.f66612d, null, null);
        }
        interfaceC9133ot.h0("/trackActiveViewUnit", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.AK
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f65959a.b((InterfaceC9133ot) obj, map);
            }
        });
        interfaceC9133ot.h0("/untrackActiveViewUnit", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.BK
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f66363a.c((InterfaceC9133ot) obj, map);
            }
        });
    }

    final /* synthetic */ void b(InterfaceC9133ot interfaceC9133ot, Map map) {
        this.f66610b.i();
    }

    final /* synthetic */ void c(InterfaceC9133ot interfaceC9133ot, Map map) {
        this.f66610b.a();
    }
}
