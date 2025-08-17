package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7613bp extends BinderC8865nb implements InterfaceC7719cp {
    public AbstractBinderC7613bp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static InterfaceC7719cp B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7719cp ? (InterfaceC7719cp) iInterfaceQueryLocalInterface : new C7506ap(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC8465jp c8253hp = null;
        InterfaceC8465jp c8253hp2 = null;
        C8572kp c8572kp = null;
        InterfaceC8039fp c7825dp = null;
        switch (i10) {
            case 1:
                Mc.Y1 y12 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c8253hp = iInterfaceQueryLocalInterface instanceof InterfaceC8465jp ? (InterfaceC8465jp) iInterfaceQueryLocalInterface : new C8253hp(strongBinder);
                }
                C8972ob.c(parcel);
                x9(y12, c8253hp);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c7825dp = iInterfaceQueryLocalInterface2 instanceof InterfaceC8039fp ? (InterfaceC8039fp) iInterfaceQueryLocalInterface2 : new C7825dp(strongBinder2);
                }
                C8972ob.c(parcel);
                b7(c7825dp);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i12 = C8972ob.f77401b;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                zzm(bVarA2);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c8572kp = iInterfaceQueryLocalInterface3 instanceof C8572kp ? (C8572kp) iInterfaceQueryLocalInterface3 : new C8572kp(strongBinder3);
                }
                C8972ob.c(parcel);
                v2(c8572kp);
                parcel2.writeNoException();
                return true;
            case 7:
                C9320rp c9320rp = (C9320rp) C8972ob.a(parcel, C9320rp.CREATOR);
                C8972ob.c(parcel);
                Z6(c9320rp);
                parcel2.writeNoException();
                return true;
            case 8:
                Mc.K0 k0B9 = Mc.J0.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                f8(k0B9);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZzb);
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                boolean zG = C8972ob.g(parcel);
                C8972ob.c(parcel);
                Q6(bVarA22, zG);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC7409Zo interfaceC7409ZoZzd = zzd();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7409ZoZzd);
                return true;
            case 12:
                Mc.U0 u0Zzc = zzc();
                parcel2.writeNoException();
                C8972ob.f(parcel2, u0Zzc);
                return true;
            case 13:
                Mc.N0 n0B9 = Mc.M0.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                P5(n0B9);
                parcel2.writeNoException();
                return true;
            case 14:
                Mc.Y1 y13 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c8253hp2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC8465jp ? (InterfaceC8465jp) iInterfaceQueryLocalInterface4 : new C8253hp(strongBinder4);
                }
                C8972ob.c(parcel);
                Y7(y13, c8253hp2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zG2 = C8972ob.g(parcel);
                C8972ob.c(parcel);
                t3(zG2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
