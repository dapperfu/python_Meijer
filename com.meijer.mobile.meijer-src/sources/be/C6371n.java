package be;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: be.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6371n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6360c[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        C6361d c6361d = null;
        C6363f c6363f = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 5) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        c6363f = (C6363f) SafeParcelReader.f(parcel, iU, C6363f.CREATOR);
                    }
                } else {
                    c6361d = (C6361d) SafeParcelReader.f(parcel, iU, C6361d.CREATOR);
                }
            } else {
                strG = SafeParcelReader.g(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6360c(strG, c6361d, c6363f);
    }
}
