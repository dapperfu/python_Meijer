package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class I0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new H0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Bundle bundleA = null;
        String strG = null;
        boolean zN = false;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 7) {
                            if (iM != 8) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                strG = SafeParcelReader.g(parcel, iU);
                            }
                        } else {
                            bundleA = SafeParcelReader.a(parcel, iU);
                        }
                    } else {
                        zN = SafeParcelReader.n(parcel, iU);
                    }
                } else {
                    jZ2 = SafeParcelReader.z(parcel, iU);
                }
            } else {
                jZ = SafeParcelReader.z(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new H0(jZ, jZ2, zN, bundleA, strG);
    }
}
