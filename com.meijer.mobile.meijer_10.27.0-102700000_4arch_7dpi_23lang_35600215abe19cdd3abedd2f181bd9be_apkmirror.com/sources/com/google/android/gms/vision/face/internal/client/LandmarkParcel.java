package com.google.android.gms.vision.face.internal.client;

import Wd.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import kd.AbstractC15136a;
import kd.C15137b;

@UsedByNative("wrapper.cc")
/* loaded from: classes6.dex */
public final class LandmarkParcel extends AbstractC15136a {

    @RecentlyNonNull
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final int f86105a;

    /* renamed from: b, reason: collision with root package name */
    public final float f86106b;

    /* renamed from: c, reason: collision with root package name */
    public final float f86107c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86108d;

    @UsedByNative("wrapper.cc")
    public LandmarkParcel(int i10, float f10, float f11, int i11) {
        this.f86105a = i10;
        this.f86106b = f10;
        this.f86107c = f11;
        this.f86108d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f86105a);
        C15137b.k(parcel, 2, this.f86106b);
        C15137b.k(parcel, 3, this.f86107c);
        C15137b.n(parcel, 4, this.f86108d);
        C15137b.b(parcel, iA);
    }
}
