package com.google.android.gms.measurement.internal;

/* loaded from: classes6.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    final String f84929a;

    /* renamed from: b, reason: collision with root package name */
    final String f84930b;

    /* renamed from: c, reason: collision with root package name */
    final long f84931c;

    /* renamed from: d, reason: collision with root package name */
    final long f84932d;

    /* renamed from: e, reason: collision with root package name */
    final long f84933e;

    /* renamed from: f, reason: collision with root package name */
    final long f84934f;

    /* renamed from: g, reason: collision with root package name */
    final long f84935g;

    /* renamed from: h, reason: collision with root package name */
    final Long f84936h;

    /* renamed from: i, reason: collision with root package name */
    final Long f84937i;

    /* renamed from: j, reason: collision with root package name */
    final Long f84938j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f84939k;

    C(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.f(str2);
        com.google.android.gms.common.internal.r.a(j10 >= 0);
        com.google.android.gms.common.internal.r.a(j11 >= 0);
        com.google.android.gms.common.internal.r.a(j12 >= 0);
        com.google.android.gms.common.internal.r.a(j14 >= 0);
        this.f84929a = str;
        this.f84930b = str2;
        this.f84931c = j10;
        this.f84932d = j11;
        this.f84933e = j12;
        this.f84934f = j13;
        this.f84935g = j14;
        this.f84936h = l10;
        this.f84937i = l11;
        this.f84938j = l12;
        this.f84939k = bool;
    }

    final C a(long j10) {
        return new C(this.f84929a, this.f84930b, this.f84931c, this.f84932d, this.f84933e, j10, this.f84935g, this.f84936h, this.f84937i, this.f84938j, this.f84939k);
    }

    final C b(long j10, long j11) {
        return new C(this.f84929a, this.f84930b, this.f84931c, this.f84932d, this.f84933e, this.f84934f, j10, Long.valueOf(j11), this.f84937i, this.f84938j, this.f84939k);
    }

    final C c(Long l10, Long l11, Boolean bool) {
        return new C(this.f84929a, this.f84930b, this.f84931c, this.f84932d, this.f84933e, this.f84934f, this.f84935g, this.f84936h, l10, l11, bool);
    }
}
