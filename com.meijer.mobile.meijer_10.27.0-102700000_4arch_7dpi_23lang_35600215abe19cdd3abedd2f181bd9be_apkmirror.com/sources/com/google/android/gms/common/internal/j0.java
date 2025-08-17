package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6524f[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C6537t c6537t = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zN = false;
        boolean zN2 = false;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    c6537t = (C6537t) SafeParcelReader.f(parcel, iU, C6537t.CREATOR);
                    break;
                case 2:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 3:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 4:
                    iArrD = SafeParcelReader.d(parcel, iU);
                    break;
                case 5:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    iArrD2 = SafeParcelReader.d(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6524f(c6537t, zN, zN2, iArrD, iW, iArrD2);
    }
}
