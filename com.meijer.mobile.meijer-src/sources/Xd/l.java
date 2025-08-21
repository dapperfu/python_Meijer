package Xd;

import Xd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class l implements Parcelable.Creator<a.g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.g[] newArray(int i10) {
        return new a.g[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.g createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    dQ2 = SafeParcelReader.q(parcel, iU);
                }
            } else {
                dQ = SafeParcelReader.q(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a.g(dQ, dQ2);
    }
}
