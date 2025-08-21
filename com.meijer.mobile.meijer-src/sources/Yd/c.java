package Yd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* loaded from: classes6.dex */
public final class c implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        float fS8 = Float.MAX_VALUE;
        float fS9 = Float.MAX_VALUE;
        float fS10 = Float.MAX_VALUE;
        LandmarkParcel[] landmarkParcelArr = null;
        a[] aVarArr = null;
        float fS11 = -1.0f;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 4:
                    fS2 = SafeParcelReader.s(parcel, iU);
                    break;
                case 5:
                    fS3 = SafeParcelReader.s(parcel, iU);
                    break;
                case 6:
                    fS4 = SafeParcelReader.s(parcel, iU);
                    break;
                case 7:
                    fS8 = SafeParcelReader.s(parcel, iU);
                    break;
                case 8:
                    fS9 = SafeParcelReader.s(parcel, iU);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) SafeParcelReader.j(parcel, iU, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    fS5 = SafeParcelReader.s(parcel, iU);
                    break;
                case 11:
                    fS6 = SafeParcelReader.s(parcel, iU);
                    break;
                case 12:
                    fS7 = SafeParcelReader.s(parcel, iU);
                    break;
                case 13:
                    aVarArr = (a[]) SafeParcelReader.j(parcel, iU, a.CREATOR);
                    break;
                case 14:
                    fS10 = SafeParcelReader.s(parcel, iU);
                    break;
                case 15:
                    fS11 = SafeParcelReader.s(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new FaceParcel(iW, iW2, fS, fS2, fS3, fS4, fS8, fS9, fS10, landmarkParcelArr, fS5, fS6, fS7, aVarArr, fS11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel[] newArray(int i10) {
        return new FaceParcel[i10];
    }
}
