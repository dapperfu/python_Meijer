package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6926Hl extends BinderC8990nb implements InterfaceC6960Il {
    public AbstractBinderC6926Hl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC6960Il B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface : new C6892Gl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i12 = parcel.readInt();
                C9097ob.c(parcel);
                zzg(i12);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                C9097ob.c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                K0(string, string2);
                break;
            case 10:
                AbstractBinderC9216ph.B9(parcel.readStrongBinder());
                parcel.readString();
                C9097ob.c(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                C9097ob.c(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                C7402Vo c7402Vo = (C7402Vo) C9097ob.a(parcel, C7402Vo.CREATOR);
                C9097ob.c(parcel);
                d8(c7402Vo);
                break;
            case 15:
                zzw();
                break;
            case 16:
                InterfaceC7534Zo interfaceC7534ZoB9 = AbstractBinderC7501Yo.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                o6(interfaceC7534ZoB9);
                break;
            case 17:
                int i13 = parcel.readInt();
                C9097ob.c(parcel);
                g0(i13);
                break;
            case 18:
                zzu();
                break;
            case 19:
                C9097ob.c(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                C9097ob.c(parcel);
                x(string3);
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                C9097ob.c(parcel);
                t1(i14, string4);
                break;
            case 23:
                Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
                C9097ob.c(parcel);
                z8(w02);
                break;
            case 24:
                Oc.W0 w03 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
                C9097ob.c(parcel);
                j8(w03);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
