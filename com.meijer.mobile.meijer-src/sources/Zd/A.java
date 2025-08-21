package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5631d[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        C5634g c5634g = null;
        C5635h c5635h = null;
        C5632e c5632e = null;
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
                        c5632e = (C5632e) SafeParcelReader.f(parcel, iU, C5632e.CREATOR);
                    }
                } else {
                    c5635h = (C5635h) SafeParcelReader.f(parcel, iU, C5635h.CREATOR);
                }
            } else {
                c5634g = (C5634g) SafeParcelReader.f(parcel, iU, C5634g.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5631d(c5634g, c5635h, c5632e, iW);
    }
}
