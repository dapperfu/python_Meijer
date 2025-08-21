package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: gd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14350e implements Parcelable.Creator<C14349d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14349d[] newArray(int i10) {
        return new C14349d[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14349d createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        jZ = SafeParcelReader.z(parcel, iU);
                    }
                } else {
                    jZ2 = SafeParcelReader.z(parcel, iU);
                }
            } else {
                zN = SafeParcelReader.n(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C14349d(zN, jZ, jZ2);
    }
}
