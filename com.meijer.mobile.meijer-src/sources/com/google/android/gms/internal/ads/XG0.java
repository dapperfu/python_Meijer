package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class XG0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f72147a;

    /* renamed from: b, reason: collision with root package name */
    public final JA0[] f72148b;

    /* renamed from: c, reason: collision with root package name */
    public final PG0[] f72149c;

    /* renamed from: d, reason: collision with root package name */
    public final C7133Np f72150d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f72151e;

    public final boolean a(XG0 xg0, int i10) {
        return xg0 != null && Objects.equals(this.f72148b[i10], xg0.f72148b[i10]) && Objects.equals(this.f72149c[i10], xg0.f72149c[i10]);
    }

    public final boolean b(int i10) {
        return this.f72148b[i10] != null;
    }

    public XG0(JA0[] ja0Arr, PG0[] pg0Arr, C7133Np c7133Np, Object obj) {
        boolean z10;
        int length = ja0Arr.length;
        if (length == pg0Arr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f72148b = ja0Arr;
        this.f72149c = (PG0[]) pg0Arr.clone();
        this.f72150d = c7133Np;
        this.f72151e = obj;
        this.f72147a = length;
    }
}
