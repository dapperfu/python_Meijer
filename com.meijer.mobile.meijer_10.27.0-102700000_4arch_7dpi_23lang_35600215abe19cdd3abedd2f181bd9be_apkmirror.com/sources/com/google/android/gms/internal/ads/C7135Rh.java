package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7135Rh extends C8758mb implements InterfaceC7203Th {
    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final InterfaceC7334Xg zzk() throws RemoteException {
        InterfaceC7334Xg c7268Vg;
        Parcel parcelA2 = a2(5, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7268Vg = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c7268Vg = iInterfaceQueryLocalInterface instanceof InterfaceC7334Xg ? (InterfaceC7334Xg) iInterfaceQueryLocalInterface : new C7268Vg(strongBinder);
        }
        parcelA2.recycle();
        return c7268Vg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzn() throws RemoteException {
        Parcel parcelA2 = a2(7, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzo() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzp() throws RemoteException {
        Parcel parcelA2 = a2(6, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzq() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final List zzu() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        ArrayList arrayListB = C8972ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    C7135Rh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final double zze() throws RemoteException {
        Parcel parcelA2 = a2(8, A1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final Mc.U0 zzg() throws RemoteException {
        Parcel parcelA2 = a2(31, A1());
        Mc.U0 u0B9 = Mc.T0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return u0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final Mc.Y0 zzh() throws RemoteException {
        Parcel parcelA2 = a2(11, A1());
        Mc.Y0 y0B9 = Mc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final InterfaceC7099Qg zzi() throws RemoteException {
        InterfaceC7099Qg c7031Og;
        Parcel parcelA2 = a2(14, A1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7031Og = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c7031Og = iInterfaceQueryLocalInterface instanceof InterfaceC7099Qg ? (InterfaceC7099Qg) iInterfaceQueryLocalInterface : new C7031Og(strongBinder);
        }
        parcelA2.recycle();
        return c7031Og;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final com.google.android.gms.dynamic.b zzl() throws RemoteException {
        Parcel parcelA2 = a2(19, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final com.google.android.gms.dynamic.b zzm() throws RemoteException {
        Parcel parcelA2 = a2(18, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzs() throws RemoteException {
        Parcel parcelA2 = a2(10, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzt() throws RemoteException {
        Parcel parcelA2 = a2(9, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final List zzv() throws RemoteException {
        Parcel parcelA2 = a2(23, A1());
        ArrayList arrayListB = C8972ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void T6(Bundle bundle) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, bundle);
        b2(33, parcelA1);
    }
}
