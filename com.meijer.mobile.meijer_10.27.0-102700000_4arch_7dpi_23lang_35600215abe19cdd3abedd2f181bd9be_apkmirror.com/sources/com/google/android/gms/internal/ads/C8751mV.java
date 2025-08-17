package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8751mV {

    /* renamed from: a, reason: collision with root package name */
    private C7897eV f76806a;

    C8751mV() {
    }

    public static C8751mV b(C7897eV c7897eV) {
        return new C8751mV(c7897eV);
    }

    private C8751mV(C7897eV c7897eV) {
        this.f76806a = c7897eV;
    }

    public final C7897eV a(com.google.android.gms.common.util.f fVar, C8111gV c8111gV, C8856nT c8856nT, R90 r90) {
        C7897eV c7897eV = this.f76806a;
        return c7897eV != null ? c7897eV : new C7897eV(fVar, c8111gV, c8856nT, r90);
    }
}
