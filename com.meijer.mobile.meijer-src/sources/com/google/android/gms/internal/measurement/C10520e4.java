package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10520e4 {

    /* renamed from: a, reason: collision with root package name */
    final Uri f83009a;

    /* renamed from: b, reason: collision with root package name */
    final String f83010b;

    /* renamed from: c, reason: collision with root package name */
    final String f83011c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f83012d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f83013e;

    private C10520e4(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, De.g gVar) {
        this.f83009a = uri;
        this.f83010b = "";
        this.f83011c = "";
        this.f83012d = z10;
        this.f83013e = z12;
    }

    public final C10520e4 b() {
        return new C10520e4(null, this.f83009a, this.f83010b, this.f83011c, this.f83012d, false, true, false, null);
    }

    public C10520e4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final C10520e4 a() {
        String str = this.f83010b;
        if (str.isEmpty()) {
            return new C10520e4(null, this.f83009a, str, this.f83011c, true, false, this.f83013e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final AbstractC10574k4 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = AbstractC10574k4.f83091j;
        return new C10502c4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC10574k4 f(String str, String str2) {
        int i10 = AbstractC10574k4.f83091j;
        return new C10511d4(this, str, str2, true);
    }

    public final AbstractC10574k4 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = AbstractC10574k4.f83091j;
        return new C10484a4(this, str, lValueOf, true);
    }

    public final AbstractC10574k4 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i10 = AbstractC10574k4.f83091j;
        return new C10493b4(this, str, boolValueOf, true);
    }
}
