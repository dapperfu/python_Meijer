package Dd;

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
        C3320v6 c3320v6 = null;
        W6 w62 = null;
        Y7 y72 = null;
        C3343x7 c3343x7 = null;
        C3297t5 c3297t5 = null;
        C3252p3 c3252p3 = null;
        Q3 q32 = null;
        C3274r4 c3274r4 = null;
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
                    c3320v6 = (C3320v6) SafeParcelReader.f(parcel, iU, C3320v6.CREATOR);
                    break;
                case 9:
                    w62 = (W6) SafeParcelReader.f(parcel, iU, W6.CREATOR);
                    break;
                case 10:
                    y72 = (Y7) SafeParcelReader.f(parcel, iU, Y7.CREATOR);
                    break;
                case 11:
                    c3343x7 = (C3343x7) SafeParcelReader.f(parcel, iU, C3343x7.CREATOR);
                    break;
                case 12:
                    c3297t5 = (C3297t5) SafeParcelReader.f(parcel, iU, C3297t5.CREATOR);
                    break;
                case 13:
                    c3252p3 = (C3252p3) SafeParcelReader.f(parcel, iU, C3252p3.CREATOR);
                    break;
                case 14:
                    q32 = (Q3) SafeParcelReader.f(parcel, iU, Q3.CREATOR);
                    break;
                case 15:
                    c3274r4 = (C3274r4) SafeParcelReader.f(parcel, iU, C3274r4.CREATOR);
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
        return new C3366z8(iW, strG, strG2, iW2, pointArr, s42, c3320v6, w62, y72, c3343x7, c3297t5, c3252p3, q32, c3274r4, bArrB, zN, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3366z8[i10];
    }
}
