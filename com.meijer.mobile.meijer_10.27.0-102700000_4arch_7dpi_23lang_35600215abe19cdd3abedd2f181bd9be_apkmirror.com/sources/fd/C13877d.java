package fd;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: fd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13877d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C13874a[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            if (SafeParcelReader.m(iU) != 1) {
                SafeParcelReader.D(parcel, iU);
            } else {
                intent = (Intent) SafeParcelReader.f(parcel, iU, Intent.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C13874a(intent);
    }
}
