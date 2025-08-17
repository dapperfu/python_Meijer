package Ld;

import Bd.C2951a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* loaded from: classes6.dex */
public final class o0 extends C2951a implements p0 {
    @Override // Ld.p0
    public final InterfaceC4040a zze() throws RemoteException {
        InterfaceC4040a j10;
        Parcel parcelA1 = A1(4, a2());
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            j10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            j10 = iInterfaceQueryLocalInterface instanceof InterfaceC4040a ? (InterfaceC4040a) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelA1.recycle();
        return j10;
    }

    @Override // Ld.p0
    public final Bd.v zzj() throws RemoteException {
        Parcel parcelA1 = A1(5, a2());
        Bd.v vVarA2 = Bd.u.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return vVarA2;
    }

    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // Ld.p0
    public final int zzd() throws RemoteException {
        Parcel parcelA1 = A1(9, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Ld.p0
    public final InterfaceC4056i B3(com.google.android.gms.dynamic.b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        InterfaceC4056i i0Var;
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Bd.s.c(parcelA2, streetViewPanoramaOptions);
        Parcel parcelA1 = A1(7, parcelA2);
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            i0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4056i) {
                i0Var = (InterfaceC4056i) iInterfaceQueryLocalInterface;
            } else {
                i0Var = new i0(strongBinder);
            }
        }
        parcelA1.recycle();
        return i0Var;
    }

    @Override // Ld.p0
    public final void E6(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        parcelA2.writeInt(i10);
        b2(10, parcelA2);
    }

    @Override // Ld.p0
    public final void V5(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        parcelA2.writeInt(19020000);
        b2(6, parcelA2);
    }

    @Override // Ld.p0
    public final InterfaceC4048e c8(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        InterfaceC4048e v0Var;
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Bd.s.c(parcelA2, googleMapOptions);
        Parcel parcelA1 = A1(3, parcelA2);
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            v0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4048e) {
                v0Var = (InterfaceC4048e) iInterfaceQueryLocalInterface;
            } else {
                v0Var = new v0(strongBinder);
            }
        }
        parcelA1.recycle();
        return v0Var;
    }

    @Override // Ld.p0
    public final void r9(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        parcelA2.writeString(str);
        b2(12, parcelA2);
    }

    @Override // Ld.p0
    public final InterfaceC4054h w0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC4054h c4055h0;
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Parcel parcelA1 = A1(8, parcelA2);
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            c4055h0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4054h) {
                c4055h0 = (InterfaceC4054h) iInterfaceQueryLocalInterface;
            } else {
                c4055h0 = new C4055h0(strongBinder);
            }
        }
        parcelA1.recycle();
        return c4055h0;
    }

    @Override // Ld.p0
    public final void y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        b2(11, parcelA2);
    }

    @Override // Ld.p0
    public final InterfaceC4046d zzf(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC4046d u0Var;
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Parcel parcelA1 = A1(2, parcelA2);
        IBinder strongBinder = parcelA1.readStrongBinder();
        if (strongBinder == null) {
            u0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4046d) {
                u0Var = (InterfaceC4046d) iInterfaceQueryLocalInterface;
            } else {
                u0Var = new u0(strongBinder);
            }
        }
        parcelA1.recycle();
        return u0Var;
    }
}
