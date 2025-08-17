package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Fp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6737Fp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6703Ep[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        ArrayList<String> arrayListI = null;
        ArrayList<String> arrayListI2 = null;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 5:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 6:
                    arrayListI = SafeParcelReader.i(parcel, iU);
                    break;
                case 7:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 8:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    arrayListI2 = SafeParcelReader.i(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6703Ep(strG, strG2, zN, zN2, arrayListI, zN3, zN4, arrayListI2);
    }
}
