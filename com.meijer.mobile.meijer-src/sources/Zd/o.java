package Zd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes6.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        C5630c c5630c = null;
        UserAddress userAddress = null;
        k kVar = null;
        String strG2 = null;
        Bundle bundleA = null;
        String strG3 = null;
        Bundle bundleA2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 2:
                    c5630c = (C5630c) SafeParcelReader.f(parcel, iU, C5630c.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) SafeParcelReader.f(parcel, iU, UserAddress.CREATOR);
                    break;
                case 4:
                    kVar = (k) SafeParcelReader.f(parcel, iU, k.CREATOR);
                    break;
                case 5:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    bundleA2 = SafeParcelReader.a(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new j(strG, c5630c, userAddress, kVar, strG2, bundleA, strG3, bundleA2);
    }
}
