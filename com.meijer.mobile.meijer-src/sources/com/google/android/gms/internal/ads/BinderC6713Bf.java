package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6713Bf extends AbstractBinderC6747Cf {

    /* renamed from: a, reason: collision with root package name */
    private final Nc.g f66407a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66408b;

    /* renamed from: c, reason: collision with root package name */
    private final String f66409c;

    @Override // com.google.android.gms.internal.ads.InterfaceC6781Df
    public final String zzb() {
        return this.f66408b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6781Df
    public final String zzc() {
        return this.f66409c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6781Df
    public final void l0(com.google.android.gms.dynamic.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f66407a.zza((View) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6781Df
    public final void zze() {
        this.f66407a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6781Df
    public final void zzf() {
        this.f66407a.zzc();
    }

    public BinderC6713Bf(Nc.g gVar, String str, String str2) {
        this.f66407a = gVar;
        this.f66408b = str;
        this.f66409c = str2;
    }
}
