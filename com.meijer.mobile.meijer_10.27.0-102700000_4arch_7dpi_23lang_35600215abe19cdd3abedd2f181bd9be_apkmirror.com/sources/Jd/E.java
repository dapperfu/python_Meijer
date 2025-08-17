package Jd;

import Ad.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        WorkSource workSource = new WorkSource();
        Q q10 = null;
        int iW = 0;
        boolean zN = false;
        int iW2 = 0;
        long jZ = Long.MAX_VALUE;
        long jZ2 = Long.MAX_VALUE;
        int iW3 = 102;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 2:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 5:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.f(parcel, iU, WorkSource.CREATOR);
                    break;
                case 7:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 8:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 9:
                    q10 = (Q) SafeParcelReader.f(parcel, iU, Q.CREATOR);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3767a(jZ, iW, iW3, jZ2, zN, iW2, workSource, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3767a[i10];
    }
}
