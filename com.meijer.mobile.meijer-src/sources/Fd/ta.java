package Fd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class ta implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        C3422ka c3422ka = null;
        C3458na c3458na = null;
        oa oaVar = null;
        ra raVar = null;
        pa paVar = null;
        C3434la c3434la = null;
        C3386ha c3386ha = null;
        C3398ia c3398ia = null;
        C3410ja c3410ja = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.j(parcel, iU, Point.CREATOR);
                    break;
                case 6:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    c3422ka = (C3422ka) SafeParcelReader.f(parcel, iU, C3422ka.CREATOR);
                    break;
                case 8:
                    c3458na = (C3458na) SafeParcelReader.f(parcel, iU, C3458na.CREATOR);
                    break;
                case 9:
                    oaVar = (oa) SafeParcelReader.f(parcel, iU, oa.CREATOR);
                    break;
                case 10:
                    raVar = (ra) SafeParcelReader.f(parcel, iU, ra.CREATOR);
                    break;
                case 11:
                    paVar = (pa) SafeParcelReader.f(parcel, iU, pa.CREATOR);
                    break;
                case 12:
                    c3434la = (C3434la) SafeParcelReader.f(parcel, iU, C3434la.CREATOR);
                    break;
                case 13:
                    c3386ha = (C3386ha) SafeParcelReader.f(parcel, iU, C3386ha.CREATOR);
                    break;
                case 14:
                    c3398ia = (C3398ia) SafeParcelReader.f(parcel, iU, C3398ia.CREATOR);
                    break;
                case 15:
                    c3410ja = (C3410ja) SafeParcelReader.f(parcel, iU, C3410ja.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new sa(iW, strG, strG2, bArrB, pointArr, iW2, c3422ka, c3458na, oaVar, raVar, paVar, c3434la, c3386ha, c3398ia, c3410ja);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new sa[i10];
    }
}
