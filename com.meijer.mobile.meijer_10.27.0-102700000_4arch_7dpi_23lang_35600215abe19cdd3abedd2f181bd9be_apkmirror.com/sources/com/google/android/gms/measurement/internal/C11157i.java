package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11157i extends AbstractC15136a {
    public static final Parcelable.Creator<C11157i> CREATOR = new C11165j();

    /* renamed from: a, reason: collision with root package name */
    public String f85608a;

    /* renamed from: b, reason: collision with root package name */
    public String f85609b;

    /* renamed from: c, reason: collision with root package name */
    public v6 f85610c;

    /* renamed from: d, reason: collision with root package name */
    public long f85611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85612e;

    /* renamed from: f, reason: collision with root package name */
    public String f85613f;

    /* renamed from: g, reason: collision with root package name */
    public final G f85614g;

    /* renamed from: h, reason: collision with root package name */
    public long f85615h;

    /* renamed from: i, reason: collision with root package name */
    public G f85616i;

    /* renamed from: j, reason: collision with root package name */
    public final long f85617j;

    /* renamed from: k, reason: collision with root package name */
    public final G f85618k;

    C11157i(C11157i c11157i) {
        com.google.android.gms.common.internal.r.l(c11157i);
        this.f85608a = c11157i.f85608a;
        this.f85609b = c11157i.f85609b;
        this.f85610c = c11157i.f85610c;
        this.f85611d = c11157i.f85611d;
        this.f85612e = c11157i.f85612e;
        this.f85613f = c11157i.f85613f;
        this.f85614g = c11157i.f85614g;
        this.f85615h = c11157i.f85615h;
        this.f85616i = c11157i.f85616i;
        this.f85617j = c11157i.f85617j;
        this.f85618k = c11157i.f85618k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f85608a, false);
        C15137b.w(parcel, 3, this.f85609b, false);
        C15137b.u(parcel, 4, this.f85610c, i10, false);
        C15137b.s(parcel, 5, this.f85611d);
        C15137b.c(parcel, 6, this.f85612e);
        C15137b.w(parcel, 7, this.f85613f, false);
        C15137b.u(parcel, 8, this.f85614g, i10, false);
        C15137b.s(parcel, 9, this.f85615h);
        C15137b.u(parcel, 10, this.f85616i, i10, false);
        C15137b.s(parcel, 11, this.f85617j);
        C15137b.u(parcel, 12, this.f85618k, i10, false);
        C15137b.b(parcel, iA);
    }

    C11157i(String str, String str2, v6 v6Var, long j10, boolean z10, String str3, G g10, long j11, G g11, long j12, G g12) {
        this.f85608a = str;
        this.f85609b = str2;
        this.f85610c = v6Var;
        this.f85611d = j10;
        this.f85612e = z10;
        this.f85613f = str3;
        this.f85614g = g10;
        this.f85615h = j11;
        this.f85616i = g11;
        this.f85617j = j12;
        this.f85618k = g12;
    }
}
