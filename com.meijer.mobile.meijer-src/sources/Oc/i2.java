package Oc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class i2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h2[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        W0 w02 = null;
        Bundle bundleA = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        long jZ = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 2:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 3:
                    w02 = (W0) SafeParcelReader.f(parcel, iU, W0.CREATOR);
                    break;
                case 4:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 5:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new h2(strG, jZ, w02, bundleA, strG2, strG3, strG4, strG5);
    }
}
