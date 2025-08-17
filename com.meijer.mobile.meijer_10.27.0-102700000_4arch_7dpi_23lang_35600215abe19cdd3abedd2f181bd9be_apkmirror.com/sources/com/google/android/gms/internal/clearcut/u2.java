package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class u2 implements Parcelable.Creator<t2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t2 createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        int iW3 = 0;
        boolean zN2 = true;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 8:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 9:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new t2(strG, iW, iW2, strG2, strG3, zN2, strG4, zN, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t2[] newArray(int i10) {
        return new t2[i10];
    }
}
