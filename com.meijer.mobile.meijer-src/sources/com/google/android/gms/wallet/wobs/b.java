package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import be.C6359b;
import be.C6362e;
import be.C6363f;
import be.C6364g;
import be.C6365h;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList arrayListC = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC2 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC3 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListK = arrayListC;
        ArrayList arrayListK2 = arrayListC2;
        ArrayList arrayListK3 = arrayListC3;
        ArrayList arrayListC4 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC5 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC6 = com.google.android.gms.common.util.b.c();
        int iW = 0;
        boolean zN = false;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        C6363f c6363f = null;
        String strG9 = null;
        String strG10 = null;
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
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                case 9:
                    strG8 = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 11:
                    arrayListK = SafeParcelReader.k(parcel, iU, C6365h.CREATOR);
                    break;
                case 12:
                    c6363f = (C6363f) SafeParcelReader.f(parcel, iU, C6363f.CREATOR);
                    break;
                case 13:
                    arrayListK2 = SafeParcelReader.k(parcel, iU, LatLng.CREATOR);
                    break;
                case 14:
                    strG9 = SafeParcelReader.g(parcel, iU);
                    break;
                case 15:
                    strG10 = SafeParcelReader.g(parcel, iU);
                    break;
                case 16:
                    arrayListK3 = SafeParcelReader.k(parcel, iU, C6359b.CREATOR);
                    break;
                case 17:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 18:
                    arrayListC4 = SafeParcelReader.k(parcel, iU, C6364g.CREATOR);
                    break;
                case 19:
                    arrayListC5 = SafeParcelReader.k(parcel, iU, C6362e.CREATOR);
                    break;
                case 20:
                    arrayListC6 = SafeParcelReader.k(parcel, iU, C6364g.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new CommonWalletObject(strG, strG2, strG3, strG4, strG5, strG6, strG7, strG8, iW, arrayListK, c6363f, arrayListK2, strG9, strG10, arrayListK3, zN, arrayListC4, arrayListC5, arrayListC6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CommonWalletObject[i10];
    }
}
