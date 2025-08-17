package Wd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* loaded from: classes6.dex */
public final class d implements Parcelable.Creator<LandmarkParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LandmarkParcel[] newArray(int i10) {
        return new LandmarkParcel[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LandmarkParcel createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            iW2 = SafeParcelReader.w(parcel, iU);
                        }
                    } else {
                        fS2 = SafeParcelReader.s(parcel, iU);
                    }
                } else {
                    fS = SafeParcelReader.s(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new LandmarkParcel(iW, fS, fS2, iW2);
    }
}
