package Cd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: Cd.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3052f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3050e0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = "";
        ArrayList<String> arrayListI = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        strG = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, iU, PendingIntent.CREATOR);
                }
            } else {
                arrayListI = SafeParcelReader.i(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3050e0(arrayListI, pendingIntent, strG);
    }
}
