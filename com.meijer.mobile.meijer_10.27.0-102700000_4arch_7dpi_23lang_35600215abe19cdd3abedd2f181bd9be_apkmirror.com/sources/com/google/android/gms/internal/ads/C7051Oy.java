package com.google.android.gms.internal.ads;

import Pc.C4562d;

/* renamed from: com.google.android.gms.internal.ads.Oy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7051Oy implements InterfaceC9581uC {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f69216a;

    /* renamed from: b, reason: collision with root package name */
    private final C9812wN f69217b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f69218c;

    C7051Oy(InterfaceC9008ot interfaceC9008ot, C9812wN c9812wN, Z50 z50) {
        this.f69216a = interfaceC9008ot;
        this.f69217b = c9812wN;
        this.f69218c = z50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        InterfaceC9008ot interfaceC9008ot;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76053Lc)).booleanValue() || (interfaceC9008ot = this.f69216a) == null) {
            return;
        }
        String str = true != C4562d.a(interfaceC9008ot.zzF()) ? "0" : "1";
        C9705vN c9705vNA = this.f69217b.a();
        c9705vNA.b("action", "hcp");
        c9705vNA.b("hcp", str);
        c9705vNA.c(this.f69218c);
        c9705vNA.g();
    }
}
