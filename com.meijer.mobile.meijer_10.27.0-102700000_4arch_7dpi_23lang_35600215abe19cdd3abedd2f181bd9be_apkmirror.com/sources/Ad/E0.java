package Ad;

import Jd.C3767a;
import Jd.C3775i;
import Jd.C3776j;
import Jd.C3779m;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC6530l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import hd.InterfaceC14405f;

/* loaded from: classes6.dex */
public interface E0 extends IInterface {
    @Deprecated
    void A4(C3775i c3775i, PendingIntent pendingIntent, C0 c02) throws RemoteException;

    @Deprecated
    LocationAvailability C(String str) throws RemoteException;

    InterfaceC6530l C6(C3767a c3767a, W w10) throws RemoteException;

    void D3(W w10, LocationRequest locationRequest, InterfaceC14405f interfaceC14405f) throws RemoteException;

    void N8(C2812e0 c2812e0, InterfaceC14405f interfaceC14405f) throws RemoteException;

    void O6(Jd.u uVar, W w10) throws RemoteException;

    @Deprecated
    void O8(C2812e0 c2812e0, C0 c02) throws RemoteException;

    void Q0(C3776j c3776j, W w10) throws RemoteException;

    @Deprecated
    void S0(C3776j c3776j, I0 i02) throws RemoteException;

    void Y4(C3775i c3775i, PendingIntent pendingIntent, InterfaceC14405f interfaceC14405f) throws RemoteException;

    void Z7(C3779m c3779m, InterfaceC2807c interfaceC2807c, String str) throws RemoteException;

    void b5(W w10, InterfaceC14405f interfaceC14405f) throws RemoteException;

    @Deprecated
    InterfaceC6530l l8(C3767a c3767a, I0 i02) throws RemoteException;

    @Deprecated
    void z5(C2804a0 c2804a0) throws RemoteException;

    @Deprecated
    Location zzs() throws RemoteException;
}
