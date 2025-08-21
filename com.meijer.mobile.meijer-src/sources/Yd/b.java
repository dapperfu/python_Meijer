package Yd;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        PointF[] pointFArr = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    iW = SafeParcelReader.w(parcel, iU);
                }
            } else {
                pointFArr = (PointF[]) SafeParcelReader.j(parcel, iU, PointF.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a(pointFArr, iW);
    }
}
