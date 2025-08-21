package be;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6365h[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        C6363f c6363f = null;
        C6364g c6364g = null;
        C6364g c6364g2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            if (iM != 6) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                c6364g2 = (C6364g) SafeParcelReader.f(parcel, iU, C6364g.CREATOR);
                            }
                        } else {
                            c6364g = (C6364g) SafeParcelReader.f(parcel, iU, C6364g.CREATOR);
                        }
                    } else {
                        c6363f = (C6363f) SafeParcelReader.f(parcel, iU, C6363f.CREATOR);
                    }
                } else {
                    strG2 = SafeParcelReader.g(parcel, iU);
                }
            } else {
                strG = SafeParcelReader.g(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6365h(strG, strG2, c6363f, c6364g, c6364g2);
    }
}
