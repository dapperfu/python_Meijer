package Qd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new J[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList<Integer> arrayListE = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            if (SafeParcelReader.m(iU) != 1) {
                SafeParcelReader.D(parcel, iU);
            } else {
                arrayListE = SafeParcelReader.e(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new J(arrayListE);
    }
}
