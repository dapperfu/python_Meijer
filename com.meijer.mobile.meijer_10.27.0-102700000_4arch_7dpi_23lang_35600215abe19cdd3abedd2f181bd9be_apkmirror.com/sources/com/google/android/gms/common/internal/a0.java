package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6537t[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        boolean zN = false;
        boolean zN2 = false;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            if (iM != 5) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                iW3 = SafeParcelReader.w(parcel, iU);
                            }
                        } else {
                            iW2 = SafeParcelReader.w(parcel, iU);
                        }
                    } else {
                        zN2 = SafeParcelReader.n(parcel, iU);
                    }
                } else {
                    zN = SafeParcelReader.n(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6537t(iW, zN, zN2, iW2, iW3);
    }
}
