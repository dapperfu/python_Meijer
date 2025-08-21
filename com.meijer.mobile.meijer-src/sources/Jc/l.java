package Jc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        IBinder iBinderV = null;
        boolean zN = false;
        IBinder iBinderV2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        iBinderV2 = SafeParcelReader.v(parcel, iU);
                    }
                } else {
                    iBinderV = SafeParcelReader.v(parcel, iU);
                }
            } else {
                zN = SafeParcelReader.n(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new e(zN, iBinderV, iBinderV2);
    }
}
