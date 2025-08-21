package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new G[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        boolean zN = true;
        boolean zN2 = false;
        IBinder iBinderV = null;
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
                                fS2 = SafeParcelReader.s(parcel, iU);
                            }
                        } else {
                            zN = SafeParcelReader.n(parcel, iU);
                        }
                    } else {
                        fS = SafeParcelReader.s(parcel, iU);
                    }
                } else {
                    zN2 = SafeParcelReader.n(parcel, iU);
                }
            } else {
                iBinderV = SafeParcelReader.v(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new G(iBinderV, zN2, fS, zN, fS2);
    }
}
