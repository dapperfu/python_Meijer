package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class Y5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        byte[] bArrB = null;
        String strG = null;
        Bundle bundleA = null;
        String strG2 = null;
        long jZ = 0;
        long jZ2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 2:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 5:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 7:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new X5(jZ, bArrB, strG, bundleA, iW, jZ2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X5[i10];
    }
}
