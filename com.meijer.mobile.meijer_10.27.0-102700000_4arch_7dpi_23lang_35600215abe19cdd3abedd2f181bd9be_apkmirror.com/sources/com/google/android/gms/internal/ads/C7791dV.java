package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.dV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7791dV {

    /* renamed from: a, reason: collision with root package name */
    final String f73416a;

    /* renamed from: b, reason: collision with root package name */
    final String f73417b;

    /* renamed from: c, reason: collision with root package name */
    int f73418c;

    /* renamed from: d, reason: collision with root package name */
    long f73419d;

    /* renamed from: e, reason: collision with root package name */
    final Integer f73420e;

    C7791dV(String str, String str2, int i10, long j10, Integer num) {
        this.f73416a = str;
        this.f73417b = str2;
        this.f73418c = i10;
        this.f73419d = j10;
        this.f73420e = num;
    }

    public final String toString() {
        String str = this.f73416a + "." + this.f73418c + "." + this.f73419d;
        if (!TextUtils.isEmpty(this.f73417b)) {
            str = str + "." + this.f73417b;
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f76028K1)).booleanValue() || this.f73420e == null || TextUtils.isEmpty(this.f73417b)) {
            return str;
        }
        return str + "." + this.f73420e;
    }
}
