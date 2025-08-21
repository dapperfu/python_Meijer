package dd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13657e implements Parcelable.Creator<C13656d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13656d[] newArray(int i10) {
        return new C13656d[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13656d createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    strG2 = SafeParcelReader.g(parcel, iU);
                }
            } else {
                strG = SafeParcelReader.g(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C13656d(strG, strG2);
    }
}
