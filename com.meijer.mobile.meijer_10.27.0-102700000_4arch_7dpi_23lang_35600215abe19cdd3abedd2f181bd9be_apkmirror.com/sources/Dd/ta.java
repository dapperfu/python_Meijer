package Dd;

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
        C3200ka c3200ka = null;
        C3236na c3236na = null;
        oa oaVar = null;
        ra raVar = null;
        pa paVar = null;
        C3212la c3212la = null;
        C3164ha c3164ha = null;
        C3176ia c3176ia = null;
        C3188ja c3188ja = null;
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
                    c3200ka = (C3200ka) SafeParcelReader.f(parcel, iU, C3200ka.CREATOR);
                    break;
                case 8:
                    c3236na = (C3236na) SafeParcelReader.f(parcel, iU, C3236na.CREATOR);
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
                    c3212la = (C3212la) SafeParcelReader.f(parcel, iU, C3212la.CREATOR);
                    break;
                case 13:
                    c3164ha = (C3164ha) SafeParcelReader.f(parcel, iU, C3164ha.CREATOR);
                    break;
                case 14:
                    c3176ia = (C3176ia) SafeParcelReader.f(parcel, iU, C3176ia.CREATOR);
                    break;
                case 15:
                    c3188ja = (C3188ja) SafeParcelReader.f(parcel, iU, C3188ja.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new sa(iW, strG, strG2, bArrB, pointArr, iW2, c3200ka, c3236na, oaVar, raVar, paVar, c3212la, c3164ha, c3176ia, c3188ja);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new sa[i10];
    }
}
