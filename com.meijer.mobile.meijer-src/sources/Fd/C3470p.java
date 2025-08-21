package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: Fd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3470p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3459o[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        long jZ = 0;
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
                                iW4 = SafeParcelReader.w(parcel, iU);
                            }
                        } else {
                            jZ = SafeParcelReader.z(parcel, iU);
                        }
                    } else {
                        iW3 = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    iW2 = SafeParcelReader.w(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3459o(iW, iW2, iW3, jZ, iW4);
    }
}
