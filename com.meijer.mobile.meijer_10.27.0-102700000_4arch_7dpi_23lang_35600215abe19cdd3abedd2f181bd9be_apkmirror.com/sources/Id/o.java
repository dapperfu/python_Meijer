package Id;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String[] strArrH = null;
        int[] iArrD = null;
        RemoteViews remoteViews = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            bArrB = SafeParcelReader.b(parcel, iU);
                        }
                    } else {
                        remoteViews = (RemoteViews) SafeParcelReader.f(parcel, iU, RemoteViews.CREATOR);
                    }
                } else {
                    iArrD = SafeParcelReader.d(parcel, iU);
                }
            } else {
                strArrH = SafeParcelReader.h(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new n(strArrH, iArrD, remoteViews, bArrB);
    }
}
