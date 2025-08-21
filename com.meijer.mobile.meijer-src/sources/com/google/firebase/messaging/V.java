package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import md.C15708b;

/* loaded from: classes8.dex */
public class V implements Parcelable.Creator<U> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U[] newArray(int i10) {
        return new U[i10];
    }

    static void c(U u10, Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.e(parcel, 2, u10.f89661a, false);
        C15708b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public U createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            if (SafeParcelReader.m(iU) != 2) {
                SafeParcelReader.D(parcel, iU);
            } else {
                bundleA = SafeParcelReader.a(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new U(bundleA);
    }
}
