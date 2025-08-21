package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C4476y c4476y = null;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        float fS = 0.0f;
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
                                c4476y = (C4476y) SafeParcelReader.f(parcel, iU, C4476y.CREATOR);
                            }
                        } else {
                            zN = SafeParcelReader.n(parcel, iU);
                        }
                    } else {
                        iW2 = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    iW = SafeParcelReader.w(parcel, iU);
                }
            } else {
                fS = SafeParcelReader.s(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C(fS, iW, iW2, zN, c4476y);
    }
}
