package od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: od.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16117m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C16112h[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        Long lA = null;
        Long lA2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            if (iM != 5) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                iW3 = SafeParcelReader.w(parcel, iU);
                            }
                        } else {
                            lA2 = SafeParcelReader.A(parcel, iU);
                        }
                    } else {
                        lA = SafeParcelReader.A(parcel, iU);
                    }
                } else {
                    iW2 = SafeParcelReader.w(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C16112h(iW, iW2, lA, lA2, iW3);
    }
}
