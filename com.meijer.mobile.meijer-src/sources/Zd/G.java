package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes6.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5635h[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        CommonWalletObject commonWalletObject = null;
        int iW = 0;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            commonWalletObject = (CommonWalletObject) SafeParcelReader.f(parcel, iU, CommonWalletObject.CREATOR);
                        }
                    } else {
                        strG2 = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5635h(iW, strG, strG2, commonWalletObject);
    }
}
