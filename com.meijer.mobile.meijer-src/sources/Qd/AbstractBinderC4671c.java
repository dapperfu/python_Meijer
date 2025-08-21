package Qd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.B6;
import com.google.android.gms.measurement.internal.C11266g;
import com.google.android.gms.measurement.internal.C11282i;
import com.google.android.gms.measurement.internal.v6;
import java.util.List;

/* renamed from: Qd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4671c extends P implements InterfaceC4672d {
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4678j c4676h = null;
        InterfaceC4675g c4673e = null;
        switch (i10) {
            case 1:
                com.google.android.gms.measurement.internal.G g10 = (com.google.android.gms.measurement.internal.G) Q.b(parcel, com.google.android.gms.measurement.internal.G.CREATOR);
                B6 b62 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                f3(g10, b62);
                parcel2.writeNoException();
                return true;
            case 2:
                v6 v6Var = (v6) Q.b(parcel, v6.CREATOR);
                B6 b63 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                O3(v6Var, b63);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                B6 b64 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                q8(b64);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.G g11 = (com.google.android.gms.measurement.internal.G) Q.b(parcel, com.google.android.gms.measurement.internal.G.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                Q.f(parcel);
                S5(g11, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                B6 b65 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                h3(b65);
                parcel2.writeNoException();
                return true;
            case 7:
                B6 b66 = (B6) Q.b(parcel, B6.CREATOR);
                boolean zA = Q.a(parcel);
                Q.f(parcel);
                List listK5 = k5(b66, zA);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK5);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.G g12 = (com.google.android.gms.measurement.internal.G) Q.b(parcel, com.google.android.gms.measurement.internal.G.CREATOR);
                String string3 = parcel.readString();
                Q.f(parcel);
                byte[] bArrV3 = v3(g12, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrV3);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Q.f(parcel);
                e6(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                B6 b67 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                String strS4 = S4(b67);
                parcel2.writeNoException();
                parcel2.writeString(strS4);
                return true;
            case 12:
                C11282i c11282i = (C11282i) Q.b(parcel, C11282i.CREATOR);
                B6 b68 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                b1(c11282i, b68);
                parcel2.writeNoException();
                return true;
            case 13:
                C11282i c11282i2 = (C11282i) Q.b(parcel, C11282i.CREATOR);
                Q.f(parcel);
                z3(c11282i2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA2 = Q.a(parcel);
                B6 b69 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                List listM8 = M8(string7, string8, zA2, b69);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM8);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zA3 = Q.a(parcel);
                Q.f(parcel);
                List listW0 = W0(string9, string10, string11, zA3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listW0);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                B6 b610 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                List listC9 = c9(string12, string13, b610);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC9);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                Q.f(parcel);
                List listG2 = g2(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG2);
                return true;
            case 18:
                B6 b611 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                g6(b611);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
                B6 b612 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                X7(bundle, b612);
                parcel2.writeNoException();
                return true;
            case 20:
                B6 b613 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                s9(b613);
                parcel2.writeNoException();
                return true;
            case 21:
                B6 b614 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                C4669a c4669aR7 = R7(b614);
                parcel2.writeNoException();
                if (c4669aR7 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c4669aR7.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                B6 b615 = (B6) Q.b(parcel, B6.CREATOR);
                Bundle bundle2 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                Q.f(parcel);
                List listV2 = V2(b615, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listV2);
                return true;
            case 25:
                B6 b616 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                y2(b616);
                parcel2.writeNoException();
                return true;
            case 26:
                B6 b617 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                j3(b617);
                parcel2.writeNoException();
                return true;
            case 27:
                B6 b618 = (B6) Q.b(parcel, B6.CREATOR);
                Q.f(parcel);
                E8(b618);
                parcel2.writeNoException();
                return true;
            case 29:
                B6 b619 = (B6) Q.b(parcel, B6.CREATOR);
                J j11 = (J) Q.b(parcel, J.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c4676h = iInterfaceQueryLocalInterface instanceof InterfaceC4678j ? (InterfaceC4678j) iInterfaceQueryLocalInterface : new C4676h(strongBinder);
                }
                Q.f(parcel);
                Y2(b619, j11, c4676h);
                parcel2.writeNoException();
                return true;
            case 30:
                B6 b620 = (B6) Q.b(parcel, B6.CREATOR);
                C11266g c11266g = (C11266g) Q.b(parcel, C11266g.CREATOR);
                Q.f(parcel);
                F7(b620, c11266g);
                parcel2.writeNoException();
                return true;
            case 31:
                B6 b621 = (B6) Q.b(parcel, B6.CREATOR);
                Bundle bundle3 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c4673e = iInterfaceQueryLocalInterface2 instanceof InterfaceC4675g ? (InterfaceC4675g) iInterfaceQueryLocalInterface2 : new C4673e(strongBinder2);
                }
                Q.f(parcel);
                p6(b621, bundle3, c4673e);
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC4671c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }
}
