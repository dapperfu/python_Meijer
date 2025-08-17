package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* renamed from: Mc.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4100a1 extends BinderC8865nb implements InterfaceC4103b1 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zG = C8972ob.g(parcel);
            C8972ob.c(parcel);
            k0(zG);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4100a1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }
}
