package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: Oc.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4442w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        return new X(strG, strG2);
    }
}
