package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes6.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5419c[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        UserAddress userAddress = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            if (iM != 5) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                userAddress = (UserAddress) SafeParcelReader.f(parcel, iU, UserAddress.CREATOR);
                            }
                        } else {
                            iW = SafeParcelReader.w(parcel, iU);
                        }
                    } else {
                        strG3 = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    strG2 = SafeParcelReader.g(parcel, iU);
                }
            } else {
                strG = SafeParcelReader.g(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5419c(strG, strG2, strG3, iW, userAddress);
    }
}
