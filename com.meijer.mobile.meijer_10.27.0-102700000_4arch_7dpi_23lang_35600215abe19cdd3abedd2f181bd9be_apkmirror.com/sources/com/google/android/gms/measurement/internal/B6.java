package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class B6 extends AbstractC15136a {
    public static final Parcelable.Creator<B6> CREATOR = new C6();

    /* renamed from: A, reason: collision with root package name */
    public final long f84898A;

    /* renamed from: B, reason: collision with root package name */
    public final String f84899B;

    /* renamed from: C, reason: collision with root package name */
    public final String f84900C;

    /* renamed from: D, reason: collision with root package name */
    public final long f84901D;

    /* renamed from: E, reason: collision with root package name */
    public final int f84902E;

    /* renamed from: a, reason: collision with root package name */
    public final String f84903a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84904b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84905c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84906d;

    /* renamed from: e, reason: collision with root package name */
    public final long f84907e;

    /* renamed from: f, reason: collision with root package name */
    public final long f84908f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84909g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84910h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84911i;

    /* renamed from: j, reason: collision with root package name */
    public final long f84912j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84913k;

    /* renamed from: l, reason: collision with root package name */
    public final long f84914l;

    /* renamed from: m, reason: collision with root package name */
    public final int f84915m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f84916n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f84917o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f84918p;

    /* renamed from: q, reason: collision with root package name */
    public final long f84919q;

    /* renamed from: r, reason: collision with root package name */
    public final List f84920r;

    /* renamed from: s, reason: collision with root package name */
    public final String f84921s;

    /* renamed from: t, reason: collision with root package name */
    public final String f84922t;

    /* renamed from: u, reason: collision with root package name */
    public final String f84923u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f84924v;

    /* renamed from: w, reason: collision with root package name */
    public final long f84925w;

    /* renamed from: x, reason: collision with root package name */
    public final int f84926x;

    /* renamed from: y, reason: collision with root package name */
    public final String f84927y;

    /* renamed from: z, reason: collision with root package name */
    public final int f84928z;

    B6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        com.google.android.gms.common.internal.r.f(str);
        this.f84903a = str;
        this.f84904b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f84905c = str3;
        this.f84912j = j10;
        this.f84906d = str4;
        this.f84907e = j11;
        this.f84908f = j12;
        this.f84909g = str5;
        this.f84910h = z10;
        this.f84911i = z11;
        this.f84913k = str6;
        this.f84914l = j13;
        this.f84915m = i10;
        this.f84916n = z12;
        this.f84917o = z13;
        this.f84918p = bool;
        this.f84919q = j14;
        this.f84920r = list;
        this.f84921s = str7;
        this.f84922t = str8;
        this.f84923u = str9;
        this.f84924v = z14;
        this.f84925w = j15;
        this.f84926x = i11;
        this.f84927y = str10;
        this.f84928z = i12;
        this.f84898A = j16;
        this.f84899B = str11;
        this.f84900C = str12;
        this.f84901D = j17;
        this.f84902E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f84903a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.w(parcel, 3, this.f84904b, false);
        C15137b.w(parcel, 4, this.f84905c, false);
        C15137b.w(parcel, 5, this.f84906d, false);
        C15137b.s(parcel, 6, this.f84907e);
        C15137b.s(parcel, 7, this.f84908f);
        C15137b.w(parcel, 8, this.f84909g, false);
        C15137b.c(parcel, 9, this.f84910h);
        C15137b.c(parcel, 10, this.f84911i);
        C15137b.s(parcel, 11, this.f84912j);
        C15137b.w(parcel, 12, this.f84913k, false);
        C15137b.s(parcel, 14, this.f84914l);
        C15137b.n(parcel, 15, this.f84915m);
        C15137b.c(parcel, 16, this.f84916n);
        C15137b.c(parcel, 18, this.f84917o);
        C15137b.d(parcel, 21, this.f84918p, false);
        C15137b.s(parcel, 22, this.f84919q);
        C15137b.y(parcel, 23, this.f84920r, false);
        C15137b.w(parcel, 25, this.f84921s, false);
        C15137b.w(parcel, 26, this.f84922t, false);
        C15137b.w(parcel, 27, this.f84923u, false);
        C15137b.c(parcel, 28, this.f84924v);
        C15137b.s(parcel, 29, this.f84925w);
        C15137b.n(parcel, 30, this.f84926x);
        C15137b.w(parcel, 31, this.f84927y, false);
        C15137b.n(parcel, 32, this.f84928z);
        C15137b.s(parcel, 34, this.f84898A);
        C15137b.w(parcel, 35, this.f84899B, false);
        C15137b.w(parcel, 36, this.f84900C, false);
        C15137b.s(parcel, 37, this.f84901D);
        C15137b.n(parcel, 38, this.f84902E);
        C15137b.b(parcel, iA);
    }

    B6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f84903a = str;
        this.f84904b = str2;
        this.f84905c = str3;
        this.f84912j = j12;
        this.f84906d = str4;
        this.f84907e = j10;
        this.f84908f = j11;
        this.f84909g = str5;
        this.f84910h = z10;
        this.f84911i = z11;
        this.f84913k = str6;
        this.f84914l = j13;
        this.f84915m = i10;
        this.f84916n = z12;
        this.f84917o = z13;
        this.f84918p = bool;
        this.f84919q = j14;
        this.f84920r = list;
        this.f84921s = str7;
        this.f84922t = str8;
        this.f84923u = str9;
        this.f84924v = z14;
        this.f84925w = j15;
        this.f84926x = i11;
        this.f84927y = str10;
        this.f84928z = i12;
        this.f84898A = j16;
        this.f84899B = str11;
        this.f84900C = str12;
        this.f84901D = j17;
        this.f84902E = i13;
    }
}
