package Nd;

import Dd.C3100a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes6.dex */
public final class J extends C3100a implements InterfaceC4172a {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // Nd.InterfaceC4172a
    public final com.google.android.gms.dynamic.b V3(CameraPosition cameraPosition) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, cameraPosition);
        Parcel parcelK1 = K1(7, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }
}
