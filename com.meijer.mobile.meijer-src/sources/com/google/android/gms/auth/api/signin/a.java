package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Uri uri = null;
        String strG5 = null;
        String strG6 = null;
        ArrayList arrayListK = null;
        String strG7 = null;
        String strG8 = null;
        long jZ = 0;
        int iW = 0;
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
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.f(parcel, iU, Uri.CREATOR);
                    break;
                case 7:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 9:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    arrayListK = SafeParcelReader.k(parcel, iU, Scope.CREATOR);
                    break;
                case 11:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                case 12:
                    strG8 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new GoogleSignInAccount(iW, strG, strG2, strG3, strG4, uri, strG5, jZ, strG6, arrayListK, strG7, strG8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
