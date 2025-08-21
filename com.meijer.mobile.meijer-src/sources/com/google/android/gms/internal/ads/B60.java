package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
public final /* synthetic */ class B60 implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC8326hG f66294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8394hx f66295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R90 f66296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C9835vS f66297d;

    public /* synthetic */ B60(InterfaceC8326hG interfaceC8326hG, C8394hx c8394hx, R90 r90, C9835vS c9835vS) {
        this.f66294a = interfaceC8326hG;
        this.f66295b = c8394hx;
        this.f66296c = r90;
        this.f66297d = c9835vS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        C7160Oi.c(map, this.f66294a);
        String str = (String) map.get("u");
        if (str == null) {
            Sc.p.g("URL missing from click GMSG.");
            return;
        }
        C9835vS c9835vS = this.f66297d;
        R90 r90 = this.f66296c;
        Mj0.r(C7160Oi.a(interfaceC9133ot, str), new D60(interfaceC9133ot, this.f66295b, r90, c9835vS), C7033Kq.f69014a);
    }
}
