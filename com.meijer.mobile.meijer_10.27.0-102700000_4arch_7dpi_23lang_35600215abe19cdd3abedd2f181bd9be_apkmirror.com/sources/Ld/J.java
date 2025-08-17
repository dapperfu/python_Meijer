package Ld;

import Bd.C2951a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes6.dex */
public final class J extends C2951a implements InterfaceC4040a {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // Ld.InterfaceC4040a
    public final com.google.android.gms.dynamic.b J3(CameraPosition cameraPosition) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, cameraPosition);
        Parcel parcelA1 = A1(7, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }
}
