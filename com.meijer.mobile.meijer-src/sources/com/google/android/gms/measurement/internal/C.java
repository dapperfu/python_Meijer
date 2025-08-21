package com.google.android.gms.measurement.internal;

/* loaded from: classes6.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    final String f85769a;

    /* renamed from: b, reason: collision with root package name */
    final String f85770b;

    /* renamed from: c, reason: collision with root package name */
    final long f85771c;

    /* renamed from: d, reason: collision with root package name */
    final long f85772d;

    /* renamed from: e, reason: collision with root package name */
    final long f85773e;

    /* renamed from: f, reason: collision with root package name */
    final long f85774f;

    /* renamed from: g, reason: collision with root package name */
    final long f85775g;

    /* renamed from: h, reason: collision with root package name */
    final Long f85776h;

    /* renamed from: i, reason: collision with root package name */
    final Long f85777i;

    /* renamed from: j, reason: collision with root package name */
    final Long f85778j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f85779k;

    C(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.f(str2);
        com.google.android.gms.common.internal.r.a(j10 >= 0);
        com.google.android.gms.common.internal.r.a(j11 >= 0);
        com.google.android.gms.common.internal.r.a(j12 >= 0);
        com.google.android.gms.common.internal.r.a(j14 >= 0);
        this.f85769a = str;
        this.f85770b = str2;
        this.f85771c = j10;
        this.f85772d = j11;
        this.f85773e = j12;
        this.f85774f = j13;
        this.f85775g = j14;
        this.f85776h = l10;
        this.f85777i = l11;
        this.f85778j = l12;
        this.f85779k = bool;
    }

    final C a(long j10) {
        return new C(this.f85769a, this.f85770b, this.f85771c, this.f85772d, this.f85773e, j10, this.f85775g, this.f85776h, this.f85777i, this.f85778j, this.f85779k);
    }

    final C b(long j10, long j11) {
        return new C(this.f85769a, this.f85770b, this.f85771c, this.f85772d, this.f85773e, this.f85774f, j10, Long.valueOf(j11), this.f85777i, this.f85778j, this.f85779k);
    }

    final C c(Long l10, Long l11, Boolean bool) {
        return new C(this.f85769a, this.f85770b, this.f85771c, this.f85772d, this.f85773e, this.f85774f, this.f85775g, this.f85776h, l10, l11, bool);
    }
}
