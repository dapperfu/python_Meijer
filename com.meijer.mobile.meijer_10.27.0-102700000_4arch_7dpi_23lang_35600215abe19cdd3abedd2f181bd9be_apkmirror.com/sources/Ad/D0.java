package Ad;

import Jd.C3767a;
import Jd.C3775i;
import Jd.C3776j;
import Jd.C3779m;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC6530l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import hd.InterfaceC14405f;

/* loaded from: classes6.dex */
public final class D0 extends C2803a implements E0 {
    @Override // Ad.E0
    public final Location zzs() throws RemoteException {
        Parcel parcelA2 = a2(7, A1());
        Location location = (Location) r.a(parcelA2, Location.CREATOR);
        parcelA2.recycle();
        return location;
    }

    D0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // Ad.E0
    public final void A4(C3775i c3775i, PendingIntent pendingIntent, C0 c02) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3775i);
        r.b(parcelA1, pendingIntent);
        r.c(parcelA1, c02);
        b2(57, parcelA1);
    }

    @Override // Ad.E0
    public final LocationAvailability C(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        Parcel parcelA2 = a2(34, parcelA1);
        LocationAvailability locationAvailability = (LocationAvailability) r.a(parcelA2, LocationAvailability.CREATOR);
        parcelA2.recycle();
        return locationAvailability;
    }

    @Override // Ad.E0
    public final InterfaceC6530l C6(C3767a c3767a, W w10) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3767a);
        r.b(parcelA1, w10);
        Parcel parcelA2 = a2(92, parcelA1);
        InterfaceC6530l interfaceC6530lA2 = InterfaceC6530l.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC6530lA2;
    }

    @Override // Ad.E0
    public final void D3(W w10, LocationRequest locationRequest, InterfaceC14405f interfaceC14405f) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, w10);
        r.b(parcelA1, locationRequest);
        r.c(parcelA1, interfaceC14405f);
        b2(88, parcelA1);
    }

    @Override // Ad.E0
    public final void N8(C2812e0 c2812e0, InterfaceC14405f interfaceC14405f) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c2812e0);
        r.c(parcelA1, interfaceC14405f);
        b2(98, parcelA1);
    }

    @Override // Ad.E0
    public final void O6(Jd.u uVar, W w10) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, uVar);
        r.b(parcelA1, w10);
        b2(91, parcelA1);
    }

    @Override // Ad.E0
    public final void O8(C2812e0 c2812e0, C0 c02) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c2812e0);
        r.c(parcelA1, c02);
        b2(74, parcelA1);
    }

    @Override // Ad.E0
    public final void Q0(C3776j c3776j, W w10) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3776j);
        r.b(parcelA1, w10);
        b2(90, parcelA1);
    }

    @Override // Ad.E0
    public final void S0(C3776j c3776j, I0 i02) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3776j);
        r.c(parcelA1, i02);
        b2(82, parcelA1);
    }

    @Override // Ad.E0
    public final void Y4(C3775i c3775i, PendingIntent pendingIntent, InterfaceC14405f interfaceC14405f) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3775i);
        r.b(parcelA1, pendingIntent);
        r.c(parcelA1, interfaceC14405f);
        b2(97, parcelA1);
    }

    @Override // Ad.E0
    public final void Z7(C3779m c3779m, InterfaceC2807c interfaceC2807c, String str) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3779m);
        r.c(parcelA1, interfaceC2807c);
        parcelA1.writeString(null);
        b2(63, parcelA1);
    }

    @Override // Ad.E0
    public final void b5(W w10, InterfaceC14405f interfaceC14405f) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, w10);
        r.c(parcelA1, interfaceC14405f);
        b2(89, parcelA1);
    }

    @Override // Ad.E0
    public final InterfaceC6530l l8(C3767a c3767a, I0 i02) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c3767a);
        r.c(parcelA1, i02);
        Parcel parcelA2 = a2(87, parcelA1);
        InterfaceC6530l interfaceC6530lA2 = InterfaceC6530l.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC6530lA2;
    }

    @Override // Ad.E0
    public final void z5(C2804a0 c2804a0) throws RemoteException {
        Parcel parcelA1 = A1();
        r.b(parcelA1, c2804a0);
        b2(59, parcelA1);
    }
}
