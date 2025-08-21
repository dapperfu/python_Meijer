package Ld;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new A[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        long jZ = -1;
        long jZ2 = -1;
        int iW = 1;
        int iW2 = 1;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            jZ2 = SafeParcelReader.z(parcel, iU);
                        }
                    } else {
                        jZ = SafeParcelReader.z(parcel, iU);
                    }
                } else {
                    iW2 = SafeParcelReader.w(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new A(iW, iW2, jZ, jZ2);
    }
}
