package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.dV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7916dV {

    /* renamed from: a, reason: collision with root package name */
    final String f74256a;

    /* renamed from: b, reason: collision with root package name */
    final String f74257b;

    /* renamed from: c, reason: collision with root package name */
    int f74258c;

    /* renamed from: d, reason: collision with root package name */
    long f74259d;

    /* renamed from: e, reason: collision with root package name */
    final Integer f74260e;

    C7916dV(String str, String str2, int i10, long j10, Integer num) {
        this.f74256a = str;
        this.f74257b = str2;
        this.f74258c = i10;
        this.f74259d = j10;
        this.f74260e = num;
    }

    public final String toString() {
        String str = this.f74256a + "." + this.f74258c + "." + this.f74259d;
        if (!TextUtils.isEmpty(this.f74257b)) {
            str = str + "." + this.f74257b;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76868K1)).booleanValue() || this.f74260e == null || TextUtils.isEmpty(this.f74257b)) {
            return str;
        }
        return str + "." + this.f74260e;
    }
}
