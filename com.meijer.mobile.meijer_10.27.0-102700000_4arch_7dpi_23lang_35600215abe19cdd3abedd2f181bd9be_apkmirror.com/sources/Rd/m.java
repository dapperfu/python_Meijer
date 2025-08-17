package Rd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.O;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import gd.C14243b;

/* loaded from: classes6.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C14243b c14243b = null;
        int iW = 0;
        O o10 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        o10 = (O) SafeParcelReader.f(parcel, iU, O.CREATOR);
                    }
                } else {
                    c14243b = (C14243b) SafeParcelReader.f(parcel, iU, C14243b.CREATOR);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new l(iW, c14243b, o10);
    }
}
