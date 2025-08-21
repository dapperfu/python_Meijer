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
public final class C7260Rh extends C8883mb implements InterfaceC7328Th {
    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final InterfaceC7459Xg zzk() throws RemoteException {
        InterfaceC7459Xg c7393Vg;
        Parcel parcelA2 = a2(5, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7393Vg = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c7393Vg = iInterfaceQueryLocalInterface instanceof InterfaceC7459Xg ? (InterfaceC7459Xg) iInterfaceQueryLocalInterface : new C7393Vg(strongBinder);
        }
        parcelA2.recycle();
        return c7393Vg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzn() throws RemoteException {
        Parcel parcelA2 = a2(7, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzo() throws RemoteException {
        Parcel parcelA2 = a2(4, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzp() throws RemoteException {
        Parcel parcelA2 = a2(6, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzq() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final List zzu() throws RemoteException {
        Parcel parcelA2 = a2(3, K1());
        ArrayList arrayListB = C9097ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    C7260Rh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final double zze() throws RemoteException {
        Parcel parcelA2 = a2(8, K1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final Oc.U0 zzg() throws RemoteException {
        Parcel parcelA2 = a2(31, K1());
        Oc.U0 u0B9 = Oc.T0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return u0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final Oc.Y0 zzh() throws RemoteException {
        Parcel parcelA2 = a2(11, K1());
        Oc.Y0 y0B9 = Oc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final InterfaceC7224Qg zzi() throws RemoteException {
        InterfaceC7224Qg c7156Og;
        Parcel parcelA2 = a2(14, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c7156Og = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c7156Og = iInterfaceQueryLocalInterface instanceof InterfaceC7224Qg ? (InterfaceC7224Qg) iInterfaceQueryLocalInterface : new C7156Og(strongBinder);
        }
        parcelA2.recycle();
        return c7156Og;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final com.google.android.gms.dynamic.b zzl() throws RemoteException {
        Parcel parcelA2 = a2(19, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final com.google.android.gms.dynamic.b zzm() throws RemoteException {
        Parcel parcelA2 = a2(18, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzs() throws RemoteException {
        Parcel parcelA2 = a2(10, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzt() throws RemoteException {
        Parcel parcelA2 = a2(9, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final List zzv() throws RemoteException {
        Parcel parcelA2 = a2(23, K1());
        ArrayList arrayListB = C9097ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void e7(Bundle bundle) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, bundle);
        c2(33, parcelK1);
    }
}
