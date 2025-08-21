package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = -1;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        String strG = null;
        String strG2 = null;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 5:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 6:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 9:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6659p(iW2, iW3, iW4, jZ, jZ2, strG, strG2, iW5, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6659p[i10];
    }
}
