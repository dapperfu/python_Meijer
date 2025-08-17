package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6873Jp implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67972a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67973b;

    public C6873Jp(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f67972a = interfaceC10088yy0;
        this.f67973b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SharedPreferencesOnSharedPreferenceChangeListenerC6839Ip((Context) this.f67972a.zzb(), (Pc.r0) this.f67973b.zzb());
    }
}
