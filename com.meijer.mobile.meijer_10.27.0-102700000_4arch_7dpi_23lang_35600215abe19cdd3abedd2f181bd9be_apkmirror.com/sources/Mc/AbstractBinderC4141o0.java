package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* renamed from: Mc.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4141o0 extends BinderC8865nb implements InterfaceC4144p0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            W0 w02 = (W0) C8972ob.a(parcel, W0.CREATOR);
            C8972ob.c(parcel);
            H0(w02);
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzc();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4141o0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
