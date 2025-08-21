package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes6.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        CommonWalletObject commonWalletObject = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    commonWalletObject = (CommonWalletObject) SafeParcelReader.f(parcel, iU, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 7:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 9:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5632e(commonWalletObject, strG, strG2, strG3, jZ, strG4, jZ2, strG5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5632e[i10];
    }
}
