package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8357io extends BinderC8865nb implements InterfaceC8463jo {
    public AbstractBinderC8357io() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC8998oo c8784mo = null;
        C9105po c9105po = null;
        InterfaceC8998oo c8784mo2 = null;
        InterfaceC8998oo c8784mo3 = null;
        InterfaceC8998oo c8784mo4 = null;
        switch (i10) {
            case 1:
                C8972ob.c(parcel);
                parcel2.writeNoException();
                C8972ob.e(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC8570ko) {
                    }
                }
                C8972ob.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C9853wo c9853wo = (C9853wo) C8972ob.a(parcel, C9853wo.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8784mo = iInterfaceQueryLocalInterface2 instanceof InterfaceC8998oo ? (InterfaceC8998oo) iInterfaceQueryLocalInterface2 : new C8784mo(strongBinder2);
                }
                C8972ob.c(parcel);
                N6(c9853wo, c8784mo);
                parcel2.writeNoException();
                return true;
            case 5:
                C9853wo c9853wo2 = (C9853wo) C8972ob.a(parcel, C9853wo.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8784mo4 = iInterfaceQueryLocalInterface3 instanceof InterfaceC8998oo ? (InterfaceC8998oo) iInterfaceQueryLocalInterface3 : new C8784mo(strongBinder3);
                }
                C8972ob.c(parcel);
                u7(c9853wo2, c8784mo4);
                parcel2.writeNoException();
                return true;
            case 6:
                C9853wo c9853wo3 = (C9853wo) C8972ob.a(parcel, C9853wo.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8784mo3 = iInterfaceQueryLocalInterface4 instanceof InterfaceC8998oo ? (InterfaceC8998oo) iInterfaceQueryLocalInterface4 : new C8784mo(strongBinder4);
                }
                C8972ob.c(parcel);
                E5(c9853wo3, c8784mo3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c8784mo2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC8998oo ? (InterfaceC8998oo) iInterfaceQueryLocalInterface5 : new C8784mo(strongBinder5);
                }
                C8972ob.c(parcel);
                r3(string, c8784mo2);
                parcel2.writeNoException();
                return true;
            case 8:
                C8037fo c8037fo = (C8037fo) C8972ob.a(parcel, C8037fo.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c9105po = iInterfaceQueryLocalInterface6 instanceof C9105po ? (C9105po) iInterfaceQueryLocalInterface6 : new C9105po(strongBinder6);
                }
                C8972ob.c(parcel);
                z6(c8037fo, c9105po);
                parcel2.writeNoException();
                return true;
        }
    }
}
