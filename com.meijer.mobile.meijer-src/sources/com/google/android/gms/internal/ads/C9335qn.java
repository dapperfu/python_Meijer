package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9335qn extends RemoteCreator {
    public C9335qn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final InterfaceC9655tn a(Activity activity) {
        try {
            IBinder iBinderZze = ((InterfaceC9976wn) getRemoteCreatorInstance(activity)).zze(com.google.android.gms.dynamic.d.I2(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC9655tn ? (InterfaceC9655tn) iInterfaceQueryLocalInterface : new C9441rn(iBinderZze);
        } catch (RemoteException e10) {
            Sc.p.h("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            Sc.p.h("Could not create remote AdOverlay.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9976wn ? (InterfaceC9976wn) iInterfaceQueryLocalInterface : new C9762un(iBinder);
    }
}
