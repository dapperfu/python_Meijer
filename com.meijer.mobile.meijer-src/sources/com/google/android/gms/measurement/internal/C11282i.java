package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11282i extends AbstractC15707a {
    public static final Parcelable.Creator<C11282i> CREATOR = new C11290j();

    /* renamed from: a, reason: collision with root package name */
    public String f86448a;

    /* renamed from: b, reason: collision with root package name */
    public String f86449b;

    /* renamed from: c, reason: collision with root package name */
    public v6 f86450c;

    /* renamed from: d, reason: collision with root package name */
    public long f86451d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86452e;

    /* renamed from: f, reason: collision with root package name */
    public String f86453f;

    /* renamed from: g, reason: collision with root package name */
    public final G f86454g;

    /* renamed from: h, reason: collision with root package name */
    public long f86455h;

    /* renamed from: i, reason: collision with root package name */
    public G f86456i;

    /* renamed from: j, reason: collision with root package name */
    public final long f86457j;

    /* renamed from: k, reason: collision with root package name */
    public final G f86458k;

    C11282i(C11282i c11282i) {
        com.google.android.gms.common.internal.r.l(c11282i);
        this.f86448a = c11282i.f86448a;
        this.f86449b = c11282i.f86449b;
        this.f86450c = c11282i.f86450c;
        this.f86451d = c11282i.f86451d;
        this.f86452e = c11282i.f86452e;
        this.f86453f = c11282i.f86453f;
        this.f86454g = c11282i.f86454g;
        this.f86455h = c11282i.f86455h;
        this.f86456i = c11282i.f86456i;
        this.f86457j = c11282i.f86457j;
        this.f86458k = c11282i.f86458k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f86448a, false);
        C15708b.w(parcel, 3, this.f86449b, false);
        C15708b.u(parcel, 4, this.f86450c, i10, false);
        C15708b.s(parcel, 5, this.f86451d);
        C15708b.c(parcel, 6, this.f86452e);
        C15708b.w(parcel, 7, this.f86453f, false);
        C15708b.u(parcel, 8, this.f86454g, i10, false);
        C15708b.s(parcel, 9, this.f86455h);
        C15708b.u(parcel, 10, this.f86456i, i10, false);
        C15708b.s(parcel, 11, this.f86457j);
        C15708b.u(parcel, 12, this.f86458k, i10, false);
        C15708b.b(parcel, iA);
    }

    C11282i(String str, String str2, v6 v6Var, long j10, boolean z10, String str3, G g10, long j11, G g11, long j12, G g12) {
        this.f86448a = str;
        this.f86449b = str2;
        this.f86450c = v6Var;
        this.f86451d = j10;
        this.f86452e = z10;
        this.f86453f = str3;
        this.f86454g = g10;
        this.f86455h = j11;
        this.f86456i = g11;
        this.f86457j = j12;
        this.f86458k = g12;
    }
}
