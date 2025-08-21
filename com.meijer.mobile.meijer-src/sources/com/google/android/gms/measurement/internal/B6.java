package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class B6 extends AbstractC15707a {
    public static final Parcelable.Creator<B6> CREATOR = new C6();

    /* renamed from: A, reason: collision with root package name */
    public final long f85738A;

    /* renamed from: B, reason: collision with root package name */
    public final String f85739B;

    /* renamed from: C, reason: collision with root package name */
    public final String f85740C;

    /* renamed from: D, reason: collision with root package name */
    public final long f85741D;

    /* renamed from: E, reason: collision with root package name */
    public final int f85742E;

    /* renamed from: a, reason: collision with root package name */
    public final String f85743a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85744b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85745c;

    /* renamed from: d, reason: collision with root package name */
    public final String f85746d;

    /* renamed from: e, reason: collision with root package name */
    public final long f85747e;

    /* renamed from: f, reason: collision with root package name */
    public final long f85748f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85749g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f85750h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f85751i;

    /* renamed from: j, reason: collision with root package name */
    public final long f85752j;

    /* renamed from: k, reason: collision with root package name */
    public final String f85753k;

    /* renamed from: l, reason: collision with root package name */
    public final long f85754l;

    /* renamed from: m, reason: collision with root package name */
    public final int f85755m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f85756n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f85757o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f85758p;

    /* renamed from: q, reason: collision with root package name */
    public final long f85759q;

    /* renamed from: r, reason: collision with root package name */
    public final List f85760r;

    /* renamed from: s, reason: collision with root package name */
    public final String f85761s;

    /* renamed from: t, reason: collision with root package name */
    public final String f85762t;

    /* renamed from: u, reason: collision with root package name */
    public final String f85763u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f85764v;

    /* renamed from: w, reason: collision with root package name */
    public final long f85765w;

    /* renamed from: x, reason: collision with root package name */
    public final int f85766x;

    /* renamed from: y, reason: collision with root package name */
    public final String f85767y;

    /* renamed from: z, reason: collision with root package name */
    public final int f85768z;

    B6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        com.google.android.gms.common.internal.r.f(str);
        this.f85743a = str;
        this.f85744b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f85745c = str3;
        this.f85752j = j10;
        this.f85746d = str4;
        this.f85747e = j11;
        this.f85748f = j12;
        this.f85749g = str5;
        this.f85750h = z10;
        this.f85751i = z11;
        this.f85753k = str6;
        this.f85754l = j13;
        this.f85755m = i10;
        this.f85756n = z12;
        this.f85757o = z13;
        this.f85758p = bool;
        this.f85759q = j14;
        this.f85760r = list;
        this.f85761s = str7;
        this.f85762t = str8;
        this.f85763u = str9;
        this.f85764v = z14;
        this.f85765w = j15;
        this.f85766x = i11;
        this.f85767y = str10;
        this.f85768z = i12;
        this.f85738A = j16;
        this.f85739B = str11;
        this.f85740C = str12;
        this.f85741D = j17;
        this.f85742E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f85743a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.w(parcel, 3, this.f85744b, false);
        C15708b.w(parcel, 4, this.f85745c, false);
        C15708b.w(parcel, 5, this.f85746d, false);
        C15708b.s(parcel, 6, this.f85747e);
        C15708b.s(parcel, 7, this.f85748f);
        C15708b.w(parcel, 8, this.f85749g, false);
        C15708b.c(parcel, 9, this.f85750h);
        C15708b.c(parcel, 10, this.f85751i);
        C15708b.s(parcel, 11, this.f85752j);
        C15708b.w(parcel, 12, this.f85753k, false);
        C15708b.s(parcel, 14, this.f85754l);
        C15708b.n(parcel, 15, this.f85755m);
        C15708b.c(parcel, 16, this.f85756n);
        C15708b.c(parcel, 18, this.f85757o);
        C15708b.d(parcel, 21, this.f85758p, false);
        C15708b.s(parcel, 22, this.f85759q);
        C15708b.y(parcel, 23, this.f85760r, false);
        C15708b.w(parcel, 25, this.f85761s, false);
        C15708b.w(parcel, 26, this.f85762t, false);
        C15708b.w(parcel, 27, this.f85763u, false);
        C15708b.c(parcel, 28, this.f85764v);
        C15708b.s(parcel, 29, this.f85765w);
        C15708b.n(parcel, 30, this.f85766x);
        C15708b.w(parcel, 31, this.f85767y, false);
        C15708b.n(parcel, 32, this.f85768z);
        C15708b.s(parcel, 34, this.f85738A);
        C15708b.w(parcel, 35, this.f85739B, false);
        C15708b.w(parcel, 36, this.f85740C, false);
        C15708b.s(parcel, 37, this.f85741D);
        C15708b.n(parcel, 38, this.f85742E);
        C15708b.b(parcel, iA);
    }

    B6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f85743a = str;
        this.f85744b = str2;
        this.f85745c = str3;
        this.f85752j = j12;
        this.f85746d = str4;
        this.f85747e = j10;
        this.f85748f = j11;
        this.f85749g = str5;
        this.f85750h = z10;
        this.f85751i = z11;
        this.f85753k = str6;
        this.f85754l = j13;
        this.f85755m = i10;
        this.f85756n = z12;
        this.f85757o = z13;
        this.f85758p = bool;
        this.f85759q = j14;
        this.f85760r = list;
        this.f85761s = str7;
        this.f85762t = str8;
        this.f85763u = str9;
        this.f85764v = z14;
        this.f85765w = j15;
        this.f85766x = i11;
        this.f85767y = str10;
        this.f85768z = i12;
        this.f85738A = j16;
        this.f85739B = str11;
        this.f85740C = str12;
        this.f85741D = j17;
        this.f85742E = i13;
    }
}
