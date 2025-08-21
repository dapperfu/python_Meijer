package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.vu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9883vu implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f79987a;

    public C9883vu(InterfaceC10213yy0 interfaceC10213yy0) {
        this.f79987a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((C9990wu) this.f79987a).a().getApplicationInfo();
        C9358qy0.b(applicationInfo);
        return applicationInfo;
    }
}
