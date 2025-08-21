package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7395Vh extends RemoteCreator {
    public final InterfaceC7828ch a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderM4 = ((InterfaceC8148fh) getRemoteCreatorInstance(context)).M4(com.google.android.gms.dynamic.d.I2(context), com.google.android.gms.dynamic.d.I2(frameLayout), com.google.android.gms.dynamic.d.I2(frameLayout2), 244410000);
            if (iBinderM4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC7828ch ? (InterfaceC7828ch) iInterfaceQueryLocalInterface : new C7525Zg(iBinderM4);
        } catch (RemoteException e10) {
            e = e10;
            Sc.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            Sc.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    public C7395Vh() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8148fh ? (InterfaceC8148fh) iInterfaceQueryLocalInterface : new C7935dh(iBinder);
    }
}
