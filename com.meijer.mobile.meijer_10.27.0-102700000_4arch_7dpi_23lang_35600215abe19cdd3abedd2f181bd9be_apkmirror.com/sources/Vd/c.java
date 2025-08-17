package Vd;

import Vd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class c implements Parcelable.Creator<a.C0808a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0808a[] newArray(int i10) {
        return new a.C0808a[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.C0808a createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        String[] strArrH = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    strArrH = SafeParcelReader.h(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a.C0808a(iW, strArrH);
    }
}
