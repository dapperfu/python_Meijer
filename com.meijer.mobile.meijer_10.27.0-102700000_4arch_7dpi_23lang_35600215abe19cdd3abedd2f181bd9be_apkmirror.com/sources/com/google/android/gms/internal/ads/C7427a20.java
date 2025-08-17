package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.a20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7427a20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final int f72334a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72335b;

    C7427a20(int i10, int i11) {
        this.f72334a = i10;
        this.f72335b = i11;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        int i10 = this.f72334a;
        if (i10 == -1 || this.f72335b == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i10);
        bundle.putInt("crashes_without_flags", this.f72335b);
        int i11 = C4169y.f19363g;
        if (Mc.A.c().e()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
