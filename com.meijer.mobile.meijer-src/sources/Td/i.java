package Td;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList<String> arrayListI = null;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                arrayListI = SafeParcelReader.i(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new h(arrayListI, strG);
    }
}
