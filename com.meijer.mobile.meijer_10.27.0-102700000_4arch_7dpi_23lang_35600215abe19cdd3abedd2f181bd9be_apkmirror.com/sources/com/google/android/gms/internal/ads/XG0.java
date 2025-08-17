package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class XG0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f71307a;

    /* renamed from: b, reason: collision with root package name */
    public final JA0[] f71308b;

    /* renamed from: c, reason: collision with root package name */
    public final PG0[] f71309c;

    /* renamed from: d, reason: collision with root package name */
    public final C7008Np f71310d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f71311e;

    public final boolean a(XG0 xg0, int i10) {
        return xg0 != null && Objects.equals(this.f71308b[i10], xg0.f71308b[i10]) && Objects.equals(this.f71309c[i10], xg0.f71309c[i10]);
    }

    public final boolean b(int i10) {
        return this.f71308b[i10] != null;
    }

    public XG0(JA0[] ja0Arr, PG0[] pg0Arr, C7008Np c7008Np, Object obj) {
        boolean z10;
        int length = ja0Arr.length;
        if (length == pg0Arr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f71308b = ja0Arr;
        this.f71309c = (PG0[]) pg0Arr.clone();
        this.f71310d = c7008Np;
        this.f71311e = obj;
        this.f71307a = length;
    }
}
