package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes6.dex */
public final class W00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70971a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70972b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f70973c;

    public W00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f70971a = interfaceC10088yy02;
        this.f70972b = interfaceC10088yy03;
        this.f70973c = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new U00(U70.b(), ((QB) this.f70971a).a(), (PackageInfo) this.f70972b.zzb(), ((C9544tu) this.f70973c).zzb());
    }
}
