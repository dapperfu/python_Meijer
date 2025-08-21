package com.google.android.gms.vision.face.internal.client;

import Yd.a;
import Yd.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import md.AbstractC15707a;
import md.C15708b;

@UsedByNative("wrapper.cc")
/* loaded from: classes6.dex */
public class FaceParcel extends AbstractC15707a {

    @RecentlyNonNull
    public static final Parcelable.Creator<FaceParcel> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final int f86930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86931b;

    /* renamed from: c, reason: collision with root package name */
    public final float f86932c;

    /* renamed from: d, reason: collision with root package name */
    public final float f86933d;

    /* renamed from: e, reason: collision with root package name */
    public final float f86934e;

    /* renamed from: f, reason: collision with root package name */
    public final float f86935f;

    /* renamed from: g, reason: collision with root package name */
    public final float f86936g;

    /* renamed from: h, reason: collision with root package name */
    public final float f86937h;

    /* renamed from: i, reason: collision with root package name */
    public final float f86938i;

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    public final LandmarkParcel[] f86939j;

    /* renamed from: k, reason: collision with root package name */
    public final float f86940k;

    /* renamed from: l, reason: collision with root package name */
    public final float f86941l;

    /* renamed from: m, reason: collision with root package name */
    public final float f86942m;

    /* renamed from: n, reason: collision with root package name */
    public final a[] f86943n;

    /* renamed from: o, reason: collision with root package name */
    public final float f86944o;

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, a[] aVarArr, float f20) {
        this.f86930a = i10;
        this.f86931b = i11;
        this.f86932c = f10;
        this.f86933d = f11;
        this.f86934e = f12;
        this.f86935f = f13;
        this.f86936g = f14;
        this.f86937h = f15;
        this.f86938i = f16;
        this.f86939j = landmarkParcelArr;
        this.f86940k = f17;
        this.f86941l = f18;
        this.f86942m = f19;
        this.f86943n = aVarArr;
        this.f86944o = f20;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f86930a);
        C15708b.n(parcel, 2, this.f86931b);
        C15708b.k(parcel, 3, this.f86932c);
        C15708b.k(parcel, 4, this.f86933d);
        C15708b.k(parcel, 5, this.f86934e);
        C15708b.k(parcel, 6, this.f86935f);
        C15708b.k(parcel, 7, this.f86936g);
        C15708b.k(parcel, 8, this.f86937h);
        C15708b.z(parcel, 9, this.f86939j, i10, false);
        C15708b.k(parcel, 10, this.f86940k);
        C15708b.k(parcel, 11, this.f86941l);
        C15708b.k(parcel, 12, this.f86942m);
        C15708b.z(parcel, 13, this.f86943n, i10, false);
        C15708b.k(parcel, 14, this.f86938i);
        C15708b.k(parcel, 15, this.f86944o);
        C15708b.b(parcel, iA);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, @RecentlyNonNull LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i10, i11, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new a[0], -1.0f);
    }
}
