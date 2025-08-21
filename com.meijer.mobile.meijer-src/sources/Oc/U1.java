package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* loaded from: classes4.dex */
public final class U1 extends RemoteCreator {
    public final Q a(Context context, String str, InterfaceC6756Cl interfaceC6756Cl) {
        try {
            IBinder iBinderZ3 = ((S) getRemoteCreatorInstance(context)).Z3(com.google.android.gms.dynamic.d.I2(context), str, interfaceC6756Cl, 244410000);
            if (iBinderZ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof Q ? (Q) iInterfaceQueryLocalInterface : new O(iBinderZ3);
        } catch (RemoteException e10) {
            e = e10;
            Sc.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            Sc.p.h("Could not create remote builder for AdLoader.", e);
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
