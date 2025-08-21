package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8482io extends BinderC8990nb implements InterfaceC8588jo {
    public AbstractBinderC8482io() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC9123oo c8909mo = null;
        C9230po c9230po = null;
        InterfaceC9123oo c8909mo2 = null;
        InterfaceC9123oo c8909mo3 = null;
        InterfaceC9123oo c8909mo4 = null;
        switch (i10) {
            case 1:
                C9097ob.c(parcel);
                parcel2.writeNoException();
                C9097ob.e(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC8695ko) {
                    }
                }
                C9097ob.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C9978wo c9978wo = (C9978wo) C9097ob.a(parcel, C9978wo.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8909mo = iInterfaceQueryLocalInterface2 instanceof InterfaceC9123oo ? (InterfaceC9123oo) iInterfaceQueryLocalInterface2 : new C8909mo(strongBinder2);
                }
                C9097ob.c(parcel);
                Z6(c9978wo, c8909mo);
                parcel2.writeNoException();
                return true;
            case 5:
                C9978wo c9978wo2 = (C9978wo) C9097ob.a(parcel, C9978wo.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8909mo4 = iInterfaceQueryLocalInterface3 instanceof InterfaceC9123oo ? (InterfaceC9123oo) iInterfaceQueryLocalInterface3 : new C8909mo(strongBinder3);
                }
                C9097ob.c(parcel);
                A7(c9978wo2, c8909mo4);
                parcel2.writeNoException();
                return true;
            case 6:
                C9978wo c9978wo3 = (C9978wo) C9097ob.a(parcel, C9978wo.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8909mo3 = iInterfaceQueryLocalInterface4 instanceof InterfaceC9123oo ? (InterfaceC9123oo) iInterfaceQueryLocalInterface4 : new C8909mo(strongBinder4);
                }
                C9097ob.c(parcel);
                O5(c9978wo3, c8909mo3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8909mo2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC9123oo ? (InterfaceC9123oo) iInterfaceQueryLocalInterface5 : new C8909mo(strongBinder5);
                }
                C9097ob.c(parcel);
                B3(string, c8909mo2);
                parcel2.writeNoException();
                return true;
            case 8:
                C8162fo c8162fo = (C8162fo) C9097ob.a(parcel, C8162fo.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c9230po = iInterfaceQueryLocalInterface6 instanceof C9230po ? (C9230po) iInterfaceQueryLocalInterface6 : new C9230po(strongBinder6);
                }
                C9097ob.c(parcel);
                N6(c8162fo, c9230po);
                parcel2.writeNoException();
                return true;
        }
    }
}
