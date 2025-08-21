package Nd;

import Dd.C3100a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* loaded from: classes6.dex */
public final class o0 extends C3100a implements p0 {
    @Override // Nd.p0
    public final InterfaceC4172a zze() throws RemoteException {
        InterfaceC4172a j10;
        Parcel parcelK1 = K1(4, a2());
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            j10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            j10 = iInterfaceQueryLocalInterface instanceof InterfaceC4172a ? (InterfaceC4172a) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelK1.recycle();
        return j10;
    }

    @Override // Nd.p0
    public final Dd.v zzj() throws RemoteException {
        Parcel parcelK1 = K1(5, a2());
        Dd.v vVarA2 = Dd.u.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return vVarA2;
    }

    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // Nd.p0
    public final int zzd() throws RemoteException {
        Parcel parcelK1 = K1(9, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Nd.p0
    public final InterfaceC4188i M3(com.google.android.gms.dynamic.b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        InterfaceC4188i i0Var;
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Dd.s.c(parcelA2, streetViewPanoramaOptions);
        Parcel parcelK1 = K1(7, parcelA2);
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            i0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4188i) {
                i0Var = (InterfaceC4188i) iInterfaceQueryLocalInterface;
            } else {
                i0Var = new i0(strongBinder);
            }
        }
        parcelK1.recycle();
        return i0Var;
    }

    @Override // Nd.p0
    public final void P6(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        parcelA2.writeInt(i10);
        c2(10, parcelA2);
    }

    @Override // Nd.p0
    public final InterfaceC4180e Y7(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        InterfaceC4180e v0Var;
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Dd.s.c(parcelA2, googleMapOptions);
        Parcel parcelK1 = K1(3, parcelA2);
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            v0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4180e) {
                v0Var = (InterfaceC4180e) iInterfaceQueryLocalInterface;
            } else {
                v0Var = new v0(strongBinder);
            }
        }
        parcelK1.recycle();
        return v0Var;
    }

    @Override // Nd.p0
    public final void i6(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        parcelA2.writeInt(19020000);
        c2(6, parcelA2);
    }

    @Override // Nd.p0
    public final void r9(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        parcelA2.writeString(str);
        c2(12, parcelA2);
    }

    @Override // Nd.p0
    public final void y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        c2(11, parcelA2);
    }

    @Override // Nd.p0
    public final InterfaceC4186h z0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC4186h c4187h0;
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Parcel parcelK1 = K1(8, parcelA2);
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            c4187h0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4186h) {
                c4187h0 = (InterfaceC4186h) iInterfaceQueryLocalInterface;
            } else {
                c4187h0 = new C4187h0(strongBinder);
            }
        }
        parcelK1.recycle();
        return c4187h0;
    }

    @Override // Nd.p0
    public final InterfaceC4178d zzf(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC4178d u0Var;
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Parcel parcelK1 = K1(2, parcelA2);
        IBinder strongBinder = parcelK1.readStrongBinder();
        if (strongBinder == null) {
            u0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4178d) {
                u0Var = (InterfaceC4178d) iInterfaceQueryLocalInterface;
            } else {
                u0Var = new u0(strongBinder);
            }
        }
        parcelK1.recycle();
        return u0Var;
    }
}
