package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import kd.C15137b;

/* loaded from: classes7.dex */
public class T implements Parcelable.Creator<S> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public S[] newArray(int i10) {
        return new S[i10];
    }

    static void c(S s10, Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.e(parcel, 2, s10.f88815a, false);
        C15137b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public S createFromParcel(Parcel parcel) {
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
        return new S(bundleA);
    }
}
