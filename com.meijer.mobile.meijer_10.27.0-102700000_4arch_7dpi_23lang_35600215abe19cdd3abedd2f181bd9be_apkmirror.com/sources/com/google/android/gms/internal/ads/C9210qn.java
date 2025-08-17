package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9210qn extends RemoteCreator {
    public C9210qn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final InterfaceC9530tn a(Activity activity) {
        try {
            IBinder iBinderZze = ((InterfaceC9851wn) getRemoteCreatorInstance(activity)).zze(com.google.android.gms.dynamic.d.F2(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC9530tn ? (InterfaceC9530tn) iInterfaceQueryLocalInterface : new C9316rn(iBinderZze);
        } catch (RemoteException e10) {
            Qc.p.h("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            Qc.p.h("Could not create remote AdOverlay.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9851wn ? (InterfaceC9851wn) iInterfaceQueryLocalInterface : new C9637un(iBinder);
    }
}
