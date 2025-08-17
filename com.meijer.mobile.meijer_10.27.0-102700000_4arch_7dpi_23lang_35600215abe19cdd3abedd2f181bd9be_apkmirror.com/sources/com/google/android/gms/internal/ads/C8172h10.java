package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.h10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8172h10 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f74572a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f74573b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f74574c;

    public C8172h10(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f74572a = interfaceC10088yy0;
        this.f74573b = interfaceC10088yy02;
        this.f74574c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7958f10 zzb() {
        return new C7958f10((ApplicationInfo) this.f74572a.zzb(), (PackageInfo) this.f74573b.zzb(), ((C9865wu) this.f74574c).a());
    }
}
