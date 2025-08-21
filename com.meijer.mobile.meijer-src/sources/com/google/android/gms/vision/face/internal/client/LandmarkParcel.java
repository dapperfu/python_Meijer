package com.google.android.gms.vision.face.internal.client;

import Yd.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import md.AbstractC15707a;
import md.C15708b;

@UsedByNative("wrapper.cc")
/* loaded from: classes6.dex */
public final class LandmarkParcel extends AbstractC15707a {

    @RecentlyNonNull
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final int f86945a;

    /* renamed from: b, reason: collision with root package name */
    public final float f86946b;

    /* renamed from: c, reason: collision with root package name */
    public final float f86947c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86948d;

    @UsedByNative("wrapper.cc")
    public LandmarkParcel(int i10, float f10, float f11, int i11) {
        this.f86945a = i10;
        this.f86946b = f10;
        this.f86947c = f11;
        this.f86948d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f86945a);
        C15708b.k(parcel, 2, this.f86946b);
        C15708b.k(parcel, 3, this.f86947c);
        C15708b.n(parcel, 4, this.f86948d);
        C15708b.b(parcel, iA);
    }
}
