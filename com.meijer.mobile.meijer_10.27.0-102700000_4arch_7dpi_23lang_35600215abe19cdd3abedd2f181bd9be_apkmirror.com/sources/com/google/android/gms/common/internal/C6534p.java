package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6534p extends AbstractC15136a {
    public static final Parcelable.Creator<C6534p> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    private final int f64910a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64911b;

    /* renamed from: c, reason: collision with root package name */
    private final int f64912c;

    /* renamed from: d, reason: collision with root package name */
    private final long f64913d;

    /* renamed from: e, reason: collision with root package name */
    private final long f64914e;

    /* renamed from: f, reason: collision with root package name */
    private final String f64915f;

    /* renamed from: g, reason: collision with root package name */
    private final String f64916g;

    /* renamed from: h, reason: collision with root package name */
    private final int f64917h;

    /* renamed from: i, reason: collision with root package name */
    private final int f64918i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f64910a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f64911b);
        C15137b.n(parcel, 3, this.f64912c);
        C15137b.s(parcel, 4, this.f64913d);
        C15137b.s(parcel, 5, this.f64914e);
        C15137b.w(parcel, 6, this.f64915f, false);
        C15137b.w(parcel, 7, this.f64916g, false);
        C15137b.n(parcel, 8, this.f64917h);
        C15137b.n(parcel, 9, this.f64918i);
        C15137b.b(parcel, iA);
    }

    public C6534p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f64910a = i10;
        this.f64911b = i11;
        this.f64912c = i12;
        this.f64913d = j10;
        this.f64914e = j11;
        this.f64915f = str;
        this.f64916g = str2;
        this.f64917h = i13;
        this.f64918i = i14;
    }
}
