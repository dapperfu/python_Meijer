package Td;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.M;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        M m10 = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    m10 = (M) SafeParcelReader.f(parcel, iU, M.CREATOR);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new j(iW, m10);
    }
}
