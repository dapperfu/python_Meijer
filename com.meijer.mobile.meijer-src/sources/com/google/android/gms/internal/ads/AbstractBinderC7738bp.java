package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7738bp extends BinderC8990nb implements InterfaceC7844cp {
    public AbstractBinderC7738bp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static InterfaceC7844cp B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7844cp ? (InterfaceC7844cp) iInterfaceQueryLocalInterface : new C7631ap(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC8590jp c8378hp = null;
        InterfaceC8590jp c8378hp2 = null;
        C8697kp c8697kp = null;
        InterfaceC8164fp c7950dp = null;
        switch (i10) {
            case 1:
                Oc.Y1 y12 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c8378hp = iInterfaceQueryLocalInterface instanceof InterfaceC8590jp ? (InterfaceC8590jp) iInterfaceQueryLocalInterface : new C8378hp(strongBinder);
                }
                C9097ob.c(parcel);
                j6(y12, c8378hp);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c7950dp = iInterfaceQueryLocalInterface2 instanceof InterfaceC8164fp ? (InterfaceC8164fp) iInterfaceQueryLocalInterface2 : new C7950dp(strongBinder2);
                }
                C9097ob.c(parcel);
                n7(c7950dp);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                zzm(bVarA2);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c8697kp = iInterfaceQueryLocalInterface3 instanceof C8697kp ? (C8697kp) iInterfaceQueryLocalInterface3 : new C8697kp(strongBinder3);
                }
                C9097ob.c(parcel);
                x2(c8697kp);
                parcel2.writeNoException();
                return true;
            case 7:
                C9445rp c9445rp = (C9445rp) C9097ob.a(parcel, C9445rp.CREATOR);
                C9097ob.c(parcel);
                k7(c9445rp);
                parcel2.writeNoException();
                return true;
            case 8:
                Oc.K0 k0B9 = Oc.J0.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                l1(k0B9);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZzb);
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                a7(bVarA22, zG);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC7534Zo interfaceC7534ZoZzd = zzd();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7534ZoZzd);
                return true;
            case 12:
                Oc.U0 u0Zzc = zzc();
                parcel2.writeNoException();
                C9097ob.f(parcel2, u0Zzc);
                return true;
            case 13:
                Oc.N0 n0B9 = Oc.M0.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Z7(n0B9);
                parcel2.writeNoException();
                return true;
            case 14:
                Oc.Y1 y13 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c8378hp2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC8590jp ? (InterfaceC8590jp) iInterfaceQueryLocalInterface4 : new C8378hp(strongBinder4);
                }
                C9097ob.c(parcel);
                R6(y13, c8378hp2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zG2 = C9097ob.g(parcel);
                C9097ob.c(parcel);
                E3(zG2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
