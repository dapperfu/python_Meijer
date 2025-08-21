package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes6.dex */
public final class WG implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final JG f71887a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71888b;

    public WG(JG jg2, InterfaceC10213yy0 interfaceC10213yy0) {
        this.f71887a = jg2;
        this.f71888b = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setF = this.f71887a.f((C9597tB) this.f71888b.zzb());
        C9358qy0.b(setF);
        return setF;
    }
}
