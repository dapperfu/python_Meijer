package Fd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class W8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        double dQ = 0.0d;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        String strG = null;
        String strG2 = null;
        Point[] pointArr = null;
        S4 s42 = null;
        C3542v6 c3542v6 = null;
        W6 w62 = null;
        Y7 y72 = null;
        C3565x7 c3565x7 = null;
        C3519t5 c3519t5 = null;
        C3474p3 c3474p3 = null;
        Q3 q32 = null;
        C3496r4 c3496r4 = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.j(parcel, iU, Point.CREATOR);
                    break;
                case 7:
                    s42 = (S4) SafeParcelReader.f(parcel, iU, S4.CREATOR);
                    break;
                case 8:
                    c3542v6 = (C3542v6) SafeParcelReader.f(parcel, iU, C3542v6.CREATOR);
                    break;
                case 9:
                    w62 = (W6) SafeParcelReader.f(parcel, iU, W6.CREATOR);
                    break;
                case 10:
                    y72 = (Y7) SafeParcelReader.f(parcel, iU, Y7.CREATOR);
                    break;
                case 11:
                    c3565x7 = (C3565x7) SafeParcelReader.f(parcel, iU, C3565x7.CREATOR);
                    break;
                case 12:
                    c3519t5 = (C3519t5) SafeParcelReader.f(parcel, iU, C3519t5.CREATOR);
                    break;
                case 13:
                    c3474p3 = (C3474p3) SafeParcelReader.f(parcel, iU, C3474p3.CREATOR);
                    break;
                case 14:
                    q32 = (Q3) SafeParcelReader.f(parcel, iU, Q3.CREATOR);
                    break;
                case 15:
                    c3496r4 = (C3496r4) SafeParcelReader.f(parcel, iU, C3496r4.CREATOR);
                    break;
                case 16:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 17:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 18:
                    dQ = SafeParcelReader.q(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3588z8(iW, strG, strG2, iW2, pointArr, s42, c3542v6, w62, y72, c3565x7, c3519t5, c3474p3, q32, c3496r4, bArrB, zN, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3588z8[i10];
    }
}
