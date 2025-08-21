package Nd;

import Dd.InterfaceC3101b;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Nd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4191l extends Dd.r implements InterfaceC4192m {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC3101b interfaceC3101bA2 = Dd.D.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            v8(interfaceC3101bA2);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4191l() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }
}
