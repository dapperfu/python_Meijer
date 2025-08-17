package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6801Hl extends BinderC8865nb implements InterfaceC6835Il {
    public AbstractBinderC6801Hl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC6835Il B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface : new C6767Gl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
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
                C8972ob.c(parcel);
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
                C8972ob.c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                C8972ob.c(parcel);
                I0(string, string2);
                break;
            case 10:
                AbstractBinderC9091ph.B9(parcel.readStrongBinder());
                parcel.readString();
                C8972ob.c(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                C8972ob.c(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                C7277Vo c7277Vo = (C7277Vo) C8972ob.a(parcel, C7277Vo.CREATOR);
                C8972ob.c(parcel);
                e8(c7277Vo);
                break;
            case 15:
                zzw();
                break;
            case 16:
                InterfaceC7409Zo interfaceC7409ZoB9 = AbstractBinderC7376Yo.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Y5(interfaceC7409ZoB9);
                break;
            case 17:
                int i13 = parcel.readInt();
                C8972ob.c(parcel);
                e0(i13);
                break;
            case 18:
                zzu();
                break;
            case 19:
                C8972ob.c(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                C8972ob.c(parcel);
                x(string3);
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                C8972ob.c(parcel);
                n1(i14, string4);
                break;
            case 23:
                Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
                C8972ob.c(parcel);
                G1(w02);
                break;
            case 24:
                Mc.W0 w03 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
                C8972ob.c(parcel);
                q4(w03);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
