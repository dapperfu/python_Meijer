package gd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: gd.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14234A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        String strG = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 2:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 3:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 4:
                    iBinderV = SafeParcelReader.v(parcel, iU);
                    break;
                case 5:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 6:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new z(strG, zN, zN2, iBinderV, zN3, zN4);
    }
}
