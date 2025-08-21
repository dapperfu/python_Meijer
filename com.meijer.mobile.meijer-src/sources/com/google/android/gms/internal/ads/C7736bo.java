package com.google.android.gms.internal.ads;

import Oc.C4384c1;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.bo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7736bo implements Parcelable.Creator {
    public static final C7629ao a(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Bundle bundleA = null;
        Oc.Y1 y12 = null;
        Oc.d2 d2Var = null;
        String strG = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Sc.a aVar = null;
        Bundle bundleA2 = null;
        ArrayList<String> arrayListI = null;
        Bundle bundleA3 = null;
        String strG5 = null;
        String strG6 = null;
        ArrayList<String> arrayListI2 = null;
        String strG7 = null;
        C7088Mg c7088Mg = null;
        ArrayList<String> arrayListI3 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        Bundle bundleA4 = null;
        String strG11 = null;
        C4384c1 c4384c1 = null;
        Bundle bundleA5 = null;
        String strG12 = null;
        String strG13 = null;
        String strG14 = null;
        ArrayList<Integer> arrayListE = null;
        String strG15 = null;
        ArrayList<String> arrayListI4 = null;
        ArrayList<String> arrayListI5 = null;
        String strG16 = null;
        C7364Uj c7364Uj = null;
        String strG17 = null;
        Bundle bundleA6 = null;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        int iW3 = 0;
        int iW4 = 0;
        boolean zN2 = false;
        int iW5 = 0;
        int iW6 = 0;
        boolean zN3 = false;
        boolean zN4 = false;
        int iW7 = 0;
        boolean zN5 = false;
        boolean zN6 = false;
        int iW8 = 0;
        boolean zN7 = false;
        boolean zN8 = false;
        boolean zN9 = false;
        float fS = 0.0f;
        float fS2 = 0.0f;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 3:
                    y12 = (Oc.Y1) SafeParcelReader.f(parcel, iU, Oc.Y1.CREATOR);
                    break;
                case 4:
                    d2Var = (Oc.d2) SafeParcelReader.f(parcel, iU, Oc.d2.CREATOR);
                    break;
                case 5:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.f(parcel, iU, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.f(parcel, iU, PackageInfo.CREATOR);
                    break;
                case 8:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 9:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 11:
                    aVar = (Sc.a) SafeParcelReader.f(parcel, iU, Sc.a.CREATOR);
                    break;
                case 12:
                    bundleA2 = SafeParcelReader.a(parcel, iU);
                    break;
                case 13:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 14:
                    arrayListI = SafeParcelReader.i(parcel, iU);
                    break;
                case 15:
                    bundleA3 = SafeParcelReader.a(parcel, iU);
                    break;
                case 16:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 17:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                case 38:
                case 62:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 18:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 19:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 20:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 21:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 25:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 26:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 27:
                    arrayListI2 = SafeParcelReader.i(parcel, iU);
                    break;
                case 28:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                case 29:
                    c7088Mg = (C7088Mg) SafeParcelReader.f(parcel, iU, C7088Mg.CREATOR);
                    break;
                case 30:
                    arrayListI3 = SafeParcelReader.i(parcel, iU);
                    break;
                case 31:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 33:
                    strG8 = SafeParcelReader.g(parcel, iU);
                    break;
                case 34:
                    fS2 = SafeParcelReader.s(parcel, iU);
                    break;
                case 35:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 36:
                    iW6 = SafeParcelReader.w(parcel, iU);
                    break;
                case 37:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 39:
                    strG9 = SafeParcelReader.g(parcel, iU);
                    break;
                case 40:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 41:
                    strG10 = SafeParcelReader.g(parcel, iU);
                    break;
                case 42:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 43:
                    iW7 = SafeParcelReader.w(parcel, iU);
                    break;
                case 44:
                    bundleA4 = SafeParcelReader.a(parcel, iU);
                    break;
                case 45:
                    strG11 = SafeParcelReader.g(parcel, iU);
                    break;
                case 46:
                    c4384c1 = (C4384c1) SafeParcelReader.f(parcel, iU, C4384c1.CREATOR);
                    break;
                case 47:
                    zN5 = SafeParcelReader.n(parcel, iU);
                    break;
                case 48:
                    bundleA5 = SafeParcelReader.a(parcel, iU);
                    break;
                case 49:
                    strG12 = SafeParcelReader.g(parcel, iU);
                    break;
                case 50:
                    strG13 = SafeParcelReader.g(parcel, iU);
                    break;
                case 51:
                    strG14 = SafeParcelReader.g(parcel, iU);
                    break;
                case 52:
                    zN6 = SafeParcelReader.n(parcel, iU);
                    break;
                case 53:
                    arrayListE = SafeParcelReader.e(parcel, iU);
                    break;
                case 54:
                    strG15 = SafeParcelReader.g(parcel, iU);
                    break;
                case 55:
                    arrayListI4 = SafeParcelReader.i(parcel, iU);
                    break;
                case 56:
                    iW8 = SafeParcelReader.w(parcel, iU);
                    break;
                case 57:
                    zN7 = SafeParcelReader.n(parcel, iU);
                    break;
                case 58:
                    zN8 = SafeParcelReader.n(parcel, iU);
                    break;
                case 59:
                    zN9 = SafeParcelReader.n(parcel, iU);
                    break;
                case 60:
                    arrayListI5 = SafeParcelReader.i(parcel, iU);
                    break;
                case 61:
                    strG16 = SafeParcelReader.g(parcel, iU);
                    break;
                case 63:
                    c7364Uj = (C7364Uj) SafeParcelReader.f(parcel, iU, C7364Uj.CREATOR);
                    break;
                case 64:
                    strG17 = SafeParcelReader.g(parcel, iU);
                    break;
                case 65:
                    bundleA6 = SafeParcelReader.a(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C7629ao(iW, bundleA, y12, d2Var, strG, applicationInfo, packageInfo, strG2, strG3, strG4, aVar, bundleA2, iW2, arrayListI, bundleA3, zN, iW3, iW4, fS, strG5, jZ, strG6, arrayListI2, strG7, c7088Mg, arrayListI3, jZ2, strG8, fS2, zN2, iW5, iW6, zN3, strG9, strG10, zN4, iW7, bundleA4, strG11, c4384c1, zN5, bundleA5, strG12, strG13, strG14, zN6, arrayListE, strG15, arrayListI4, iW8, zN7, zN8, zN9, arrayListI5, strG16, c7364Uj, strG17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7629ao[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
