package Jd;

import Ad.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3776j[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Q q10 = null;
        int iW = 0;
        boolean zN = false;
        long jZ = Long.MAX_VALUE;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 5) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            q10 = (Q) SafeParcelReader.f(parcel, iU, Q.CREATOR);
                        }
                    } else {
                        zN = SafeParcelReader.n(parcel, iU);
                    }
                } else {
                    iW = SafeParcelReader.w(parcel, iU);
                }
            } else {
                jZ = SafeParcelReader.z(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3776j(jZ, iW, zN, q10);
    }
}
