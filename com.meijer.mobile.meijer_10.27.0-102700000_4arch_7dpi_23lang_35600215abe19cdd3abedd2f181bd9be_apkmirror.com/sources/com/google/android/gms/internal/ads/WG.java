package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes6.dex */
public final class WG implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final JG f71047a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f71048b;

    public WG(JG jg2, InterfaceC10088yy0 interfaceC10088yy0) {
        this.f71047a = jg2;
        this.f71048b = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setF = this.f71047a.f((C9472tB) this.f71048b.zzb());
        C9233qy0.b(setF);
        return setF;
    }
}
