package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class M0 implements Parcelable.Creator<C11176l1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C11176l1[] newArray(int i10) {
        return new C11176l1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C11176l1 createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    zN = SafeParcelReader.n(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C11176l1(iW, zN);
    }
}
