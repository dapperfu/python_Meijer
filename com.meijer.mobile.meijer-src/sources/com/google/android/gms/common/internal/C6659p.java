package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6659p extends AbstractC15707a {
    public static final Parcelable.Creator<C6659p> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    private final int f65750a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65751b;

    /* renamed from: c, reason: collision with root package name */
    private final int f65752c;

    /* renamed from: d, reason: collision with root package name */
    private final long f65753d;

    /* renamed from: e, reason: collision with root package name */
    private final long f65754e;

    /* renamed from: f, reason: collision with root package name */
    private final String f65755f;

    /* renamed from: g, reason: collision with root package name */
    private final String f65756g;

    /* renamed from: h, reason: collision with root package name */
    private final int f65757h;

    /* renamed from: i, reason: collision with root package name */
    private final int f65758i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f65750a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f65751b);
        C15708b.n(parcel, 3, this.f65752c);
        C15708b.s(parcel, 4, this.f65753d);
        C15708b.s(parcel, 5, this.f65754e);
        C15708b.w(parcel, 6, this.f65755f, false);
        C15708b.w(parcel, 7, this.f65756g, false);
        C15708b.n(parcel, 8, this.f65757h);
        C15708b.n(parcel, 9, this.f65758i);
        C15708b.b(parcel, iA);
    }

    public C6659p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f65750a = i10;
        this.f65751b = i11;
        this.f65752c = i12;
        this.f65753d = j10;
        this.f65754e = j11;
        this.f65755f = str;
        this.f65756g = str2;
        this.f65757h = i13;
        this.f65758i = i14;
    }
}
