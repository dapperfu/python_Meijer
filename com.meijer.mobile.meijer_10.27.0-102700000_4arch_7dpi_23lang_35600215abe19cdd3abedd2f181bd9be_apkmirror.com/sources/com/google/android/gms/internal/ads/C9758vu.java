package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.vu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9758vu implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f79147a;

    public C9758vu(InterfaceC10088yy0 interfaceC10088yy0) {
        this.f79147a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((C9865wu) this.f79147a).a().getApplicationInfo();
        C9233qy0.b(applicationInfo);
        return applicationInfo;
    }
}
