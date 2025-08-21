package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7326Tg extends BinderC8990nb implements InterfaceC7360Ug {
    public AbstractBinderC7326Tg() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        C6853Fh c6853Fh;
        switch (i10) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Q(bVarA2);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.b bVarZzi = zzi();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                Oc.Y0 y0Zzh = zzh();
                parcel2.writeNoException();
                C9097ob.f(parcel2, y0Zzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c6853Fh = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (iInterfaceQueryLocalInterface instanceof C6853Fh) {
                        c6853Fh = (C6853Fh) iInterfaceQueryLocalInterface;
                    } else {
                        c6853Fh = new C6853Fh(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                u7(c6853Fh);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
