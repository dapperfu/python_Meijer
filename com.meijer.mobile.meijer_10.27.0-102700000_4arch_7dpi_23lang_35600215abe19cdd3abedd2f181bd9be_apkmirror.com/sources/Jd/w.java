package Jd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3779m[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        ArrayList arrayListK = null;
        boolean zN2 = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        zN2 = SafeParcelReader.n(parcel, iU);
                    }
                } else {
                    zN = SafeParcelReader.n(parcel, iU);
                }
            } else {
                arrayListK = SafeParcelReader.k(parcel, iU, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3779m(arrayListK, zN, zN2);
    }
}
