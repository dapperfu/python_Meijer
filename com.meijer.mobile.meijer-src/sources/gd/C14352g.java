package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.clearcut.t2;

/* renamed from: gd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14352g implements Parcelable.Creator<C14351f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14351f[] newArray(int i10) {
        return new C14351f[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C14351f createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        t2 t2Var = null;
        byte[] bArrB = null;
        int[] iArrD = null;
        String[] strArrH = null;
        int[] iArrD2 = null;
        byte[][] bArrC = null;
        Rd.a[] aVarArr = null;
        boolean zN = true;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    t2Var = (t2) SafeParcelReader.f(parcel, iU, t2.CREATOR);
                    break;
                case 3:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 4:
                    iArrD = SafeParcelReader.d(parcel, iU);
                    break;
                case 5:
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 6:
                    iArrD2 = SafeParcelReader.d(parcel, iU);
                    break;
                case 7:
                    bArrC = SafeParcelReader.c(parcel, iU);
                    break;
                case 8:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    aVarArr = (Rd.a[]) SafeParcelReader.j(parcel, iU, Rd.a.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C14351f(t2Var, bArrB, iArrD, strArrH, iArrD2, bArrC, zN, aVarArr);
    }
}
