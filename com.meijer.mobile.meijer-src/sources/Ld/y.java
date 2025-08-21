package Ld;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        boolean zN5 = false;
        boolean zN6 = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 2:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 3:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 4:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 5:
                    zN5 = SafeParcelReader.n(parcel, iU);
                    break;
                case 6:
                    zN6 = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new p(zN, zN2, zN3, zN4, zN5, zN6);
    }
}
