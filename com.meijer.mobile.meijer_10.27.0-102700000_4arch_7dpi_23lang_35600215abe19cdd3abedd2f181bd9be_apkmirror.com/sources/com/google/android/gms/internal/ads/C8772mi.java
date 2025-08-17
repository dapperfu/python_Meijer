package com.google.android.gms.internal.ads;

import Mc.C4169y;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8772mi implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC8201hG f76859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8269hx f76860b;

    public /* synthetic */ C8772mi(InterfaceC8201hG interfaceC8201hG, C8269hx c8269hx) {
        this.f76859a = interfaceC8201hG;
        this.f76860b = c8269hx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        C7035Oi.c(map, this.f76859a);
        final String str = (String) map.get("u");
        if (str == null) {
            Qc.p.g("URL missing from click GMSG.");
            return;
        }
        final C8269hx c8269hx = this.f76860b;
        Cj0 cj0D = Cj0.D(C7035Oi.a(interfaceC9008ot, str));
        InterfaceC9416sj0 interfaceC9416sj0 = new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.pi
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                C8269hx c8269hx2;
                String str2 = (String) obj2;
                InterfaceC7069Pi interfaceC7069Pi = C7035Oi.f69132a;
                return (((Boolean) Mc.A.c().a(C8659lf.f76176U9)).booleanValue() && (c8269hx2 = c8269hx) != null && C8269hx.j(str)) ? c8269hx2.b(str2, C4169y.e()) : Mj0.h(str2);
            }
        };
        Xj0 xj0 = C6908Kq.f68174a;
        Mj0.r((Cj0) Mj0.n(cj0D, interfaceC9416sj0, xj0), new C6662Di(interfaceC9008ot), xj0);
    }
}
