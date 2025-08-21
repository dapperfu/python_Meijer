package Td;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.O;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import id.C14719b;

/* loaded from: classes6.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C14719b c14719b = null;
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
                    c14719b = (C14719b) SafeParcelReader.f(parcel, iU, C14719b.CREATOR);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new l(iW, c14719b, o10);
    }
}
