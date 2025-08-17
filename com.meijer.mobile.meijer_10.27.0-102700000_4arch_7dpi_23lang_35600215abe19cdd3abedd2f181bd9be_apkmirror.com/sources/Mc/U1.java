package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* loaded from: classes4.dex */
public final class U1 extends RemoteCreator {
    public final Q a(Context context, String str, InterfaceC6631Cl interfaceC6631Cl) {
        try {
            IBinder iBinderN3 = ((S) getRemoteCreatorInstance(context)).N3(com.google.android.gms.dynamic.d.F2(context), str, interfaceC6631Cl, 244410000);
            if (iBinderN3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof Q ? (Q) iInterfaceQueryLocalInterface : new O(iBinderN3);
        } catch (RemoteException e10) {
            e = e10;
            Qc.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            Qc.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    public U1() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new S(iBinder);
    }
}
