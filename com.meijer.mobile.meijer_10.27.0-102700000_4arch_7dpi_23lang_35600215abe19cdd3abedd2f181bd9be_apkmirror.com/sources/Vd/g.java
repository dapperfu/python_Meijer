package Vd;

import Vd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class g implements Parcelable.Creator<a.d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.d[] newArray(int i10) {
        return new a.d[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.d createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        a.h hVar = null;
        String strG = null;
        String strG2 = null;
        a.i[] iVarArr = null;
        a.f[] fVarArr = null;
        String[] strArrH = null;
        a.C0808a[] c0808aArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    hVar = (a.h) SafeParcelReader.f(parcel, iU, a.h.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    iVarArr = (a.i[]) SafeParcelReader.j(parcel, iU, a.i.CREATOR);
                    break;
                case 6:
                    fVarArr = (a.f[]) SafeParcelReader.j(parcel, iU, a.f.CREATOR);
                    break;
                case 7:
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 8:
                    c0808aArr = (a.C0808a[]) SafeParcelReader.j(parcel, iU, a.C0808a.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a.d(hVar, strG, strG2, iVarArr, fVarArr, strArrH, c0808aArr);
    }
}
