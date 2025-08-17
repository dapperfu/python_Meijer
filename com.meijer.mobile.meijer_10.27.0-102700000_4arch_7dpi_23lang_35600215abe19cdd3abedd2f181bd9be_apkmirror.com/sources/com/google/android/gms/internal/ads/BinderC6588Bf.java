package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6588Bf extends AbstractBinderC6622Cf {

    /* renamed from: a, reason: collision with root package name */
    private final Lc.g f65567a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65568b;

    /* renamed from: c, reason: collision with root package name */
    private final String f65569c;

    @Override // com.google.android.gms.internal.ads.InterfaceC6656Df
    public final String zzb() {
        return this.f65568b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6656Df
    public final String zzc() {
        return this.f65569c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6656Df
    public final void i0(com.google.android.gms.dynamic.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f65567a.zza((View) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6656Df
    public final void zze() {
        this.f65567a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6656Df
    public final void zzf() {
        this.f65567a.zzc();
    }

    public BinderC6588Bf(Lc.g gVar, String str, String str2) {
        this.f65567a = gVar;
        this.f65568b = str;
        this.f65569c = str2;
    }
}
