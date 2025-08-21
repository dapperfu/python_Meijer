package Cd;

import Ld.C4011a;
import Ld.C4019i;
import Ld.C4020j;
import Ld.C4023m;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC6655l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import jd.InterfaceC14983f;

/* loaded from: classes6.dex */
public interface E0 extends IInterface {
    InterfaceC6655l A2(C4011a c4011a, W w10) throws RemoteException;

    @Deprecated
    LocationAvailability C(String str) throws RemoteException;

    void G4(C4020j c4020j, W w10) throws RemoteException;

    void S0(C4023m c4023m, InterfaceC3045c interfaceC3045c, String str) throws RemoteException;

    @Deprecated
    InterfaceC6655l T4(C4011a c4011a, I0 i02) throws RemoteException;

    @Deprecated
    void Z4(C4019i c4019i, PendingIntent pendingIntent, C0 c02) throws RemoteException;

    @Deprecated
    void Z5(C4020j c4020j, I0 i02) throws RemoteException;

    void b9(Ld.u uVar, W w10) throws RemoteException;

    @Deprecated
    void c8(C3042a0 c3042a0) throws RemoteException;

    void i3(W w10, LocationRequest locationRequest, InterfaceC14983f interfaceC14983f) throws RemoteException;

    void i4(W w10, InterfaceC14983f interfaceC14983f) throws RemoteException;

    @Deprecated
    void l8(C3050e0 c3050e0, C0 c02) throws RemoteException;

    void n2(C4019i c4019i, PendingIntent pendingIntent, InterfaceC14983f interfaceC14983f) throws RemoteException;

    void n8(C3050e0 c3050e0, InterfaceC14983f interfaceC14983f) throws RemoteException;

    @Deprecated
    Location zzs() throws RemoteException;
}
