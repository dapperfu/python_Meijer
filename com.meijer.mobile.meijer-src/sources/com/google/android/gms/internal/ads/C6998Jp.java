package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6998Jp implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68812a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68813b;

    public C6998Jp(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f68812a = interfaceC10213yy0;
        this.f68813b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip((Context) this.f68812a.zzb(), (Rc.r0) this.f68813b.zzb());
    }
}
