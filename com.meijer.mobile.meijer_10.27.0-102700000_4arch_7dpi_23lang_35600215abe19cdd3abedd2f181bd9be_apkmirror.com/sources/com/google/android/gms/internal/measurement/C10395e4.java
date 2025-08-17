package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10395e4 {

    /* renamed from: a, reason: collision with root package name */
    final Uri f82169a;

    /* renamed from: b, reason: collision with root package name */
    final String f82170b;

    /* renamed from: c, reason: collision with root package name */
    final String f82171c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f82172d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f82173e;

    private C10395e4(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, Be.g gVar) {
        this.f82169a = uri;
        this.f82170b = "";
        this.f82171c = "";
        this.f82172d = z10;
        this.f82173e = z12;
    }

    public final C10395e4 b() {
        return new C10395e4(null, this.f82169a, this.f82170b, this.f82171c, this.f82172d, false, true, false, null);
    }

    public C10395e4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final C10395e4 a() {
        String str = this.f82170b;
        if (str.isEmpty()) {
            return new C10395e4(null, this.f82169a, str, this.f82171c, true, false, this.f82173e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final AbstractC10449k4 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = AbstractC10449k4.f82251j;
        return new C10377c4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC10449k4 f(String str, String str2) {
        int i10 = AbstractC10449k4.f82251j;
        return new C10386d4(this, str, str2, true);
    }

    public final AbstractC10449k4 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = AbstractC10449k4.f82251j;
        return new C10359a4(this, str, lValueOf, true);
    }

    public final AbstractC10449k4 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i10 = AbstractC10449k4.f82251j;
        return new C10368b4(this, str, boolValueOf, true);
    }
}
