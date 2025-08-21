package Cd;

import Ld.C4011a;
import Ld.C4019i;
import Ld.C4020j;
import Ld.C4023m;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC6655l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import jd.InterfaceC14983f;

/* loaded from: classes6.dex */
public final class D0 extends C3041a implements E0 {
    @Override // Cd.E0
    public final Location zzs() throws RemoteException {
        Parcel parcelA2 = a2(7, K1());
        Location location = (Location) r.a(parcelA2, Location.CREATOR);
        parcelA2.recycle();
        return location;
    }

    D0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // Cd.E0
    public final InterfaceC6655l A2(C4011a c4011a, W w10) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4011a);
        r.b(parcelK1, w10);
        Parcel parcelA2 = a2(92, parcelK1);
        InterfaceC6655l interfaceC6655lA2 = InterfaceC6655l.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC6655lA2;
    }

    @Override // Cd.E0
    public final LocationAvailability C(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        Parcel parcelA2 = a2(34, parcelK1);
        LocationAvailability locationAvailability = (LocationAvailability) r.a(parcelA2, LocationAvailability.CREATOR);
        parcelA2.recycle();
        return locationAvailability;
    }

    @Override // Cd.E0
    public final void G4(C4020j c4020j, W w10) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4020j);
        r.b(parcelK1, w10);
        c2(90, parcelK1);
    }

    @Override // Cd.E0
    public final void S0(C4023m c4023m, InterfaceC3045c interfaceC3045c, String str) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4023m);
        r.c(parcelK1, interfaceC3045c);
        parcelK1.writeString(null);
        c2(63, parcelK1);
    }

    @Override // Cd.E0
    public final InterfaceC6655l T4(C4011a c4011a, I0 i02) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4011a);
        r.c(parcelK1, i02);
        Parcel parcelA2 = a2(87, parcelK1);
        InterfaceC6655l interfaceC6655lA2 = InterfaceC6655l.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC6655lA2;
    }

    @Override // Cd.E0
    public final void Z4(C4019i c4019i, PendingIntent pendingIntent, C0 c02) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4019i);
        r.b(parcelK1, pendingIntent);
        r.c(parcelK1, c02);
        c2(57, parcelK1);
    }

    @Override // Cd.E0
    public final void Z5(C4020j c4020j, I0 i02) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4020j);
        r.c(parcelK1, i02);
        c2(82, parcelK1);
    }

    @Override // Cd.E0
    public final void b9(Ld.u uVar, W w10) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, uVar);
        r.b(parcelK1, w10);
        c2(91, parcelK1);
    }

    @Override // Cd.E0
    public final void c8(C3042a0 c3042a0) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c3042a0);
        c2(59, parcelK1);
    }

    @Override // Cd.E0
    public final void i3(W w10, LocationRequest locationRequest, InterfaceC14983f interfaceC14983f) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, w10);
        r.b(parcelK1, locationRequest);
        r.c(parcelK1, interfaceC14983f);
        c2(88, parcelK1);
    }

    @Override // Cd.E0
    public final void i4(W w10, InterfaceC14983f interfaceC14983f) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, w10);
        r.c(parcelK1, interfaceC14983f);
        c2(89, parcelK1);
    }

    @Override // Cd.E0
    public final void l8(C3050e0 c3050e0, C0 c02) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c3050e0);
        r.c(parcelK1, c02);
        c2(74, parcelK1);
    }

    @Override // Cd.E0
    public final void n2(C4019i c4019i, PendingIntent pendingIntent, InterfaceC14983f interfaceC14983f) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c4019i);
        r.b(parcelK1, pendingIntent);
        r.c(parcelK1, interfaceC14983f);
        c2(97, parcelK1);
    }

    @Override // Cd.E0
    public final void n8(C3050e0 c3050e0, InterfaceC14983f interfaceC14983f) throws RemoteException {
        Parcel parcelK1 = K1();
        r.b(parcelK1, c3050e0);
        r.c(parcelK1, interfaceC14983f);
        c2(98, parcelK1);
    }
}
