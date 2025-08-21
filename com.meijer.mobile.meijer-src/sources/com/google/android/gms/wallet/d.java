package com.google.android.gms.wallet;

import Zd.C5633f;
import Zd.C5634g;
import Zd.C5635h;
import Zd.n;
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
        C5634g[] c5634gArr = null;
        C5635h[] c5635hArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C5633f[] c5633fArr = null;
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
                    c5634gArr = (C5634g[]) SafeParcelReader.j(parcel, iU, C5634g.CREATOR);
                    break;
                case 9:
                    c5635hArr = (C5635h[]) SafeParcelReader.j(parcel, iU, C5635h.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) SafeParcelReader.f(parcel, iU, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) SafeParcelReader.f(parcel, iU, UserAddress.CREATOR);
                    break;
                case 12:
                    c5633fArr = (C5633f[]) SafeParcelReader.j(parcel, iU, C5633f.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new MaskedWallet(strG, strG2, strArrH, strG3, nVar, nVar2, c5634gArr, c5635hArr, userAddress, userAddress2, c5633fArr);
    }
}
