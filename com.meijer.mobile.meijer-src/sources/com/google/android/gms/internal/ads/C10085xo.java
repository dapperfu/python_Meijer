package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10085xo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Bundle bundleA = null;
        Sc.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String strG = null;
        ArrayList<String> arrayListI = null;
        PackageInfo packageInfo = null;
        String strG2 = null;
        String strG3 = null;
        C9163p70 c9163p70 = null;
        String strG4 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        boolean zN = false;
        boolean zN2 = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    bundleA = SafeParcelReader.a(parcel, iU);
                    break;
                case 2:
                    aVar = (Sc.a) SafeParcelReader.f(parcel, iU, Sc.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.f(parcel, iU, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    arrayListI = SafeParcelReader.i(parcel, iU);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.f(parcel, iU, PackageInfo.CREATOR);
                    break;
                case 7:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 9:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    c9163p70 = (C9163p70) SafeParcelReader.f(parcel, iU, C9163p70.CREATOR);
                    break;
                case 11:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 12:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 13:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 14:
                    bundleA2 = SafeParcelReader.a(parcel, iU);
                    break;
                case 15:
                    bundleA3 = SafeParcelReader.a(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C9978wo(bundleA, aVar, applicationInfo, strG, arrayListI, packageInfo, strG2, strG3, c9163p70, strG4, zN, zN2, bundleA2, bundleA3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C9978wo[i10];
    }
}
