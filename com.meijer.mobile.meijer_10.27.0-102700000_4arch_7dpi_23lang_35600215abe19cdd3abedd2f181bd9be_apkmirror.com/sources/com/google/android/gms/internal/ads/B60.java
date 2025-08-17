package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
public final /* synthetic */ class B60 implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC8201hG f65454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8269hx f65455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R90 f65456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C9710vS f65457d;

    public /* synthetic */ B60(InterfaceC8201hG interfaceC8201hG, C8269hx c8269hx, R90 r90, C9710vS c9710vS) {
        this.f65454a = interfaceC8201hG;
        this.f65455b = c8269hx;
        this.f65456c = r90;
        this.f65457d = c9710vS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        C7035Oi.c(map, this.f65454a);
        String str = (String) map.get("u");
        if (str == null) {
            Qc.p.g("URL missing from click GMSG.");
            return;
        }
        C9710vS c9710vS = this.f65457d;
        R90 r90 = this.f65456c;
        Mj0.r(C7035Oi.a(interfaceC9008ot, str), new D60(interfaceC9008ot, this.f65455b, r90, c9710vS), C6908Kq.f68174a);
    }
}
