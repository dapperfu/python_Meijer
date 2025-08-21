package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class K0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new J0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        int iW = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        intent = (Intent) SafeParcelReader.f(parcel, iU, Intent.CREATOR);
                    }
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new J0(iW, strG, intent);
    }
}
