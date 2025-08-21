package Cd;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: Cd.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3044b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3042a0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Y y10 = null;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderV3 = null;
        String strG = null;
        int iW = 1;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    y10 = (Y) SafeParcelReader.f(parcel, iU, Y.CREATOR);
                    break;
                case 3:
                    iBinderV = SafeParcelReader.v(parcel, iU);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, iU, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderV2 = SafeParcelReader.v(parcel, iU);
                    break;
                case 6:
                    iBinderV3 = SafeParcelReader.v(parcel, iU);
                    break;
                case 7:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 8:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3042a0(iW, y10, iBinderV, iBinderV2, pendingIntent, iBinderV3, strG);
    }
}
