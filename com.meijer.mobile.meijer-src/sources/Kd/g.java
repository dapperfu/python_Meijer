package Kd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        byte[] bArrB = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            if (SafeParcelReader.m(iU) != 2) {
                SafeParcelReader.D(parcel, iU);
            } else {
                bArrB = SafeParcelReader.b(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new f(bArrB);
    }
}
