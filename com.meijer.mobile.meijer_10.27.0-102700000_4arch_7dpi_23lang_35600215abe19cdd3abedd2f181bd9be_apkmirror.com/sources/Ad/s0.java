package Ad;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import gd.C14244c;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList arrayListK = null;
        Q q10 = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 6) {
                            if (iM != 7) {
                                if (iM != 8) {
                                    SafeParcelReader.D(parcel, iU);
                                } else {
                                    arrayListK = SafeParcelReader.k(parcel, iU, C14244c.CREATOR);
                                }
                            } else {
                                q10 = (Q) SafeParcelReader.f(parcel, iU, Q.CREATOR);
                            }
                        } else {
                            strG3 = SafeParcelReader.g(parcel, iU);
                        }
                    } else {
                        strG2 = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new Q(iW, strG, strG2, strG3, arrayListK, q10);
    }
}
