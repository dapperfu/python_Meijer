package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class XY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final double f71344a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f71345b;

    public XY(double d10, boolean z10) {
        this.f71344a = d10;
        this.f71345b = z10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        Bundle bundleA = H60.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = H60.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f71345b);
        bundleA2.putDouble("battery_level", this.f71344a);
    }
}
