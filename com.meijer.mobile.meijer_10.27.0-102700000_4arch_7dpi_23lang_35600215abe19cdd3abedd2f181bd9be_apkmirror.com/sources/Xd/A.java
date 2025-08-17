package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5420d[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        C5423g c5423g = null;
        C5424h c5424h = null;
        C5421e c5421e = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            iW = SafeParcelReader.w(parcel, iU);
                        }
                    } else {
                        c5421e = (C5421e) SafeParcelReader.f(parcel, iU, C5421e.CREATOR);
                    }
                } else {
                    c5424h = (C5424h) SafeParcelReader.f(parcel, iU, C5424h.CREATOR);
                }
            } else {
                c5423g = (C5423g) SafeParcelReader.f(parcel, iU, C5423g.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5420d(c5423g, c5424h, c5421e, iW);
    }
}
