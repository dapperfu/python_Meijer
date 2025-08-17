package Vd;

import Vd.a;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class d implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        String strG = null;
        String strG2 = null;
        Point[] pointArr = null;
        a.f fVar = null;
        a.i iVar = null;
        a.j jVar = null;
        a.l lVar = null;
        a.k kVar = null;
        a.g gVar = null;
        a.c cVar = null;
        a.d dVar = null;
        a.e eVar = null;
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
                    fVar = (a.f) SafeParcelReader.f(parcel, iU, a.f.CREATOR);
                    break;
                case 8:
                    iVar = (a.i) SafeParcelReader.f(parcel, iU, a.i.CREATOR);
                    break;
                case 9:
                    jVar = (a.j) SafeParcelReader.f(parcel, iU, a.j.CREATOR);
                    break;
                case 10:
                    lVar = (a.l) SafeParcelReader.f(parcel, iU, a.l.CREATOR);
                    break;
                case 11:
                    kVar = (a.k) SafeParcelReader.f(parcel, iU, a.k.CREATOR);
                    break;
                case 12:
                    gVar = (a.g) SafeParcelReader.f(parcel, iU, a.g.CREATOR);
                    break;
                case 13:
                    cVar = (a.c) SafeParcelReader.f(parcel, iU, a.c.CREATOR);
                    break;
                case 14:
                    dVar = (a.d) SafeParcelReader.f(parcel, iU, a.d.CREATOR);
                    break;
                case 15:
                    eVar = (a.e) SafeParcelReader.f(parcel, iU, a.e.CREATOR);
                    break;
                case 16:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 17:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a(iW, strG, strG2, iW2, pointArr, fVar, iVar, jVar, lVar, kVar, gVar, cVar, dVar, eVar, bArrB, zN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
