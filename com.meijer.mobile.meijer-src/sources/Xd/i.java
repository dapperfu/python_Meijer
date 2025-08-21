package Xd;

import Xd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class i implements Parcelable.Creator<a.f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.f[] newArray(int i10) {
        return new a.f[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.f createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            strG3 = SafeParcelReader.g(parcel, iU);
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
        return new a.f(iW, strG, strG2, strG3);
    }
}
