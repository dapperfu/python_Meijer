package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5633f[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        String strG = null;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        iW = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    strG2 = SafeParcelReader.g(parcel, iU);
                }
            } else {
                strG = SafeParcelReader.g(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5633f(strG, strG2, iW);
    }
}
