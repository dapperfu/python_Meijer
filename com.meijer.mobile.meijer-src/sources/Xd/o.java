package Xd;

import Xd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class o implements Parcelable.Creator<a.l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.l[] newArray(int i10) {
        return new a.l[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.l createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        int iW = 0;
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
        return new a.l(strG, strG2, iW);
    }
}
