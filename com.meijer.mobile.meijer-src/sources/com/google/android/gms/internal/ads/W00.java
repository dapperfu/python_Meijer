package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes6.dex */
public final class W00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71811a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71812b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f71813c;

    public W00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f71811a = interfaceC10213yy02;
        this.f71812b = interfaceC10213yy03;
        this.f71813c = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new U00(U70.b(), ((QB) this.f71811a).a(), (PackageInfo) this.f71812b.zzb(), ((C9669tu) this.f71813c).zzb());
    }
}
