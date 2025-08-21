package com.google.android.gms.internal.ads;

import Oc.C4447y;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8897mi implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC8326hG f77699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8394hx f77700b;

    public /* synthetic */ C8897mi(InterfaceC8326hG interfaceC8326hG, C8394hx c8394hx) {
        this.f77699a = interfaceC8326hG;
        this.f77700b = c8394hx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        C7160Oi.c(map, this.f77699a);
        final String str = (String) map.get("u");
        if (str == null) {
            Sc.p.g("URL missing from click GMSG.");
            return;
        }
        final C8394hx c8394hx = this.f77700b;
        Cj0 cj0D = Cj0.D(C7160Oi.a(interfaceC9133ot, str));
        InterfaceC9541sj0 interfaceC9541sj0 = new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.pi
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                C8394hx c8394hx2;
                String str2 = (String) obj2;
                InterfaceC7194Pi interfaceC7194Pi = C7160Oi.f69972a;
                return (((Boolean) Oc.A.c().a(C8784lf.f77016U9)).booleanValue() && (c8394hx2 = c8394hx) != null && C8394hx.j(str)) ? c8394hx2.b(str2, C4447y.e()) : Mj0.h(str2);
            }
        };
        Xj0 xj0 = C7033Kq.f69014a;
        Mj0.r((Cj0) Mj0.n(cj0D, interfaceC9541sj0, xj0), new C6787Di(interfaceC9133ot), xj0);
    }
}
