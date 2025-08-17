package Ad;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new W[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        PendingIntent pendingIntent = null;
        String strG = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            if (iM != 6) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                strG = SafeParcelReader.g(parcel, iU);
                            }
                        } else {
                            pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, iU, PendingIntent.CREATOR);
                        }
                    } else {
                        iBinderV2 = SafeParcelReader.v(parcel, iU);
                    }
                } else {
                    iBinderV = SafeParcelReader.v(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new W(iW, iBinderV, iBinderV2, pendingIntent, strG);
    }
}
