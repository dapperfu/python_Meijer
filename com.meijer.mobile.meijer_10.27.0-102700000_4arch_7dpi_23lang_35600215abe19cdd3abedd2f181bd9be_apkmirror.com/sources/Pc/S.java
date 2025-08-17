package Pc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public abstract class S extends BinderC8865nb implements T {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            C8972ob.c(parcel);
            boolean zZzf = zzf(bVarA2, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i10 == 2) {
            com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
            C8972ob.c(parcel);
            zze(bVarA22);
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
            Nc.a aVar = (Nc.a) C8972ob.a(parcel, Nc.a.CREATOR);
            C8972ob.c(parcel);
            boolean zZzg = zzg(bVarA23, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }

    public S() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }
}
