package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7270Vh extends RemoteCreator {
    public final InterfaceC7703ch a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZ4 = ((InterfaceC8023fh) getRemoteCreatorInstance(context)).z4(com.google.android.gms.dynamic.d.F2(context), com.google.android.gms.dynamic.d.F2(frameLayout), com.google.android.gms.dynamic.d.F2(frameLayout2), 244410000);
            if (iBinderZ4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC7703ch ? (InterfaceC7703ch) iInterfaceQueryLocalInterface : new C7400Zg(iBinderZ4);
        } catch (RemoteException e10) {
            e = e10;
            Qc.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            Qc.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    public C7270Vh() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8023fh ? (InterfaceC8023fh) iInterfaceQueryLocalInterface : new C7810dh(iBinder);
    }
}
