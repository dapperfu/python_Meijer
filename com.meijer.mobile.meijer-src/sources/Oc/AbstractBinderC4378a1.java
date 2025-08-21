package Oc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;

/* renamed from: Oc.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4378a1 extends BinderC8990nb implements InterfaceC4381b1 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
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
            boolean zG = C9097ob.g(parcel);
            C9097ob.c(parcel);
            n0(zG);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4378a1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }
}
