package od;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: od.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16114j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C16109e[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            if (SafeParcelReader.m(iU) != 1) {
                SafeParcelReader.D(parcel, iU);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, iU, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C16109e(pendingIntent);
    }
}
