package Oc;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        long jZ = 0;
        long jZ2 = 0;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        int iW3 = 0;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        Bundle bundleA = null;
        ArrayList<String> arrayListI = null;
        String strG = null;
        N1 n12 = null;
        Location location = null;
        String strG2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList<String> arrayListI2 = null;
        String strG3 = null;
        String strG4 = null;
        X x10 = null;
        String strG5 = null;
        ArrayList<String> arrayListI3 = null;
        String strG6 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 3:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 4:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    arrayListI = SafeParcelReader.i(parcel, iU);
                    break;
                case 6:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 7:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 8:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    n12 = (N1) SafeParcelReader.f(parcel, iU, N1.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.f(parcel, iU, Location.CREATOR);
                    break;
                case 12:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 13:
                    bundleA2 = SafeParcelReader.a(parcel, iU);
                    break;
                case 14:
                    bundleA3 = SafeParcelReader.a(parcel, iU);
                    break;
                case 15:
                    arrayListI2 = SafeParcelReader.i(parcel, iU);
                    break;
                case 16:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 17:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 18:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 19:
                    x10 = (X) SafeParcelReader.f(parcel, iU, X.CREATOR);
                    break;
                case 20:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 21:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    arrayListI3 = SafeParcelReader.i(parcel, iU);
                    break;
                case 23:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 24:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 25:
                    iW6 = SafeParcelReader.w(parcel, iU);
                    break;
                case 26:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new Y1(iW, jZ, bundleA, iW2, arrayListI, zN, iW3, zN2, strG, n12, location, strG2, bundleA2, bundleA3, arrayListI2, strG3, strG4, zN3, x10, iW4, strG5, arrayListI3, iW5, strG6, iW6, jZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Y1[i10];
    }
}
