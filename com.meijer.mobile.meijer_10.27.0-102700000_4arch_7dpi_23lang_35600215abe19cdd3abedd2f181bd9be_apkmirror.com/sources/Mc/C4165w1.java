package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: Mc.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4165w1 extends RemoteCreator {
    public final InterfaceC4161v0 a(Context context) {
        try {
            IBinder iBinderN3 = ((C4167x0) getRemoteCreatorInstance(context)).N3(com.google.android.gms.dynamic.d.F2(context), 244410000);
            if (iBinderN3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC4161v0 ? (InterfaceC4161v0) iInterfaceQueryLocalInterface : new C4155t0(iBinderN3);
        } catch (RemoteException e10) {
            e = e10;
            Qc.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            Qc.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    public C4165w1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C4167x0 ? (C4167x0) iInterfaceQueryLocalInterface : new C4167x0(iBinder);
    }
}
