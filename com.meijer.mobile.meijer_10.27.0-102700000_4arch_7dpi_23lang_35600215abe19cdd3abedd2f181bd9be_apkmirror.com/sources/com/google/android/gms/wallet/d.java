package com.google.android.gms.wallet;

import Xd.C5422f;
import Xd.C5423g;
import Xd.C5424h;
import Xd.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes6.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MaskedWallet[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String[] strArrH = null;
        String strG3 = null;
        n nVar = null;
        n nVar2 = null;
        C5423g[] c5423gArr = null;
        C5424h[] c5424hArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C5422f[] c5422fArr = null;
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
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    nVar = (n) SafeParcelReader.f(parcel, iU, n.CREATOR);
                    break;
                case 7:
                    nVar2 = (n) SafeParcelReader.f(parcel, iU, n.CREATOR);
                    break;
                case 8:
                    c5423gArr = (C5423g[]) SafeParcelReader.j(parcel, iU, C5423g.CREATOR);
                    break;
                case 9:
                    c5424hArr = (C5424h[]) SafeParcelReader.j(parcel, iU, C5424h.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) SafeParcelReader.f(parcel, iU, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) SafeParcelReader.f(parcel, iU, UserAddress.CREATOR);
                    break;
                case 12:
                    c5422fArr = (C5422f[]) SafeParcelReader.j(parcel, iU, C5422f.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new MaskedWallet(strG, strG2, strArrH, strG3, nVar, nVar2, c5423gArr, c5424hArr, userAddress, userAddress2, c5422fArr);
    }
}
