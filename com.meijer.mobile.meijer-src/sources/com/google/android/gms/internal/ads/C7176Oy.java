package com.google.android.gms.internal.ads;

import Rc.C5183d;

/* renamed from: com.google.android.gms.internal.ads.Oy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7176Oy implements InterfaceC9706uC {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f70056a;

    /* renamed from: b, reason: collision with root package name */
    private final C9937wN f70057b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f70058c;

    C7176Oy(InterfaceC9133ot interfaceC9133ot, C9937wN c9937wN, Z50 z50) {
        this.f70056a = interfaceC9133ot;
        this.f70057b = c9937wN;
        this.f70058c = z50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        InterfaceC9133ot interfaceC9133ot;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76893Lc)).booleanValue() || (interfaceC9133ot = this.f70056a) == null) {
            return;
        }
        String str = true != C5183d.a(interfaceC9133ot.zzF()) ? "0" : "1";
        C9830vN c9830vNA = this.f70057b.a();
        c9830vNA.b("action", "hcp");
        c9830vNA.b("hcp", str);
        c9830vNA.c(this.f70058c);
        c9830vNA.g();
    }
}
