package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import id.C14724g;

/* loaded from: classes6.dex */
public final class T4 extends RemoteCreator {

    /* renamed from: a, reason: collision with root package name */
    private static final T4 f83727a = new T4();

    private T4() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return iInterfaceQueryLocalInterface instanceof X4 ? (X4) iInterfaceQueryLocalInterface : new X4(iBinder);
    }

    @Deprecated
    public static W4 a(String str, Context context, boolean z10, boolean z11) {
        W4 w4B;
        if (C14724g.f().h(context, 12800000) == 0) {
            w4B = f83727a.b("h.3.2.2/n.android.3.2.2", context, false);
        } else {
            w4B = null;
        }
        if (w4B == null) {
            return new S4("h.3.2.2/n.android.3.2.2", context, false);
        }
        return w4B;
    }

    private final W4 b(String str, Context context, boolean z10) {
        try {
            IBinder iBinderZ3 = ((X4) getRemoteCreatorInstance(context)).Z3("h.3.2.2/n.android.3.2.2", com.google.android.gms.dynamic.d.I2(context));
            if (iBinderZ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZ3.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (iInterfaceQueryLocalInterface instanceof W4) {
                return (W4) iInterfaceQueryLocalInterface;
            }
            return new U4(iBinderZ3);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | LinkageError unused) {
            return null;
        }
    }
}
