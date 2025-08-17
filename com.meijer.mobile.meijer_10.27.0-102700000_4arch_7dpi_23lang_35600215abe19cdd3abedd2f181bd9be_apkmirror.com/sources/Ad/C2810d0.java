package Ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: Ad.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2810d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = -1;
        int iW2 = 0;
        short sB = 0;
        int iW3 = 0;
        long jZ = 0;
        float fS = 0.0f;
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 2:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 3:
                    sB = SafeParcelReader.B(parcel, iU);
                    break;
                case 4:
                    dQ = SafeParcelReader.q(parcel, iU);
                    break;
                case 5:
                    dQ2 = SafeParcelReader.q(parcel, iU);
                    break;
                case 6:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 7:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 8:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 9:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C2808c0(strG, iW2, sB, dQ, dQ2, fS, jZ, iW3, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2808c0[i10];
    }
}
