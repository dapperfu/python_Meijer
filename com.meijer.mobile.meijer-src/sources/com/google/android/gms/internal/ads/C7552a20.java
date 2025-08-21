package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.a20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7552a20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final int f73174a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73175b;

    C7552a20(int i10, int i11) {
        this.f73174a = i10;
        this.f73175b = i11;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        int i10 = this.f73174a;
        if (i10 == -1 || this.f73175b == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i10);
        bundle.putInt("crashes_without_flags", this.f73175b);
        int i11 = C4447y.f23550g;
        if (Oc.A.c().e()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
