package com.google.android.gms.vision.face.internal.client;

import Wd.a;
import Wd.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import kd.AbstractC15136a;
import kd.C15137b;

@UsedByNative("wrapper.cc")
/* loaded from: classes6.dex */
public class FaceParcel extends AbstractC15136a {

    @RecentlyNonNull
    public static final Parcelable.Creator<FaceParcel> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final int f86090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86091b;

    /* renamed from: c, reason: collision with root package name */
    public final float f86092c;

    /* renamed from: d, reason: collision with root package name */
    public final float f86093d;

    /* renamed from: e, reason: collision with root package name */
    public final float f86094e;

    /* renamed from: f, reason: collision with root package name */
    public final float f86095f;

    /* renamed from: g, reason: collision with root package name */
    public final float f86096g;

    /* renamed from: h, reason: collision with root package name */
    public final float f86097h;

    /* renamed from: i, reason: collision with root package name */
    public final float f86098i;

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    public final LandmarkParcel[] f86099j;

    /* renamed from: k, reason: collision with root package name */
    public final float f86100k;

    /* renamed from: l, reason: collision with root package name */
    public final float f86101l;

    /* renamed from: m, reason: collision with root package name */
    public final float f86102m;

    /* renamed from: n, reason: collision with root package name */
    public final a[] f86103n;

    /* renamed from: o, reason: collision with root package name */
    public final float f86104o;

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, a[] aVarArr, float f20) {
        this.f86090a = i10;
        this.f86091b = i11;
        this.f86092c = f10;
        this.f86093d = f11;
        this.f86094e = f12;
        this.f86095f = f13;
        this.f86096g = f14;
        this.f86097h = f15;
        this.f86098i = f16;
        this.f86099j = landmarkParcelArr;
        this.f86100k = f17;
        this.f86101l = f18;
        this.f86102m = f19;
        this.f86103n = aVarArr;
        this.f86104o = f20;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f86090a);
        C15137b.n(parcel, 2, this.f86091b);
        C15137b.k(parcel, 3, this.f86092c);
        C15137b.k(parcel, 4, this.f86093d);
        C15137b.k(parcel, 5, this.f86094e);
        C15137b.k(parcel, 6, this.f86095f);
        C15137b.k(parcel, 7, this.f86096g);
        C15137b.k(parcel, 8, this.f86097h);
        C15137b.z(parcel, 9, this.f86099j, i10, false);
        C15137b.k(parcel, 10, this.f86100k);
        C15137b.k(parcel, 11, this.f86101l);
        C15137b.k(parcel, 12, this.f86102m);
        C15137b.z(parcel, 13, this.f86103n, i10, false);
        C15137b.k(parcel, 14, this.f86098i);
        C15137b.k(parcel, 15, this.f86104o);
        C15137b.b(parcel, iA);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, @RecentlyNonNull LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i10, i11, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new a[0], -1.0f);
    }
}
