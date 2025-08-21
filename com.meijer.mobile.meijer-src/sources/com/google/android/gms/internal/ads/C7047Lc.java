package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7047Lc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        int iW = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Bundle bundleA = null;
        String strG5 = null;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 8:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 10:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 11:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C7013Kc(strG, jZ, strG2, strG3, strG4, bundleA, zN, jZ2, strG5, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7013Kc[i10];
    }
}
